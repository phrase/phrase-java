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
 * JobTemplateLocaleUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-10T14:10:10.482170Z[Etc/UTC]")
public class JobTemplateLocaleUpdateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = null;

  public static final String SERIALIZED_NAME_REVIEWER_IDS = "reviewer_ids";
  @SerializedName(SERIALIZED_NAME_REVIEWER_IDS)
  private List<String> reviewerIds = null;


  public JobTemplateLocaleUpdateParameters branch(String branch) {
    
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


  public JobTemplateLocaleUpdateParameters localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * locale id
   * @return localeId
  **/
  @ApiModelProperty(example = "abcd1234cdef1234abcd1234cdef1234", required = true, value = "locale id")

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  public JobTemplateLocaleUpdateParameters userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public JobTemplateLocaleUpdateParameters addUserIdsItem(String userIdsItem) {
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


  public JobTemplateLocaleUpdateParameters reviewerIds(List<String> reviewerIds) {
    
    this.reviewerIds = reviewerIds;
    return this;
  }

  public JobTemplateLocaleUpdateParameters addReviewerIdsItem(String reviewerIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTemplateLocaleUpdateParameters jobTemplateLocaleUpdateParameters = (JobTemplateLocaleUpdateParameters) o;
    return Objects.equals(this.branch, jobTemplateLocaleUpdateParameters.branch) &&
        Objects.equals(this.localeId, jobTemplateLocaleUpdateParameters.localeId) &&
        Objects.equals(this.userIds, jobTemplateLocaleUpdateParameters.userIds) &&
        Objects.equals(this.reviewerIds, jobTemplateLocaleUpdateParameters.reviewerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, localeId, userIds, reviewerIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTemplateLocaleUpdateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    reviewerIds: ").append(toIndentedString(reviewerIds)).append("\n");
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
