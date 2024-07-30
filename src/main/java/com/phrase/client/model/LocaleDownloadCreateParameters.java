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
 * LocaleDownloadCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-30T09:38:57.358078Z[Etc/UTC]")
public class LocaleDownloadCreateParameters {
  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private String fileFormat;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_INCLUDE_EMPTY_TRANSLATIONS = "include_empty_translations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EMPTY_TRANSLATIONS)
  private Boolean includeEmptyTranslations;

  public static final String SERIALIZED_NAME_EXCLUDE_EMPTY_ZERO_FORMS = "exclude_empty_zero_forms";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_EMPTY_ZERO_FORMS)
  private Boolean excludeEmptyZeroForms;

  public static final String SERIALIZED_NAME_INCLUDE_TRANSLATED_KEYS = "include_translated_keys";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TRANSLATED_KEYS)
  private Boolean includeTranslatedKeys;

  public static final String SERIALIZED_NAME_KEEP_NOTRANSLATE_TAGS = "keep_notranslate_tags";
  @SerializedName(SERIALIZED_NAME_KEEP_NOTRANSLATE_TAGS)
  private Boolean keepNotranslateTags;

  public static final String SERIALIZED_NAME_FORMAT_OPTIONS = "format_options";
  @SerializedName(SERIALIZED_NAME_FORMAT_OPTIONS)
  private Object formatOptions;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private String encoding;

  public static final String SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS = "include_unverified_translations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS)
  private Boolean includeUnverifiedTranslations;

  public static final String SERIALIZED_NAME_USE_LAST_REVIEWED_VERSION = "use_last_reviewed_version";
  @SerializedName(SERIALIZED_NAME_USE_LAST_REVIEWED_VERSION)
  private Boolean useLastReviewedVersion;

  public static final String SERIALIZED_NAME_FALLBACK_LOCALE_ID = "fallback_locale_id";
  @SerializedName(SERIALIZED_NAME_FALLBACK_LOCALE_ID)
  private String fallbackLocaleId;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE_ID = "source_locale_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE_ID)
  private String sourceLocaleId;

  public static final String SERIALIZED_NAME_CUSTOM_METADATA_FILTERS = "custom_metadata_filters";
  @SerializedName(SERIALIZED_NAME_CUSTOM_METADATA_FILTERS)
  private Object customMetadataFilters;

  public LocaleDownloadCreateParameters() {
  }

  public LocaleDownloadCreateParameters fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format name. See the &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/sections/6111343326364\&quot;&gt;format guide&lt;/a&gt; for all supported file formats.
   * @return fileFormat
  **/
  @javax.annotation.Nonnull

  public String getFileFormat() {
    return fileFormat;
  }


  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }


  public LocaleDownloadCreateParameters branch(String branch) {
    
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


  public LocaleDownloadCreateParameters tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Limit results to keys tagged with a list of comma separated tag names.
   * @return tags
  **/
  @javax.annotation.Nullable

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public LocaleDownloadCreateParameters includeEmptyTranslations(Boolean includeEmptyTranslations) {
    
    this.includeEmptyTranslations = includeEmptyTranslations;
    return this;
  }

   /**
   * Indicates whether keys without translations should be included in the output as well.
   * @return includeEmptyTranslations
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeEmptyTranslations() {
    return includeEmptyTranslations;
  }


  public void setIncludeEmptyTranslations(Boolean includeEmptyTranslations) {
    this.includeEmptyTranslations = includeEmptyTranslations;
  }


  public LocaleDownloadCreateParameters excludeEmptyZeroForms(Boolean excludeEmptyZeroForms) {
    
    this.excludeEmptyZeroForms = excludeEmptyZeroForms;
    return this;
  }

   /**
   * Indicates whether zero forms should be included when empty in pluralized keys.
   * @return excludeEmptyZeroForms
  **/
  @javax.annotation.Nullable

  public Boolean getExcludeEmptyZeroForms() {
    return excludeEmptyZeroForms;
  }


  public void setExcludeEmptyZeroForms(Boolean excludeEmptyZeroForms) {
    this.excludeEmptyZeroForms = excludeEmptyZeroForms;
  }


  public LocaleDownloadCreateParameters includeTranslatedKeys(Boolean includeTranslatedKeys) {
    
    this.includeTranslatedKeys = includeTranslatedKeys;
    return this;
  }

   /**
   * Include translated keys in the locale file. Use in combination with include_empty_translations to obtain only untranslated keys.
   * @return includeTranslatedKeys
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeTranslatedKeys() {
    return includeTranslatedKeys;
  }


  public void setIncludeTranslatedKeys(Boolean includeTranslatedKeys) {
    this.includeTranslatedKeys = includeTranslatedKeys;
  }


  public LocaleDownloadCreateParameters keepNotranslateTags(Boolean keepNotranslateTags) {
    
    this.keepNotranslateTags = keepNotranslateTags;
    return this;
  }

   /**
   * Indicates whether [NOTRANSLATE] tags should be kept.
   * @return keepNotranslateTags
  **/
  @javax.annotation.Nullable

  public Boolean getKeepNotranslateTags() {
    return keepNotranslateTags;
  }


  public void setKeepNotranslateTags(Boolean keepNotranslateTags) {
    this.keepNotranslateTags = keepNotranslateTags;
  }


  public LocaleDownloadCreateParameters formatOptions(Object formatOptions) {
    
    this.formatOptions = formatOptions;
    return this;
  }

   /**
   * Additional formatting and render options. See the &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/sections/6111343326364\&quot;&gt;format guide&lt;/a&gt; for a list of options available for each format. Specify format options like this: &lt;code&gt;...&amp;format_options[foo]&#x3D;bar&lt;/code&gt;
   * @return formatOptions
  **/
  @javax.annotation.Nullable

  public Object getFormatOptions() {
    return formatOptions;
  }


  public void setFormatOptions(Object formatOptions) {
    this.formatOptions = formatOptions;
  }


  public LocaleDownloadCreateParameters encoding(String encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * Enforces a specific encoding on the file contents. Valid options are \&quot;UTF-8\&quot;, \&quot;UTF-16\&quot; and \&quot;ISO-8859-1\&quot;.
   * @return encoding
  **/
  @javax.annotation.Nullable

  public String getEncoding() {
    return encoding;
  }


  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public LocaleDownloadCreateParameters includeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
    return this;
  }

   /**
   * if set to false unverified translations are excluded
   * @return includeUnverifiedTranslations
  **/
  @javax.annotation.Nullable

  public Boolean getIncludeUnverifiedTranslations() {
    return includeUnverifiedTranslations;
  }


  public void setIncludeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
  }


  public LocaleDownloadCreateParameters useLastReviewedVersion(Boolean useLastReviewedVersion) {
    
    this.useLastReviewedVersion = useLastReviewedVersion;
    return this;
  }

   /**
   * If set to true the last reviewed version of a translation is used. This is only available if the review workflow is enabled for the project.
   * @return useLastReviewedVersion
  **/
  @javax.annotation.Nullable

  public Boolean getUseLastReviewedVersion() {
    return useLastReviewedVersion;
  }


  public void setUseLastReviewedVersion(Boolean useLastReviewedVersion) {
    this.useLastReviewedVersion = useLastReviewedVersion;
  }


  public LocaleDownloadCreateParameters fallbackLocaleId(String fallbackLocaleId) {
    
    this.fallbackLocaleId = fallbackLocaleId;
    return this;
  }

   /**
   * If a key has no translation in the locale being downloaded the translation in the fallback locale will be used. Provide the ID of the locale that should be used as the fallback. Requires include_empty_translations to be set to &lt;code&gt;true&lt;/code&gt;.
   * @return fallbackLocaleId
  **/
  @javax.annotation.Nullable

  public String getFallbackLocaleId() {
    return fallbackLocaleId;
  }


  public void setFallbackLocaleId(String fallbackLocaleId) {
    this.fallbackLocaleId = fallbackLocaleId;
  }


  public LocaleDownloadCreateParameters sourceLocaleId(String sourceLocaleId) {
    
    this.sourceLocaleId = sourceLocaleId;
    return this;
  }

   /**
   * Provides the source language of a corresponding job as the source language of the generated locale file. This parameter will be ignored unless used in combination with a &lt;code&gt;tag&lt;/code&gt; parameter indicating a specific job.
   * @return sourceLocaleId
  **/
  @javax.annotation.Nullable

  public String getSourceLocaleId() {
    return sourceLocaleId;
  }


  public void setSourceLocaleId(String sourceLocaleId) {
    this.sourceLocaleId = sourceLocaleId;
  }


  public LocaleDownloadCreateParameters customMetadataFilters(Object customMetadataFilters) {
    
    this.customMetadataFilters = customMetadataFilters;
    return this;
  }

   /**
   * Custom metadata filters. Provide the name of the metadata field and the value to filter by. Only keys with matching metadata will be included in the download. 
   * @return customMetadataFilters
  **/
  @javax.annotation.Nullable

  public Object getCustomMetadataFilters() {
    return customMetadataFilters;
  }


  public void setCustomMetadataFilters(Object customMetadataFilters) {
    this.customMetadataFilters = customMetadataFilters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleDownloadCreateParameters localeDownloadCreateParameters = (LocaleDownloadCreateParameters) o;
    return Objects.equals(this.fileFormat, localeDownloadCreateParameters.fileFormat) &&
        Objects.equals(this.branch, localeDownloadCreateParameters.branch) &&
        Objects.equals(this.tags, localeDownloadCreateParameters.tags) &&
        Objects.equals(this.includeEmptyTranslations, localeDownloadCreateParameters.includeEmptyTranslations) &&
        Objects.equals(this.excludeEmptyZeroForms, localeDownloadCreateParameters.excludeEmptyZeroForms) &&
        Objects.equals(this.includeTranslatedKeys, localeDownloadCreateParameters.includeTranslatedKeys) &&
        Objects.equals(this.keepNotranslateTags, localeDownloadCreateParameters.keepNotranslateTags) &&
        Objects.equals(this.formatOptions, localeDownloadCreateParameters.formatOptions) &&
        Objects.equals(this.encoding, localeDownloadCreateParameters.encoding) &&
        Objects.equals(this.includeUnverifiedTranslations, localeDownloadCreateParameters.includeUnverifiedTranslations) &&
        Objects.equals(this.useLastReviewedVersion, localeDownloadCreateParameters.useLastReviewedVersion) &&
        Objects.equals(this.fallbackLocaleId, localeDownloadCreateParameters.fallbackLocaleId) &&
        Objects.equals(this.sourceLocaleId, localeDownloadCreateParameters.sourceLocaleId) &&
        Objects.equals(this.customMetadataFilters, localeDownloadCreateParameters.customMetadataFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileFormat, branch, tags, includeEmptyTranslations, excludeEmptyZeroForms, includeTranslatedKeys, keepNotranslateTags, formatOptions, encoding, includeUnverifiedTranslations, useLastReviewedVersion, fallbackLocaleId, sourceLocaleId, customMetadataFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleDownloadCreateParameters {\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    includeEmptyTranslations: ").append(toIndentedString(includeEmptyTranslations)).append("\n");
    sb.append("    excludeEmptyZeroForms: ").append(toIndentedString(excludeEmptyZeroForms)).append("\n");
    sb.append("    includeTranslatedKeys: ").append(toIndentedString(includeTranslatedKeys)).append("\n");
    sb.append("    keepNotranslateTags: ").append(toIndentedString(keepNotranslateTags)).append("\n");
    sb.append("    formatOptions: ").append(toIndentedString(formatOptions)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    includeUnverifiedTranslations: ").append(toIndentedString(includeUnverifiedTranslations)).append("\n");
    sb.append("    useLastReviewedVersion: ").append(toIndentedString(useLastReviewedVersion)).append("\n");
    sb.append("    fallbackLocaleId: ").append(toIndentedString(fallbackLocaleId)).append("\n");
    sb.append("    sourceLocaleId: ").append(toIndentedString(sourceLocaleId)).append("\n");
    sb.append("    customMetadataFilters: ").append(toIndentedString(customMetadataFilters)).append("\n");
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

