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
 * The parameters of the download request. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T09:38:57.358078Z[Etc/UTC]")
public class LocaleDownloadParams {
  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private String fileFormat;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_INCLUDE_EMPTY_TRANSLATIONS = "include_empty_translations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EMPTY_TRANSLATIONS)
  private Boolean includeEmptyTranslations;

  public static final String SERIALIZED_NAME_INCLUDE_TRANSLATED_KEYS = "include_translated_keys";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TRANSLATED_KEYS)
  private Boolean includeTranslatedKeys;

  public static final String SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS = "include_unverified_translations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS)
  private Boolean includeUnverifiedTranslations;

  public LocaleDownloadParams() {
  }

  public LocaleDownloadParams fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * Get fileFormat
   * @return fileFormat
  **/
  @javax.annotation.Nullable

  public String getFileFormat() {
    return fileFormat;
  }


  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }


  public LocaleDownloadParams localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * Get localeId
   * @return localeId
  **/
  @javax.annotation.Nullable

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  public LocaleDownloadParams tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public LocaleDownloadParams branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public LocaleDownloadParams includeEmptyTranslations(Boolean includeEmptyTranslations) {
    
    this.includeEmptyTranslations = includeEmptyTranslations;
    return this;
  }

   /**
   * Get includeEmptyTranslations
   * @return includeEmptyTranslations
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeEmptyTranslations() {
    return includeEmptyTranslations;
  }


  public void setIncludeEmptyTranslations(Boolean includeEmptyTranslations) {
    this.includeEmptyTranslations = includeEmptyTranslations;
  }


  public LocaleDownloadParams includeTranslatedKeys(Boolean includeTranslatedKeys) {
    
    this.includeTranslatedKeys = includeTranslatedKeys;
    return this;
  }

   /**
   * Get includeTranslatedKeys
   * @return includeTranslatedKeys
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeTranslatedKeys() {
    return includeTranslatedKeys;
  }


  public void setIncludeTranslatedKeys(Boolean includeTranslatedKeys) {
    this.includeTranslatedKeys = includeTranslatedKeys;
  }


  public LocaleDownloadParams includeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
    return this;
  }

   /**
   * Get includeUnverifiedTranslations
   * @return includeUnverifiedTranslations
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeUnverifiedTranslations() {
    return includeUnverifiedTranslations;
  }


  public void setIncludeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleDownloadParams localeDownloadParams = (LocaleDownloadParams) o;
    return Objects.equals(this.fileFormat, localeDownloadParams.fileFormat) &&
        Objects.equals(this.localeId, localeDownloadParams.localeId) &&
        Objects.equals(this.tags, localeDownloadParams.tags) &&
        Objects.equals(this.branch, localeDownloadParams.branch) &&
        Objects.equals(this.includeEmptyTranslations, localeDownloadParams.includeEmptyTranslations) &&
        Objects.equals(this.includeTranslatedKeys, localeDownloadParams.includeTranslatedKeys) &&
        Objects.equals(this.includeUnverifiedTranslations, localeDownloadParams.includeUnverifiedTranslations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileFormat, localeId, tags, branch, includeEmptyTranslations, includeTranslatedKeys, includeUnverifiedTranslations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleDownloadParams {\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    includeEmptyTranslations: ").append(toIndentedString(includeEmptyTranslations)).append("\n");
    sb.append("    includeTranslatedKeys: ").append(toIndentedString(includeTranslatedKeys)).append("\n");
    sb.append("    includeUnverifiedTranslations: ").append(toIndentedString(includeUnverifiedTranslations)).append("\n");
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

