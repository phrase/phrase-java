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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ReleaseCreateParameters1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T14:34:37.999277883Z[Etc/UTC]")
public class ReleaseCreateParameters1 {
  public static final String SERIALIZED_NAME_CRON_SCHEDULE = "cron_schedule";
  @SerializedName(SERIALIZED_NAME_CRON_SCHEDULE)
  private String cronSchedule;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_LOCALE_IDS = "locale_ids";
  @SerializedName(SERIALIZED_NAME_LOCALE_IDS)
  private List<String> localeIds;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_APP_MIN_VERSION = "app_min_version";
  @SerializedName(SERIALIZED_NAME_APP_MIN_VERSION)
  private String appMinVersion;

  public static final String SERIALIZED_NAME_APP_MAX_VERSION = "app_max_version";
  @SerializedName(SERIALIZED_NAME_APP_MAX_VERSION)
  private String appMaxVersion;

  public ReleaseCreateParameters1() {
  }

  public ReleaseCreateParameters1 cronSchedule(String cronSchedule) {
    
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


  public ReleaseCreateParameters1 timeZone(String timeZone) {
    
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


  public ReleaseCreateParameters1 localeIds(List<String> localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

  public ReleaseCreateParameters1 addLocaleIdsItem(String localeIdsItem) {
    if (this.localeIds == null) {
      this.localeIds = new ArrayList<>();
    }
    this.localeIds.add(localeIdsItem);
    return this;
  }

   /**
   * List of locale ids that will be included in the release.
   * @return localeIds
  **/
  @javax.annotation.Nullable

  public List<String> getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(List<String> localeIds) {
    this.localeIds = localeIds;
  }


  public ReleaseCreateParameters1 tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ReleaseCreateParameters1 addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Only include tagged keys in the release. For a key to be included it must be tagged with all tags provided
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ReleaseCreateParameters1 branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Branch used for release
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public ReleaseCreateParameters1 appMinVersion(String appMinVersion) {
    
    this.appMinVersion = appMinVersion;
    return this;
  }

   /**
   * The created releases will be available only for apps with version greater or equal to this value
   * @return appMinVersion
  **/
  @javax.annotation.Nullable

  public String getAppMinVersion() {
    return appMinVersion;
  }


  public void setAppMinVersion(String appMinVersion) {
    this.appMinVersion = appMinVersion;
  }


  public ReleaseCreateParameters1 appMaxVersion(String appMaxVersion) {
    
    this.appMaxVersion = appMaxVersion;
    return this;
  }

   /**
   * The created releases will be available only for apps with version less or equal to this value
   * @return appMaxVersion
  **/
  @javax.annotation.Nullable

  public String getAppMaxVersion() {
    return appMaxVersion;
  }


  public void setAppMaxVersion(String appMaxVersion) {
    this.appMaxVersion = appMaxVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseCreateParameters1 releaseCreateParameters1 = (ReleaseCreateParameters1) o;
    return Objects.equals(this.cronSchedule, releaseCreateParameters1.cronSchedule) &&
        Objects.equals(this.timeZone, releaseCreateParameters1.timeZone) &&
        Objects.equals(this.localeIds, releaseCreateParameters1.localeIds) &&
        Objects.equals(this.tags, releaseCreateParameters1.tags) &&
        Objects.equals(this.branch, releaseCreateParameters1.branch) &&
        Objects.equals(this.appMinVersion, releaseCreateParameters1.appMinVersion) &&
        Objects.equals(this.appMaxVersion, releaseCreateParameters1.appMaxVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronSchedule, timeZone, localeIds, tags, branch, appMinVersion, appMaxVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseCreateParameters1 {\n");
    sb.append("    cronSchedule: ").append(toIndentedString(cronSchedule)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    localeIds: ").append(toIndentedString(localeIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    appMinVersion: ").append(toIndentedString(appMinVersion)).append("\n");
    sb.append("    appMaxVersion: ").append(toIndentedString(appMaxVersion)).append("\n");
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

