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
import java.util.List;

/**
 * MemberUpdateSettingsParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-13T14:47:35.268098Z[Etc/UTC]")
public class MemberUpdateSettingsParameters {
  public static final String SERIALIZED_NAME_PROJECT_ROLE = "project_role";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE)
  private String projectRole;

  public static final String SERIALIZED_NAME_LOCALE_IDS = "locale_ids";
  @SerializedName(SERIALIZED_NAME_LOCALE_IDS)
  private List<String> localeIds = null;


  public MemberUpdateSettingsParameters projectRole(String projectRole) {
    
    this.projectRole = projectRole;
    return this;
  }

   /**
   * Member role, can be any of of Manager, Developer, Translator
   * @return projectRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Developer", value = "Member role, can be any of of Manager, Developer, Translator")

  public String getProjectRole() {
    return projectRole;
  }


  public void setProjectRole(String projectRole) {
    this.projectRole = projectRole;
  }


  public MemberUpdateSettingsParameters localeIds(List<String> localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

  public MemberUpdateSettingsParameters addLocaleIdsItem(String localeIdsItem) {
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
  @ApiModelProperty(example = "[\"abcd1234abcd1234abcd1234\",\"abcd1234abcd1234abcd1235\"]", value = "List of locale ids the user has access to.")

  public List<String> getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(List<String> localeIds) {
    this.localeIds = localeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberUpdateSettingsParameters memberUpdateSettingsParameters = (MemberUpdateSettingsParameters) o;
    return Objects.equals(this.projectRole, memberUpdateSettingsParameters.projectRole) &&
        Objects.equals(this.localeIds, memberUpdateSettingsParameters.localeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectRole, localeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberUpdateSettingsParameters {\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
    sb.append("    localeIds: ").append(toIndentedString(localeIds)).append("\n");
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

