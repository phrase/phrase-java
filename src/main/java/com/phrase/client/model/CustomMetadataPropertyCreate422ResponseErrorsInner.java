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
 * CustomMetadataPropertyCreate422ResponseErrorsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-19T11:27:31.753930Z[Etc/UTC]")
public class CustomMetadataPropertyCreate422ResponseErrorsInner {
  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public CustomMetadataPropertyCreate422ResponseErrorsInner() {
  }

  public CustomMetadataPropertyCreate422ResponseErrorsInner resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public CustomMetadataPropertyCreate422ResponseErrorsInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public CustomMetadataPropertyCreate422ResponseErrorsInner message(String message) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMetadataPropertyCreate422ResponseErrorsInner customMetadataPropertyCreate422ResponseErrorsInner = (CustomMetadataPropertyCreate422ResponseErrorsInner) o;
    return Objects.equals(this.resource, customMetadataPropertyCreate422ResponseErrorsInner.resource) &&
        Objects.equals(this.field, customMetadataPropertyCreate422ResponseErrorsInner.field) &&
        Objects.equals(this.message, customMetadataPropertyCreate422ResponseErrorsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, field, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMetadataPropertyCreate422ResponseErrorsInner {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

