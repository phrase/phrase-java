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
 * GitlabSyncExport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T07:48:10.623085Z[Etc/UTC]")
public class GitlabSyncExport {
  public static final String SERIALIZED_NAME_MERGE_REQUEST_ID = "merge_request_id";
  @SerializedName(SERIALIZED_NAME_MERGE_REQUEST_ID)
  private Integer mergeRequestId;

  public static final String SERIALIZED_NAME_MERGE_REQUEST_WEB_URL = "merge_request_web_url";
  @SerializedName(SERIALIZED_NAME_MERGE_REQUEST_WEB_URL)
  private String mergeRequestWebUrl;

  public GitlabSyncExport() {
  }

  public GitlabSyncExport mergeRequestId(Integer mergeRequestId) {
    
    this.mergeRequestId = mergeRequestId;
    return this;
  }

   /**
   * Get mergeRequestId
   * @return mergeRequestId
  **/
  @javax.annotation.Nullable

  public Integer getMergeRequestId() {
    return mergeRequestId;
  }


  public void setMergeRequestId(Integer mergeRequestId) {
    this.mergeRequestId = mergeRequestId;
  }


  public GitlabSyncExport mergeRequestWebUrl(String mergeRequestWebUrl) {
    
    this.mergeRequestWebUrl = mergeRequestWebUrl;
    return this;
  }

   /**
   * Get mergeRequestWebUrl
   * @return mergeRequestWebUrl
  **/
  @javax.annotation.Nullable

  public String getMergeRequestWebUrl() {
    return mergeRequestWebUrl;
  }


  public void setMergeRequestWebUrl(String mergeRequestWebUrl) {
    this.mergeRequestWebUrl = mergeRequestWebUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabSyncExport gitlabSyncExport = (GitlabSyncExport) o;
    return Objects.equals(this.mergeRequestId, gitlabSyncExport.mergeRequestId) &&
        Objects.equals(this.mergeRequestWebUrl, gitlabSyncExport.mergeRequestWebUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mergeRequestId, mergeRequestWebUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabSyncExport {\n");
    sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
    sb.append("    mergeRequestWebUrl: ").append(toIndentedString(mergeRequestWebUrl)).append("\n");
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

