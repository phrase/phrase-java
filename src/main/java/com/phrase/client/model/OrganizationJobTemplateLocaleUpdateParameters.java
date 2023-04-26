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
import java.util.ArrayList;
import java.util.List;

/**
 * OrganizationJobTemplateLocaleUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-26T08:15:30.342352Z[Etc/UTC]")
public class OrganizationJobTemplateLocaleUpdateParameters {
  public static final String SERIALIZED_NAME_LOCALE_NAME = "locale_name";
  @SerializedName(SERIALIZED_NAME_LOCALE_NAME)
  private String localeName;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "locale_code";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = null;

  public static final String SERIALIZED_NAME_REVIEWER_IDS = "reviewer_ids";
  @SerializedName(SERIALIZED_NAME_REVIEWER_IDS)
  private List<String> reviewerIds = null;

  public static final String SERIALIZED_NAME_TRANSLATOR_TEAM_IDS = "translator_team_ids";
  @SerializedName(SERIALIZED_NAME_TRANSLATOR_TEAM_IDS)
  private List<String> translatorTeamIds = null;

  public static final String SERIALIZED_NAME_REVIEWER_TEAM_IDS = "reviewer_team_ids";
  @SerializedName(SERIALIZED_NAME_REVIEWER_TEAM_IDS)
  private List<String> reviewerTeamIds = null;


  public OrganizationJobTemplateLocaleUpdateParameters localeName(String localeName) {
    
    this.localeName = localeName;
    return this;
  }

   /**
   * locale name
   * @return localeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de-1", value = "locale name")

  public String getLocaleName() {
    return localeName;
  }


  public void setLocaleName(String localeName) {
    this.localeName = localeName;
  }


  public OrganizationJobTemplateLocaleUpdateParameters localeCode(String localeCode) {
    
    this.localeCode = localeCode;
    return this;
  }

   /**
   * locale code
   * @return localeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de-DE", value = "locale code")

  public String getLocaleCode() {
    return localeCode;
  }


  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }


  public OrganizationJobTemplateLocaleUpdateParameters userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public OrganizationJobTemplateLocaleUpdateParameters addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Array of user ids to be assigned to the job template locale
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcd1234cdef1234abcd1234cdef1234\"]", value = "Array of user ids to be assigned to the job template locale")

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public OrganizationJobTemplateLocaleUpdateParameters reviewerIds(List<String> reviewerIds) {
    
    this.reviewerIds = reviewerIds;
    return this;
  }

  public OrganizationJobTemplateLocaleUpdateParameters addReviewerIdsItem(String reviewerIdsItem) {
    if (this.reviewerIds == null) {
      this.reviewerIds = new ArrayList<>();
    }
    this.reviewerIds.add(reviewerIdsItem);
    return this;
  }

   /**
   * Array of reviewer ids to be assigned to the job template locale
   * @return reviewerIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcd1234cdef1234abcd1234cdef1234\"]", value = "Array of reviewer ids to be assigned to the job template locale")

  public List<String> getReviewerIds() {
    return reviewerIds;
  }


  public void setReviewerIds(List<String> reviewerIds) {
    this.reviewerIds = reviewerIds;
  }


  public OrganizationJobTemplateLocaleUpdateParameters translatorTeamIds(List<String> translatorTeamIds) {
    
    this.translatorTeamIds = translatorTeamIds;
    return this;
  }

  public OrganizationJobTemplateLocaleUpdateParameters addTranslatorTeamIdsItem(String translatorTeamIdsItem) {
    if (this.translatorTeamIds == null) {
      this.translatorTeamIds = new ArrayList<>();
    }
    this.translatorTeamIds.add(translatorTeamIdsItem);
    return this;
  }

   /**
   * Array of team ids to be assigned to the job locale as translators
   * @return translatorTeamIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcd1234cdef1234abcd1234cdef1234\"]", value = "Array of team ids to be assigned to the job locale as translators")

  public List<String> getTranslatorTeamIds() {
    return translatorTeamIds;
  }


  public void setTranslatorTeamIds(List<String> translatorTeamIds) {
    this.translatorTeamIds = translatorTeamIds;
  }


  public OrganizationJobTemplateLocaleUpdateParameters reviewerTeamIds(List<String> reviewerTeamIds) {
    
    this.reviewerTeamIds = reviewerTeamIds;
    return this;
  }

  public OrganizationJobTemplateLocaleUpdateParameters addReviewerTeamIdsItem(String reviewerTeamIdsItem) {
    if (this.reviewerTeamIds == null) {
      this.reviewerTeamIds = new ArrayList<>();
    }
    this.reviewerTeamIds.add(reviewerTeamIdsItem);
    return this;
  }

   /**
   * Array of team ids to be assigned to the job locale as reviewers
   * @return reviewerTeamIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcd1234cdef1234abcd1234cdef1234\"]", value = "Array of team ids to be assigned to the job locale as reviewers")

  public List<String> getReviewerTeamIds() {
    return reviewerTeamIds;
  }


  public void setReviewerTeamIds(List<String> reviewerTeamIds) {
    this.reviewerTeamIds = reviewerTeamIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationJobTemplateLocaleUpdateParameters organizationJobTemplateLocaleUpdateParameters = (OrganizationJobTemplateLocaleUpdateParameters) o;
    return Objects.equals(this.localeName, organizationJobTemplateLocaleUpdateParameters.localeName) &&
        Objects.equals(this.localeCode, organizationJobTemplateLocaleUpdateParameters.localeCode) &&
        Objects.equals(this.userIds, organizationJobTemplateLocaleUpdateParameters.userIds) &&
        Objects.equals(this.reviewerIds, organizationJobTemplateLocaleUpdateParameters.reviewerIds) &&
        Objects.equals(this.translatorTeamIds, organizationJobTemplateLocaleUpdateParameters.translatorTeamIds) &&
        Objects.equals(this.reviewerTeamIds, organizationJobTemplateLocaleUpdateParameters.reviewerTeamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeName, localeCode, userIds, reviewerIds, translatorTeamIds, reviewerTeamIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationJobTemplateLocaleUpdateParameters {\n");
    sb.append("    localeName: ").append(toIndentedString(localeName)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    reviewerIds: ").append(toIndentedString(reviewerIds)).append("\n");
    sb.append("    translatorTeamIds: ").append(toIndentedString(translatorTeamIds)).append("\n");
    sb.append("    reviewerTeamIds: ").append(toIndentedString(reviewerTeamIds)).append("\n");
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

