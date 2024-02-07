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
 * OrganizationJobTemplateLocalesCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-07T15:13:10.273765Z[Etc/UTC]")
public class OrganizationJobTemplateLocalesCreateParameters {
  public static final String SERIALIZED_NAME_LOCALE_NAME = "locale_name";
  @SerializedName(SERIALIZED_NAME_LOCALE_NAME)
  private String localeName;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "locale_code";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds;

  public static final String SERIALIZED_NAME_REVIEWER_IDS = "reviewer_ids";
  @SerializedName(SERIALIZED_NAME_REVIEWER_IDS)
  private List<String> reviewerIds;

  public static final String SERIALIZED_NAME_TRANSLATOR_TEAM_IDS = "translator_team_ids";
  @SerializedName(SERIALIZED_NAME_TRANSLATOR_TEAM_IDS)
  private List<String> translatorTeamIds;

  public static final String SERIALIZED_NAME_REVIEWER_TEAM_IDS = "reviewer_team_ids";
  @SerializedName(SERIALIZED_NAME_REVIEWER_TEAM_IDS)
  private List<String> reviewerTeamIds;

  public OrganizationJobTemplateLocalesCreateParameters() {
  }

  public OrganizationJobTemplateLocalesCreateParameters localeName(String localeName) {
    
    this.localeName = localeName;
    return this;
  }

   /**
   * locale name
   * @return localeName
  **/
  @javax.annotation.Nonnull

  public String getLocaleName() {
    return localeName;
  }


  public void setLocaleName(String localeName) {
    this.localeName = localeName;
  }


  public OrganizationJobTemplateLocalesCreateParameters localeCode(String localeCode) {
    
    this.localeCode = localeCode;
    return this;
  }

   /**
   * locale code
   * @return localeCode
  **/
  @javax.annotation.Nonnull

  public String getLocaleCode() {
    return localeCode;
  }


  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }


  public OrganizationJobTemplateLocalesCreateParameters userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public OrganizationJobTemplateLocalesCreateParameters addUserIdsItem(String userIdsItem) {
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

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public OrganizationJobTemplateLocalesCreateParameters reviewerIds(List<String> reviewerIds) {
    
    this.reviewerIds = reviewerIds;
    return this;
  }

  public OrganizationJobTemplateLocalesCreateParameters addReviewerIdsItem(String reviewerIdsItem) {
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

  public List<String> getReviewerIds() {
    return reviewerIds;
  }


  public void setReviewerIds(List<String> reviewerIds) {
    this.reviewerIds = reviewerIds;
  }


  public OrganizationJobTemplateLocalesCreateParameters translatorTeamIds(List<String> translatorTeamIds) {
    
    this.translatorTeamIds = translatorTeamIds;
    return this;
  }

  public OrganizationJobTemplateLocalesCreateParameters addTranslatorTeamIdsItem(String translatorTeamIdsItem) {
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

  public List<String> getTranslatorTeamIds() {
    return translatorTeamIds;
  }


  public void setTranslatorTeamIds(List<String> translatorTeamIds) {
    this.translatorTeamIds = translatorTeamIds;
  }


  public OrganizationJobTemplateLocalesCreateParameters reviewerTeamIds(List<String> reviewerTeamIds) {
    
    this.reviewerTeamIds = reviewerTeamIds;
    return this;
  }

  public OrganizationJobTemplateLocalesCreateParameters addReviewerTeamIdsItem(String reviewerTeamIdsItem) {
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

  public List<String> getReviewerTeamIds() {
    return reviewerTeamIds;
  }


  public void setReviewerTeamIds(List<String> reviewerTeamIds) {
    this.reviewerTeamIds = reviewerTeamIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationJobTemplateLocalesCreateParameters organizationJobTemplateLocalesCreateParameters = (OrganizationJobTemplateLocalesCreateParameters) o;
    return Objects.equals(this.localeName, organizationJobTemplateLocalesCreateParameters.localeName) &&
        Objects.equals(this.localeCode, organizationJobTemplateLocalesCreateParameters.localeCode) &&
        Objects.equals(this.userIds, organizationJobTemplateLocalesCreateParameters.userIds) &&
        Objects.equals(this.reviewerIds, organizationJobTemplateLocalesCreateParameters.reviewerIds) &&
        Objects.equals(this.translatorTeamIds, organizationJobTemplateLocalesCreateParameters.translatorTeamIds) &&
        Objects.equals(this.reviewerTeamIds, organizationJobTemplateLocalesCreateParameters.reviewerTeamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeName, localeCode, userIds, reviewerIds, translatorTeamIds, reviewerTeamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationJobTemplateLocalesCreateParameters {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

