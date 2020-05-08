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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DistributionCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-08T10:17:29.617Z[Etc/UTC]")
public class DistributionCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<String> platforms = null;

  public static final String SERIALIZED_NAME_FORMAT_OPTIONS = "format_options";
  @SerializedName(SERIALIZED_NAME_FORMAT_OPTIONS)
  private Map<String, String> formatOptions = null;

  public static final String SERIALIZED_NAME_FALLBACK_TO_NON_REGIONAL_LOCALE = "fallback_to_non_regional_locale";
  @SerializedName(SERIALIZED_NAME_FALLBACK_TO_NON_REGIONAL_LOCALE)
  private Boolean fallbackToNonRegionalLocale;

  public static final String SERIALIZED_NAME_FALLBACK_TO_DEFAULT_LOCALE = "fallback_to_default_locale";
  @SerializedName(SERIALIZED_NAME_FALLBACK_TO_DEFAULT_LOCALE)
  private Boolean fallbackToDefaultLocale;

  public static final String SERIALIZED_NAME_USE_LAST_REVIEWED_VERSION = "use_last_reviewed_version";
  @SerializedName(SERIALIZED_NAME_USE_LAST_REVIEWED_VERSION)
  private Boolean useLastReviewedVersion;


  public DistributionCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the distribution
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Android Distribution", value = "Name of the distribution")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DistributionCreateParameters projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Project id the distribution should be assigned to.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234", value = "Project id the distribution should be assigned to.")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public DistributionCreateParameters platforms(List<String> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public DistributionCreateParameters addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<String>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * List of platforms the distribution should support.
   * @return platforms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"android\",\"ios\"]", value = "List of platforms the distribution should support.")

  public List<String> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  public DistributionCreateParameters formatOptions(Map<String, String> formatOptions) {
    
    this.formatOptions = formatOptions;
    return this;
  }

  public DistributionCreateParameters putFormatOptionsItem(String key, String formatOptionsItem) {
    if (this.formatOptions == null) {
      this.formatOptions = new HashMap<String, String>();
    }
    this.formatOptions.put(key, formatOptionsItem);
    return this;
  }

   /**
   * Additional formatting and render options. Only &lt;code&gt;enclose_in_cdata&lt;/code&gt; is available for platform &lt;code&gt;android&lt;/code&gt;.
   * @return formatOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{xml:{enclose_in_cdata:'1'}}", value = "Additional formatting and render options. Only <code>enclose_in_cdata</code> is available for platform <code>android</code>.")

  public Map<String, String> getFormatOptions() {
    return formatOptions;
  }


  public void setFormatOptions(Map<String, String> formatOptions) {
    this.formatOptions = formatOptions;
  }


  public DistributionCreateParameters fallbackToNonRegionalLocale(Boolean fallbackToNonRegionalLocale) {
    
    this.fallbackToNonRegionalLocale = fallbackToNonRegionalLocale;
    return this;
  }

   /**
   * Indicates whether to fallback to non regional locale when locale can not be found
   * @return fallbackToNonRegionalLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether to fallback to non regional locale when locale can not be found")

  public Boolean getFallbackToNonRegionalLocale() {
    return fallbackToNonRegionalLocale;
  }


  public void setFallbackToNonRegionalLocale(Boolean fallbackToNonRegionalLocale) {
    this.fallbackToNonRegionalLocale = fallbackToNonRegionalLocale;
  }


  public DistributionCreateParameters fallbackToDefaultLocale(Boolean fallbackToDefaultLocale) {
    
    this.fallbackToDefaultLocale = fallbackToDefaultLocale;
    return this;
  }

   /**
   * Indicates whether to fallback to projects default locale when locale can not be found
   * @return fallbackToDefaultLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether to fallback to projects default locale when locale can not be found")

  public Boolean getFallbackToDefaultLocale() {
    return fallbackToDefaultLocale;
  }


  public void setFallbackToDefaultLocale(Boolean fallbackToDefaultLocale) {
    this.fallbackToDefaultLocale = fallbackToDefaultLocale;
  }


  public DistributionCreateParameters useLastReviewedVersion(Boolean useLastReviewedVersion) {
    
    this.useLastReviewedVersion = useLastReviewedVersion;
    return this;
  }

   /**
   * Use last reviewed instead of latest translation in a project
   * @return useLastReviewedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Use last reviewed instead of latest translation in a project")

  public Boolean getUseLastReviewedVersion() {
    return useLastReviewedVersion;
  }


  public void setUseLastReviewedVersion(Boolean useLastReviewedVersion) {
    this.useLastReviewedVersion = useLastReviewedVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionCreateParameters distributionCreateParameters = (DistributionCreateParameters) o;
    return Objects.equals(this.name, distributionCreateParameters.name) &&
        Objects.equals(this.projectId, distributionCreateParameters.projectId) &&
        Objects.equals(this.platforms, distributionCreateParameters.platforms) &&
        Objects.equals(this.formatOptions, distributionCreateParameters.formatOptions) &&
        Objects.equals(this.fallbackToNonRegionalLocale, distributionCreateParameters.fallbackToNonRegionalLocale) &&
        Objects.equals(this.fallbackToDefaultLocale, distributionCreateParameters.fallbackToDefaultLocale) &&
        Objects.equals(this.useLastReviewedVersion, distributionCreateParameters.useLastReviewedVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId, platforms, formatOptions, fallbackToNonRegionalLocale, fallbackToDefaultLocale, useLastReviewedVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    formatOptions: ").append(toIndentedString(formatOptions)).append("\n");
    sb.append("    fallbackToNonRegionalLocale: ").append(toIndentedString(fallbackToNonRegionalLocale)).append("\n");
    sb.append("    fallbackToDefaultLocale: ").append(toIndentedString(fallbackToDefaultLocale)).append("\n");
    sb.append("    useLastReviewedVersion: ").append(toIndentedString(useLastReviewedVersion)).append("\n");
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

