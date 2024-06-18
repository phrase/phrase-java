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
import com.phrase.client.model.CustomMetadataPropertyCreate422ResponseErrorsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomMetadataPropertyCreate422Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T06:58:19.134006Z[Etc/UTC]")
public class CustomMetadataPropertyCreate422Response {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CustomMetadataPropertyCreate422ResponseErrorsInner> errors;

  public CustomMetadataPropertyCreate422Response() {
  }

  public CustomMetadataPropertyCreate422Response message(String message) {
    
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


  public CustomMetadataPropertyCreate422Response errors(List<CustomMetadataPropertyCreate422ResponseErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public CustomMetadataPropertyCreate422Response addErrorsItem(CustomMetadataPropertyCreate422ResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<CustomMetadataPropertyCreate422ResponseErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<CustomMetadataPropertyCreate422ResponseErrorsInner> errors) {
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
    CustomMetadataPropertyCreate422Response customMetadataPropertyCreate422Response = (CustomMetadataPropertyCreate422Response) o;
    return Objects.equals(this.message, customMetadataPropertyCreate422Response.message) &&
        Objects.equals(this.errors, customMetadataPropertyCreate422Response.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMetadataPropertyCreate422Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

