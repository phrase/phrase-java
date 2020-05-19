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

/**
 * KeyUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-19T13:18:42.843Z[Etc/UTC]")
public class KeyUpdateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PLURAL = "plural";
  @SerializedName(SERIALIZED_NAME_PLURAL)
  private Boolean plural;

  public static final String SERIALIZED_NAME_NAME_PLURAL = "name_plural";
  @SerializedName(SERIALIZED_NAME_NAME_PLURAL)
  private String namePlural;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_MAX_CHARACTERS_ALLOWED = "max_characters_allowed";
  @SerializedName(SERIALIZED_NAME_MAX_CHARACTERS_ALLOWED)
  private Integer maxCharactersAllowed;

  public static final String SERIALIZED_NAME_SCREENSHOT = "screenshot";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT)
  private File screenshot;

  public static final String SERIALIZED_NAME_REMOVE_SCREENSHOT = "remove_screenshot";
  @SerializedName(SERIALIZED_NAME_REMOVE_SCREENSHOT)
  private Boolean removeScreenshot;

  public static final String SERIALIZED_NAME_UNFORMATTED = "unformatted";
  @SerializedName(SERIALIZED_NAME_UNFORMATTED)
  private Boolean unformatted;

  public static final String SERIALIZED_NAME_XML_SPACE_PRESERVE = "xml_space_preserve";
  @SerializedName(SERIALIZED_NAME_XML_SPACE_PRESERVE)
  private Boolean xmlSpacePreserve;

  public static final String SERIALIZED_NAME_ORIGINAL_FILE = "original_file";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE)
  private String originalFile;

  public static final String SERIALIZED_NAME_LOCALIZED_FORMAT_STRING = "localized_format_string";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_FORMAT_STRING)
  private String localizedFormatString;

  public static final String SERIALIZED_NAME_LOCALIZED_FORMAT_KEY = "localized_format_key";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_FORMAT_KEY)
  private String localizedFormatKey;


  public KeyUpdateParameters branch(String branch) {
    
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


  public KeyUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Key name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "home.index.headline", value = "Key name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KeyUpdateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Key description (usually includes contextual information for translators)
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some description worth knowing...", value = "Key description (usually includes contextual information for translators)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public KeyUpdateParameters plural(Boolean plural) {
    
    this.plural = plural;
    return this;
  }

   /**
   * Indicates whether key supports pluralization
   * @return plural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether key supports pluralization")

  public Boolean getPlural() {
    return plural;
  }


  public void setPlural(Boolean plural) {
    this.plural = plural;
  }


  public KeyUpdateParameters namePlural(String namePlural) {
    
    this.namePlural = namePlural;
    return this;
  }

   /**
   * Plural name for the key (used in some file formats, e.g. Gettext)
   * @return namePlural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "home.index.headlines", value = "Plural name for the key (used in some file formats, e.g. Gettext)")

  public String getNamePlural() {
    return namePlural;
  }


  public void setNamePlural(String namePlural) {
    this.namePlural = namePlural;
  }


  public KeyUpdateParameters dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Type of the key. Can be one of the following: string, number, boolean, array, markdown.
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number", value = "Type of the key. Can be one of the following: string, number, boolean, array, markdown.")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public KeyUpdateParameters tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * List of tags separated by comma to be associated with the key.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "awesome-feature,needs-proofreading", value = "List of tags separated by comma to be associated with the key.")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public KeyUpdateParameters maxCharactersAllowed(Integer maxCharactersAllowed) {
    
    this.maxCharactersAllowed = maxCharactersAllowed;
    return this;
  }

   /**
   * Max. number of characters translations for this key can have.
   * @return maxCharactersAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "140", value = "Max. number of characters translations for this key can have.")

  public Integer getMaxCharactersAllowed() {
    return maxCharactersAllowed;
  }


  public void setMaxCharactersAllowed(Integer maxCharactersAllowed) {
    this.maxCharactersAllowed = maxCharactersAllowed;
  }


  public KeyUpdateParameters screenshot(File screenshot) {
    
    this.screenshot = screenshot;
    return this;
  }

   /**
   * Screenshot/image for the key. This parameter is deprecated. Please use the Screenshots endpoint instead.
   * @return screenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Screenshot/image for the key. This parameter is deprecated. Please use the Screenshots endpoint instead.")

  public File getScreenshot() {
    return screenshot;
  }


  public void setScreenshot(File screenshot) {
    this.screenshot = screenshot;
  }


  public KeyUpdateParameters removeScreenshot(Boolean removeScreenshot) {
    
    this.removeScreenshot = removeScreenshot;
    return this;
  }

   /**
   * Indicates whether the screenshot will be deleted. This parameter is deprecated. Please use the Screenshots endpoint instead.
   * @return removeScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the screenshot will be deleted. This parameter is deprecated. Please use the Screenshots endpoint instead.")

  public Boolean getRemoveScreenshot() {
    return removeScreenshot;
  }


  public void setRemoveScreenshot(Boolean removeScreenshot) {
    this.removeScreenshot = removeScreenshot;
  }


  public KeyUpdateParameters unformatted(Boolean unformatted) {
    
    this.unformatted = unformatted;
    return this;
  }

   /**
   * Indicates whether the key should be exported as \&quot;unformatted\&quot;. Supported by Android XML and other formats.
   * @return unformatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the key should be exported as \"unformatted\". Supported by Android XML and other formats.")

  public Boolean getUnformatted() {
    return unformatted;
  }


  public void setUnformatted(Boolean unformatted) {
    this.unformatted = unformatted;
  }


  public KeyUpdateParameters xmlSpacePreserve(Boolean xmlSpacePreserve) {
    
    this.xmlSpacePreserve = xmlSpacePreserve;
    return this;
  }

   /**
   * Indicates whether the key should be exported with \&quot;xml:space&#x3D;preserve\&quot;. Supported by several XML-based formats.
   * @return xmlSpacePreserve
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the key should be exported with \"xml:space=preserve\". Supported by several XML-based formats.")

  public Boolean getXmlSpacePreserve() {
    return xmlSpacePreserve;
  }


  public void setXmlSpacePreserve(Boolean xmlSpacePreserve) {
    this.xmlSpacePreserve = xmlSpacePreserve;
  }


  public KeyUpdateParameters originalFile(String originalFile) {
    
    this.originalFile = originalFile;
    return this;
  }

   /**
   * Original file attribute. Used in some formats, e.g. XLIFF.
   * @return originalFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original file attribute. Used in some formats, e.g. XLIFF.")

  public String getOriginalFile() {
    return originalFile;
  }


  public void setOriginalFile(String originalFile) {
    this.originalFile = originalFile;
  }


  public KeyUpdateParameters localizedFormatString(String localizedFormatString) {
    
    this.localizedFormatString = localizedFormatString;
    return this;
  }

   /**
   * NSStringLocalizedFormatKey attribute. Used in .stringsdict format.
   * @return localizedFormatString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NSStringLocalizedFormatKey attribute. Used in .stringsdict format.")

  public String getLocalizedFormatString() {
    return localizedFormatString;
  }


  public void setLocalizedFormatString(String localizedFormatString) {
    this.localizedFormatString = localizedFormatString;
  }


  public KeyUpdateParameters localizedFormatKey(String localizedFormatKey) {
    
    this.localizedFormatKey = localizedFormatKey;
    return this;
  }

   /**
   * NSStringLocalizedFormatKey attribute. Used in .stringsdict format.
   * @return localizedFormatKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NSStringLocalizedFormatKey attribute. Used in .stringsdict format.")

  public String getLocalizedFormatKey() {
    return localizedFormatKey;
  }


  public void setLocalizedFormatKey(String localizedFormatKey) {
    this.localizedFormatKey = localizedFormatKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyUpdateParameters keyUpdateParameters = (KeyUpdateParameters) o;
    return Objects.equals(this.branch, keyUpdateParameters.branch) &&
        Objects.equals(this.name, keyUpdateParameters.name) &&
        Objects.equals(this.description, keyUpdateParameters.description) &&
        Objects.equals(this.plural, keyUpdateParameters.plural) &&
        Objects.equals(this.namePlural, keyUpdateParameters.namePlural) &&
        Objects.equals(this.dataType, keyUpdateParameters.dataType) &&
        Objects.equals(this.tags, keyUpdateParameters.tags) &&
        Objects.equals(this.maxCharactersAllowed, keyUpdateParameters.maxCharactersAllowed) &&
        Objects.equals(this.screenshot, keyUpdateParameters.screenshot) &&
        Objects.equals(this.removeScreenshot, keyUpdateParameters.removeScreenshot) &&
        Objects.equals(this.unformatted, keyUpdateParameters.unformatted) &&
        Objects.equals(this.xmlSpacePreserve, keyUpdateParameters.xmlSpacePreserve) &&
        Objects.equals(this.originalFile, keyUpdateParameters.originalFile) &&
        Objects.equals(this.localizedFormatString, keyUpdateParameters.localizedFormatString) &&
        Objects.equals(this.localizedFormatKey, keyUpdateParameters.localizedFormatKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, description, plural, namePlural, dataType, tags, maxCharactersAllowed, screenshot, removeScreenshot, unformatted, xmlSpacePreserve, originalFile, localizedFormatString, localizedFormatKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyUpdateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    namePlural: ").append(toIndentedString(namePlural)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    maxCharactersAllowed: ").append(toIndentedString(maxCharactersAllowed)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    removeScreenshot: ").append(toIndentedString(removeScreenshot)).append("\n");
    sb.append("    unformatted: ").append(toIndentedString(unformatted)).append("\n");
    sb.append("    xmlSpacePreserve: ").append(toIndentedString(xmlSpacePreserve)).append("\n");
    sb.append("    originalFile: ").append(toIndentedString(originalFile)).append("\n");
    sb.append("    localizedFormatString: ").append(toIndentedString(localizedFormatString)).append("\n");
    sb.append("    localizedFormatKey: ").append(toIndentedString(localizedFormatKey)).append("\n");
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

