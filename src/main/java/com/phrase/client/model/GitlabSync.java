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
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabSync
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-26T16:54:22.246929Z[Etc/UTC]")
public class GitlabSync {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_GITLAB_PROJECT_ID = "gitlab_project_id";
  @SerializedName(SERIALIZED_NAME_GITLAB_PROJECT_ID)
  private Integer gitlabProjectId;

  public static final String SERIALIZED_NAME_GITLAB_BRANCH_NAME = "gitlab_branch_name";
  @SerializedName(SERIALIZED_NAME_GITLAB_BRANCH_NAME)
  private String gitlabBranchName;

  public static final String SERIALIZED_NAME_AUTO_IMPORT = "auto_import";
  @SerializedName(SERIALIZED_NAME_AUTO_IMPORT)
  private Boolean autoImport;

  public static final String SERIALIZED_NAME_AUTO_IMPORT_SECRET = "auto_import_secret";
  @SerializedName(SERIALIZED_NAME_AUTO_IMPORT_SECRET)
  private String autoImportSecret;

  public static final String SERIALIZED_NAME_AUTO_IMPORT_URL = "auto_import_url";
  @SerializedName(SERIALIZED_NAME_AUTO_IMPORT_URL)
  private String autoImportUrl;

  public static final String SERIALIZED_NAME_SELF_HOSTED_API_URL = "self_hosted_api_url";
  @SerializedName(SERIALIZED_NAME_SELF_HOSTED_API_URL)
  private String selfHostedApiUrl;

  public static final String SERIALIZED_NAME_LAST_EXPORTED_AT = "last_exported_at";
  @SerializedName(SERIALIZED_NAME_LAST_EXPORTED_AT)
  private OffsetDateTime lastExportedAt;

  public static final String SERIALIZED_NAME_LAST_IMPORTED_AT = "last_imported_at";
  @SerializedName(SERIALIZED_NAME_LAST_IMPORTED_AT)
  private OffsetDateTime lastImportedAt;

