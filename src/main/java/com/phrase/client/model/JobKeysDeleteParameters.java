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
 * JobKeysDeleteParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-14T07:39:13.963277996Z[Etc/UTC]")
public class JobKeysDeleteParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_TRANSLATION_KEY_IDS = "translation_key_ids";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_KEY_IDS)
  private List<String> translationKeyIds = new ArrayList<>();

  public JobKeysDeleteParameters() {
  }

  public JobKeysDeleteParameters branch(String branch) {
    
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


  public JobKeysDeleteParameters translationKeyIds(List<String> translationKeyIds) {
    
    this.translationKeyIds = translationKeyIds;
    return this;
  }

  public JobKeysDeleteParameters addTranslationKeyIdsItem(String translationKeyIdsItem) {
    if (this.translationKeyIds == null) {
      this.translationKeyIds = new ArrayList<>();
    }
    this.translationKeyIds.add(translationKeyIdsItem);
    return this;
  }

   /**
   * ids of keys that should be deleted from the job
   * @return translationKeyIds
  **/
  @javax.annotation.Nonnull

  public List<String> getTranslationKeyIds() {
    return translationKeyIds;
  }


  public void setTranslationKeyIds(List<String> translationKeyIds) {
    this.translationKeyIds = translationKeyIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobKeysDeleteParameters jobKeysDeleteParameters = (JobKeysDeleteParameters) o;
    return Objects.equals(this.branch, jobKeysDeleteParameters.branch) &&
        Objects.equals(this.translationKeyIds, jobKeysDeleteParameters.translationKeyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, translationKeyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobKeysDeleteParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    translationKeyIds: ").append(toIndentedString(translationKeyIds)).append("\n");
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

