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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InvitationCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T10:41:21.781068Z[Etc/UTC]")
public class InvitationCreateParameters {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private String projectIds;

  public static final String SERIALIZED_NAME_LOCALE_IDS = "locale_ids";
  @SerializedName(SERIALIZED_NAME_LOCALE_IDS)
  private String localeIds;

  public static final String SERIALIZED_NAME_SPACE_IDS = "space_ids";
  @SerializedName(SERIALIZED_NAME_SPACE_IDS)
  private List<String> spaceIds;

  public static final String SERIALIZED_NAME_TEAM_IDS = "team_ids";
  @SerializedName(SERIALIZED_NAME_TEAM_IDS)
  private List<String> teamIds;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE_CODES = "default_locale_codes";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE_CODES)
  private List<String> defaultLocaleCodes;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Map<String, String> permissions = new HashMap<>();

  public InvitationCreateParameters() {
  }

  public InvitationCreateParameters email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the invited user. The &lt;code&gt;email&lt;/code&gt; can not be updated once created. Create a new invitation for each unique email.
   * @return email
  **/
  @javax.annotation.Nonnull

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public InvitationCreateParameters role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Invitiation role, can be any of Manager, Developer, Translator.
   * @return role
  **/
  @javax.annotation.Nonnull

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public InvitationCreateParameters projectIds(String projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

   /**
   * List of project ids the invited user has access to.
   * @return projectIds
  **/
  @javax.annotation.Nullable

  public String getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(String projectIds) {
    this.projectIds = projectIds;
  }


  public InvitationCreateParameters localeIds(String localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

   /**
   * List of locale ids the invited user has access to.
   * @return localeIds
  **/
  @javax.annotation.Nullable

  public String getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(String localeIds) {
    this.localeIds = localeIds;
  }


  public InvitationCreateParameters spaceIds(List<String> spaceIds) {
    
    this.spaceIds = spaceIds;
    return this;
  }

  public InvitationCreateParameters addSpaceIdsItem(String spaceIdsItem) {
    if (this.spaceIds == null) {
      this.spaceIds = new ArrayList<>();
    }
    this.spaceIds.add(spaceIdsItem);
    return this;
  }

   /**
   * List of spaces the user is assigned to.
   * @return spaceIds
  **/
  @javax.annotation.Nullable

  public List<String> getSpaceIds() {
    return spaceIds;
  }


  public void setSpaceIds(List<String> spaceIds) {
    this.spaceIds = spaceIds;
  }


  public InvitationCreateParameters teamIds(List<String> teamIds) {
    
    this.teamIds = teamIds;
    return this;
  }

  public InvitationCreateParameters addTeamIdsItem(String teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * List of teams the user is assigned to.
   * @return teamIds
  **/
  @javax.annotation.Nullable

  public List<String> getTeamIds() {
    return teamIds;
  }


  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }


  public InvitationCreateParameters defaultLocaleCodes(List<String> defaultLocaleCodes) {
    
    this.defaultLocaleCodes = defaultLocaleCodes;
    return this;
  }

  public InvitationCreateParameters addDefaultLocaleCodesItem(String defaultLocaleCodesItem) {
    if (this.defaultLocaleCodes == null) {
      this.defaultLocaleCodes = new ArrayList<>();
    }
    this.defaultLocaleCodes.add(defaultLocaleCodesItem);
    return this;
  }

   /**
   * List of default locales for the user.
   * @return defaultLocaleCodes
  **/
  @javax.annotation.Nullable

  public List<String> getDefaultLocaleCodes() {
    return defaultLocaleCodes;
  }


  public void setDefaultLocaleCodes(List<String> defaultLocaleCodes) {
    this.defaultLocaleCodes = defaultLocaleCodes;
  }


  public InvitationCreateParameters permissions(Map<String, String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public InvitationCreateParameters putPermissionsItem(String key, String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new HashMap<>();
    }
    this.permissions.put(key, permissionsItem);
    return this;
  }

   /**
   * Additional permissions depending on invitation role. Available permissions are &lt;code&gt;create_upload&lt;/code&gt; and &lt;code&gt;review_translations&lt;/code&gt;
   * @return permissions
  **/
  @javax.annotation.Nullable

  public Map<String, String> getPermissions() {
    return permissions;
  }


  public void setPermissions(Map<String, String> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationCreateParameters invitationCreateParameters = (InvitationCreateParameters) o;
    return Objects.equals(this.email, invitationCreateParameters.email) &&
        Objects.equals(this.role, invitationCreateParameters.role) &&
        Objects.equals(this.projectIds, invitationCreateParameters.projectIds) &&
        Objects.equals(this.localeIds, invitationCreateParameters.localeIds) &&
        Objects.equals(this.spaceIds, invitationCreateParameters.spaceIds) &&
        Objects.equals(this.teamIds, invitationCreateParameters.teamIds) &&
        Objects.equals(this.defaultLocaleCodes, invitationCreateParameters.defaultLocaleCodes) &&
        Objects.equals(this.permissions, invitationCreateParameters.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, role, projectIds, localeIds, spaceIds, teamIds, defaultLocaleCodes, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationCreateParameters {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    localeIds: ").append(toIndentedString(localeIds)).append("\n");
    sb.append("    spaceIds: ").append(toIndentedString(spaceIds)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    defaultLocaleCodes: ").append(toIndentedString(defaultLocaleCodes)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

