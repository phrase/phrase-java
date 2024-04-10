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
import com.phrase.client.model.MemberSpacesInner;
import com.phrase.client.model.ProjectLocales;
import com.phrase.client.model.TeamShort;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Member
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T08:58:54.004002Z[Etc/UTC]")
public class Member {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY_AT = "last_activity_at";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY_AT)
  private OffsetDateTime lastActivityAt;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<ProjectLocales> projects;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Object permissions;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE_CODES = "default_locale_codes";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE_CODES)
  private List<String> defaultLocaleCodes;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<TeamShort> teams;

  public static final String SERIALIZED_NAME_SPACES = "spaces";
  @SerializedName(SERIALIZED_NAME_SPACES)
  private List<MemberSpacesInner> spaces;

  public Member() {
  }

  public Member id(String id) {
    
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


  public Member email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Member username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public Member createdAt(OffsetDateTime createdAt) {
    
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


  public Member lastActivityAt(OffsetDateTime lastActivityAt) {
    
    this.lastActivityAt = lastActivityAt;
    return this;
  }

   /**
   * Get lastActivityAt
   * @return lastActivityAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastActivityAt() {
    return lastActivityAt;
  }


  public void setLastActivityAt(OffsetDateTime lastActivityAt) {
    this.lastActivityAt = lastActivityAt;
  }


  public Member role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public Member projects(List<ProjectLocales> projects) {
    
    this.projects = projects;
    return this;
  }

  public Member addProjectsItem(ProjectLocales projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @javax.annotation.Nullable

  public List<ProjectLocales> getProjects() {
    return projects;
  }


  public void setProjects(List<ProjectLocales> projects) {
    this.projects = projects;
  }


  public Member permissions(Object permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable

  public Object getPermissions() {
    return permissions;
  }


  public void setPermissions(Object permissions) {
    this.permissions = permissions;
  }


  public Member defaultLocaleCodes(List<String> defaultLocaleCodes) {
    
    this.defaultLocaleCodes = defaultLocaleCodes;
    return this;
  }

  public Member addDefaultLocaleCodesItem(String defaultLocaleCodesItem) {
    if (this.defaultLocaleCodes == null) {
      this.defaultLocaleCodes = new ArrayList<>();
    }
    this.defaultLocaleCodes.add(defaultLocaleCodesItem);
    return this;
  }

   /**
   * Get defaultLocaleCodes
   * @return defaultLocaleCodes
  **/
  @javax.annotation.Nullable

  public List<String> getDefaultLocaleCodes() {
    return defaultLocaleCodes;
  }


  public void setDefaultLocaleCodes(List<String> defaultLocaleCodes) {
    this.defaultLocaleCodes = defaultLocaleCodes;
  }


  public Member teams(List<TeamShort> teams) {
    
    this.teams = teams;
    return this;
  }

  public Member addTeamsItem(TeamShort teamsItem) {
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

  public List<TeamShort> getTeams() {
    return teams;
  }


  public void setTeams(List<TeamShort> teams) {
    this.teams = teams;
  }


  public Member spaces(List<MemberSpacesInner> spaces) {
    
    this.spaces = spaces;
    return this;
  }

  public Member addSpacesItem(MemberSpacesInner spacesItem) {
    if (this.spaces == null) {
      this.spaces = new ArrayList<>();
    }
    this.spaces.add(spacesItem);
    return this;
  }

   /**
   * Get spaces
   * @return spaces
  **/
  @javax.annotation.Nullable

  public List<MemberSpacesInner> getSpaces() {
    return spaces;
  }


  public void setSpaces(List<MemberSpacesInner> spaces) {
    this.spaces = spaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.email, member.email) &&
        Objects.equals(this.username, member.username) &&
        Objects.equals(this.createdAt, member.createdAt) &&
        Objects.equals(this.lastActivityAt, member.lastActivityAt) &&
        Objects.equals(this.role, member.role) &&
        Objects.equals(this.projects, member.projects) &&
        Objects.equals(this.permissions, member.permissions) &&
        Objects.equals(this.defaultLocaleCodes, member.defaultLocaleCodes) &&
        Objects.equals(this.teams, member.teams) &&
        Objects.equals(this.spaces, member.spaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, username, createdAt, lastActivityAt, role, projects, permissions, defaultLocaleCodes, teams, spaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    defaultLocaleCodes: ").append(toIndentedString(defaultLocaleCodes)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
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

