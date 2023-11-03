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
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Branch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-03T15:04:07.063922Z[Etc/UTC]")
public class Branch {
  public static final String SERIALIZED_NAME_BASE_PROJECT_ID = "base_project_id";
  @SerializedName(SERIALIZED_NAME_BASE_PROJECT_ID)
  private String baseProjectId;

  public static final String SERIALIZED_NAME_BRANCH_PROJECT_ID = "branch_project_id";
  @SerializedName(SERIALIZED_NAME_BRANCH_PROJECT_ID)
  private String branchProjectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_MERGED_AT = "merged_at";
  @SerializedName(SERIALIZED_NAME_MERGED_AT)
  private OffsetDateTime mergedAt;

  public static final String SERIALIZED_NAME_MERGED_BY = "merged_by";
  @SerializedName(SERIALIZED_NAME_MERGED_BY)
  private UserPreview mergedBy;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UserPreview createdBy;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public Branch() {
  }

  public Branch baseProjectId(String baseProjectId) {
    
    this.baseProjectId = baseProjectId;
    return this;
  }

   /**
   * Get baseProjectId
   * @return baseProjectId
  **/
  @javax.annotation.Nullable

  public String getBaseProjectId() {
    return baseProjectId;
  }


  public void setBaseProjectId(String baseProjectId) {
    this.baseProjectId = baseProjectId;
  }


  public Branch branchProjectId(String branchProjectId) {
    
    this.branchProjectId = branchProjectId;
    return this;
  }

   /**
   * Get branchProjectId
   * @return branchProjectId
  **/
  @javax.annotation.Nullable

  public String getBranchProjectId() {
    return branchProjectId;
  }


  public void setBranchProjectId(String branchProjectId) {
    this.branchProjectId = branchProjectId;
  }


  public Branch name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Branch createdAt(OffsetDateTime createdAt) {
    
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


  public Branch updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Branch mergedAt(OffsetDateTime mergedAt) {
    
    this.mergedAt = mergedAt;
    return this;
  }

   /**
   * Get mergedAt
   * @return mergedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getMergedAt() {
    return mergedAt;
  }


  public void setMergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
  }


  public Branch mergedBy(UserPreview mergedBy) {
    
    this.mergedBy = mergedBy;
    return this;
  }

   /**
   * Get mergedBy
   * @return mergedBy
  **/
  @javax.annotation.Nullable

  public UserPreview getMergedBy() {
    return mergedBy;
  }


  public void setMergedBy(UserPreview mergedBy) {
    this.mergedBy = mergedBy;
  }


  public Branch createdBy(UserPreview createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable

  public UserPreview getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UserPreview createdBy) {
    this.createdBy = createdBy;
  }


  public Branch state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.baseProjectId, branch.baseProjectId) &&
        Objects.equals(this.branchProjectId, branch.branchProjectId) &&
        Objects.equals(this.name, branch.name) &&
        Objects.equals(this.createdAt, branch.createdAt) &&
        Objects.equals(this.updatedAt, branch.updatedAt) &&
        Objects.equals(this.mergedAt, branch.mergedAt) &&
        Objects.equals(this.mergedBy, branch.mergedBy) &&
        Objects.equals(this.createdBy, branch.createdBy) &&
        Objects.equals(this.state, branch.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseProjectId, branchProjectId, name, createdAt, updatedAt, mergedAt, mergedBy, createdBy, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    sb.append("    baseProjectId: ").append(toIndentedString(baseProjectId)).append("\n");
    sb.append("    branchProjectId: ").append(toIndentedString(branchProjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
    sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

