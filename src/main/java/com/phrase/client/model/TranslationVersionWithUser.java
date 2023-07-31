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
import com.phrase.client.model.KeyPreview;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.TranslationVersion;
import com.phrase.client.model.TranslationVersionWithUser1;
import com.phrase.client.model.UserPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * TranslationVersionWithUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-31T07:50:13.380817Z[Etc/UTC]")
public class TranslationVersionWithUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_PLURAL_SUFFIX = "plural_suffix";
  @SerializedName(SERIALIZED_NAME_PLURAL_SUFFIX)
  private String pluralSuffix;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private KeyPreview key;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private LocalePreview locale;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CHANGED_AT = "changed_at";
  @SerializedName(SERIALIZED_NAME_CHANGED_AT)
  private OffsetDateTime changedAt;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserPreview user;


  public TranslationVersionWithUser id(String id) {
    
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


  public TranslationVersionWithUser content(String content) {
    
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


  public TranslationVersionWithUser pluralSuffix(String pluralSuffix) {
    
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


  public TranslationVersionWithUser key(KeyPreview key) {
    
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


  public TranslationVersionWithUser locale(LocalePreview locale) {
    
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


  public TranslationVersionWithUser createdAt(OffsetDateTime createdAt) {
    
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


  public TranslationVersionWithUser updatedAt(OffsetDateTime updatedAt) {
    
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


  public TranslationVersionWithUser changedAt(OffsetDateTime changedAt) {
    
    this.changedAt = changedAt;
    return this;
  }

   /**
   * Get changedAt
   * @return changedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getChangedAt() {
    return changedAt;
  }


  public void setChangedAt(OffsetDateTime changedAt) {
    this.changedAt = changedAt;
  }


  public TranslationVersionWithUser user(UserPreview user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserPreview getUser() {
    return user;
  }


  public void setUser(UserPreview user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationVersionWithUser translationVersionWithUser = (TranslationVersionWithUser) o;
    return Objects.equals(this.id, translationVersionWithUser.id) &&
        Objects.equals(this.content, translationVersionWithUser.content) &&
        Objects.equals(this.pluralSuffix, translationVersionWithUser.pluralSuffix) &&
        Objects.equals(this.key, translationVersionWithUser.key) &&
        Objects.equals(this.locale, translationVersionWithUser.locale) &&
        Objects.equals(this.createdAt, translationVersionWithUser.createdAt) &&
        Objects.equals(this.updatedAt, translationVersionWithUser.updatedAt) &&
        Objects.equals(this.changedAt, translationVersionWithUser.changedAt) &&
        Objects.equals(this.user, translationVersionWithUser.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, pluralSuffix, key, locale, createdAt, updatedAt, changedAt, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationVersionWithUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pluralSuffix: ").append(toIndentedString(pluralSuffix)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

