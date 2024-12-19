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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReleaseUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T10:00:31.833213276Z[Etc/UTC]")
public class ReleaseUpdateParameters {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<String> platforms;

  public static final String SERIALIZED_NAME_APP_MIN_VERSION = "app_min_version";
  @SerializedName(SERIALIZED_NAME_APP_MIN_VERSION)
  private String appMinVersion;

  public static final String SERIALIZED_NAME_APP_MAX_VERSION = "app_max_version";
  @SerializedName(SERIALIZED_NAME_APP_MAX_VERSION)
  private String appMaxVersion;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public ReleaseUpdateParameters() {
  }

  public ReleaseUpdateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the release
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReleaseUpdateParameters platforms(List<String> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public ReleaseUpdateParameters addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * List of platforms the release should support.
   * @return platforms
  **/
  @javax.annotation.Nullable

  public List<String> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  public ReleaseUpdateParameters appMinVersion(String appMinVersion) {
    
    this.appMinVersion = appMinVersion;
    return this;
  }

   /**
   * Minimum version of the app that the release supports in semver format
   * @return appMinVersion
  **/
  @javax.annotation.Nullable

  public String getAppMinVersion() {
    return appMinVersion;
  }


  public void setAppMinVersion(String appMinVersion) {
    this.appMinVersion = appMinVersion;
  }


  public ReleaseUpdateParameters appMaxVersion(String appMaxVersion) {
    
    this.appMaxVersion = appMaxVersion;
    return this;
  }

   /**
   * Maximum version of the app that the release supports in semver format
   * @return appMaxVersion
  **/
  @javax.annotation.Nullable

  public String getAppMaxVersion() {
    return appMaxVersion;
  }


  public void setAppMaxVersion(String appMaxVersion) {
    this.appMaxVersion = appMaxVersion;
  }


  public ReleaseUpdateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Branch used for release
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
    ReleaseUpdateParameters releaseUpdateParameters = (ReleaseUpdateParameters) o;
    return Objects.equals(this.description, releaseUpdateParameters.description) &&
        Objects.equals(this.platforms, releaseUpdateParameters.platforms) &&
        Objects.equals(this.appMinVersion, releaseUpdateParameters.appMinVersion) &&
        Objects.equals(this.appMaxVersion, releaseUpdateParameters.appMaxVersion) &&
        Objects.equals(this.branch, releaseUpdateParameters.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, platforms, appMinVersion, appMaxVersion, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseUpdateParameters {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    appMinVersion: ").append(toIndentedString(appMinVersion)).append("\n");
    sb.append("    appMaxVersion: ").append(toIndentedString(appMaxVersion)).append("\n");
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

