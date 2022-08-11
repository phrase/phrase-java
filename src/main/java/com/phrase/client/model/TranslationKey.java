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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TranslationKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-11T06:40:55.753519Z[Etc/UTC]")
public class TranslationKey {
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
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public TranslationKey id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TranslationKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TranslationKey description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TranslationKey nameHash(String nameHash) {
    
    this.nameHash = nameHash;
    return this;
  }

   /**
   * Get nameHash
   * @return nameHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameHash() {
    return nameHash;
  }


  public void setNameHash(String nameHash) {
    this.nameHash = nameHash;
  }


  public TranslationKey plural(Boolean plural) {
    
    this.plural = plural;
    return this;
  }

   /**
   * Get plural
   * @return plural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPlural() {
    return plural;
  }


  public void setPlural(Boolean plural) {
    this.plural = plural;
  }


  public TranslationKey tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public TranslationKey addTagsItem(String tagsItem) {
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
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TranslationKey dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public TranslationKey createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TranslationKey updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationKey translationKey = (TranslationKey) o;
    return Objects.equals(this.id, translationKey.id) &&
        Objects.equals(this.name, translationKey.name) &&
        Objects.equals(this.description, translationKey.description) &&
        Objects.equals(this.nameHash, translationKey.nameHash) &&
        Objects.equals(this.plural, translationKey.plural) &&
        Objects.equals(this.tags, translationKey.tags) &&
        Objects.equals(this.dataType, translationKey.dataType) &&
        Objects.equals(this.createdAt, translationKey.createdAt) &&
        Objects.equals(this.updatedAt, translationKey.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, nameHash, plural, tags, dataType, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nameHash: ").append(toIndentedString(nameHash)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

