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
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReleaseTrigger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T06:43:11.225647232Z[Etc/UTC]")
public class ReleaseTrigger {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_CRON_SCHEDULE = "cron_schedule";
  @SerializedName(SERIALIZED_NAME_CRON_SCHEDULE)
  private String cronSchedule;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_NEXT_RUN_AT = "next_run_at";
  @SerializedName(SERIALIZED_NAME_NEXT_RUN_AT)
  private OffsetDateTime nextRunAt;

  public static final String SERIALIZED_NAME_APP_MIN_VERSION = "app_min_version";
  @SerializedName(SERIALIZED_NAME_APP_MIN_VERSION)
  private String appMinVersion;

  public static final String SERIALIZED_NAME_APP_MAX_VERSION = "app_max_version";
  @SerializedName(SERIALIZED_NAME_APP_MAX_VERSION)
  private String appMaxVersion;

  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<LocalePreview> locales;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ReleaseTrigger() {
  }

  public ReleaseTrigger id(String id) {
    
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


  public ReleaseTrigger branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public ReleaseTrigger cronSchedule(String cronSchedule) {
    
    this.cronSchedule = cronSchedule;
    return this;
  }

   /**
   * Cron schedule for the scheduler. Read more about the format of this field at https://en.wikipedia.org/wiki/Cron
   * @return cronSchedule
  **/
  @javax.annotation.Nullable

  public String getCronSchedule() {
    return cronSchedule;
  }


  public void setCronSchedule(String cronSchedule) {
    this.cronSchedule = cronSchedule;
  }


  public ReleaseTrigger timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Time zone for the scheduler
   * @return timeZone
  **/
  @javax.annotation.Nullable

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public ReleaseTrigger nextRunAt(OffsetDateTime nextRunAt) {
    
    this.nextRunAt = nextRunAt;
    return this;
  }

   /**
   * The next time a release will be created for this trigger
   * @return nextRunAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getNextRunAt() {
    return nextRunAt;
  }


  public void setNextRunAt(OffsetDateTime nextRunAt) {
    this.nextRunAt = nextRunAt;
  }


  public ReleaseTrigger appMinVersion(String appMinVersion) {
    
    this.appMinVersion = appMinVersion;
    return this;
  }

   /**
   * Get appMinVersion
   * @return appMinVersion
  **/
  @javax.annotation.Nullable

  public String getAppMinVersion() {
    return appMinVersion;
  }


  public void setAppMinVersion(String appMinVersion) {
    this.appMinVersion = appMinVersion;
  }


  public ReleaseTrigger appMaxVersion(String appMaxVersion) {
    
    this.appMaxVersion = appMaxVersion;
    return this;
  }

   /**
   * Get appMaxVersion
   * @return appMaxVersion
  **/
  @javax.annotation.Nullable

  public String getAppMaxVersion() {
    return appMaxVersion;
  }


  public void setAppMaxVersion(String appMaxVersion) {
    this.appMaxVersion = appMaxVersion;
  }


  public ReleaseTrigger locales(List<LocalePreview> locales) {
    
    this.locales = locales;
    return this;
  }

  public ReleaseTrigger addLocalesItem(LocalePreview localesItem) {
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


  public ReleaseTrigger tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ReleaseTrigger addTagsItem(String tagsItem) {
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


  public ReleaseTrigger createdAt(OffsetDateTime createdAt) {
    
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


  public ReleaseTrigger updatedAt(OffsetDateTime updatedAt) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTrigger releaseTrigger = (ReleaseTrigger) o;
    return Objects.equals(this.id, releaseTrigger.id) &&
        Objects.equals(this.branch, releaseTrigger.branch) &&
        Objects.equals(this.cronSchedule, releaseTrigger.cronSchedule) &&
        Objects.equals(this.timeZone, releaseTrigger.timeZone) &&
        Objects.equals(this.nextRunAt, releaseTrigger.nextRunAt) &&
        Objects.equals(this.appMinVersion, releaseTrigger.appMinVersion) &&
        Objects.equals(this.appMaxVersion, releaseTrigger.appMaxVersion) &&
        Objects.equals(this.locales, releaseTrigger.locales) &&
        Objects.equals(this.tags, releaseTrigger.tags) &&
        Objects.equals(this.createdAt, releaseTrigger.createdAt) &&
        Objects.equals(this.updatedAt, releaseTrigger.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, branch, cronSchedule, timeZone, nextRunAt, appMinVersion, appMaxVersion, locales, tags, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTrigger {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    cronSchedule: ").append(toIndentedString(cronSchedule)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    nextRunAt: ").append(toIndentedString(nextRunAt)).append("\n");
    sb.append("    appMinVersion: ").append(toIndentedString(appMinVersion)).append("\n");
    sb.append("    appMaxVersion: ").append(toIndentedString(appMaxVersion)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

