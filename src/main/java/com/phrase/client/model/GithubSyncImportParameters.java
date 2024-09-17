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
 * GithubSyncImportParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-17T12:12:18.933623Z[Etc/UTC]")
public class GithubSyncImportParameters {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public GithubSyncImportParameters() {
  }

  public GithubSyncImportParameters projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Project ID to specify the actual project the GitHub import should be triggered in.
   * @return projectId
  **/
  @javax.annotation.Nullable

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubSyncImportParameters githubSyncImportParameters = (GithubSyncImportParameters) o;
    return Objects.equals(this.projectId, githubSyncImportParameters.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubSyncImportParameters {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

