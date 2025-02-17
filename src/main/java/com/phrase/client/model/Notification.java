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
import com.phrase.client.model.Account;
import com.phrase.client.model.Locale;
import com.phrase.client.model.NotificationGroup;
import com.phrase.client.model.Project;
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Notification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T14:34:37.999277883Z[Etc/UTC]")
public class Notification {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EVENT_NAME = "event_name";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DELIVERED_AT = "delivered_at";
  @SerializedName(SERIALIZED_NAME_DELIVERED_AT)
  private OffsetDateTime deliveredAt;

  public static final String SERIALIZED_NAME_SEEN_AT = "seen_at";
  @SerializedName(SERIALIZED_NAME_SEEN_AT)
  private OffsetDateTime seenAt;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private Object resource;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private Locale locale;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserPreview user;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private NotificationGroup group;

  public Notification() {
  }

  public Notification id(String id) {
    
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


  public Notification eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public Notification createdAt(OffsetDateTime createdAt) {
    
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


  public Notification updatedAt(OffsetDateTime updatedAt) {
    
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


  public Notification deliveredAt(OffsetDateTime deliveredAt) {
    
    this.deliveredAt = deliveredAt;
    return this;
  }

   /**
   * Get deliveredAt
   * @return deliveredAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDeliveredAt() {
    return deliveredAt;
  }


  public void setDeliveredAt(OffsetDateTime deliveredAt) {
    this.deliveredAt = deliveredAt;
  }


  public Notification seenAt(OffsetDateTime seenAt) {
    
    this.seenAt = seenAt;
    return this;
  }

   /**
   * Get seenAt
   * @return seenAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getSeenAt() {
    return seenAt;
  }


  public void setSeenAt(OffsetDateTime seenAt) {
    this.seenAt = seenAt;
  }


  public Notification data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public Notification resource(Object resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable

  public Object getResource() {
    return resource;
  }


  public void setResource(Object resource) {
    this.resource = resource;
  }


  public Notification locale(Locale locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable

  public Locale getLocale() {
    return locale;
  }


  public void setLocale(Locale locale) {
    this.locale = locale;
  }


  public Notification user(UserPreview user) {
    
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


  public Notification project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public Project getProject() {
    return project;
  }


  public void setProject(Project project) {
    this.project = project;
  }


  public Notification account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    this.account = account;
  }


  public Notification group(NotificationGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable

  public NotificationGroup getGroup() {
    return group;
  }


  public void setGroup(NotificationGroup group) {
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.id, notification.id) &&
        Objects.equals(this.eventName, notification.eventName) &&
        Objects.equals(this.createdAt, notification.createdAt) &&
        Objects.equals(this.updatedAt, notification.updatedAt) &&
        Objects.equals(this.deliveredAt, notification.deliveredAt) &&
        Objects.equals(this.seenAt, notification.seenAt) &&
        Objects.equals(this.data, notification.data) &&
        Objects.equals(this.resource, notification.resource) &&
        Objects.equals(this.locale, notification.locale) &&
        Objects.equals(this.user, notification.user) &&
        Objects.equals(this.project, notification.project) &&
        Objects.equals(this.account, notification.account) &&
        Objects.equals(this.group, notification.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventName, createdAt, updatedAt, deliveredAt, seenAt, data, resource, locale, user, project, account, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

