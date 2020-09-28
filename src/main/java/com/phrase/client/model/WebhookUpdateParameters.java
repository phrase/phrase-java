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

/**
 * WebhookUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-28T13:07:43.335Z[Etc/UTC]")
public class WebhookUpdateParameters {
  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private String events;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;


  public WebhookUpdateParameters callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback URL to send requests to
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/hooks/phraseapp-notifications", value = "Callback URL to send requests to")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public WebhookUpdateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Webhook description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My webhook for chat notifications", value = "Webhook description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookUpdateParameters events(String events) {
    
    this.events = events;
    return this;
  }

   /**
   * List of event names to trigger the webhook (separated by comma)
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "locales:create,translations:update", value = "List of event names to trigger the webhook (separated by comma)")

  public String getEvents() {
    return events;
  }


  public void setEvents(String events) {
    this.events = events;
  }


  public WebhookUpdateParameters active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Whether webhook is active or inactive
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether webhook is active or inactive")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdateParameters webhookUpdateParameters = (WebhookUpdateParameters) o;
    return Objects.equals(this.callbackUrl, webhookUpdateParameters.callbackUrl) &&
        Objects.equals(this.description, webhookUpdateParameters.description) &&
        Objects.equals(this.events, webhookUpdateParameters.events) &&
        Objects.equals(this.active, webhookUpdateParameters.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, description, events, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdateParameters {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

