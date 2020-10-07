/*
 * Phrase API Reference
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.phrase.client.model.ProjectShort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ReleasePreview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T11:35:30.882Z[Etc/UTC]")
public class ReleasePreview {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_APP_MIN_VERSION = "app_min_version";
  @SerializedName(SERIALIZED_NAME_APP_MIN_VERSION)
  private String appMinVersion;

  public static final String SERIALIZED_NAME_APP_MAX_VERSION = "app_max_version";
  @SerializedName(SERIALIZED_NAME_APP_MAX_VERSION)
  private String appMaxVersion;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<String> platforms = null;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<String> environments = null;

  public static final String SERIALIZED_NAME_LOCALE_CODES = "locale_codes";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODES)
  private List<String> localeCodes = null;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectShort project;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public ReleasePreview id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ReleasePreview version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ReleasePreview appMinVersion(String appMinVersion) {
    
    this.appMinVersion = appMinVersion;
    return this;
  }

   /**
   * Get appMinVersion
   * @return appMinVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppMinVersion() {
    return appMinVersion;
  }


  public void setAppMinVersion(String appMinVersion) {
    this.appMinVersion = appMinVersion;
  }


  public ReleasePreview appMaxVersion(String appMaxVersion) {
    
    this.appMaxVersion = appMaxVersion;
    return this;
  }

   /**
   * Get appMaxVersion
   * @return appMaxVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppMaxVersion() {
    return appMaxVersion;
  }


  public void setAppMaxVersion(String appMaxVersion) {
    this.appMaxVersion = appMaxVersion;
  }


  public ReleasePreview description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReleasePreview platforms(List<String> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public ReleasePreview addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * Get platforms
   * @return platforms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  public ReleasePreview environments(List<String> environments) {
    
    this.environments = environments;
    return this;
  }

  public ReleasePreview addEnvironmentsItem(String environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEnvironments() {
    return environments;
  }


  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }


  public ReleasePreview localeCodes(List<String> localeCodes) {
    
    this.localeCodes = localeCodes;
    return this;
  }

  public ReleasePreview addLocaleCodesItem(String localeCodesItem) {
    if (this.localeCodes == null) {
      this.localeCodes = new ArrayList<>();
    }
    this.localeCodes.add(localeCodesItem);
    return this;
  }

   /**
   * Get localeCodes
   * @return localeCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocaleCodes() {
    return localeCodes;
  }


  public void setLocaleCodes(List<String> localeCodes) {
    this.localeCodes = localeCodes;
  }


  public ReleasePreview project(ProjectShort project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectShort getProject() {
    return project;
  }


  public void setProject(ProjectShort project) {
    this.project = project;
  }


  public ReleasePreview createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ReleasePreview updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleasePreview releasePreview = (ReleasePreview) o;
    return Objects.equals(this.id, releasePreview.id) &&
        Objects.equals(this.version, releasePreview.version) &&
        Objects.equals(this.appMinVersion, releasePreview.appMinVersion) &&
        Objects.equals(this.appMaxVersion, releasePreview.appMaxVersion) &&
        Objects.equals(this.description, releasePreview.description) &&
        Objects.equals(this.platforms, releasePreview.platforms) &&
        Objects.equals(this.environments, releasePreview.environments) &&
        Objects.equals(this.localeCodes, releasePreview.localeCodes) &&
        Objects.equals(this.project, releasePreview.project) &&
        Objects.equals(this.createdAt, releasePreview.createdAt) &&
        Objects.equals(this.updatedAt, releasePreview.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, appMinVersion, appMaxVersion, description, platforms, environments, localeCodes, project, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleasePreview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    appMinVersion: ").append(toIndentedString(appMinVersion)).append("\n");
    sb.append("    appMaxVersion: ").append(toIndentedString(appMaxVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    localeCodes: ").append(toIndentedString(localeCodes)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

