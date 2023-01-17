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
 * SearchInAccountParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-17T14:12:49.489934Z[Etc/UTC]")
public class SearchInAccountParameters {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "locale_code";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;


  public SearchInAccountParameters query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Search query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "keyword", value = "Search query")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public SearchInAccountParameters localeCode(String localeCode) {
    
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Locale code
   * @return localeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de_DE", value = "Locale code")

  public String getLocaleCode() {
    return localeCode;
  }


  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }


  public SearchInAccountParameters page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Page")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public SearchInAccountParameters perPage(Integer perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Number of results per page
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Number of results per page")

  public Integer getPerPage() {
    return perPage;
  }


  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchInAccountParameters searchInAccountParameters = (SearchInAccountParameters) o;
    return Objects.equals(this.query, searchInAccountParameters.query) &&
        Objects.equals(this.localeCode, searchInAccountParameters.localeCode) &&
        Objects.equals(this.page, searchInAccountParameters.page) &&
        Objects.equals(this.perPage, searchInAccountParameters.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, localeCode, page, perPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchInAccountParameters {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

