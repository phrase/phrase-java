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

/**
 * ScreenshotMarkerCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-30T12:04:53.528Z[Etc/UTC]")
public class ScreenshotMarkerCreateParameters {
  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public static final String SERIALIZED_NAME_PRESENTATION = "presentation";
  @SerializedName(SERIALIZED_NAME_PRESENTATION)
  private String presentation;


  public ScreenshotMarkerCreateParameters keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * Specify the Key ID which should be highlighted on the specified screenshot. The Key must belong to the project.
   * @return keyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234abcd1234", value = "Specify the Key ID which should be highlighted on the specified screenshot. The Key must belong to the project.")

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
  @ApiModelProperty(example = "{ \"x\": 100, \"y\": 100, \"w\": 100, \"h\": 100 }", value = "Presentation details of the screenshot marker in JSON format.<br/><br/>Each Screenshot Marker is represented as a rectangular shaped highlight box with the name of the specified Key attached. You can specify the marker position on the screenshot (<code>x</code>-axis and <code>y</code>-axis in pixels) from the top left corner of the screenshot and the dimensions of the marker itself (<code>w</code> and <code>h</code> in pixels).")

  public String getPresentation() {
    return presentation;
  }


  public void setPresentation(String presentation) {
    this.presentation = presentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenshotMarkerCreateParameters screenshotMarkerCreateParameters = (ScreenshotMarkerCreateParameters) o;
    return Objects.equals(this.keyId, screenshotMarkerCreateParameters.keyId) &&
        Objects.equals(this.presentation, screenshotMarkerCreateParameters.presentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, presentation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenshotMarkerCreateParameters {\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    presentation: ").append(toIndentedString(presentation)).append("\n");
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

