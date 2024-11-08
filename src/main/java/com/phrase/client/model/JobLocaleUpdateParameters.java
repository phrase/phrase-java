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
 * JobLocaleUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T12:59:49.185571Z[Etc/UTC]")
public class JobLocaleUpdateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;

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

  public JobLocaleUpdateParameters() {
  }

  public JobLocaleUpdateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public JobLocaleUpdateParameters localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * ID of a target locale to update
   * @return localeId
  **/
  @javax.annotation.Nullable

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  public JobLocaleUpdateParameters userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public JobLocaleUpdateParameters addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Array of user ids to be assigned to the job locale
   * @return userIds
  **/
  @javax.annotation.Nullable

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public JobLocaleUpdateParameters reviewerIds(List<String> reviewerIds) {
    
    this.reviewerIds = reviewerIds;
    return this;
  }

  public JobLocaleUpdateParameters addReviewerIdsItem(String reviewerIdsItem) {
    if (this.reviewerIds == null) {
      this.reviewerIds = new ArrayList<>();
    }
    this.reviewerIds.add(reviewerIdsItem);
    return this;
  }

   /**
   * Array of reviewer ids to be assigned to the job locale as reviewers
   * @return reviewerIds
  **/
  @javax.annotation.Nullable

  public List<String> getReviewerIds() {
    return reviewerIds;
  }


  public void setReviewerIds(List<String> reviewerIds) {
    this.reviewerIds = reviewerIds;
  }


  public JobLocaleUpdateParameters translatorTeamIds(List<String> translatorTeamIds) {
    
    this.translatorTeamIds = translatorTeamIds;
    return this;
  }

  public JobLocaleUpdateParameters addTranslatorTeamIdsItem(String translatorTeamIdsItem) {
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


  public JobLocaleUpdateParameters reviewerTeamIds(List<String> reviewerTeamIds) {
    
    this.reviewerTeamIds = reviewerTeamIds;
    return this;
  }

  public JobLocaleUpdateParameters addReviewerTeamIdsItem(String reviewerTeamIdsItem) {
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
    JobLocaleUpdateParameters jobLocaleUpdateParameters = (JobLocaleUpdateParameters) o;
    return Objects.equals(this.branch, jobLocaleUpdateParameters.branch) &&
        Objects.equals(this.localeId, jobLocaleUpdateParameters.localeId) &&
        Objects.equals(this.userIds, jobLocaleUpdateParameters.userIds) &&
        Objects.equals(this.reviewerIds, jobLocaleUpdateParameters.reviewerIds) &&
        Objects.equals(this.translatorTeamIds, jobLocaleUpdateParameters.translatorTeamIds) &&
        Objects.equals(this.reviewerTeamIds, jobLocaleUpdateParameters.reviewerTeamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, localeId, userIds, reviewerIds, translatorTeamIds, reviewerTeamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobLocaleUpdateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
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

