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
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TranslationKeyDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-21T14:12:10.630449Z[Etc/UTC]")
public class TranslationKeyDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME_HASH = "name_hash";
  @SerializedName(SERIALIZED_NAME_NAME_HASH)
  private String nameHash;

  public static final String SERIALIZED_NAME_PLURAL = "plural";
  @SerializedName(SERIALIZED_NAME_PLURAL)
  private Boolean plural;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NAME_PLURAL = "name_plural";
  @SerializedName(SERIALIZED_NAME_NAME_PLURAL)
  private String namePlural;

  public static final String SERIALIZED_NAME_COMMENTS_COUNT = "comments_count";
  @SerializedName(SERIALIZED_NAME_COMMENTS_COUNT)
  private Integer commentsCount;

  public static final String SERIALIZED_NAME_MAX_CHARACTERS_ALLOWED = "max_characters_allowed";
  @SerializedName(SERIALIZED_NAME_MAX_CHARACTERS_ALLOWED)
  private Integer maxCharactersAllowed;

  public static final String SERIALIZED_NAME_SCREENSHOT_URL = "screenshot_url";
  @SerializedName(SERIALIZED_NAME_SCREENSHOT_URL)
  private String screenshotUrl;

  public static final String SERIALIZED_NAME_UNFORMATTED = "unformatted";
  @SerializedName(SERIALIZED_NAME_UNFORMATTED)
  private Boolean unformatted;

  public static final String SERIALIZED_NAME_XML_SPACE_PRESERVE = "xml_space_preserve";
  @SerializedName(SERIALIZED_NAME_XML_SPACE_PRESERVE)
  private Boolean xmlSpacePreserve;

  public static final String SERIALIZED_NAME_ORIGINAL_FILE = "original_file";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILE)
  private String originalFile;

  public static final String SERIALIZED_NAME_FORMAT_VALUE_TYPE = "format_value_type";
  @SerializedName(SERIALIZED_NAME_FORMAT_VALUE_TYPE)
  private String formatValueType;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private UserPreview creator;

  public static final String SERIALIZED_NAME_CUSTOM_METADATA = "custom_metadata";
  @SerializedName(SERIALIZED_NAME_CUSTOM_METADATA)
  private Map<String, String> customMetadata = new HashMap<>();

  public TranslationKeyDetails() {
  }

  public TranslationKeyDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TranslationKeyDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TranslationKeyDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TranslationKeyDetails nameHash(String nameHash) {
    
    this.nameHash = nameHash;
    return this;
  }

   /**
   * Get nameHash
   * @return nameHash
  **/
  @javax.annotation.Nullable

  public String getNameHash() {
    return nameHash;
  }


  public void setNameHash(String nameHash) {
    this.nameHash = nameHash;
  }


  public TranslationKeyDetails plural(Boolean plural) {
    
    this.plural = plural;
    return this;
  }

   /**
   * Get plural
   * @return plural
  **/
  @javax.annotation.Nullable

  public Boolean getPlural() {
    return plural;
  }


  public void setPlural(Boolean plural) {
    this.plural = plural;
  }


  public TranslationKeyDetails tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public TranslationKeyDetails addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TranslationKeyDetails dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public TranslationKeyDetails createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TranslationKeyDetails updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TranslationKeyDetails namePlural(String namePlural) {
    
    this.namePlural = namePlural;
    return this;
  }

   /**
   * Get namePlural
   * @return namePlural
  **/
  @javax.annotation.Nullable

  public String getNamePlural() {
    return namePlural;
  }


  public void setNamePlural(String namePlural) {
    this.namePlural = namePlural;
  }


  public TranslationKeyDetails commentsCount(Integer commentsCount) {
    
    this.commentsCount = commentsCount;
    return this;
  }

   /**
   * Get commentsCount
   * @return commentsCount
  **/
  @javax.annotation.Nullable

  public Integer getCommentsCount() {
    return commentsCount;
  }


  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }


  public TranslationKeyDetails maxCharactersAllowed(Integer maxCharactersAllowed) {
    
    this.maxCharactersAllowed = maxCharactersAllowed;
    return this;
  }

   /**
   * Get maxCharactersAllowed
   * @return maxCharactersAllowed
  **/
  @javax.annotation.Nullable

  public Integer getMaxCharactersAllowed() {
    return maxCharactersAllowed;
  }


  public void setMaxCharactersAllowed(Integer maxCharactersAllowed) {
    this.maxCharactersAllowed = maxCharactersAllowed;
  }


  public TranslationKeyDetails screenshotUrl(String screenshotUrl) {
    
    this.screenshotUrl = screenshotUrl;
    return this;
  }

   /**
   * Get screenshotUrl
   * @return screenshotUrl
  **/
  @javax.annotation.Nullable

  public String getScreenshotUrl() {
    return screenshotUrl;
  }


  public void setScreenshotUrl(String screenshotUrl) {
    this.screenshotUrl = screenshotUrl;
  }


  public TranslationKeyDetails unformatted(Boolean unformatted) {
    
    this.unformatted = unformatted;
    return this;
  }

   /**
   * Get unformatted
   * @return unformatted
  **/
  @javax.annotation.Nullable

  public Boolean getUnformatted() {
    return unformatted;
  }


  public void setUnformatted(Boolean unformatted) {
    this.unformatted = unformatted;
  }


  public TranslationKeyDetails xmlSpacePreserve(Boolean xmlSpacePreserve) {
    
    this.xmlSpacePreserve = xmlSpacePreserve;
    return this;
  }

   /**
   * Get xmlSpacePreserve
   * @return xmlSpacePreserve
  **/
  @javax.annotation.Nullable

  public Boolean getXmlSpacePreserve() {
    return xmlSpacePreserve;
  }


  public void setXmlSpacePreserve(Boolean xmlSpacePreserve) {
    this.xmlSpacePreserve = xmlSpacePreserve;
  }


  public TranslationKeyDetails originalFile(String originalFile) {
    
    this.originalFile = originalFile;
    return this;
  }

   /**
   * Get originalFile
   * @return originalFile
  **/
  @javax.annotation.Nullable

  public String getOriginalFile() {
    return originalFile;
  }


  public void setOriginalFile(String originalFile) {
    this.originalFile = originalFile;
  }


  public TranslationKeyDetails formatValueType(String formatValueType) {
    
    this.formatValueType = formatValueType;
    return this;
  }

   /**
   * Get formatValueType
   * @return formatValueType
  **/
  @javax.annotation.Nullable

  public String getFormatValueType() {
    return formatValueType;
  }


  public void setFormatValueType(String formatValueType) {
    this.formatValueType = formatValueType;
  }


  public TranslationKeyDetails creator(UserPreview creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable

  public UserPreview getCreator() {
    return creator;
  }


  public void setCreator(UserPreview creator) {
    this.creator = creator;
  }


  public TranslationKeyDetails customMetadata(Map<String, String> customMetadata) {
    
    this.customMetadata = customMetadata;
    return this;
  }

  public TranslationKeyDetails putCustomMetadataItem(String key, String customMetadataItem) {
    if (this.customMetadata == null) {
      this.customMetadata = new HashMap<>();
    }
    this.customMetadata.put(key, customMetadataItem);
    return this;
  }

   /**
   * Get customMetadata
   * @return customMetadata
  **/
  @javax.annotation.Nullable

  public Map<String, String> getCustomMetadata() {
    return customMetadata;
  }


  public void setCustomMetadata(Map<String, String> customMetadata) {
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
    TranslationKeyDetails translationKeyDetails = (TranslationKeyDetails) o;
    return Objects.equals(this.id, translationKeyDetails.id) &&
        Objects.equals(this.name, translationKeyDetails.name) &&
        Objects.equals(this.description, translationKeyDetails.description) &&
        Objects.equals(this.nameHash, translationKeyDetails.nameHash) &&
        Objects.equals(this.plural, translationKeyDetails.plural) &&
        Objects.equals(this.tags, translationKeyDetails.tags) &&
        Objects.equals(this.dataType, translationKeyDetails.dataType) &&
        Objects.equals(this.createdAt, translationKeyDetails.createdAt) &&
        Objects.equals(this.updatedAt, translationKeyDetails.updatedAt) &&
        Objects.equals(this.namePlural, translationKeyDetails.namePlural) &&
        Objects.equals(this.commentsCount, translationKeyDetails.commentsCount) &&
        Objects.equals(this.maxCharactersAllowed, translationKeyDetails.maxCharactersAllowed) &&
        Objects.equals(this.screenshotUrl, translationKeyDetails.screenshotUrl) &&
        Objects.equals(this.unformatted, translationKeyDetails.unformatted) &&
        Objects.equals(this.xmlSpacePreserve, translationKeyDetails.xmlSpacePreserve) &&
        Objects.equals(this.originalFile, translationKeyDetails.originalFile) &&
        Objects.equals(this.formatValueType, translationKeyDetails.formatValueType) &&
        Objects.equals(this.creator, translationKeyDetails.creator) &&
        Objects.equals(this.customMetadata, translationKeyDetails.customMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, nameHash, plural, tags, dataType, createdAt, updatedAt, namePlural, commentsCount, maxCharactersAllowed, screenshotUrl, unformatted, xmlSpacePreserve, originalFile, formatValueType, creator, customMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationKeyDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nameHash: ").append(toIndentedString(nameHash)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    namePlural: ").append(toIndentedString(namePlural)).append("\n");
    sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
    sb.append("    maxCharactersAllowed: ").append(toIndentedString(maxCharactersAllowed)).append("\n");
    sb.append("    screenshotUrl: ").append(toIndentedString(screenshotUrl)).append("\n");
    sb.append("    unformatted: ").append(toIndentedString(unformatted)).append("\n");
    sb.append("    xmlSpacePreserve: ").append(toIndentedString(xmlSpacePreserve)).append("\n");
    sb.append("    originalFile: ").append(toIndentedString(originalFile)).append("\n");
    sb.append("    formatValueType: ").append(toIndentedString(formatValueType)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

