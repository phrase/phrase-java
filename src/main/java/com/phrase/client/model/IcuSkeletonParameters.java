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
 * IcuSkeletonParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-05T10:03:42.673594Z[Etc/UTC]")
public class IcuSkeletonParameters {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_LOCALE_CODES = "locale_codes";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODES)
  private List<String> localeCodes = null;

  public static final String SERIALIZED_NAME_ZERO_FORM_ENABLED = "zero_form_enabled";
  @SerializedName(SERIALIZED_NAME_ZERO_FORM_ENABLED)
  private Boolean zeroFormEnabled;


  public IcuSkeletonParameters content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Source content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{number, plural, one {One} other {%{n}}}", value = "Source content")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public IcuSkeletonParameters localeCodes(List<String> localeCodes) {
    
    this.localeCodes = localeCodes;
    return this;
  }

  public IcuSkeletonParameters addLocaleCodesItem(String localeCodesItem) {
    if (this.localeCodes == null) {
      this.localeCodes = new ArrayList<>();
    }
    this.localeCodes.add(localeCodesItem);
    return this;
  }

   /**
   * Locale codes
   * @return localeCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"en\"]", value = "Locale codes")

  public List<String> getLocaleCodes() {
    return localeCodes;
  }


  public void setLocaleCodes(List<String> localeCodes) {
    this.localeCodes = localeCodes;
  }


  public IcuSkeletonParameters zeroFormEnabled(Boolean zeroFormEnabled) {
    
    this.zeroFormEnabled = zeroFormEnabled;
    return this;
  }

   /**
   * Indicates whether the zero form should be included or excluded in the returned skeletons
   * @return zeroFormEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the zero form should be included or excluded in the returned skeletons")

  public Boolean getZeroFormEnabled() {
    return zeroFormEnabled;
  }


  public void setZeroFormEnabled(Boolean zeroFormEnabled) {
    this.zeroFormEnabled = zeroFormEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcuSkeletonParameters icuSkeletonParameters = (IcuSkeletonParameters) o;
    return Objects.equals(this.content, icuSkeletonParameters.content) &&
        Objects.equals(this.localeCodes, icuSkeletonParameters.localeCodes) &&
        Objects.equals(this.zeroFormEnabled, icuSkeletonParameters.zeroFormEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, localeCodes, zeroFormEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcuSkeletonParameters {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    localeCodes: ").append(toIndentedString(localeCodes)).append("\n");
    sb.append("    zeroFormEnabled: ").append(toIndentedString(zeroFormEnabled)).append("\n");
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

