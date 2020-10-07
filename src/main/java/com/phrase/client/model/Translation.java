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
import com.phrase.client.model.KeyPreview;
import com.phrase.client.model.LocalePreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Translation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-07T11:19:58.522Z[Etc/UTC]")
public class Translation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_UNVERIFIED = "unverified";
  @SerializedName(SERIALIZED_NAME_UNVERIFIED)
  private Boolean unverified;

  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  private Boolean excluded;

  public static final String SERIALIZED_NAME_PLURAL_SUFFIX = "plural_suffix";
  @SerializedName(SERIALIZED_NAME_PLURAL_SUFFIX)
  private String pluralSuffix;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private KeyPreview key;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private LocalePreview locale;

  public static final String SERIALIZED_NAME_PLACEHOLDERS = "placeholders";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDERS)
  private List<String> placeholders = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public Translation id(String id) {
    
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


  public Translation content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public Translation unverified(Boolean unverified) {
    
    this.unverified = unverified;
    return this;
  }

   /**
   * Get unverified
   * @return unverified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUnverified() {
    return unverified;
  }


  public void setUnverified(Boolean unverified) {
    this.unverified = unverified;
  }


  public Translation excluded(Boolean excluded) {
    
    this.excluded = excluded;
    return this;
  }

   /**
   * Get excluded
   * @return excluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExcluded() {
    return excluded;
  }


  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }


  public Translation pluralSuffix(String pluralSuffix) {
    
    this.pluralSuffix = pluralSuffix;
    return this;
  }

   /**
   * Get pluralSuffix
   * @return pluralSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPluralSuffix() {
    return pluralSuffix;
  }


  public void setPluralSuffix(String pluralSuffix) {
    this.pluralSuffix = pluralSuffix;
  }


  public Translation key(KeyPreview key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyPreview getKey() {
    return key;
  }


  public void setKey(KeyPreview key) {
    this.key = key;
  }


  public Translation locale(LocalePreview locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalePreview getLocale() {
    return locale;
  }


  public void setLocale(LocalePreview locale) {
    this.locale = locale;
  }


  public Translation placeholders(List<String> placeholders) {
    
    this.placeholders = placeholders;
    return this;
  }

  public Translation addPlaceholdersItem(String placeholdersItem) {
    if (this.placeholders == null) {
      this.placeholders = new ArrayList<>();
    }
    this.placeholders.add(placeholdersItem);
    return this;
  }

   /**
   * Get placeholders
   * @return placeholders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPlaceholders() {
    return placeholders;
  }


  public void setPlaceholders(List<String> placeholders) {
    this.placeholders = placeholders;
  }


  public Translation state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Translation createdAt(OffsetDateTime createdAt) {
    
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


  public Translation updatedAt(OffsetDateTime updatedAt) {
    
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
    Translation translation = (Translation) o;
    return Objects.equals(this.id, translation.id) &&
        Objects.equals(this.content, translation.content) &&
        Objects.equals(this.unverified, translation.unverified) &&
        Objects.equals(this.excluded, translation.excluded) &&
        Objects.equals(this.pluralSuffix, translation.pluralSuffix) &&
        Objects.equals(this.key, translation.key) &&
        Objects.equals(this.locale, translation.locale) &&
        Objects.equals(this.placeholders, translation.placeholders) &&
        Objects.equals(this.state, translation.state) &&
        Objects.equals(this.createdAt, translation.createdAt) &&
        Objects.equals(this.updatedAt, translation.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, unverified, excluded, pluralSuffix, key, locale, placeholders, state, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Translation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    unverified: ").append(toIndentedString(unverified)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    pluralSuffix: ").append(toIndentedString(pluralSuffix)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    placeholders: ").append(toIndentedString(placeholders)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

