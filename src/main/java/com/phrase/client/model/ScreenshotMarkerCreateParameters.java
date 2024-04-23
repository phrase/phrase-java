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
 * ScreenshotMarkerCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T09:45:32.972161Z[Etc/UTC]")
public class ScreenshotMarkerCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public static final String SERIALIZED_NAME_PRESENTATION = "presentation";
  @SerializedName(SERIALIZED_NAME_PRESENTATION)
  private String presentation;

  public ScreenshotMarkerCreateParameters() {
  }

  public ScreenshotMarkerCreateParameters branch(String branch) {
    
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


  public ScreenshotMarkerCreateParameters keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * Specify the Key ID which should be highlighted on the specified screenshot. The Key must belong to the project.
   * @return keyId
  **/
  @javax.annotation.Nonnull

  public String getKeyId() {
    return keyId;
  }


  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  public ScreenshotMarkerCreateParameters presentation(String presentation) {
    
    this.presentation = presentation;
    return this;
  }

   /**
   * Presentation details of the screenshot marker in JSON format.&lt;br/&gt;&lt;br/&gt;Each Screenshot Marker is represented as a rectangular shaped highlight box with the name of the specified Key attached. You can specify the marker position on the screenshot (&lt;code&gt;x&lt;/code&gt;-axis and &lt;code&gt;y&lt;/code&gt;-axis in pixels) from the top left corner of the screenshot and the dimensions of the marker itself (&lt;code&gt;w&lt;/code&gt; and &lt;code&gt;h&lt;/code&gt; in pixels).
   * @return presentation
  **/
  @javax.annotation.Nullable

  public String getPresentation() {
    return presentation;
  }


  public void setPresentation(String presentation) {
    this.presentation = presentation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotMarkerCreateParameters screenshotMarkerCreateParameters = (ScreenshotMarkerCreateParameters) o;
    return Objects.equals(this.branch, screenshotMarkerCreateParameters.branch) &&
        Objects.equals(this.keyId, screenshotMarkerCreateParameters.keyId) &&
        Objects.equals(this.presentation, screenshotMarkerCreateParameters.presentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, keyId, presentation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotMarkerCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    presentation: ").append(toIndentedString(presentation)).append("\n");
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

