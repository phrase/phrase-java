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

/**
 * NotificationGroupDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-24T15:53:04.406259Z[Etc/UTC]")
public class NotificationGroupDetail {
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

  public static final String SERIALIZED_NAME_NOTIFICATIONS_COUNT = "notifications_count";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS_COUNT)
  private Integer notificationsCount;

  public static final String SERIALIZED_NAME_LATEST_NOTIFICATION = "latest_notification";
  @SerializedName(SERIALIZED_NAME_LATEST_NOTIFICATION)
  private Object latestNotification = null;


  public NotificationGroupDetail id(String id) {
    
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


  public NotificationGroupDetail eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public NotificationGroupDetail createdAt(OffsetDateTime createdAt) {
    
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


  public NotificationGroupDetail updatedAt(OffsetDateTime updatedAt) {
    
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


  public NotificationGroupDetail notificationsCount(Integer notificationsCount) {
    
    this.notificationsCount = notificationsCount;
    return this;
  }

   /**
   * Get notificationsCount
   * @return notificationsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNotificationsCount() {
    return notificationsCount;
  }


  public void setNotificationsCount(Integer notificationsCount) {
    this.notificationsCount = notificationsCount;
  }


  public NotificationGroupDetail latestNotification(Object latestNotification) {
    
    this.latestNotification = latestNotification;
    return this;
  }

   /**
   * Get latestNotification
   * @return latestNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLatestNotification() {
    return latestNotification;
  }


  public void setLatestNotification(Object latestNotification) {
    this.latestNotification = latestNotification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationGroupDetail notificationGroupDetail = (NotificationGroupDetail) o;
    return Objects.equals(this.id, notificationGroupDetail.id) &&
        Objects.equals(this.eventName, notificationGroupDetail.eventName) &&
        Objects.equals(this.createdAt, notificationGroupDetail.createdAt) &&
        Objects.equals(this.updatedAt, notificationGroupDetail.updatedAt) &&
        Objects.equals(this.notificationsCount, notificationGroupDetail.notificationsCount) &&
        Objects.equals(this.latestNotification, notificationGroupDetail.latestNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventName, createdAt, updatedAt, notificationsCount, latestNotification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationGroupDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    notificationsCount: ").append(toIndentedString(notificationsCount)).append("\n");
    sb.append("    latestNotification: ").append(toIndentedString(latestNotification)).append("\n");
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

