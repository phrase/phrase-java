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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * WebhookDelivery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-23T13:28:43.001721Z[Etc/UTC]")
public class WebhookDelivery {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhook_id";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private String webhookId;

  public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "response_status_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
  private Integer responseStatusCode;

  public static final String SERIALIZED_NAME_DELIVERED_AT = "delivered_at";
  @SerializedName(SERIALIZED_NAME_DELIVERED_AT)
  private OffsetDateTime deliveredAt;

  public static final String SERIALIZED_NAME_DURATION_MS = "duration_ms";
  @SerializedName(SERIALIZED_NAME_DURATION_MS)
  private Integer durationMs;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public WebhookDelivery id(String id) {
    
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


  public WebhookDelivery webhookId(String webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * Get webhookId
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(String webhookId) {
    this.webhookId = webhookId;
  }


  public WebhookDelivery responseStatusCode(Integer responseStatusCode) {
    
    this.responseStatusCode = responseStatusCode;
    return this;
  }

   /**
   * Get responseStatusCode
   * @return responseStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }


  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }


  public WebhookDelivery deliveredAt(OffsetDateTime deliveredAt) {
    
    this.deliveredAt = deliveredAt;
    return this;
  }

   /**
   * Get deliveredAt
   * @return deliveredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeliveredAt() {
    return deliveredAt;
  }


  public void setDeliveredAt(OffsetDateTime deliveredAt) {
    this.deliveredAt = deliveredAt;
  }


  public WebhookDelivery durationMs(Integer durationMs) {
    
    this.durationMs = durationMs;
    return this;
  }

   /**
   * Get durationMs
   * @return durationMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationMs() {
    return durationMs;
  }


  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }


  public WebhookDelivery createdAt(OffsetDateTime createdAt) {
    
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


  public WebhookDelivery updatedAt(OffsetDateTime updatedAt) {
    
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
    WebhookDelivery webhookDelivery = (WebhookDelivery) o;
    return Objects.equals(this.id, webhookDelivery.id) &&
        Objects.equals(this.webhookId, webhookDelivery.webhookId) &&
        Objects.equals(this.responseStatusCode, webhookDelivery.responseStatusCode) &&
        Objects.equals(this.deliveredAt, webhookDelivery.deliveredAt) &&
        Objects.equals(this.durationMs, webhookDelivery.durationMs) &&
        Objects.equals(this.createdAt, webhookDelivery.createdAt) &&
        Objects.equals(this.updatedAt, webhookDelivery.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webhookId, responseStatusCode, deliveredAt, durationMs, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDelivery {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    responseStatusCode: ").append(toIndentedString(responseStatusCode)).append("\n");
    sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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

