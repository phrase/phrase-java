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
 * RepliesListParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-21T13:38:49.300726286Z[Etc/UTC]")
public class RepliesListParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<String> filters;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public RepliesListParameters() {
  }

  public RepliesListParameters branch(String branch) {
    
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


  public RepliesListParameters query(String query) {
    
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


  public RepliesListParameters filters(List<String> filters) {
    
    this.filters = filters;
    return this;
  }

  public RepliesListParameters addFiltersItem(String filtersItem) {
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


  public RepliesListParameters order(String order) {
    
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
    RepliesListParameters repliesListParameters = (RepliesListParameters) o;
    return Objects.equals(this.branch, repliesListParameters.branch) &&
        Objects.equals(this.query, repliesListParameters.query) &&
        Objects.equals(this.filters, repliesListParameters.filters) &&
        Objects.equals(this.order, repliesListParameters.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, query, filters, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepliesListParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

