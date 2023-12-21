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
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Comment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-21T15:21:31.740862Z[Etc/UTC]")
public class Comment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_HAS_REPLIES = "has_replies";
  @SerializedName(SERIALIZED_NAME_HAS_REPLIES)
  private Boolean hasReplies;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserPreview user;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_MENTIONED_USERS = "mentioned_users";
  @SerializedName(SERIALIZED_NAME_MENTIONED_USERS)
  private List<UserPreview> mentionedUsers;

  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<LocalePreview> locales;

  public Comment() {
  }

  public Comment id(String id) {
    
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


  public Comment message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Comment hasReplies(Boolean hasReplies) {
    
    this.hasReplies = hasReplies;
    return this;
  }

   /**
   * Get hasReplies
   * @return hasReplies
  **/
  @javax.annotation.Nullable

  public Boolean getHasReplies() {
    return hasReplies;
  }


  public void setHasReplies(Boolean hasReplies) {
    this.hasReplies = hasReplies;
  }


  public Comment user(UserPreview user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public UserPreview getUser() {
    return user;
  }


  public void setUser(UserPreview user) {
    this.user = user;
  }


  public Comment createdAt(OffsetDateTime createdAt) {
    
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


  public Comment updatedAt(OffsetDateTime updatedAt) {
    
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


  public Comment mentionedUsers(List<UserPreview> mentionedUsers) {
    
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public Comment addMentionedUsersItem(UserPreview mentionedUsersItem) {
    if (this.mentionedUsers == null) {
      this.mentionedUsers = new ArrayList<>();
    }
    this.mentionedUsers.add(mentionedUsersItem);
    return this;
  }

   /**
   * Get mentionedUsers
   * @return mentionedUsers
  **/
  @javax.annotation.Nullable

  public List<UserPreview> getMentionedUsers() {
    return mentionedUsers;
  }


  public void setMentionedUsers(List<UserPreview> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public Comment locales(List<LocalePreview> locales) {
    
    this.locales = locales;
    return this;
  }

  public Comment addLocalesItem(LocalePreview localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

   /**
   * Get locales
   * @return locales
  **/
  @javax.annotation.Nullable

  public List<LocalePreview> getLocales() {
    return locales;
  }


  public void setLocales(List<LocalePreview> locales) {
    this.locales = locales;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.message, comment.message) &&
        Objects.equals(this.hasReplies, comment.hasReplies) &&
        Objects.equals(this.user, comment.user) &&
        Objects.equals(this.createdAt, comment.createdAt) &&
        Objects.equals(this.updatedAt, comment.updatedAt) &&
        Objects.equals(this.mentionedUsers, comment.mentionedUsers) &&
        Objects.equals(this.locales, comment.locales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, hasReplies, user, createdAt, updatedAt, mentionedUsers, locales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    hasReplies: ").append(toIndentedString(hasReplies)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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

