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
import com.phrase.client.model.JobTemplatePreview;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.LocaleTeamPreview;
import com.phrase.client.model.LocaleUserPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobTemplateLocales
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-20T12:21:44.145214Z[Etc/UTC]")
public class JobTemplateLocales {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JOB_TEMPLATE = "job_template";
  @SerializedName(SERIALIZED_NAME_JOB_TEMPLATE)
  private JobTemplatePreview jobTemplate;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private LocalePreview locale;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<LocaleUserPreview> users = null;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<LocaleTeamPreview> teams = null;


  public JobTemplateLocales id(String id) {
    
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


  public JobTemplateLocales jobTemplate(JobTemplatePreview jobTemplate) {
    
    this.jobTemplate = jobTemplate;
    return this;
  }

   /**
   * Get jobTemplate
   * @return jobTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobTemplatePreview getJobTemplate() {
    return jobTemplate;
  }


  public void setJobTemplate(JobTemplatePreview jobTemplate) {
    this.jobTemplate = jobTemplate;
  }


  public JobTemplateLocales locale(LocalePreview locale) {
    
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


  public JobTemplateLocales users(List<LocaleUserPreview> users) {
    
    this.users = users;
    return this;
  }

  public JobTemplateLocales addUsersItem(LocaleUserPreview usersItem) {
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

  public List<LocaleUserPreview> getUsers() {
    return users;
  }


  public void setUsers(List<LocaleUserPreview> users) {
    this.users = users;
  }


  public JobTemplateLocales teams(List<LocaleTeamPreview> teams) {
    
    this.teams = teams;
    return this;
  }

  public JobTemplateLocales addTeamsItem(LocaleTeamPreview teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocaleTeamPreview> getTeams() {
    return teams;
  }


  public void setTeams(List<LocaleTeamPreview> teams) {
    this.teams = teams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTemplateLocales jobTemplateLocales = (JobTemplateLocales) o;
    return Objects.equals(this.id, jobTemplateLocales.id) &&
        Objects.equals(this.jobTemplate, jobTemplateLocales.jobTemplate) &&
        Objects.equals(this.locale, jobTemplateLocales.locale) &&
        Objects.equals(this.users, jobTemplateLocales.users) &&
        Objects.equals(this.teams, jobTemplateLocales.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobTemplate, locale, users, teams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTemplateLocales {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobTemplate: ").append(toIndentedString(jobTemplate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

