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
import com.phrase.client.model.ProjectShort;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RepoSync
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-06T08:22:22.677493027Z[Etc/UTC]")
public class RepoSync {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectShort project;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_AUTO_IMPORT = "auto_import";
  @SerializedName(SERIALIZED_NAME_AUTO_IMPORT)
  private Boolean autoImport;

  public static final String SERIALIZED_NAME_REPO_NAME = "repo_name";
  @SerializedName(SERIALIZED_NAME_REPO_NAME)
  private String repoName;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_IMPORT_AT = "last_import_at";
  @SerializedName(SERIALIZED_NAME_LAST_IMPORT_AT)
  private OffsetDateTime lastImportAt;

  public static final String SERIALIZED_NAME_LAST_EXPORT_AT = "last_export_at";
  @SerializedName(SERIALIZED_NAME_LAST_EXPORT_AT)
  private OffsetDateTime lastExportAt;

  public RepoSync() {
  }

  public RepoSync id(String id) {
    
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


  public RepoSync project(ProjectShort project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public ProjectShort getProject() {
    return project;
  }


  public void setProject(ProjectShort project) {
    this.project = project;
  }


  public RepoSync provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public RepoSync enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RepoSync autoImport(Boolean autoImport) {
    
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


  public RepoSync repoName(String repoName) {
    
    this.repoName = repoName;
    return this;
  }

   /**
   * Get repoName
   * @return repoName
  **/
  @javax.annotation.Nullable

  public String getRepoName() {
    return repoName;
  }


  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }


  public RepoSync createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RepoSync lastImportAt(OffsetDateTime lastImportAt) {
    
    this.lastImportAt = lastImportAt;
    return this;
  }

   /**
   * Get lastImportAt
   * @return lastImportAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastImportAt() {
    return lastImportAt;
  }


  public void setLastImportAt(OffsetDateTime lastImportAt) {
    this.lastImportAt = lastImportAt;
  }


  public RepoSync lastExportAt(OffsetDateTime lastExportAt) {
    
    this.lastExportAt = lastExportAt;
    return this;
  }

   /**
   * Get lastExportAt
   * @return lastExportAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastExportAt() {
    return lastExportAt;
  }


  public void setLastExportAt(OffsetDateTime lastExportAt) {
    this.lastExportAt = lastExportAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoSync repoSync = (RepoSync) o;
    return Objects.equals(this.id, repoSync.id) &&
        Objects.equals(this.project, repoSync.project) &&
        Objects.equals(this.provider, repoSync.provider) &&
        Objects.equals(this.enabled, repoSync.enabled) &&
        Objects.equals(this.autoImport, repoSync.autoImport) &&
        Objects.equals(this.repoName, repoSync.repoName) &&
        Objects.equals(this.createdAt, repoSync.createdAt) &&
        Objects.equals(this.lastImportAt, repoSync.lastImportAt) &&
        Objects.equals(this.lastExportAt, repoSync.lastExportAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, project, provider, enabled, autoImport, repoName, createdAt, lastImportAt, lastExportAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoSync {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoImport: ").append(toIndentedString(autoImport)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastImportAt: ").append(toIndentedString(lastImportAt)).append("\n");
    sb.append("    lastExportAt: ").append(toIndentedString(lastExportAt)).append("\n");
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

