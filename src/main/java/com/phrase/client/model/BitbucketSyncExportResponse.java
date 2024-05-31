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
 * BitbucketSyncExportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T12:12:09.100207Z[Etc/UTC]")
public class BitbucketSyncExportResponse {
  public static final String SERIALIZED_NAME_STATUS_PATH = "status_path";
  @SerializedName(SERIALIZED_NAME_STATUS_PATH)
  private String statusPath;

  public BitbucketSyncExportResponse() {
  }

  public BitbucketSyncExportResponse statusPath(String statusPath) {
    
    this.statusPath = statusPath;
    return this;
  }

   /**
   * Get statusPath
   * @return statusPath
  **/
  @javax.annotation.Nullable

  public String getStatusPath() {
    return statusPath;
  }


  public void setStatusPath(String statusPath) {
    this.statusPath = statusPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitbucketSyncExportResponse bitbucketSyncExportResponse = (BitbucketSyncExportResponse) o;
    return Objects.equals(this.statusPath, bitbucketSyncExportResponse.statusPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitbucketSyncExportResponse {\n");
    sb.append("    statusPath: ").append(toIndentedString(statusPath)).append("\n");
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

