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
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ScreenshotUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-05T10:26:56.450874Z[Etc/UTC]")
public class ScreenshotUpdateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private File filename;

  public ScreenshotUpdateParameters() {
  }

  public ScreenshotUpdateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public ScreenshotUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the screenshot
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ScreenshotUpdateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the screenshot
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ScreenshotUpdateParameters filename(File filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Screenshot file
   * @return filename
  **/
  @javax.annotation.Nullable

  public File getFilename() {
    return filename;
  }


  public void setFilename(File filename) {
    this.filename = filename;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotUpdateParameters screenshotUpdateParameters = (ScreenshotUpdateParameters) o;
    return Objects.equals(this.branch, screenshotUpdateParameters.branch) &&
        Objects.equals(this.name, screenshotUpdateParameters.name) &&
        Objects.equals(this.description, screenshotUpdateParameters.description) &&
        Objects.equals(this.filename, screenshotUpdateParameters.filename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, description, filename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotUpdateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

