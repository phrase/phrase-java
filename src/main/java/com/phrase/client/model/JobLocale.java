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
import com.phrase.client.model.JobPreview;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.UserPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * JobLocale
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T15:02:32.350972Z[Etc/UTC]")
public class JobLocale {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private JobPreview job;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private LocalePreview locale;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<UserPreview> users = null;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Boolean completed;

  public static final String SERIALIZED_NAME_TRANSLATION_COMPLETED_AT = "translation_completed_at";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_COMPLETED_AT)
  private OffsetDateTime translationCompletedAt;

  public static final String SERIALIZED_NAME_REVIEW_COMPLETED_AT = "review_completed_at";
  @SerializedName(SERIALIZED_NAME_REVIEW_COMPLETED_AT)
  private OffsetDateTime reviewCompletedAt;


  public JobLocale id(String id) {
    
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


  public JobLocale job(JobPreview job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobPreview getJob() {
    return job;
  }


  public void setJob(JobPreview job) {
    this.job = job;
  }


  public JobLocale locale(LocalePreview locale) {
    
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


  public JobLocale users(List<UserPreview> users) {
    
    this.users = users;
    return this;
  }

  public JobLocale addUsersItem(UserPreview usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPreview> getUsers() {
    return users;
  }


  public void setUsers(List<UserPreview> users) {
    this.users = users;
  }


  public JobLocale completed(Boolean completed) {
    
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompleted() {
    return completed;
  }


  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  public JobLocale translationCompletedAt(OffsetDateTime translationCompletedAt) {
    
    this.translationCompletedAt = translationCompletedAt;
    return this;
  }

   /**
   * Get translationCompletedAt
   * @return translationCompletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTranslationCompletedAt() {
    return translationCompletedAt;
  }


  public void setTranslationCompletedAt(OffsetDateTime translationCompletedAt) {
    this.translationCompletedAt = translationCompletedAt;
  }


  public JobLocale reviewCompletedAt(OffsetDateTime reviewCompletedAt) {
    
    this.reviewCompletedAt = reviewCompletedAt;
    return this;
  }

   /**
   * Get reviewCompletedAt
   * @return reviewCompletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getReviewCompletedAt() {
    return reviewCompletedAt;
  }


  public void setReviewCompletedAt(OffsetDateTime reviewCompletedAt) {
    this.reviewCompletedAt = reviewCompletedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobLocale jobLocale = (JobLocale) o;
    return Objects.equals(this.id, jobLocale.id) &&
        Objects.equals(this.job, jobLocale.job) &&
        Objects.equals(this.locale, jobLocale.locale) &&
        Objects.equals(this.users, jobLocale.users) &&
        Objects.equals(this.completed, jobLocale.completed) &&
        Objects.equals(this.translationCompletedAt, jobLocale.translationCompletedAt) &&
        Objects.equals(this.reviewCompletedAt, jobLocale.reviewCompletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, job, locale, users, completed, translationCompletedAt, reviewCompletedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobLocale {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    translationCompletedAt: ").append(toIndentedString(translationCompletedAt)).append("\n");
    sb.append("    reviewCompletedAt: ").append(toIndentedString(reviewCompletedAt)).append("\n");
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

