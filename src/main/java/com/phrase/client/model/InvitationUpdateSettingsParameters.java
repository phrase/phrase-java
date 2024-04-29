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
 * InvitationUpdateSettingsParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-29T15:07:09.803973Z[Etc/UTC]")
public class InvitationUpdateSettingsParameters {
  public static final String SERIALIZED_NAME_PROJECT_ROLE = "project_role";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE)
  private String projectRole;

  public static final String SERIALIZED_NAME_LOCALE_IDS = "locale_ids";
  @SerializedName(SERIALIZED_NAME_LOCALE_IDS)
  private List<String> localeIds;

  public InvitationUpdateSettingsParameters() {
  }

  public InvitationUpdateSettingsParameters projectRole(String projectRole) {
    
    this.projectRole = projectRole;
    return this;
  }

   /**
   * Member role, can be any of of Manager, Developer, Translator
   * @return projectRole
  **/
  @javax.annotation.Nullable

  public String getProjectRole() {
    return projectRole;
  }


  public void setProjectRole(String projectRole) {
    this.projectRole = projectRole;
  }


  public InvitationUpdateSettingsParameters localeIds(List<String> localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

  public InvitationUpdateSettingsParameters addLocaleIdsItem(String localeIdsItem) {
    if (this.localeIds == null) {
      this.localeIds = new ArrayList<>();
    }
    this.localeIds.add(localeIdsItem);
    return this;
  }

   /**
   * List of locale ids the user has access to.
   * @return localeIds
  **/
  @javax.annotation.Nullable

  public List<String> getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(List<String> localeIds) {
    this.localeIds = localeIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationUpdateSettingsParameters invitationUpdateSettingsParameters = (InvitationUpdateSettingsParameters) o;
    return Objects.equals(this.projectRole, invitationUpdateSettingsParameters.projectRole) &&
        Objects.equals(this.localeIds, invitationUpdateSettingsParameters.localeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectRole, localeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationUpdateSettingsParameters {\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
    sb.append("    localeIds: ").append(toIndentedString(localeIds)).append("\n");
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

