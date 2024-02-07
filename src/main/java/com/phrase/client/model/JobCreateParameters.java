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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T15:23:17.520138Z[Etc/UTC]")
public class JobCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE_ID = "source_locale_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE_ID)
  private String sourceLocaleId;

  public static final String SERIALIZED_NAME_BRIEFING = "briefing";
  @SerializedName(SERIALIZED_NAME_BRIEFING)
  private String briefing;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_TICKET_URL = "ticket_url";
  @SerializedName(SERIALIZED_NAME_TICKET_URL)
  private String ticketUrl;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_TRANSLATION_KEY_IDS = "translation_key_ids";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_KEY_IDS)
  private List<String> translationKeyIds;

  public static final String SERIALIZED_NAME_JOB_TEMPLATE_ID = "job_template_id";
  @SerializedName(SERIALIZED_NAME_JOB_TEMPLATE_ID)
  private String jobTemplateId;

  public JobCreateParameters() {
  }

  public JobCreateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public JobCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Job name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobCreateParameters sourceLocaleId(String sourceLocaleId) {
    
    this.sourceLocaleId = sourceLocaleId;
    return this;
  }

   /**
   * The API id of the source language
   * @return sourceLocaleId
  **/
  @javax.annotation.Nullable

  public String getSourceLocaleId() {
    return sourceLocaleId;
  }


  public void setSourceLocaleId(String sourceLocaleId) {
    this.sourceLocaleId = sourceLocaleId;
  }


  public JobCreateParameters briefing(String briefing) {
    
    this.briefing = briefing;
    return this;
  }

   /**
   * Briefing for the translators
   * @return briefing
  **/
  @javax.annotation.Nullable

  public String getBriefing() {
    return briefing;
  }


  public void setBriefing(String briefing) {
    this.briefing = briefing;
  }


  public JobCreateParameters dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Date the job should be finished
   * @return dueDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public JobCreateParameters ticketUrl(String ticketUrl) {
    
    this.ticketUrl = ticketUrl;
    return this;
  }

   /**
   * URL to a ticket for this job (e.g. Jira, Trello)
   * @return ticketUrl
  **/
  @javax.annotation.Nullable

  public String getTicketUrl() {
    return ticketUrl;
  }


  public void setTicketUrl(String ticketUrl) {
    this.ticketUrl = ticketUrl;
  }


  public JobCreateParameters tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public JobCreateParameters addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * tags of keys that should be included within the job
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public JobCreateParameters translationKeyIds(List<String> translationKeyIds) {
    
    this.translationKeyIds = translationKeyIds;
    return this;
  }

  public JobCreateParameters addTranslationKeyIdsItem(String translationKeyIdsItem) {
    if (this.translationKeyIds == null) {
      this.translationKeyIds = new ArrayList<>();
    }
    this.translationKeyIds.add(translationKeyIdsItem);
    return this;
  }

   /**
   * ids of keys that should be included within the job
   * @return translationKeyIds
  **/
  @javax.annotation.Nullable

  public List<String> getTranslationKeyIds() {
    return translationKeyIds;
  }


  public void setTranslationKeyIds(List<String> translationKeyIds) {
    this.translationKeyIds = translationKeyIds;
  }


  public JobCreateParameters jobTemplateId(String jobTemplateId) {
    
    this.jobTemplateId = jobTemplateId;
    return this;
  }

   /**
   * id of a job template you would like to model the created job after. Any manually added parameters will take preference over template attributes.
   * @return jobTemplateId
  **/
  @javax.annotation.Nullable

  public String getJobTemplateId() {
    return jobTemplateId;
  }


  public void setJobTemplateId(String jobTemplateId) {
    this.jobTemplateId = jobTemplateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCreateParameters jobCreateParameters = (JobCreateParameters) o;
    return Objects.equals(this.branch, jobCreateParameters.branch) &&
        Objects.equals(this.name, jobCreateParameters.name) &&
        Objects.equals(this.sourceLocaleId, jobCreateParameters.sourceLocaleId) &&
        Objects.equals(this.briefing, jobCreateParameters.briefing) &&
        Objects.equals(this.dueDate, jobCreateParameters.dueDate) &&
        Objects.equals(this.ticketUrl, jobCreateParameters.ticketUrl) &&
        Objects.equals(this.tags, jobCreateParameters.tags) &&
        Objects.equals(this.translationKeyIds, jobCreateParameters.translationKeyIds) &&
        Objects.equals(this.jobTemplateId, jobCreateParameters.jobTemplateId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, sourceLocaleId, briefing, dueDate, ticketUrl, tags, translationKeyIds, jobTemplateId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceLocaleId: ").append(toIndentedString(sourceLocaleId)).append("\n");
    sb.append("    briefing: ").append(toIndentedString(briefing)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    ticketUrl: ").append(toIndentedString(ticketUrl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    translationKeyIds: ").append(toIndentedString(translationKeyIds)).append("\n");
    sb.append("    jobTemplateId: ").append(toIndentedString(jobTemplateId)).append("\n");
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

