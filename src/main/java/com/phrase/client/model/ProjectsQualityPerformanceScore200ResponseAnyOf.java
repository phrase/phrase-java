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
import com.phrase.client.model.ProjectsQualityPerformanceScore200ResponseAnyOfData;
import com.phrase.client.model.ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProjectsQualityPerformanceScore200ResponseAnyOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T12:02:25.948344916Z[Etc/UTC]")
public class ProjectsQualityPerformanceScore200ResponseAnyOf {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ProjectsQualityPerformanceScore200ResponseAnyOfData data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner> errors;

  public ProjectsQualityPerformanceScore200ResponseAnyOf() {
  }

  public ProjectsQualityPerformanceScore200ResponseAnyOf data(ProjectsQualityPerformanceScore200ResponseAnyOfData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public ProjectsQualityPerformanceScore200ResponseAnyOfData getData() {
    return data;
  }


  public void setData(ProjectsQualityPerformanceScore200ResponseAnyOfData data) {
    this.data = data;
  }


  public ProjectsQualityPerformanceScore200ResponseAnyOf errors(List<ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public ProjectsQualityPerformanceScore200ResponseAnyOf addErrorsItem(ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Array of errors for any failing translation IDs
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsQualityPerformanceScore200ResponseAnyOf projectsQualityPerformanceScore200ResponseAnyOf = (ProjectsQualityPerformanceScore200ResponseAnyOf) o;
    return Objects.equals(this.data, projectsQualityPerformanceScore200ResponseAnyOf.data) &&
        Objects.equals(this.errors, projectsQualityPerformanceScore200ResponseAnyOf.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsQualityPerformanceScore200ResponseAnyOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

