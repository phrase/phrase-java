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
 * JobCommentCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T08:16:49.478835182Z[Etc/UTC]")
public class JobCommentCreateParameters {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public JobCommentCreateParameters() {
  }

  public JobCommentCreateParameters message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Job comment message
   * @return message
  **/
  @javax.annotation.Nullable

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public JobCommentCreateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Branch name for the job
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCommentCreateParameters jobCommentCreateParameters = (JobCommentCreateParameters) o;
    return Objects.equals(this.message, jobCommentCreateParameters.message) &&
        Objects.equals(this.branch, jobCommentCreateParameters.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCommentCreateParameters {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

