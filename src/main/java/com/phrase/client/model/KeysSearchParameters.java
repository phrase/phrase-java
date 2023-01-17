/*
 * Phrase Strings API Reference
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@phrase.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.phrase.client.model;

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

/**
 * KeysSearchParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-17T09:43:06.786165Z[Etc/UTC]")
public class KeysSearchParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private String sort;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public static final String SERIALIZED_NAME_Q = "q";
  @SerializedName(SERIALIZED_NAME_Q)
  private String q;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;


  public KeysSearchParameters branch(String branch) {
    
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


  public KeysSearchParameters sort(String sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Sort by field. Can be one of: name, created_at, updated_at.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "updated_at", value = "Sort by field. Can be one of: name, created_at, updated_at.")

  public String getSort() {
    return sort;
  }


  public void setSort(String sort) {
    this.sort = sort;
  }


  public KeysSearchParameters order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * Order direction. Can be one of: asc, desc.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "desc", value = "Order direction. Can be one of: asc, desc.")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }


  public KeysSearchParameters q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * Specify a query to do broad search for keys by name (including wildcards).&lt;br&gt;&lt;br&gt; The following qualifiers are also supported in the search term:&lt;br&gt; &lt;ul&gt;   &lt;li&gt;&lt;code&gt;ids:key_id,...&lt;/code&gt; for queries on a comma-separated list of ids&lt;/li&gt;   &lt;li&gt;&lt;code&gt;name:key_name&lt;/code&gt; for text queries on exact key names - spaces, commas, and colons  need to be escaped with double backslashes&lt;/li&gt;   &lt;li&gt;&lt;code&gt;tags:tag_name&lt;/code&gt; to filter for keys with certain tags&lt;/li&gt;   &lt;li&gt;&lt;code&gt;translated:{true|false}&lt;/code&gt; for translation status (also requires &lt;code&gt;locale_id&lt;/code&gt; to be specified)&lt;/li&gt;   &lt;li&gt;&lt;code&gt;updated_at:{&gt;&#x3D;|&lt;&#x3D;}2013-02-21T00:00:00Z&lt;/code&gt; for date range queries&lt;/li&gt;   &lt;li&gt;&lt;code&gt;unmentioned_in_upload:upload_id&lt;/code&gt; to filter keys unmentioned within upload&lt;/li&gt; &lt;/ul&gt; Find more examples &lt;a href&#x3D;\&quot;#overview--usage-examples\&quot;&gt;here&lt;/a&gt;. Please note: If &lt;code&gt;tags&lt;/code&gt; are added to filter the search, the search will be limited to a maximum of 65,536 tagged keys. 
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mykey* translated:true", value = "Specify a query to do broad search for keys by name (including wildcards).<br><br> The following qualifiers are also supported in the search term:<br> <ul>   <li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>   <li><code>name:key_name</code> for text queries on exact key names - spaces, commas, and colons  need to be escaped with double backslashes</li>   <li><code>tags:tag_name</code> to filter for keys with certain tags</li>   <li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>   <li><code>updated_at:{>=|<=}2013-02-21T00:00:00Z</code> for date range queries</li>   <li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li> </ul> Find more examples <a href=\"#overview--usage-examples\">here</a>. Please note: If <code>tags</code> are added to filter the search, the search will be limited to a maximum of 65,536 tagged keys. ")

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public KeysSearchParameters localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * Locale used to determine the translation state of a key when filtering for untranslated or translated keys.
   * @return localeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234abcd1234", value = "Locale used to determine the translation state of a key when filtering for untranslated or translated keys.")

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeysSearchParameters keysSearchParameters = (KeysSearchParameters) o;
    return Objects.equals(this.branch, keysSearchParameters.branch) &&
        Objects.equals(this.sort, keysSearchParameters.sort) &&
        Objects.equals(this.order, keysSearchParameters.order) &&
        Objects.equals(this.q, keysSearchParameters.q) &&
        Objects.equals(this.localeId, keysSearchParameters.localeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, sort, order, q, localeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeysSearchParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
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

