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
import com.phrase.client.model.ErrorError;
import java.io.IOException;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Error field for when the request completely fails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-31T08:36:18.299935511Z[Etc/UTC]")
public class Error {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorError error;

  public Error() {
  }

  public Error error(ErrorError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable

  public ErrorError getError() {
    return error;
  }


  public void setError(ErrorError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.error, error.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

