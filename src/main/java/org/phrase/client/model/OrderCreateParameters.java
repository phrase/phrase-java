/*
 * Phrase API Reference
 * Phrase is a translation management platform for software projects. You can collaborate on language file translation with your team or order translations through our platform. The API allows you to import locale files, download locale files, tag keys or interact in other ways with the localization data stored in Phrase for your account.  ## API Endpoint  <div class=\"resource__code--outer\">   <div class=\"code-section\">     <pre><code>https://api.phrase.com/v2/</code></pre>   </div> </div>  The API is only accessible via HTTPS, the base URL is <code>https://api.phrase.com/</code>, and the current version is <code>v2</code> which results in the base URL for all requests: <code>https://api.phrase.com/v2/</code>.   ## Usage  [curl](http://curl.haxx.se/) is used primarily to send requests to Phrase in the examples. On most you'll find a second variant using the [Phrase API v2 client](https://phrase.com/cli/) that might be more convenient to handle. For further information check its [documentation](https://help.phrase.com/help/phrase-in-your-terminal).   ## Use of HTTP Verbs  Phrase API v2 tries to use the appropriate HTTP verb for accessing each endpoint according to REST specification where possible:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Verb</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\">GET</td>         <td class=\"basic-table__cell\">Retrieve one or multiple resources</td>       </tr>       <tr>         <td class=\"basic-table__cell\">POST</td>         <td class=\"basic-table__cell\">Create a resource</td>       </tr>       <tr>         <td class=\"basic-table__cell\">PUT</td>         <td class=\"basic-table__cell\">Update a resource</td>       </tr>       <tr>         <td class=\"basic-table__cell\">PATCH</td>         <td class=\"basic-table__cell\">Update a resource (partially)</td>       </tr>       <tr>         <td class=\"basic-table__cell\">DELETE</td>         <td class=\"basic-table__cell\">Delete a resource</td>       </tr>     </tbody>   </table> </div>   ## Identification via User-Agent  You must include the User-Agent header with the name of your application or project. It might be a good idea to include some sort of contact information  as well, so that we can get in touch if necessary (e.g. to warn you about Rate-Limiting or badly formed requests). Examples of excellent User-Agent headers:  <pre><code>User-Agent: Frederiks Mobile App (frederik@phrase.com) User-Agent: ACME Inc Python Client (http://example.com/contact)</code></pre>  If you don't send this header, you will receive a response with 400 Bad Request.   ## Lists  When you request a list of resources, the API will typically only return an array of resources including their most important attributes. For a detailed representation of the resource you should request its detailed representation.  Lists are usually [paginated](#pagination).   ## Parameters  Many endpoints support additional parameters, e.g. for pagination. When passing them in a GET request you can send them as HTTP query string parameters:  <pre><code>$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\"</code></pre>  When performing a POST, PUT, PATCH or DELETE request, we recommend sending parameters that are not already included in the URL, as JSON body:  <pre><code>$ curl -H 'Content-Type: application/json' -d '{\"name\":\"My new project\"}' -u EMAIL_OR_ACCESS_TOKEN https://api.phrase.com/v2/projects</code></pre>  Encoding parameters as JSON means better support for types (boolean, integer) and usually better readability. Don't forget to set the correct Content-Type for your request.  *The Content-Type header is omitted in some of the following examples for better readbility.*   ## Errors   ### Request Errors  If a request contains invalid JSON or is missing a required parameter (besides resource attributes), the status `400 Bad Request` is returned:  <pre><code>{   \"message\": \"JSON could not be parsed\" }</code></pre>   ### Validation Errors  When the validation for a resource fails, the status `422 Unprocessable Entity` is returned, along with information on the affected fields:  <pre><code>{   \"message\": \"Validation Failed\",   \"errors\": [     {       \"resource\": \"Project\",       \"field\": \"name\",       \"message\": \"can't be blank\"     }   ] }</code></pre>   ## Date Format  Times and dates are returned and expected in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) date format:  <pre><code>YYYY-MM-DDTHH:MM:SSZ</code></pre>  Instead of 'Z' for UTC time zone you can specify your time zone's locale offset using the following notation:  <pre><code>YYYY-MM-DDTHH:MM:SS¬±hh:mm</code></pre>  Example for CET (1 hour behind UTC):  <pre><code>2015-03-31T13:00+01:00</code></pre>  Please note that in HTTP headers, we will use the appropriate recommended date formats instead of ISO 8601.   ## Authentication  <div class=\"alert alert-info\">For more detailed information on authentication, check out the <a href=\"#authentication\">API v2 Authentication Guide</a>.</div>  There are two different ways to authenticate when performing API requests:  * E-Mail and password * Oauth Access Token   ### E-Mail and password  To get started easily, you can use HTTP Basic authentication with your email and password:  <pre><code>$ curl -u username:password \"https://api.phrase.com/v2/projects\"</code></pre>   ### OAuth via Access Tokens  You can create and manage access tokens in your [profile settings](https://app.phrase.com/settings/oauth_access_tokens) in Translation Center or via the [Authorizations API](#authorizations).  Simply pass the access token as the username of your request:  <pre><code>$ curl -u ACCESS_TOKEN: \"https://api.phrase.com/v2/projects\"</code></pre>  or send the access token via the `Authorization` header field:  <pre><code>$ curl -H \"Authorization: token ACCESS_TOKEN\" https://api.phrase.com/v2/projects</code></pre>  For more detailed information on authentication, check out the <a href=\"#authentication\">API v2 Authentication Guide</a>.  #### Send via parameter  As JSONP (and other) requests cannot send HTTP Basic Auth credentials, a special query parameter `access_token` can be used:  <pre><code>curl \"https://api.phrase.com/v2/projects?access_token=ACCESS_TOKEN\"</code></pre>  You should only use this transport method if sending the authentication via header or Basic authentication is not possible.  ### Two-Factor-Authentication  Users with Two-Factor-Authentication enabled have to send a valid token along their request with certain authentication methods (such as Basic authentication). The necessity of a Two-Factor-Authentication token is indicated by the `X-PhraseApp-OTP: required; :MFA-type` header in the response. The `:MFA-type`field indicates the source of the token, e.g. `app` (refers to your Authenticator application):  <pre><code>X-PhraseApp-OTP: required; app</code></pre>  To provide a Two-Factor-Authentication token you can simply send it in the header of the request:  <pre><code>curl -H \"X-PhraseApp-OTP: MFA-TOKEN\" -u EMAIL https://api.phrase.com/v2/projects</code></pre>  Since Two-Factor-Authentication tokens usually expire quickly, we recommend using an alternative authentication method such as OAuth access tokens.  ### Multiple Accounts  Some endpoints require the account ID to be specified if the authenticated user is a member of multiple accounts. You can find the eight-digit account ID inside <a href=\"https://app.phrase.com/\" target=\"_blank\">Translation Center</a> by switching to the desired account and then visiting the account details page. If required, you can specify the account just like a normal parameter within the request.  ## Pagination  Endpoints that return a list or resources will usually return paginated results and include 25 items by default. To access further pages, use the `page` parameter:  <pre><code>$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\"</code></pre>  Some endpoints also allow a custom page size by using the `per_page` parameter:  <pre><code>$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2&per_page=50\"</code></pre>  Unless specified otherwise in the description of the respective endpoint, `per_page` allows you to specify a page size up to 100 items.   ## Link-Headers  We provide you with pagination URLs in the [Link Header field](http://tools.ietf.org/html/rfc5988). Make use of this information to avoid building pagination URLs yourself.  <pre><code>Link: <https://api.phrase.com/v2/projects?page=1>; rel=\"first\", <https://api.phrase.com/v2/projects?page=3>; rel=\"prev\", <https://api.phrase.com/v2/projects?page=5>; rel=\"next\", <https://api.phrase.com/v2/projects?page=9>; rel=\"last\"</code></pre>  Possible `rel` values are:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Value</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\">next</td>         <td class=\"basic-table__cell\">URL of the next page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">last</td>         <td class=\"basic-table__cell\">URL of the last page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">first</td>         <td class=\"basic-table__cell\">URL of the first page of results</td>       </tr>       <tr>         <td class=\"basic-table__cell\">prev</td>         <td class=\"basic-table__cell\">URL of the previous page of results</td>       </tr>     </tbody>   </table> </div>  ## Rate Limiting  All API endpoints are subject to rate limiting to ensure good performance for all customers. The rate limit is calculated per user:  * 1000 requests per 5 minutes * 4 concurrent (parallel) requests  For your convenience we send information on the current rate limit within the response headers:  <div class=\"table-responsive\">   <table class=\"basic-table\">     <thead>       <tr class=\"basic-table__row basic-table__row--header\">         <th class=\"basic-table__cell basic-table__cell--header\">Header</th>         <th class=\"basic-table__cell basic-table__cell--header\">Description</th>       </tr>     </thead>     <tbody>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Limit</code></td>         <td class=\"basic-table__cell\">Number of max requests allowed in the current time period</td>       </tr>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Remaining</code></td>         <td class=\"basic-table__cell\">Number of remaining requests in the current time period</td>       </tr>       <tr>         <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Reset</code></td>         <td class=\"basic-table__cell\">Timestamp of end of current time period as UNIX timestamp</td>       </tr>     </tbody>   </table> </div>  If you should run into the rate limit, you will receive the HTTP status code `429: Too many requests`.  If you should need higher rate limits, [contact us](https://phrase.com/contact).   ## Conditional GET requests / HTTP Caching  <div class=\"alert alert-info\"><p><strong>Note:</strong> Conditional GET requests are currently only supported for <a href=\"#locales_download\">locales#download</a> and <a href=\"#translations_index\">translations#index</a></p></div>  We will return an ETag or Last-Modified header with most GET requests. When you request a resource we recommend to store this value and submit them on subsequent requests as `If-Modified-Since` and `If-None-Match` headers. If the resource has not changed in the meantime, we will return the status `304 Not Modified` instead of rendering and returning the resource again. In most cases this is less time-consuming and makes your application/integration faster.  Please note that all conditional requests that return a response with status 304 don't count against your rate limits.  <pre><code>$ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" HTTP/1.1 200 OK ETag: \"abcd1234abcdefefabcd1234efab1234\" Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 200 OK  $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H 'If-None-Match: \"abcd1234abcdefefabcd1234efab1234\"' HTTP/1.1 304 Not Modified ETag: \"abcd1234abcdefefabcd1234efab1234\" Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 304 Not Modified  $ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H \"If-Modified-Since: Wed, 28 Jan 2015 15:31:30 UTC\" HTTP/1.1 304 Not Modified Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC Status: 304 Not Modified</code></pre>   ## JSONP  The Phrase API supports [JSONP](http://en.wikipedia.org/wiki/JSONP) for all GET requests in order to deal with cross-domain request issues. Just send a `?callback` parameter along with the request to specify the Javascript function name to be called with the response content:  <pre><code>$ curl \"https://api.phrase.com/v2/projects?callback=myFunction\"</code></pre>  The response will include the normal output for that endpoint, along with a `meta` section including header data:  <pre><code>myFunction({   {     \"meta\": {       \"status\": 200,       ...     },     \"data\": [       {         \"id\": \"1234abcd1234abc1234abcd1234abc\"         ...       }     ]   } });</code></pre>  To authenticate a JSONP request, you can send a valid [access token](#authentication) as the `?access_token` parameter along the request:  <pre><code>$ curl \"https://api.phrase.com/v2/projects?callback=myFunction&access_token=ACCESS-TOKEN\"</code></pre> 
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-08T12:34:12.395Z[Etc/UTC]")
public class OrderCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_LSP = "lsp";
  @SerializedName(SERIALIZED_NAME_LSP)
  private String lsp;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE_ID = "source_locale_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE_ID)
  private String sourceLocaleId;

  public static final String SERIALIZED_NAME_TARGET_LOCALE_IDS = "target_locale_ids";
  @SerializedName(SERIALIZED_NAME_TARGET_LOCALE_IDS)
  private List<String> targetLocaleIds = null;

  public static final String SERIALIZED_NAME_TRANSLATION_TYPE = "translation_type";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_TYPE)
  private String translationType;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STYLEGUIDE_ID = "styleguide_id";
  @SerializedName(SERIALIZED_NAME_STYLEGUIDE_ID)
  private String styleguideId;

  public static final String SERIALIZED_NAME_UNVERIFY_TRANSLATIONS_UPON_DELIVERY = "unverify_translations_upon_delivery";
  @SerializedName(SERIALIZED_NAME_UNVERIFY_TRANSLATIONS_UPON_DELIVERY)
  private Boolean unverifyTranslationsUponDelivery;

  public static final String SERIALIZED_NAME_INCLUDE_UNTRANSLATED_KEYS = "include_untranslated_keys";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNTRANSLATED_KEYS)
  private Boolean includeUntranslatedKeys;

  public static final String SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS = "include_unverified_translations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS)
  private Boolean includeUnverifiedTranslations;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Boolean quality;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Boolean priority;


  public OrderCreateParameters branch(String branch) {
    
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


  public OrderCreateParameters lsp(String lsp) {
    
    this.lsp = lsp;
    return this;
  }

   /**
   * Name of the LSP that should process this order. Can be one of gengo, textmaster.
   * @return lsp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "textmaster", value = "Name of the LSP that should process this order. Can be one of gengo, textmaster.")

  public String getLsp() {
    return lsp;
  }


  public void setLsp(String lsp) {
    this.lsp = lsp;
  }


  public OrderCreateParameters sourceLocaleId(String sourceLocaleId) {
    
    this.sourceLocaleId = sourceLocaleId;
    return this;
  }

   /**
   * Source locale for the order. Can be the name or public id of the source locale. Preferred is the public id.
   * @return sourceLocaleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234abcd1234", value = "Source locale for the order. Can be the name or public id of the source locale. Preferred is the public id.")

  public String getSourceLocaleId() {
    return sourceLocaleId;
  }


  public void setSourceLocaleId(String sourceLocaleId) {
    this.sourceLocaleId = sourceLocaleId;
  }


  public OrderCreateParameters targetLocaleIds(List<String> targetLocaleIds) {
    
    this.targetLocaleIds = targetLocaleIds;
    return this;
  }

  public OrderCreateParameters addTargetLocaleIdsItem(String targetLocaleIdsItem) {
    if (this.targetLocaleIds == null) {
      this.targetLocaleIds = new ArrayList<String>();
    }
    this.targetLocaleIds.add(targetLocaleIdsItem);
    return this;
  }

   /**
   * List of target locales you want the source content translate to. Can be the name or public id of the target locales. Preferred is the public id.
   * @return targetLocaleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1234abcd1234abcd1234abcd1234abcd\",\"abcd1234abcd1234abcd1234abcd1234\"]", value = "List of target locales you want the source content translate to. Can be the name or public id of the target locales. Preferred is the public id.")

  public List<String> getTargetLocaleIds() {
    return targetLocaleIds;
  }


  public void setTargetLocaleIds(List<String> targetLocaleIds) {
    this.targetLocaleIds = targetLocaleIds;
  }


  public OrderCreateParameters translationType(String translationType) {
    
    this.translationType = translationType;
    return this;
  }

   /**
   * Name of the quality level, availability depends on the LSP. Can be one of:  standard, pro (for orders processed by Gengo) and one of regular, premium, enterprise (for orders processed by TextMaster)
   * @return translationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "premium", value = "Name of the quality level, availability depends on the LSP. Can be one of:  standard, pro (for orders processed by Gengo) and one of regular, premium, enterprise (for orders processed by TextMaster)")

  public String getTranslationType() {
    return translationType;
  }


  public void setTranslationType(String translationType) {
    this.translationType = translationType;
  }


  public OrderCreateParameters tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Tag you want to order translations for.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-awesome-feature", value = "Tag you want to order translations for.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public OrderCreateParameters message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message that is displayed to the translators for description.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please make everything sound really nice :)", value = "Message that is displayed to the translators for description.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public OrderCreateParameters styleguideId(String styleguideId) {
    
    this.styleguideId = styleguideId;
    return this;
  }

   /**
   * Style guide for translators to be sent with the order.
   * @return styleguideId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234abcd1234abcd1234abcd1234abcd", value = "Style guide for translators to be sent with the order.")

  public String getStyleguideId() {
    return styleguideId;
  }


  public void setStyleguideId(String styleguideId) {
    this.styleguideId = styleguideId;
  }


  public OrderCreateParameters unverifyTranslationsUponDelivery(Boolean unverifyTranslationsUponDelivery) {
    
    this.unverifyTranslationsUponDelivery = unverifyTranslationsUponDelivery;
    return this;
  }

   /**
   * Unverify translations upon delivery.
   * @return unverifyTranslationsUponDelivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unverify translations upon delivery.")

  public Boolean getUnverifyTranslationsUponDelivery() {
    return unverifyTranslationsUponDelivery;
  }


  public void setUnverifyTranslationsUponDelivery(Boolean unverifyTranslationsUponDelivery) {
    this.unverifyTranslationsUponDelivery = unverifyTranslationsUponDelivery;
  }


  public OrderCreateParameters includeUntranslatedKeys(Boolean includeUntranslatedKeys) {
    
    this.includeUntranslatedKeys = includeUntranslatedKeys;
    return this;
  }

   /**
   * Order translations for keys with untranslated content in the selected target locales.
   * @return includeUntranslatedKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order translations for keys with untranslated content in the selected target locales.")

  public Boolean getIncludeUntranslatedKeys() {
    return includeUntranslatedKeys;
  }


  public void setIncludeUntranslatedKeys(Boolean includeUntranslatedKeys) {
    this.includeUntranslatedKeys = includeUntranslatedKeys;
  }


  public OrderCreateParameters includeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
    return this;
  }

   /**
   * Order translations for keys with unverified content in the selected target locales.
   * @return includeUnverifiedTranslations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order translations for keys with unverified content in the selected target locales.")

  public Boolean getIncludeUnverifiedTranslations() {
    return includeUnverifiedTranslations;
  }


  public void setIncludeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
  }


  public OrderCreateParameters category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category to use (required for orders processed by TextMaster).
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C021", value = "Category to use (required for orders processed by TextMaster).")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public OrderCreateParameters quality(Boolean quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Extra proofreading option to ensure consistency in vocabulary and style. Only available for orders processed by TextMaster.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra proofreading option to ensure consistency in vocabulary and style. Only available for orders processed by TextMaster.")

  public Boolean getQuality() {
    return quality;
  }


  public void setQuality(Boolean quality) {
    this.quality = quality;
  }


  public OrderCreateParameters priority(Boolean priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Indicates whether the priority option should be ordered which decreases turnaround time by 30%. Available only for orders processed by TextMaster.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the priority option should be ordered which decreases turnaround time by 30%. Available only for orders processed by TextMaster.")

  public Boolean getPriority() {
    return priority;
  }


  public void setPriority(Boolean priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateParameters orderCreateParameters = (OrderCreateParameters) o;
    return Objects.equals(this.branch, orderCreateParameters.branch) &&
        Objects.equals(this.lsp, orderCreateParameters.lsp) &&
        Objects.equals(this.sourceLocaleId, orderCreateParameters.sourceLocaleId) &&
        Objects.equals(this.targetLocaleIds, orderCreateParameters.targetLocaleIds) &&
        Objects.equals(this.translationType, orderCreateParameters.translationType) &&
        Objects.equals(this.tag, orderCreateParameters.tag) &&
        Objects.equals(this.message, orderCreateParameters.message) &&
        Objects.equals(this.styleguideId, orderCreateParameters.styleguideId) &&
        Objects.equals(this.unverifyTranslationsUponDelivery, orderCreateParameters.unverifyTranslationsUponDelivery) &&
        Objects.equals(this.includeUntranslatedKeys, orderCreateParameters.includeUntranslatedKeys) &&
        Objects.equals(this.includeUnverifiedTranslations, orderCreateParameters.includeUnverifiedTranslations) &&
        Objects.equals(this.category, orderCreateParameters.category) &&
        Objects.equals(this.quality, orderCreateParameters.quality) &&
        Objects.equals(this.priority, orderCreateParameters.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, lsp, sourceLocaleId, targetLocaleIds, translationType, tag, message, styleguideId, unverifyTranslationsUponDelivery, includeUntranslatedKeys, includeUnverifiedTranslations, category, quality, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    lsp: ").append(toIndentedString(lsp)).append("\n");
    sb.append("    sourceLocaleId: ").append(toIndentedString(sourceLocaleId)).append("\n");
    sb.append("    targetLocaleIds: ").append(toIndentedString(targetLocaleIds)).append("\n");
    sb.append("    translationType: ").append(toIndentedString(translationType)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    styleguideId: ").append(toIndentedString(styleguideId)).append("\n");
    sb.append("    unverifyTranslationsUponDelivery: ").append(toIndentedString(unverifyTranslationsUponDelivery)).append("\n");
    sb.append("    includeUntranslatedKeys: ").append(toIndentedString(includeUntranslatedKeys)).append("\n");
    sb.append("    includeUnverifiedTranslations: ").append(toIndentedString(includeUnverifiedTranslations)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

