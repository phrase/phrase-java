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
import com.phrase.client.model.RepoSyncEventErrorsInner;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RepoSyncEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T11:57:28.502990428Z[Etc/UTC]")
public class RepoSyncEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    IMPORT("import"),
    
    EXPORT("export");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    RUNNING("running"),
    
    SUCCESS("success"),
    
    FAILURE("failure");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_PULL_REQUEST_URL = "pull_request_url";
  @SerializedName(SERIALIZED_NAME_PULL_REQUEST_URL)
  private String pullRequestUrl;

  public static final String SERIALIZED_NAME_AUTO_IMPORT = "auto_import";
  @SerializedName(SERIALIZED_NAME_AUTO_IMPORT)
  private Boolean autoImport;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<RepoSyncEventErrorsInner> errors;

  public RepoSyncEvent() {
  }

  public RepoSyncEvent id(String id) {
    
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


  public RepoSyncEvent eventType(EventTypeEnum eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable

  public EventTypeEnum getEventType() {
    return eventType;
  }


  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public RepoSyncEvent createdAt(OffsetDateTime createdAt) {
    
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


  public RepoSyncEvent status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RepoSyncEvent pullRequestUrl(String pullRequestUrl) {
    
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

   /**
   * URL of the pull request created on export
   * @return pullRequestUrl
  **/
  @javax.annotation.Nullable

  public String getPullRequestUrl() {
    return pullRequestUrl;
  }


  public void setPullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }


  public RepoSyncEvent autoImport(Boolean autoImport) {
    
    this.autoImport = autoImport;
    return this;
  }

   /**
   * Whether the import was triggered by the repo push event
   * @return autoImport
  **/
  @javax.annotation.Nullable

  public Boolean getAutoImport() {
    return autoImport;
  }


  public void setAutoImport(Boolean autoImport) {
    this.autoImport = autoImport;
  }


  public RepoSyncEvent errors(List<RepoSyncEventErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public RepoSyncEvent addErrorsItem(RepoSyncEventErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of error messages, in case of failure
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<RepoSyncEventErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<RepoSyncEventErrorsInner> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoSyncEvent repoSyncEvent = (RepoSyncEvent) o;
    return Objects.equals(this.id, repoSyncEvent.id) &&
        Objects.equals(this.eventType, repoSyncEvent.eventType) &&
        Objects.equals(this.createdAt, repoSyncEvent.createdAt) &&
        Objects.equals(this.status, repoSyncEvent.status) &&
        Objects.equals(this.pullRequestUrl, repoSyncEvent.pullRequestUrl) &&
        Objects.equals(this.autoImport, repoSyncEvent.autoImport) &&
        Objects.equals(this.errors, repoSyncEvent.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, createdAt, status, pullRequestUrl, autoImport, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoSyncEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    autoImport: ").append(toIndentedString(autoImport)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

