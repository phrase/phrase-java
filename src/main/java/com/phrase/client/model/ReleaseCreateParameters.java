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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReleaseCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T10:34:30.723Z[Etc/UTC]")
public class ReleaseCreateParameters {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<String> platforms = null;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;


  public ReleaseCreateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the release
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My first Release", value = "Description of the release")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReleaseCreateParameters platforms(List<String> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public ReleaseCreateParameters addPlatformsItem(String platformsItem) {
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
  @ApiModelProperty(example = "[\"android\",\"ios\"]", value = "List of platforms the release should support.")

  public List<String> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  public ReleaseCreateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Branch used for release
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-feature-branch", value = "Branch used for release")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseCreateParameters releaseCreateParameters = (ReleaseCreateParameters) o;
    return Objects.equals(this.description, releaseCreateParameters.description) &&
        Objects.equals(this.platforms, releaseCreateParameters.platforms) &&
        Objects.equals(this.branch, releaseCreateParameters.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, platforms, branch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseCreateParameters {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

