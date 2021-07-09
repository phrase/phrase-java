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
import java.io.File;
import java.io.IOException;

/**
 * UploadCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-09T09:48:28.652124Z[Etc/UTC]")
public class UploadCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File file;

  public static final String SERIALIZED_NAME_FILE_FORMAT = "file_format";
  @SerializedName(SERIALIZED_NAME_FILE_FORMAT)
  private String fileFormat;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_UPDATE_TRANSLATIONS = "update_translations";
  @SerializedName(SERIALIZED_NAME_UPDATE_TRANSLATIONS)
  private Boolean updateTranslations;

  public static final String SERIALIZED_NAME_UPDATE_DESCRIPTIONS = "update_descriptions";
  @SerializedName(SERIALIZED_NAME_UPDATE_DESCRIPTIONS)
  private Boolean updateDescriptions;

  public static final String SERIALIZED_NAME_CONVERT_EMOJI = "convert_emoji";
  @SerializedName(SERIALIZED_NAME_CONVERT_EMOJI)
  private Boolean convertEmoji;

  public static final String SERIALIZED_NAME_SKIP_UPLOAD_TAGS = "skip_upload_tags";
  @SerializedName(SERIALIZED_NAME_SKIP_UPLOAD_TAGS)
  private Boolean skipUploadTags;

  public static final String SERIALIZED_NAME_SKIP_UNVERIFICATION = "skip_unverification";
  @SerializedName(SERIALIZED_NAME_SKIP_UNVERIFICATION)
  private Boolean skipUnverification;

  public static final String SERIALIZED_NAME_FILE_ENCODING = "file_encoding";
  @SerializedName(SERIALIZED_NAME_FILE_ENCODING)
  private String fileEncoding;

  public static final String SERIALIZED_NAME_LOCALE_MAPPING = "locale_mapping";
  @SerializedName(SERIALIZED_NAME_LOCALE_MAPPING)
  private Object localeMapping;

  public static final String SERIALIZED_NAME_FORMAT_OPTIONS = "format_options";
  @SerializedName(SERIALIZED_NAME_FORMAT_OPTIONS)
  private Object formatOptions;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE = "autotranslate";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE)
  private Boolean autotranslate;

  public static final String SERIALIZED_NAME_MARK_REVIEWED = "mark_reviewed";
  @SerializedName(SERIALIZED_NAME_MARK_REVIEWED)
  private Boolean markReviewed;


  public UploadCreateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-feature-branch", value = "specify the branch to use")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public UploadCreateParameters file(File file) {
    
    this.file = file;
    return this;
  }

   /**
   * File to be imported
   * @return file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to be imported")

  public File getFile() {
    return file;
  }


  public void setFile(File file) {
    this.file = file;
  }


  public UploadCreateParameters fileFormat(String fileFormat) {
    
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format. Auto-detected when possible and not specified.
   * @return fileFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "json", value = "File format. Auto-detected when possible and not specified.")

  public String getFileFormat() {
    return fileFormat;
  }


  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }


  public UploadCreateParameters localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * Locale of the file&#39;s content. Can be the name or public id of the locale. Preferred is the public id.
   * @return localeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234cdef1234abcd1234cdef1234", value = "Locale of the file's content. Can be the name or public id of the locale. Preferred is the public id.")

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  public UploadCreateParameters tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * List of tags separated by comma to be associated with the new keys contained in the upload.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "awesome-feature,needs-proofreading", value = "List of tags separated by comma to be associated with the new keys contained in the upload.")

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public UploadCreateParameters updateTranslations(Boolean updateTranslations) {
    
    this.updateTranslations = updateTranslations;
    return this;
  }

   /**
   * Indicates whether existing translations should be updated with the file content.
   * @return updateTranslations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether existing translations should be updated with the file content.")

  public Boolean getUpdateTranslations() {
    return updateTranslations;
  }


  public void setUpdateTranslations(Boolean updateTranslations) {
    this.updateTranslations = updateTranslations;
  }


  public UploadCreateParameters updateDescriptions(Boolean updateDescriptions) {
    
    this.updateDescriptions = updateDescriptions;
    return this;
  }

   /**
   * Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions.
   * @return updateDescriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions.")

  public Boolean getUpdateDescriptions() {
    return updateDescriptions;
  }


  public void setUpdateDescriptions(Boolean updateDescriptions) {
    this.updateDescriptions = updateDescriptions;
  }


  public UploadCreateParameters convertEmoji(Boolean convertEmoji) {
    
    this.convertEmoji = convertEmoji;
    return this;
  }

   /**
   * This option is obsolete. Providing the option will cause a bad request error.
   * @return convertEmoji
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This option is obsolete. Providing the option will cause a bad request error.")

  public Boolean getConvertEmoji() {
    return convertEmoji;
  }


  public void setConvertEmoji(Boolean convertEmoji) {
    this.convertEmoji = convertEmoji;
  }


  public UploadCreateParameters skipUploadTags(Boolean skipUploadTags) {
    
    this.skipUploadTags = skipUploadTags;
    return this;
  }

   /**
   * Indicates whether the upload should not create upload tags.
   * @return skipUploadTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the upload should not create upload tags.")

  public Boolean getSkipUploadTags() {
    return skipUploadTags;
  }


  public void setSkipUploadTags(Boolean skipUploadTags) {
    this.skipUploadTags = skipUploadTags;
  }


  public UploadCreateParameters skipUnverification(Boolean skipUnverification) {
    
    this.skipUnverification = skipUnverification;
    return this;
  }

   /**
   * Indicates whether the upload should unverify updated translations.
   * @return skipUnverification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the upload should unverify updated translations.")

  public Boolean getSkipUnverification() {
    return skipUnverification;
  }


  public void setSkipUnverification(Boolean skipUnverification) {
    this.skipUnverification = skipUnverification;
  }


  public UploadCreateParameters fileEncoding(String fileEncoding) {
    
    this.fileEncoding = fileEncoding;
    return this;
  }

   /**
   * Enforces a specific encoding on the file contents. Valid options are \&quot;UTF-8\&quot;, \&quot;UTF-16\&quot; and \&quot;ISO-8859-1\&quot;.
   * @return fileEncoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enforces a specific encoding on the file contents. Valid options are \"UTF-8\", \"UTF-16\" and \"ISO-8859-1\".")

  public String getFileEncoding() {
    return fileEncoding;
  }


  public void setFileEncoding(String fileEncoding) {
    this.fileEncoding = fileEncoding;
  }


  public UploadCreateParameters localeMapping(Object localeMapping) {
    
    this.localeMapping = localeMapping;
    return this;
  }

   /**
   * Optional, format specific mapping between locale names and the columns the translations to those locales are contained in.
   * @return localeMapping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"en\": \"2\"}", value = "Optional, format specific mapping between locale names and the columns the translations to those locales are contained in.")

  public Object getLocaleMapping() {
    return localeMapping;
  }


  public void setLocaleMapping(Object localeMapping) {
    this.localeMapping = localeMapping;
  }


  public UploadCreateParameters formatOptions(Object formatOptions) {
    
    this.formatOptions = formatOptions;
    return this;
  }

   /**
   * Additional options available for specific formats. See our format guide for complete list.
   * @return formatOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"foo\": \"bar\"}", value = "Additional options available for specific formats. See our format guide for complete list.")

  public Object getFormatOptions() {
    return formatOptions;
  }


  public void setFormatOptions(Object formatOptions) {
    this.formatOptions = formatOptions;
  }


  public UploadCreateParameters autotranslate(Boolean autotranslate) {
    
    this.autotranslate = autotranslate;
    return this;
  }

   /**
   * If set, translations for the uploaded language will be fetched automatically.
   * @return autotranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, translations for the uploaded language will be fetched automatically.")

  public Boolean getAutotranslate() {
    return autotranslate;
  }


  public void setAutotranslate(Boolean autotranslate) {
    this.autotranslate = autotranslate;
  }


  public UploadCreateParameters markReviewed(Boolean markReviewed) {
    
    this.markReviewed = markReviewed;
    return this;
  }

   /**
   * Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project.
   * @return markReviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow (currently beta) is enabled for the project.")

  public Boolean getMarkReviewed() {
    return markReviewed;
  }


  public void setMarkReviewed(Boolean markReviewed) {
    this.markReviewed = markReviewed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadCreateParameters uploadCreateParameters = (UploadCreateParameters) o;
    return Objects.equals(this.branch, uploadCreateParameters.branch) &&
        Objects.equals(this.file, uploadCreateParameters.file) &&
        Objects.equals(this.fileFormat, uploadCreateParameters.fileFormat) &&
        Objects.equals(this.localeId, uploadCreateParameters.localeId) &&
        Objects.equals(this.tags, uploadCreateParameters.tags) &&
        Objects.equals(this.updateTranslations, uploadCreateParameters.updateTranslations) &&
        Objects.equals(this.updateDescriptions, uploadCreateParameters.updateDescriptions) &&
        Objects.equals(this.convertEmoji, uploadCreateParameters.convertEmoji) &&
        Objects.equals(this.skipUploadTags, uploadCreateParameters.skipUploadTags) &&
        Objects.equals(this.skipUnverification, uploadCreateParameters.skipUnverification) &&
        Objects.equals(this.fileEncoding, uploadCreateParameters.fileEncoding) &&
        Objects.equals(this.localeMapping, uploadCreateParameters.localeMapping) &&
        Objects.equals(this.formatOptions, uploadCreateParameters.formatOptions) &&
        Objects.equals(this.autotranslate, uploadCreateParameters.autotranslate) &&
        Objects.equals(this.markReviewed, uploadCreateParameters.markReviewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, file, fileFormat, localeId, tags, updateTranslations, updateDescriptions, convertEmoji, skipUploadTags, skipUnverification, fileEncoding, localeMapping, formatOptions, autotranslate, markReviewed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTranslations: ").append(toIndentedString(updateTranslations)).append("\n");
    sb.append("    updateDescriptions: ").append(toIndentedString(updateDescriptions)).append("\n");
    sb.append("    convertEmoji: ").append(toIndentedString(convertEmoji)).append("\n");
    sb.append("    skipUploadTags: ").append(toIndentedString(skipUploadTags)).append("\n");
    sb.append("    skipUnverification: ").append(toIndentedString(skipUnverification)).append("\n");
    sb.append("    fileEncoding: ").append(toIndentedString(fileEncoding)).append("\n");
    sb.append("    localeMapping: ").append(toIndentedString(localeMapping)).append("\n");
    sb.append("    formatOptions: ").append(toIndentedString(formatOptions)).append("\n");
    sb.append("    autotranslate: ").append(toIndentedString(autotranslate)).append("\n");
    sb.append("    markReviewed: ").append(toIndentedString(markReviewed)).append("\n");
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