  public static final String SERIALIZED_NAME_LAST_STATUS = "last_status";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS)
  private String lastStatus;

  public GitlabSync() {
  }

  public GitlabSync id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GitlabSync projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public GitlabSync gitlabProjectId(Integer gitlabProjectId) {
    
    this.gitlabProjectId = gitlabProjectId;
    return this;
  }

   /**
   * Get gitlabProjectId
   * @return gitlabProjectId
  **/
  @javax.annotation.Nullable

  public Integer getGitlabProjectId() {
    return gitlabProjectId;
  }


  public void setGitlabProjectId(Integer gitlabProjectId) {
    this.gitlabProjectId = gitlabProjectId;
  }


  public GitlabSync gitlabBranchName(String gitlabBranchName) {
    
    this.gitlabBranchName = gitlabBranchName;
    return this;
  }

   /**
   * Get gitlabBranchName
   * @return gitlabBranchName
  **/
  @javax.annotation.Nullable

  public String getGitlabBranchName() {
    return gitlabBranchName;
  }


  public void setGitlabBranchName(String gitlabBranchName) {
    this.gitlabBranchName = gitlabBranchName;
  }


  public GitlabSync autoImport(Boolean autoImport) {
    
    this.autoImport = autoImport;
    return this;
  }

   /**
   * Get autoImport
   * @return autoImport
  **/
  @javax.annotation.Nullable

  public Boolean getAutoImport() {
    return autoImport;
  }


  public void setAutoImport(Boolean autoImport) {
    this.autoImport = autoImport;
  }


  public GitlabSync autoImportSecret(String autoImportSecret) {
    
    this.autoImportSecret = autoImportSecret;
    return this;
  }

   /**
   * Get autoImportSecret
   * @return autoImportSecret
  **/
  @javax.annotation.Nullable

  public String getAutoImportSecret() {
    return autoImportSecret;
  }


  public void setAutoImportSecret(String autoImportSecret) {
    this.autoImportSecret = autoImportSecret;
  }


  public GitlabSync autoImportUrl(String autoImportUrl) {
    
    this.autoImportUrl = autoImportUrl;
    return this;
  }

   /**
   * Get autoImportUrl
   * @return autoImportUrl
  **/
  @javax.annotation.Nullable

  public String getAutoImportUrl() {
    return autoImportUrl;
  }


  public void setAutoImportUrl(String autoImportUrl) {
    this.autoImportUrl = autoImportUrl;
  }


  public GitlabSync selfHostedApiUrl(String selfHostedApiUrl) {
    
    this.selfHostedApiUrl = selfHostedApiUrl;
    return this;
  }

   /**
   * Get selfHostedApiUrl
   * @return selfHostedApiUrl
  **/
  @javax.annotation.Nullable

  public String getSelfHostedApiUrl() {
    return selfHostedApiUrl;
  }


  public void setSelfHostedApiUrl(String selfHostedApiUrl) {
    this.selfHostedApiUrl = selfHostedApiUrl;
  }


  public GitlabSync lastExportedAt(OffsetDateTime lastExportedAt) {
    
    this.lastExportedAt = lastExportedAt;
    return this;
  }

   /**
   * Get lastExportedAt
   * @return lastExportedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastExportedAt() {
    return lastExportedAt;
  }


  public void setLastExportedAt(OffsetDateTime lastExportedAt) {
    this.lastExportedAt = lastExportedAt;
  }


  public GitlabSync lastImportedAt(OffsetDateTime lastImportedAt) {
    
    this.lastImportedAt = lastImportedAt;
    return this;
  }

   /**
   * Get lastImportedAt
   * @return lastImportedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastImportedAt() {
    return lastImportedAt;
  }


  public void setLastImportedAt(OffsetDateTime lastImportedAt) {
    this.lastImportedAt = lastImportedAt;
  }


  public GitlabSync lastStatus(String lastStatus) {
    
    this.lastStatus = lastStatus;
    return this;
  }

   /**
   * Get lastStatus
   * @return lastStatus
  **/
  @javax.annotation.Nullable

  public String getLastStatus() {
    return lastStatus;
  }


  public void setLastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabSync gitlabSync = (GitlabSync) o;
    return Objects.equals(this.id, gitlabSync.id) &&
        Objects.equals(this.projectId, gitlabSync.projectId) &&
        Objects.equals(this.gitlabProjectId, gitlabSync.gitlabProjectId) &&
        Objects.equals(this.gitlabBranchName, gitlabSync.gitlabBranchName) &&
        Objects.equals(this.autoImport, gitlabSync.autoImport) &&
        Objects.equals(this.autoImportSecret, gitlabSync.autoImportSecret) &&
        Objects.equals(this.autoImportUrl, gitlabSync.autoImportUrl) &&
        Objects.equals(this.selfHostedApiUrl, gitlabSync.selfHostedApiUrl) &&
        Objects.equals(this.lastExportedAt, gitlabSync.lastExportedAt) &&
        Objects.equals(this.lastImportedAt, gitlabSync.lastImportedAt) &&
        Objects.equals(this.lastStatus, gitlabSync.lastStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, gitlabProjectId, gitlabBranchName, autoImport, autoImportSecret, autoImportUrl, selfHostedApiUrl, lastExportedAt, lastImportedAt, lastStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabSync {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    gitlabProjectId: ").append(toIndentedString(gitlabProjectId)).append("\n");
    sb.append("    gitlabBranchName: ").append(toIndentedString(gitlabBranchName)).append("\n");
    sb.append("    autoImport: ").append(toIndentedString(autoImport)).append("\n");
    sb.append("    autoImportSecret: ").append(toIndentedString(autoImportSecret)).append("\n");
    sb.append("    autoImportUrl: ").append(toIndentedString(autoImportUrl)).append("\n");
    sb.append("    selfHostedApiUrl: ").append(toIndentedString(selfHostedApiUrl)).append("\n");
    sb.append("    lastExportedAt: ").append(toIndentedString(lastExportedAt)).append("\n");
    sb.append("    lastImportedAt: ").append(toIndentedString(lastImportedAt)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
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

