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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CommentsListParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T11:37:28.137785248Z[Etc/UTC]")
public class CommentsListParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_LOCALE_IDS = "locale_ids";
  @SerializedName(SERIALIZED_NAME_LOCALE_IDS)
  private List<String> localeIds;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<String> filters;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public CommentsListParameters() {
  }

  public CommentsListParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public CommentsListParameters query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Search query for comment messages
   * @return query
  **/
  @javax.annotation.Nullable

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public CommentsListParameters localeIds(List<String> localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

  public CommentsListParameters addLocaleIdsItem(String localeIdsItem) {
    if (this.localeIds == null) {
      this.localeIds = new ArrayList<>();
    }
    this.localeIds.add(localeIdsItem);
    return this;
  }

   /**
   * Search comments by their assigned locales
   * @return localeIds
  **/
  @javax.annotation.Nullable

  public List<String> getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(List<String> localeIds) {
    this.localeIds = localeIds;
  }


  public CommentsListParameters filters(List<String> filters) {
    
    this.filters = filters;
    return this;
  }

  public CommentsListParameters addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Specify filters to find comments by
   * @return filters
  **/
  @javax.annotation.Nullable

  public List<String> getFilters() {
    return filters;
  }


  public void setFilters(List<String> filters) {
    this.filters = filters;
  }


  public CommentsListParameters order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * Specify ordering of comments
   * @return order
  **/
  @javax.annotation.Nullable

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentsListParameters commentsListParameters = (CommentsListParameters) o;
    return Objects.equals(this.branch, commentsListParameters.branch) &&
        Objects.equals(this.query, commentsListParameters.query) &&
        Objects.equals(this.localeIds, commentsListParameters.localeIds) &&
        Objects.equals(this.filters, commentsListParameters.filters) &&
        Objects.equals(this.order, commentsListParameters.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, query, localeIds, filters, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentsListParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    localeIds: ").append(toIndentedString(localeIds)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

