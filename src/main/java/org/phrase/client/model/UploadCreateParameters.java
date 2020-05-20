/*
 * Phrase API Reference
 * Phrase is a translation management platform for software projects. You can collaborate on language file translation with your team or order translations through our platform. The API allows you to import locale files, download locale files, tag keys or interact in other ways with the localization data stored in Phrase for your account.  ## API Endpoint  ``` https://api.phrase.com/v2/ ```  The API is only accessible via HTTPS, the base URL is <code>https://api.phrase.com/</code>, and the current version is <code>v2</code> which results in the base URL for all requests: <code>https://api.phrase.com/v2/</code>.  ## Usage  [curl](http://curl.haxx.se/) is used primarily to send requests to Phrase in the examples. On most you'll find a second variant using the [Phrase API v2 client](https://phrase.com/cli/) that might be more convenient to handle. For further information check its [documentation](https://help.phrase.com/help/phrase-in-your-terminal).  ## Use of HTTP Verbs  Phrase API v2 tries to use the appropriate HTTP verb for accessing each endpoint according to REST specification where possible:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Verb</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\">GET</td>         <td class=\"basic-table__cell\">Retrieve one or multiple resources</td>       </tr>       <tr>         <td class=\"basic-table__cell\">POST</td>         <td class=\"basic-table__cell\">Create a resource</td>       </tr>       <tr>         <td class=\"basic-table__cell\">PUT</td>         <td class=\"basic-table__cell\">Update a resource</td>       </tr>       <tr>         <td class=\"basic-table__cell\">PATCH</td>         <td class=\"basic-table__cell\">Update a resource (partially)</td>       </tr>       <tr>         <td class=\"basic-table__cell\">DELETE</td>         <td class=\"basic-table__cell\">Delete a resource</td>       </tr>     </tbody>   </table> </div>   ## Identification via User-Agent  You must include the User-Agent header with the name of your application or project. It might be a good idea to include some sort of contact information  as well, so that we can get in touch if necessary (e.g. to warn you about Rate-Limiting or badly formed requests). Examples of excellent User-Agent headers:  ``` User-Agent: Frederiks Mobile App (frederik@phrase.com) User-Agent: ACME Inc Python Client (http://example.com/contact) ```  If you don't send this header, you will receive a response with 400 Bad Request.   ## Lists  When you request a list of resources, the API will typically only return an array of resources including their most important attributes. For a detailed representation of the resource you should request its detailed representation.  Lists are usually [paginated](#pagination).   ## Parameters  Many endpoints support additional parameters, e.g. for pagination. When passing them in a GET request you can send them as HTTP query string parameters:  ``` $ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\" ```  When performing a POST, PUT, PATCH or DELETE request, we recommend sending parameters that are not already included in the URL, as JSON body:  ``` $ curl -H 'Content-Type: application/json' -d '{\"name\":\"My new project\"}' -u EMAIL_OR_ACCESS_TOKEN https://api.phrase.com/v2/projects ```  Encoding parameters as JSON means better support for types (boolean, integer) and usually better readability. Don't forget to set the correct Content-Type for your request.  *The Content-Type header is omitted in some of the following examples for better readbility.*   ## Errors   ### Request Errors  If a request contains invalid JSON or is missing a required parameter (besides resource attributes), the status `400 Bad Request` is returned:  ``` {   \"message\": \"JSON could not be parsed\" } ```   ### Validation Errors  When the validation for a resource fails, the status `422 Unprocessable Entity` is returned, along with information on the affected fields:  ``` {   \"message\": \"Validation Failed\",   \"errors\": [     {       \"resource\": \"Project\",       \"field\": \"name\",       \"message\": \"can't be blank\"     }   ] } ```   ## Date Format  Times and dates are returned and expected in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) date format:  ``` YYYY-MM-DDTHH:MM:SSZ ```  Instead of 'Z' for UTC time zone you can specify your time zone's locale offset using the following notation:  ``` YYYY-MM-DDTHH:MM:SS¬±hh:mm ```  Example for CET (1 hour behind UTC):  ``` 2015-03-31T13:00+01:00 ```  Please note that in HTTP headers, we will use the appropriate recommended date formats instead of ISO 8601.   ## Authentication  <div class=\"alert alert-info\">For more detailed information on authentication, check out the <a href=\"#authentication\">API v2 Authentication Guide</a>.</div>  There are two different ways to authenticate when performing API requests:  * E-Mail and password * Oauth Access Token   ### E-Mail and password  To get started easily, you can use HTTP Basic authentication with your email and password:  ``` $ curl -u username:password \"https://api.phrase.com/v2/projects\" ```   ### OAuth via Access Tokens  You can create and manage access tokens in your [profile settings](https://app.phrase.com/settings/oauth_access_tokens) in Translation Center or via the [Authorizations API](#authorizations).  Simply pass the access token as the username of your request:  ``` $ curl -u ACCESS_TOKEN: \"https://api.phrase.com/v2/projects\" ```  or send the access token via the `Authorization` header field:  ``` $ curl -H \"Authorization: token ACCESS_TOKEN\" https://api.phrase.com/v2/projects ```  For more detailed information on authentication, check out the <a href=\"#authentication\">API v2 Authentication Guide</a>.  #### Send via parameter  As JSONP (and other) requests cannot send HTTP Basic Auth credentials, a special query parameter `access_token` can be used:  ``` curl \"https://api.phrase.com/v2/projects?access_token=ACCESS_TOKEN\" ```  You should only use this transport method if sending the authentication via header or Basic authentication is not possible.  ### Two-Factor-Authentication  Users with Two-Factor-Authentication enabled have to send a valid token along their request with certain authentication methods (such as Basic authentication). The necessity of a Two-Factor-Authentication token is indicated by the `X-PhraseApp-OTP: required; :MFA-type` header in the response. The `:MFA-type`field indicates the source of the token, e.g. `app` (refers to your Authenticator application):  ``` X-PhraseApp-OTP: required; app ```  To provide a Two-Factor-Authentication token you can simply send it in the header of the request:  ``` curl -H \"X-PhraseApp-OTP: MFA-TOKEN\" -u EMAIL https://api.phrase.com/v2/projects ```  Since Two-Factor-Authentication tokens usually expire quickly, we recommend using an alternative authentication method such as OAuth access tokens.  ### Multiple Accounts  Some endpoints require the account ID to be specified if the authenticated user is a member of multiple accounts. You can find the eight-digit account ID inside <a href=\"https://app.phrase.com/\" target=\"_blank\">Translation Center</a> by switching to the desired account and then visiting the account details page. If required, you can specify the account just like a normal parameter within the request.  ## Pagination  Endpoints that return a list or resources will usually return paginated results and include 25 items by default. To access further pages, use the `page` parameter:  ``` $ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\" ```  Some endpoints also allow a custom page size by using the `per_page` parameter:  ``` $ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2&per_page=50\" ```  Unless specified otherwise in the description of the respective endpoint, `per_page` allows you to specify a page size up to 100 items.   ## Link-Headers  We provide you with pagination URLs in the [Link Header field](http://tools.ietf.org/html/rfc5988). Make use of this information to avoid building pagination URLs yourself.  ``` Link: <https://api.phrase.com/v2/projects?page=1>; rel=\"first\", <https://api.phrase.com/v2/projects?page=3>; rel=\"prev\", <https://api.phrase.com/v2/projects?page=5>; rel=\"next\", <https://api.phrase.com/v2/projects?page=9>; rel=\"last\" ```  Possible `rel` values are:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Value</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\">next</td>         <td class=\"basic-table__cell\">URL of the next page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">last</td>         <td class=\"basic-table__cell\">URL of the last page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">first</td>         <td class=\"basic-table__cell\">URL of the first page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">prev</td>         <td class=\"basic-table__cell\">URL of the previous page of results</td>       </tr>     </tbody>   </table> </div>  ## Rate Limiting  All API endpoints are subject to rate limiting to ensure good performance for all customers. The rate limit is calculated per user:  * 1000 requests per 5 minutes * 4 concurrent (parallel) requests  For your convenience we send information on the current rate limit within the response headers:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Header</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Limit</code></td>         <td class=\"basic-table__cell\">Number of max requests allowed in the current time period</td>       </tr>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Remaining</code></td>         <td class=\"basic-table__cell\">Number of remaining requests in the current time period</td>       </tr>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Reset</code></td>         <td class=\"basic-table__cell\">Timestamp of end of current time period as UNIX timestamp</td>       </tr>     </tbody>   </table> </div>  If you should run into the rate limit, you will receive the HTTP status code `429: Too many requests`.  If you should need higher rate limits, [contact us](https://phrase.com/contact).   ## Conditional GET requests / HTTP Caching  <div class=\"alert alert-info\"><p><strong>Note:</strong> Conditional GET requests are currently only supported for <a href=\"#locales_download\">locales#download</a> and <a href=\"#translations_index\">translations#index</a></p></div>  We will return an ETag or Last-Modified header with most GET requests. When you request a resource we recommend to store this value and submit them on subsequent requests as `If-Modified-Since` and `If-None-Match` headers. If the resource has not changed in the meantime, we will return the status `304 Not Modified` instead of rendering and returning the resource again. In most cases this is less time-consuming and makes your application/integration faster.  Please note that all conditional requests that return a response with status 304 don't count against your rate limits.  ``` $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" HTTP/1.1 200 OK ETag: \"abcd1234abcdefefabcd1234efab1234\" Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 200 OK  $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H 'If-None-Match: \"abcd1234abcdefefabcd1234efab1234\"' HTTP/1.1 304 Not Modified ETag: \"abcd1234abcdefefabcd1234efab1234\" Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 304 Not Modified  $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H \"If-Modified-Since: Wed, 28 Jan 2015 15:31:30 UTC\" HTTP/1.1 304 Not Modified Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 304 Not Modified ```   ## JSONP  The Phrase API supports [JSONP](http://en.wikipedia.org/wiki/JSONP) for all GET requests in order to deal with cross-domain request issues. Just send a `?callback` parameter along with the request to specify the Javascript function name to be called with the response content:  ``` $ curl \"https://api.phrase.com/v2/projects?callback=myFunction\" ```  The response will include the normal output for that endpoint, along with a `meta` section including header data:  ``` myFunction({   {     \"meta\": {       \"status\": 200,       ...     },     \"data\": [       {         \"id\": \"1234abcd1234abc1234abcd1234abc\"         ...       }     ]   } }); ```  To authenticate a JSONP request, you can send a valid [access token](#authentication) as the `?access_token` parameter along the request:  ``` $ curl \"https://api.phrase.com/v2/projects?callback=myFunction&access_token=ACCESS-TOKEN\" ``` 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@phrase.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.phrase.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UploadCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-20T07:49:32.904Z[Etc/UTC]")
public class UploadCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File file;

  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private String fileFormat;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_UPDATE_TRANSLATIONS = "update_translations";
  @SerializedName(SERIALIZED_NAME_UPDATE_TRANSLATIONS)
  private Boolean updateTranslations;

  public static final String SERIALIZED_NAME_UPDATE_DESCRIPTIONS = "update_descriptions";
  @SerializedName(SERIALIZED_NAME_UPDATE_DESCRIPTIONS)
  private Boolean updateDescriptions;

  public static final String SERIALIZED_NAME_CONVERT_EMOJI = "convert_emoji";
  @SerializedName(SERIALIZED_NAME_CONVERT_EMOJI)
  private Boolean convertEmoji;

  public static final String SERIALIZED_NAME_SKIP_UPLOAD_TAGS = "skip_upload_tags";
  @SerializedName(SERIALIZED_NAME_SKIP_UPLOAD_TAGS)
  private Boolean skipUploadTags;

  public static final String SERIALIZED_NAME_SKIP_UNVERIFICATION = "skip_unverification";
  @SerializedName(SERIALIZED_NAME_SKIP_UNVERIFICATION)
  private Boolean skipUnverification;

  public static final String SERIALIZED_NAME_FILE_ENCODING = "file_encoding";
  @SerializedName(SERIALIZED_NAME_FILE_ENCODING)
  private String fileEncoding;

  public static final String SERIALIZED_NAME_LOCALE_MAPPING = "locale_mapping";
  @SerializedName(SERIALIZED_NAME_LOCALE_MAPPING)
  private Map<String, String> localeMapping = null;

  public static final String SERIALIZED_NAME_FORMAT_OPTIONS = "format_options";
  @SerializedName(SERIALIZED_NAME_FORMAT_OPTIONS)
  private Map<String, String> formatOptions = null;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE = "autotranslate";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE)
  private Boolean autotranslate;

  public static final String SERIALIZED_NAME_MARK_REVIEWED = "mark_reviewed";
  @SerializedName(SERIALIZED_NAME_MARK_REVIEWED)
  private Boolean markReviewed;


  public UploadCreateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-feature-branch", value = "specify the branch to use")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public UploadCreateParameters file(File file) {
    
    this.file = file;
    return this;
  }

   /**
   * File to be imported
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to be imported")

  public File getFile() {
    return file;
  }


  public void setFile(File file) {
    this.file = file;
  }


  public UploadCreateParameters fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format. Auto-detected when possible and not specified.
   * @return fileFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "json", value = "File format. Auto-detected when possible and not specified.")

  public String getFileFormat() {
    return fileFormat;
  }


  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }


  public UploadCreateParameters localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * Locale of the file&#39;s content. Can be the name or public id of the locale. Preferred is the public id.
   * @return localeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234cdef1234abcd1234cdef1234", value = "Locale of the file's content. Can be the name or public id of the locale. Preferred is the public id.")

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  public UploadCreateParameters tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * List of tags separated by comma to be associated with the new keys contained in the upload.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "awesome-feature,needs-proofreading", value = "List of tags separated by comma to be associated with the new keys contained in the upload.")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public UploadCreateParameters updateTranslations(Boolean updateTranslations) {
    
    this.updateTranslations = updateTranslations;
    return this;
  }

   /**
   * Indicates whether existing translations should be updated with the file content.
   * @return updateTranslations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether existing translations should be updated with the file content.")

  public Boolean getUpdateTranslations() {
    return updateTranslations;
  }


  public void setUpdateTranslations(Boolean updateTranslations) {
    this.updateTranslations = updateTranslations;
  }


  public UploadCreateParameters updateDescriptions(Boolean updateDescriptions) {
    
    this.updateDescriptions = updateDescriptions;
    return this;
  }

   /**
   * Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions.
   * @return updateDescriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions.")

  public Boolean getUpdateDescriptions() {
    return updateDescriptions;
  }


  public void setUpdateDescriptions(Boolean updateDescriptions) {
    this.updateDescriptions = updateDescriptions;
  }


  public UploadCreateParameters convertEmoji(Boolean convertEmoji) {
    
    this.convertEmoji = convertEmoji;
    return this;
  }

   /**
   * This option is obsolete. Providing the option will cause a bad request error.
   * @return convertEmoji
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This option is obsolete. Providing the option will cause a bad request error.")

  public Boolean getConvertEmoji() {
    return convertEmoji;
  }


  public void setConvertEmoji(Boolean convertEmoji) {
    this.convertEmoji = convertEmoji;
  }


  public UploadCreateParameters skipUploadTags(Boolean skipUploadTags) {
    
    this.skipUploadTags = skipUploadTags;
    return this;
  }

   /**
   * Indicates whether the upload should not create upload tags.
   * @return skipUploadTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the upload should not create upload tags.")

  public Boolean getSkipUploadTags() {
    return skipUploadTags;
  }


  public void setSkipUploadTags(Boolean skipUploadTags) {
    this.skipUploadTags = skipUploadTags;
  }


  public UploadCreateParameters skipUnverification(Boolean skipUnverification) {
    
    this.skipUnverification = skipUnverification;
    return this;
  }

   /**
   * Indicates whether the upload should unverify updated translations.
   * @return skipUnverification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the upload should unverify updated translations.")

  public Boolean getSkipUnverification() {
    return skipUnverification;
  }


  public void setSkipUnverification(Boolean skipUnverification) {
    this.skipUnverification = skipUnverification;
  }


  public UploadCreateParameters fileEncoding(String fileEncoding) {
    
    this.fileEncoding = fileEncoding;
    return this;
  }

   /**
   * Enforces a specific encoding on the file contents. Valid options are \&quot;UTF-8\&quot;, \&quot;UTF-16\&quot; and \&quot;ISO-8859-1\&quot;.
   * @return fileEncoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enforces a specific encoding on the file contents. Valid options are \"UTF-8\", \"UTF-16\" and \"ISO-8859-1\".")

  public String getFileEncoding() {
    return fileEncoding;
  }


  public void setFileEncoding(String fileEncoding) {
    this.fileEncoding = fileEncoding;
  }


  public UploadCreateParameters localeMapping(Map<String, String> localeMapping) {
    
    this.localeMapping = localeMapping;
    return this;
  }

  public UploadCreateParameters putLocaleMappingItem(String key, String localeMappingItem) {
    if (this.localeMapping == null) {
      this.localeMapping = new HashMap<String, String>();
    }
    this.localeMapping.put(key, localeMappingItem);
    return this;
  }

   /**
   * Optional, format specific mapping between locale names and the columns the translations to those locales are contained in.
   * @return localeMapping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en\": \"2\"}", value = "Optional, format specific mapping between locale names and the columns the translations to those locales are contained in.")

  public Map<String, String> getLocaleMapping() {
    return localeMapping;
  }


  public void setLocaleMapping(Map<String, String> localeMapping) {
    this.localeMapping = localeMapping;
  }


  public UploadCreateParameters formatOptions(Map<String, String> formatOptions) {
    
    this.formatOptions = formatOptions;
    return this;
  }

  public UploadCreateParameters putFormatOptionsItem(String key, String formatOptionsItem) {
    if (this.formatOptions == null) {
      this.formatOptions = new HashMap<String, String>();
    }
    this.formatOptions.put(key, formatOptionsItem);
    return this;
  }

   /**
   * Additional options available for specific formats. See our format guide for complete list.
   * @return formatOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"foo\": \"bar\"}", value = "Additional options available for specific formats. See our format guide for complete list.")

  public Map<String, String> getFormatOptions() {
    return formatOptions;
  }


  public void setFormatOptions(Map<String, String> formatOptions) {
    this.formatOptions = formatOptions;
  }


  public UploadCreateParameters autotranslate(Boolean autotranslate) {
    
    this.autotranslate = autotranslate;
    return this;
  }

   /**
   * If set, translations for the uploaded language will be fetched automatically.
   * @return autotranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, translations for the uploaded language will be fetched automatically.")

  public Boolean getAutotranslate() {
    return autotranslate;
  }


  public void setAutotranslate(Boolean autotranslate) {
    this.autotranslate = autotranslate;
  }


  public UploadCreateParameters markReviewed(Boolean markReviewed) {
    
    this.markReviewed = markReviewed;
    return this;
  }

   /**
   * Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project.
   * @return markReviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project.")

  public Boolean getMarkReviewed() {
    return markReviewed;
  }


  public void setMarkReviewed(Boolean markReviewed) {
    this.markReviewed = markReviewed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadCreateParameters uploadCreateParameters = (UploadCreateParameters) o;
    return Objects.equals(this.branch, uploadCreateParameters.branch) &&
        Objects.equals(this.file, uploadCreateParameters.file) &&
        Objects.equals(this.fileFormat, uploadCreateParameters.fileFormat) &&
        Objects.equals(this.localeId, uploadCreateParameters.localeId) &&
        Objects.equals(this.tags, uploadCreateParameters.tags) &&
        Objects.equals(this.updateTranslations, uploadCreateParameters.updateTranslations) &&
        Objects.equals(this.updateDescriptions, uploadCreateParameters.updateDescriptions) &&
        Objects.equals(this.convertEmoji, uploadCreateParameters.convertEmoji) &&
        Objects.equals(this.skipUploadTags, uploadCreateParameters.skipUploadTags) &&
        Objects.equals(this.skipUnverification, uploadCreateParameters.skipUnverification) &&
        Objects.equals(this.fileEncoding, uploadCreateParameters.fileEncoding) &&
        Objects.equals(this.localeMapping, uploadCreateParameters.localeMapping) &&
        Objects.equals(this.formatOptions, uploadCreateParameters.formatOptions) &&
        Objects.equals(this.autotranslate, uploadCreateParameters.autotranslate) &&
        Objects.equals(this.markReviewed, uploadCreateParameters.markReviewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, file, fileFormat, localeId, tags, updateTranslations, updateDescriptions, convertEmoji, skipUploadTags, skipUnverification, fileEncoding, localeMapping, formatOptions, autotranslate, markReviewed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTranslations: ").append(toIndentedString(updateTranslations)).append("\n");
    sb.append("    updateDescriptions: ").append(toIndentedString(updateDescriptions)).append("\n");
    sb.append("    convertEmoji: ").append(toIndentedString(convertEmoji)).append("\n");
    sb.append("    skipUploadTags: ").append(toIndentedString(skipUploadTags)).append("\n");
    sb.append("    skipUnverification: ").append(toIndentedString(skipUnverification)).append("\n");
    sb.append("    fileEncoding: ").append(toIndentedString(fileEncoding)).append("\n");
    sb.append("    localeMapping: ").append(toIndentedString(localeMapping)).append("\n");
    sb.append("    formatOptions: ").append(toIndentedString(formatOptions)).append("\n");
    sb.append("    autotranslate: ").append(toIndentedString(autotranslate)).append("\n");
    sb.append("    markReviewed: ").append(toIndentedString(markReviewed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

