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
 * ProjectsQualityPerformanceScoreRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T12:02:25.948344916Z[Etc/UTC]")
public class ProjectsQualityPerformanceScoreRequest {
  public static final String SERIALIZED_NAME_TRANSLATION_IDS = "translation_ids";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_IDS)
  private List<String> translationIds;

  public ProjectsQualityPerformanceScoreRequest() {
  }

  public ProjectsQualityPerformanceScoreRequest translationIds(List<String> translationIds) {
    
    this.translationIds = translationIds;
    return this;
  }

  public ProjectsQualityPerformanceScoreRequest addTranslationIdsItem(String translationIdsItem) {
    if (this.translationIds == null) {
      this.translationIds = new ArrayList<>();
    }
    this.translationIds.add(translationIdsItem);
    return this;
  }

   /**
   * Translation ids you want to get the quality performance score for
   * @return translationIds
  **/
  @javax.annotation.Nullable

  public List<String> getTranslationIds() {
    return translationIds;
  }


  public void setTranslationIds(List<String> translationIds) {
    this.translationIds = translationIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsQualityPerformanceScoreRequest projectsQualityPerformanceScoreRequest = (ProjectsQualityPerformanceScoreRequest) o;
    return Objects.equals(this.translationIds, projectsQualityPerformanceScoreRequest.translationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsQualityPerformanceScoreRequest {\n");
    sb.append("    translationIds: ").append(toIndentedString(translationIds)).append("\n");
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

