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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InvitationUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-26T09:52:26.119496Z[Etc/UTC]")
public class InvitationUpdateParameters {
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
  private List<String> spaceIds = null;

  public static final String SERIALIZED_NAME_TEAM_IDS = "team_ids";
  @SerializedName(SERIALIZED_NAME_TEAM_IDS)
  private List<String> teamIds = null;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE_CODES = "default_locale_codes";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE_CODES)
  private List<String> defaultLocaleCodes = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private Map<String, String> permissions = null;


  public InvitationUpdateParameters role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Invitiation role, can be any of Manager, Developer, Translator
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invitiation role", value = "Invitiation role, can be any of Manager, Developer, Translator")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public InvitationUpdateParameters projectIds(String projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

   /**
   * List of project ids the invited user has access to
   * @return projectIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234,abcd1234abcd1234abcd1235", value = "List of project ids the invited user has access to")

  public String getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(String projectIds) {
    this.projectIds = projectIds;
  }


  public InvitationUpdateParameters localeIds(String localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

   /**
   * List of locale ids the invited user has access to
   * @return localeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234,abcd1234abcd1234abcd1235", value = "List of locale ids the invited user has access to")

  public String getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(String localeIds) {
    this.localeIds = localeIds;
  }


  public InvitationUpdateParameters spaceIds(List<String> spaceIds) {
    
    this.spaceIds = spaceIds;
    return this;
  }

  public InvitationUpdateParameters addSpaceIdsItem(String spaceIdsItem) {
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
  @ApiModelProperty(example = "[\"abcd1234abcd1234abcd1234\",\"abcd1234abcd1234abcd1235\"]", value = "List of spaces the user is assigned to.")

  public List<String> getSpaceIds() {
    return spaceIds;
  }


  public void setSpaceIds(List<String> spaceIds) {
    this.spaceIds = spaceIds;
  }


  public InvitationUpdateParameters teamIds(List<String> teamIds) {
    
    this.teamIds = teamIds;
    return this;
  }

  public InvitationUpdateParameters addTeamIdsItem(String teamIdsItem) {
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
  @ApiModelProperty(example = "[\"abcd1234abcd1234abcd1234\",\"abcd1234abcd1234abcd1235\"]", value = "List of teams the user is assigned to.")

  public List<String> getTeamIds() {
    return teamIds;
  }


  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }


  public InvitationUpdateParameters defaultLocaleCodes(List<String> defaultLocaleCodes) {
    
    this.defaultLocaleCodes = defaultLocaleCodes;
    return this;
  }

  public InvitationUpdateParameters addDefaultLocaleCodesItem(String defaultLocaleCodesItem) {
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
  @ApiModelProperty(example = "[\"en\",\"de\"]", value = "List of default locales for the user.")

  public List<String> getDefaultLocaleCodes() {
    return defaultLocaleCodes;
  }


  public void setDefaultLocaleCodes(List<String> defaultLocaleCodes) {
    this.defaultLocaleCodes = defaultLocaleCodes;
  }


  public InvitationUpdateParameters permissions(Map<String, String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public InvitationUpdateParameters putPermissionsItem(String key, String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new HashMap<>();
    }
    this.permissions.put(key, permissionsItem);
    return this;
  }

   /**
   * Additional permissions depending on invitation role.
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"create_upload\":true}", value = "Additional permissions depending on invitation role.")

  public Map<String, String> getPermissions() {
    return permissions;
  }


  public void setPermissions(Map<String, String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationUpdateParameters invitationUpdateParameters = (InvitationUpdateParameters) o;
    return Objects.equals(this.role, invitationUpdateParameters.role) &&
        Objects.equals(this.projectIds, invitationUpdateParameters.projectIds) &&
        Objects.equals(this.localeIds, invitationUpdateParameters.localeIds) &&
        Objects.equals(this.spaceIds, invitationUpdateParameters.spaceIds) &&
        Objects.equals(this.teamIds, invitationUpdateParameters.teamIds) &&
        Objects.equals(this.defaultLocaleCodes, invitationUpdateParameters.defaultLocaleCodes) &&
        Objects.equals(this.permissions, invitationUpdateParameters.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, projectIds, localeIds, spaceIds, teamIds, defaultLocaleCodes, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationUpdateParameters {\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

