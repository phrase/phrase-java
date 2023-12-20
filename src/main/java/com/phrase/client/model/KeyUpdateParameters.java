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
 * KeyUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T10:48:30.341835Z[Etc/UTC]")
public class KeyUpdateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PLURAL = "plural";
  @SerializedName(SERIALIZED_NAME_PLURAL)
  private Boolean plural;

  public static final String SERIALIZED_NAME_NAME_PLURAL = "name_plural";
  @SerializedName(SERIALIZED_NAME_NAME_PLURAL)
  private String namePlural;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags;

  public static final String SERIALIZED_NAME_MAX_CHARACTERS_ALLOWED = "max_characters_allowed";
  @SerializedName(SERIALIZED_NAME_MAX_CHARACTERS_ALLOWED)
  private Integer maxCharactersAllowed;

  public static final String SERIALIZED_NAME_SCREENSHOT = "screenshot";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT)
  private File screenshot;

  public static final String SERIALIZED_NAME_REMOVE_SCREENSHOT = "remove_screenshot";
  @SerializedName(SERIALIZED_NAME_REMOVE_SCREENSHOT)
  private Boolean removeScreenshot;

  public static final String SERIALIZED_NAME_UNFORMATTED = "unformatted";
  @SerializedName(SERIALIZED_NAME_UNFORMATTED)
  private Boolean unformatted;

  public static final String SERIALIZED_NAME_XML_SPACE_PRESERVE = "xml_space_preserve";
  @SerializedName(SERIALIZED_NAME_XML_SPACE_PRESERVE)
  private Boolean xmlSpacePreserve;

  public static final String SERIALIZED_NAME_ORIGINAL_FILE = "original_file";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE)
  private String originalFile;

  public static final String SERIALIZED_NAME_LOCALIZED_FORMAT_STRING = "localized_format_string";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_FORMAT_STRING)
  private String localizedFormatString;

  public static final String SERIALIZED_NAME_LOCALIZED_FORMAT_KEY = "localized_format_key";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_FORMAT_KEY)
  private String localizedFormatKey;

  public static final String SERIALIZED_NAME_CUSTOM_METADATA = "custom_metadata";
  @SerializedName(SERIALIZED_NAME_CUSTOM_METADATA)
  private Object customMetadata;

  public KeyUpdateParameters() {
  }

  public KeyUpdateParameters branch(String branch) {
    
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


  public KeyUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Key name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KeyUpdateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Key description (usually includes contextual information for translators)
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public KeyUpdateParameters plural(Boolean plural) {
    
    this.plural = plural;
    return this;
  }

   /**
   * Indicates whether key supports pluralization
   * @return plural
  **/
  @javax.annotation.Nullable

  public Boolean getPlural() {
    return plural;
  }


  public void setPlural(Boolean plural) {
    this.plural = plural;
  }


  public KeyUpdateParameters namePlural(String namePlural) {
    
    this.namePlural = namePlural;
    return this;
  }

   /**
   * Plural name for the key (used in some file formats, e.g. Gettext)
   * @return namePlural
  **/
  @javax.annotation.Nullable

  public String getNamePlural() {
    return namePlural;
  }


  public void setNamePlural(String namePlural) {
    this.namePlural = namePlural;
  }


  public KeyUpdateParameters dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Type of the key. Can be one of the following: string, number, boolean, array, markdown.
   * @return dataType
  **/
  @javax.annotation.Nullable

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public KeyUpdateParameters tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * List of tags separated by comma to be associated with the key.
   * @return tags
  **/
  @javax.annotation.Nullable

  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public KeyUpdateParameters maxCharactersAllowed(Integer maxCharactersAllowed) {
    
    this.maxCharactersAllowed = maxCharactersAllowed;
    return this;
  }

   /**
   * Max. number of characters translations for this key can have.
   * @return maxCharactersAllowed
  **/
  @javax.annotation.Nullable

  public Integer getMaxCharactersAllowed() {
    return maxCharactersAllowed;
  }


  public void setMaxCharactersAllowed(Integer maxCharactersAllowed) {
    this.maxCharactersAllowed = maxCharactersAllowed;
  }


  public KeyUpdateParameters screenshot(File screenshot) {
    
    this.screenshot = screenshot;
    return this;
  }

   /**
   * Screenshot/image for the key. This parameter is deprecated. Please use the Screenshots endpoint instead.
   * @return screenshot
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable

  public File getScreenshot() {
    return screenshot;
  }


  public void setScreenshot(File screenshot) {
    this.screenshot = screenshot;
  }


  public KeyUpdateParameters removeScreenshot(Boolean removeScreenshot) {
    
    this.removeScreenshot = removeScreenshot;
    return this;
  }

   /**
   * Indicates whether the screenshot will be deleted. This parameter is deprecated. Please use the Screenshots endpoint instead.
   * @return removeScreenshot
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable

  public Boolean getRemoveScreenshot() {
    return removeScreenshot;
  }


  public void setRemoveScreenshot(Boolean removeScreenshot) {
    this.removeScreenshot = removeScreenshot;
  }


  public KeyUpdateParameters unformatted(Boolean unformatted) {
    
    this.unformatted = unformatted;
    return this;
  }

   /**
   * Indicates whether the key should be exported as \&quot;unformatted\&quot;. Supported by Android XML and other formats.
   * @return unformatted
  **/
  @javax.annotation.Nullable

  public Boolean getUnformatted() {
    return unformatted;
  }


  public void setUnformatted(Boolean unformatted) {
    this.unformatted = unformatted;
  }


  public KeyUpdateParameters xmlSpacePreserve(Boolean xmlSpacePreserve) {
    
    this.xmlSpacePreserve = xmlSpacePreserve;
    return this;
  }

   /**
   * Indicates whether the key should be exported with \&quot;xml:space&#x3D;preserve\&quot;. Supported by several XML-based formats.
   * @return xmlSpacePreserve
  **/
  @javax.annotation.Nullable

  public Boolean getXmlSpacePreserve() {
    return xmlSpacePreserve;
  }


  public void setXmlSpacePreserve(Boolean xmlSpacePreserve) {
    this.xmlSpacePreserve = xmlSpacePreserve;
  }


  public KeyUpdateParameters originalFile(String originalFile) {
    
    this.originalFile = originalFile;
    return this;
  }

   /**
   * Original file attribute. Used in some formats, e.g. XLIFF.
   * @return originalFile
  **/
  @javax.annotation.Nullable

  public String getOriginalFile() {
    return originalFile;
  }


  public void setOriginalFile(String originalFile) {
    this.originalFile = originalFile;
  }


  public KeyUpdateParameters localizedFormatString(String localizedFormatString) {
    
    this.localizedFormatString = localizedFormatString;
    return this;
  }

   /**
   * NSStringLocalizedFormatKey attribute. Used in .stringsdict format.
   * @return localizedFormatString
  **/
  @javax.annotation.Nullable

  public String getLocalizedFormatString() {
    return localizedFormatString;
  }


  public void setLocalizedFormatString(String localizedFormatString) {
    this.localizedFormatString = localizedFormatString;
  }


  public KeyUpdateParameters localizedFormatKey(String localizedFormatKey) {
    
    this.localizedFormatKey = localizedFormatKey;
    return this;
  }

   /**
   * NSStringLocalizedFormatKey attribute. Used in .stringsdict format.
   * @return localizedFormatKey
  **/
  @javax.annotation.Nullable

  public String getLocalizedFormatKey() {
    return localizedFormatKey;
  }


  public void setLocalizedFormatKey(String localizedFormatKey) {
    this.localizedFormatKey = localizedFormatKey;
  }


  public KeyUpdateParameters customMetadata(Object customMetadata) {
    
    this.customMetadata = customMetadata;
    return this;
  }

   /**
   * Updates/Creates custom metadata property name and value pairs to be associated with key. If you want to delete a custom metadata property, you can set its value to null. If you want to update a custom metadata property, you can set its value to the new value.
   * @return customMetadata
  **/
  @javax.annotation.Nullable

  public Object getCustomMetadata() {
    return customMetadata;
  }


  public void setCustomMetadata(Object customMetadata) {
    this.customMetadata = customMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyUpdateParameters keyUpdateParameters = (KeyUpdateParameters) o;
    return Objects.equals(this.branch, keyUpdateParameters.branch) &&
        Objects.equals(this.name, keyUpdateParameters.name) &&
        Objects.equals(this.description, keyUpdateParameters.description) &&
        Objects.equals(this.plural, keyUpdateParameters.plural) &&
        Objects.equals(this.namePlural, keyUpdateParameters.namePlural) &&
        Objects.equals(this.dataType, keyUpdateParameters.dataType) &&
        Objects.equals(this.tags, keyUpdateParameters.tags) &&
        Objects.equals(this.maxCharactersAllowed, keyUpdateParameters.maxCharactersAllowed) &&
        Objects.equals(this.screenshot, keyUpdateParameters.screenshot) &&
        Objects.equals(this.removeScreenshot, keyUpdateParameters.removeScreenshot) &&
        Objects.equals(this.unformatted, keyUpdateParameters.unformatted) &&
        Objects.equals(this.xmlSpacePreserve, keyUpdateParameters.xmlSpacePreserve) &&
        Objects.equals(this.originalFile, keyUpdateParameters.originalFile) &&
        Objects.equals(this.localizedFormatString, keyUpdateParameters.localizedFormatString) &&
        Objects.equals(this.localizedFormatKey, keyUpdateParameters.localizedFormatKey) &&
        Objects.equals(this.customMetadata, keyUpdateParameters.customMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, description, plural, namePlural, dataType, tags, maxCharactersAllowed, screenshot, removeScreenshot, unformatted, xmlSpacePreserve, originalFile, localizedFormatString, localizedFormatKey, customMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyUpdateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    namePlural: ").append(toIndentedString(namePlural)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    maxCharactersAllowed: ").append(toIndentedString(maxCharactersAllowed)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    removeScreenshot: ").append(toIndentedString(removeScreenshot)).append("\n");
    sb.append("    unformatted: ").append(toIndentedString(unformatted)).append("\n");
    sb.append("    xmlSpacePreserve: ").append(toIndentedString(xmlSpacePreserve)).append("\n");
    sb.append("    originalFile: ").append(toIndentedString(originalFile)).append("\n");
    sb.append("    localizedFormatString: ").append(toIndentedString(localizedFormatString)).append("\n");
    sb.append("    localizedFormatKey: ").append(toIndentedString(localizedFormatKey)).append("\n");
    sb.append("    customMetadata: ").append(toIndentedString(customMetadata)).append("\n");
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

