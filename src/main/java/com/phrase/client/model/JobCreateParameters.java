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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * JobCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-24T13:52:31.068Z[Etc/UTC]")
public class JobCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRIEFING = "briefing";
  @SerializedName(SERIALIZED_NAME_BRIEFING)
  private String briefing;

  public static final String SERIALIZED_NAME_DUE_DATE = "due_date";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TRANSLATION_KEY_IDS = "translation_key_ids";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_KEY_IDS)
  private List<String> translationKeyIds = null;


  public JobCreateParameters branch(String branch) {
    
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


  public JobCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Job name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "Job name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JobCreateParameters briefing(String briefing) {
    
    this.briefing = briefing;
    return this;
  }

   /**
   * Briefing for the translators
   * @return briefing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de-DE", value = "Briefing for the translators")

  public String getBriefing() {
    return briefing;
  }


  public void setBriefing(String briefing) {
    this.briefing = briefing;
  }


  public JobCreateParameters dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Date the job should be finished
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the job should be finished")

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  public JobCreateParameters tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public JobCreateParameters addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * tags of keys that should be included within the job
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"myUploadTag\"]", value = "tags of keys that should be included within the job")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public JobCreateParameters translationKeyIds(List<String> translationKeyIds) {
    
    this.translationKeyIds = translationKeyIds;
    return this;
  }

  public JobCreateParameters addTranslationKeyIdsItem(String translationKeyIdsItem) {
    if (this.translationKeyIds == null) {
      this.translationKeyIds = new ArrayList<>();
    }
    this.translationKeyIds.add(translationKeyIdsItem);
    return this;
  }

   /**
   * ids of keys that should be included within the job
   * @return translationKeyIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcd1234cdef1234abcd1234cdef1234\"]", value = "ids of keys that should be included within the job")

  public List<String> getTranslationKeyIds() {
    return translationKeyIds;
  }


  public void setTranslationKeyIds(List<String> translationKeyIds) {
    this.translationKeyIds = translationKeyIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCreateParameters jobCreateParameters = (JobCreateParameters) o;
    return Objects.equals(this.branch, jobCreateParameters.branch) &&
        Objects.equals(this.name, jobCreateParameters.name) &&
        Objects.equals(this.briefing, jobCreateParameters.briefing) &&
        Objects.equals(this.dueDate, jobCreateParameters.dueDate) &&
        Objects.equals(this.tags, jobCreateParameters.tags) &&
        Objects.equals(this.translationKeyIds, jobCreateParameters.translationKeyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, briefing, dueDate, tags, translationKeyIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    briefing: ").append(toIndentedString(briefing)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    translationKeyIds: ").append(toIndentedString(translationKeyIds)).append("\n");
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
