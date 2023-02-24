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
import com.phrase.client.model.BranchName;
import com.phrase.client.model.ProjectShort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Job
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T14:57:35.304658Z[Etc/UTC]")
public class Job {
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


  public Job id(String id) {
    
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


  public Job name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Job briefing(String briefing) {
    
    this.briefing = briefing;
    return this;
  }

   /**
   * Get briefing
   * @return briefing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBriefing() {
    return briefing;
  }


  public void setBriefing(String briefing) {
    this.briefing = briefing;
  }


  public Job dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public Job state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Job ticketUrl(String ticketUrl) {
    
    this.ticketUrl = ticketUrl;
    return this;
  }

   /**
   * Get ticketUrl
   * @return ticketUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTicketUrl() {
    return ticketUrl;
  }


  public void setTicketUrl(String ticketUrl) {
    this.ticketUrl = ticketUrl;
  }


  public Job project(ProjectShort project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectShort getProject() {
    return project;
  }


  public void setProject(ProjectShort project) {
    this.project = project;
  }


  public Job branch(BranchName branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BranchName getBranch() {
    return branch;
  }


  public void setBranch(BranchName branch) {
    this.branch = branch;
  }


  public Job createdAt(OffsetDateTime createdAt) {
    
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


  public Job updatedAt(OffsetDateTime updatedAt) {
    
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
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.briefing, job.briefing) &&
        Objects.equals(this.dueDate, job.dueDate) &&
        Objects.equals(this.state, job.state) &&
        Objects.equals(this.ticketUrl, job.ticketUrl) &&
        Objects.equals(this.project, job.project) &&
        Objects.equals(this.branch, job.branch) &&
        Objects.equals(this.createdAt, job.createdAt) &&
        Objects.equals(this.updatedAt, job.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, briefing, dueDate, state, ticketUrl, project, branch, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
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

