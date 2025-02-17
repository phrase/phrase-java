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
import com.phrase.client.model.Error;
import com.phrase.client.model.ErrorError;
import com.phrase.client.model.QualityPerformanceScoreList200ResponseAnyOf;
import com.phrase.client.model.QualityPerformanceScoreList200ResponseAnyOfData;
import com.phrase.client.model.QualityPerformanceScoreList200ResponseAnyOfErrorsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QualityPerformanceScoreList200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T10:43:14.656589345Z[Etc/UTC]")
public class QualityPerformanceScoreList200Response {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorError error;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private QualityPerformanceScoreList200ResponseAnyOfData data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<QualityPerformanceScoreList200ResponseAnyOfErrorsInner> errors;

  public QualityPerformanceScoreList200Response() {
  }

  public QualityPerformanceScoreList200Response error(ErrorError error) {
    
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


  public QualityPerformanceScoreList200Response data(QualityPerformanceScoreList200ResponseAnyOfData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public QualityPerformanceScoreList200ResponseAnyOfData getData() {
    return data;
  }


  public void setData(QualityPerformanceScoreList200ResponseAnyOfData data) {
    this.data = data;
  }


  public QualityPerformanceScoreList200Response errors(List<QualityPerformanceScoreList200ResponseAnyOfErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public QualityPerformanceScoreList200Response addErrorsItem(QualityPerformanceScoreList200ResponseAnyOfErrorsInner errorsItem) {
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

  public List<QualityPerformanceScoreList200ResponseAnyOfErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<QualityPerformanceScoreList200ResponseAnyOfErrorsInner> errors) {
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
    QualityPerformanceScoreList200Response qualityPerformanceScoreList200Response = (QualityPerformanceScoreList200Response) o;
    return Objects.equals(this.error, qualityPerformanceScoreList200Response.error) &&
        Objects.equals(this.data, qualityPerformanceScoreList200Response.data) &&
        Objects.equals(this.errors, qualityPerformanceScoreList200Response.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityPerformanceScoreList200Response {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

