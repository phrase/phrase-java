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
 * JobUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T12:53:36.818230Z[Etc/UTC]")
public class JobUpdateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRIEFING = "briefing";
  @SerializedName(SERIALIZED_NAME_BRIEFING)
  private String briefing;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_TICKET_URL = "ticket_url";
  @SerializedName(SERIALIZED_NAME_TICKET_URL)
  private String ticketUrl;


  public JobUpdateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-feature-branch", value = "specify the branch to use")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public JobUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Job name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "Job name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobUpdateParameters briefing(String briefing) {
    
    this.briefing = briefing;
    return this;
  }

   /**
   * Briefing for the translators
   * @return briefing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de-DE", value = "Briefing for the translators")

  public String getBriefing() {
    return briefing;
  }


  public void setBriefing(String briefing) {
    this.briefing = briefing;
  }


  public JobUpdateParameters dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Date the job should be finished
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the job should be finished")

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public JobUpdateParameters ticketUrl(String ticketUrl) {
    
    this.ticketUrl = ticketUrl;
    return this;
  }

   /**
   * URL to a ticket for this job (e.g. Jira, Trello)
   * @return ticketUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.atlassian.net/browse/FOO", value = "URL to a ticket for this job (e.g. Jira, Trello)")

  public String getTicketUrl() {
    return ticketUrl;
  }


  public void setTicketUrl(String ticketUrl) {
    this.ticketUrl = ticketUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobUpdateParameters jobUpdateParameters = (JobUpdateParameters) o;
    return Objects.equals(this.branch, jobUpdateParameters.branch) &&
        Objects.equals(this.name, jobUpdateParameters.name) &&
        Objects.equals(this.briefing, jobUpdateParameters.briefing) &&
        Objects.equals(this.dueDate, jobUpdateParameters.dueDate) &&
        Objects.equals(this.ticketUrl, jobUpdateParameters.ticketUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, briefing, dueDate, ticketUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobUpdateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    briefing: ").append(toIndentedString(briefing)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    ticketUrl: ").append(toIndentedString(ticketUrl)).append("\n");
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

