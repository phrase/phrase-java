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
import com.phrase.client.model.BranchName;
import com.phrase.client.model.KeyPreview;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.ProjectShort;
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T13:36:06.529719Z[Etc/UTC]")
public class JobDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRIEFING = "briefing";
  @SerializedName(SERIALIZED_NAME_BRIEFING)
  private String briefing;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TICKET_URL = "ticket_url";
  @SerializedName(SERIALIZED_NAME_TICKET_URL)
  private String ticketUrl;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectShort project;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private BranchName branch;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserPreview owner;

  public static final String SERIALIZED_NAME_JOB_TAG_NAME = "job_tag_name";
  @SerializedName(SERIALIZED_NAME_JOB_TAG_NAME)
  private String jobTagName;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE = "source_locale";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE)
  private LocalePreview sourceLocale;

  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<LocalePreview> locales;

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<KeyPreview> keys;

  public JobDetails() {
  }

  public JobDetails id(String id) {
    
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


  public JobDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobDetails briefing(String briefing) {
    
    this.briefing = briefing;
    return this;
  }

   /**
   * Get briefing
   * @return briefing
  **/
  @javax.annotation.Nullable

  public String getBriefing() {
    return briefing;
  }


  public void setBriefing(String briefing) {
    this.briefing = briefing;
  }


  public JobDetails dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public JobDetails state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public JobDetails ticketUrl(String ticketUrl) {
    
    this.ticketUrl = ticketUrl;
    return this;
  }

   /**
   * Get ticketUrl
   * @return ticketUrl
  **/
  @javax.annotation.Nullable

  public String getTicketUrl() {
    return ticketUrl;
  }


  public void setTicketUrl(String ticketUrl) {
    this.ticketUrl = ticketUrl;
  }


  public JobDetails project(ProjectShort project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public ProjectShort getProject() {
    return project;
  }


  public void setProject(ProjectShort project) {
    this.project = project;
  }


  public JobDetails branch(BranchName branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @javax.annotation.Nullable

  public BranchName getBranch() {
    return branch;
  }


  public void setBranch(BranchName branch) {
    this.branch = branch;
  }


  public JobDetails createdAt(OffsetDateTime createdAt) {
    
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


  public JobDetails updatedAt(OffsetDateTime updatedAt) {
    
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


  public JobDetails owner(UserPreview owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable

  public UserPreview getOwner() {
    return owner;
  }


  public void setOwner(UserPreview owner) {
    this.owner = owner;
  }


  public JobDetails jobTagName(String jobTagName) {
    
    this.jobTagName = jobTagName;
    return this;
  }

   /**
   * Get jobTagName
   * @return jobTagName
  **/
  @javax.annotation.Nullable

  public String getJobTagName() {
    return jobTagName;
  }


  public void setJobTagName(String jobTagName) {
    this.jobTagName = jobTagName;
  }


  public JobDetails sourceLocale(LocalePreview sourceLocale) {
    
    this.sourceLocale = sourceLocale;
    return this;
  }

   /**
   * Get sourceLocale
   * @return sourceLocale
  **/
  @javax.annotation.Nullable

  public LocalePreview getSourceLocale() {
    return sourceLocale;
  }


  public void setSourceLocale(LocalePreview sourceLocale) {
    this.sourceLocale = sourceLocale;
  }


  public JobDetails locales(List<LocalePreview> locales) {
    
    this.locales = locales;
    return this;
  }

  public JobDetails addLocalesItem(LocalePreview localesItem) {
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


  public JobDetails keys(List<KeyPreview> keys) {
    
    this.keys = keys;
    return this;
  }

  public JobDetails addKeysItem(KeyPreview keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @javax.annotation.Nullable

  public List<KeyPreview> getKeys() {
    return keys;
  }


  public void setKeys(List<KeyPreview> keys) {
    this.keys = keys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetails jobDetails = (JobDetails) o;
    return Objects.equals(this.id, jobDetails.id) &&
        Objects.equals(this.name, jobDetails.name) &&
        Objects.equals(this.briefing, jobDetails.briefing) &&
        Objects.equals(this.dueDate, jobDetails.dueDate) &&
        Objects.equals(this.state, jobDetails.state) &&
        Objects.equals(this.ticketUrl, jobDetails.ticketUrl) &&
        Objects.equals(this.project, jobDetails.project) &&
        Objects.equals(this.branch, jobDetails.branch) &&
        Objects.equals(this.createdAt, jobDetails.createdAt) &&
        Objects.equals(this.updatedAt, jobDetails.updatedAt) &&
        Objects.equals(this.owner, jobDetails.owner) &&
        Objects.equals(this.jobTagName, jobDetails.jobTagName) &&
        Objects.equals(this.sourceLocale, jobDetails.sourceLocale) &&
        Objects.equals(this.locales, jobDetails.locales) &&
        Objects.equals(this.keys, jobDetails.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, briefing, dueDate, state, ticketUrl, project, branch, createdAt, updatedAt, owner, jobTagName, sourceLocale, locales, keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    briefing: ").append(toIndentedString(briefing)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ticketUrl: ").append(toIndentedString(ticketUrl)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    jobTagName: ").append(toIndentedString(jobTagName)).append("\n");
    sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

