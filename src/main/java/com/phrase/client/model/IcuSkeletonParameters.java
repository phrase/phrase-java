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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T12:54:01.699117Z[Etc/UTC]")
public class IcuSkeletonParameters {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_LOCALE_CODES = "locale_codes";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODES)
  private List<String> localeCodes = null;

  public static final String SERIALIZED_NAME_KEEP_CONTENT = "keep_content";
  @SerializedName(SERIALIZED_NAME_KEEP_CONTENT)
  private Boolean keepContent;

  public static final String SERIALIZED_NAME_ZERO_FORM_ENABLED = "zero_form_enabled";
  @SerializedName(SERIALIZED_NAME_ZERO_FORM_ENABLED)
  private Boolean zeroFormEnabled;

  public static final String SERIALIZED_NAME_CLDR_VERSION = "cldr_version";
  @SerializedName(SERIALIZED_NAME_CLDR_VERSION)
  private String cldrVersion;


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


  public IcuSkeletonParameters keepContent(Boolean keepContent) {
    
    this.keepContent = keepContent;
    return this;
  }

   /**
   * Keep the content and add missing plural forms for each locale
   * @return keepContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Keep the content and add missing plural forms for each locale")

  public Boolean getKeepContent() {
    return keepContent;
  }


  public void setKeepContent(Boolean keepContent) {
    this.keepContent = keepContent;
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


  public IcuSkeletonParameters cldrVersion(String cldrVersion) {
    
    this.cldrVersion = cldrVersion;
    return this;
  }

   /**
   * Strings supports two CLDR variants, when it comes to pluralization rules. \\ You can choose which one you want to use when constructing the skeletons. Possible values \\ are &#x60;legacy&#x60; and &#x60;cldr_41&#x60;. Default value is &#x60;legacy&#x60;.
   * @return cldrVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cldr_41", value = "Strings supports two CLDR variants, when it comes to pluralization rules. \\ You can choose which one you want to use when constructing the skeletons. Possible values \\ are `legacy` and `cldr_41`. Default value is `legacy`.")

  public String getCldrVersion() {
    return cldrVersion;
  }


  public void setCldrVersion(String cldrVersion) {
    this.cldrVersion = cldrVersion;
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
        Objects.equals(this.keepContent, icuSkeletonParameters.keepContent) &&
        Objects.equals(this.zeroFormEnabled, icuSkeletonParameters.zeroFormEnabled) &&
        Objects.equals(this.cldrVersion, icuSkeletonParameters.cldrVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, localeCodes, keepContent, zeroFormEnabled, cldrVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcuSkeletonParameters {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    localeCodes: ").append(toIndentedString(localeCodes)).append("\n");
    sb.append("    keepContent: ").append(toIndentedString(keepContent)).append("\n");
    sb.append("    zeroFormEnabled: ").append(toIndentedString(zeroFormEnabled)).append("\n");
    sb.append("    cldrVersion: ").append(toIndentedString(cldrVersion)).append("\n");
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

