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
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-03T08:11:20.292228Z[Etc/UTC]")
public class ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner() {
  }

  public ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * One of the translation ids passed in arguments
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner projectsQualityPerformanceScore200ResponseAnyOfErrorsInner = (ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner) o;
    return Objects.equals(this.message, projectsQualityPerformanceScore200ResponseAnyOfErrorsInner.message) &&
        Objects.equals(this.code, projectsQualityPerformanceScore200ResponseAnyOfErrorsInner.code) &&
        Objects.equals(this.id, projectsQualityPerformanceScore200ResponseAnyOfErrorsInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsQualityPerformanceScore200ResponseAnyOfErrorsInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

