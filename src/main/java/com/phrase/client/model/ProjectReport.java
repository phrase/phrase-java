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
import com.phrase.client.model.ProjectShort;
import java.io.IOException;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProjectReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-18T12:47:55.193587487Z[Etc/UTC]")
public class ProjectReport {
  public static final String SERIALIZED_NAME_LOCALES_COUNT = "locales_count";
  @SerializedName(SERIALIZED_NAME_LOCALES_COUNT)
  private Integer localesCount;

  public static final String SERIALIZED_NAME_KEYS_COUNT = "keys_count";
  @SerializedName(SERIALIZED_NAME_KEYS_COUNT)
  private Integer keysCount;

  public static final String SERIALIZED_NAME_TRANSLATIONS_COUNT = "translations_count";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS_COUNT)
  private Integer translationsCount;

  public static final String SERIALIZED_NAME_UNTRANSLATED_KEYS_COUNT = "untranslated_keys_count";
  @SerializedName(SERIALIZED_NAME_UNTRANSLATED_KEYS_COUNT)
  private Integer untranslatedKeysCount;

  public static final String SERIALIZED_NAME_UNVERIFIED_TRANSLATIONS_COUNT = "unverified_translations_count";
  @SerializedName(SERIALIZED_NAME_UNVERIFIED_TRANSLATIONS_COUNT)
  private Integer unverifiedTranslationsCount;

  public static final String SERIALIZED_NAME_REVIEWED_TRANSLATIONS_COUNT = "reviewed_translations_count";
  @SerializedName(SERIALIZED_NAME_REVIEWED_TRANSLATIONS_COUNT)
  private Integer reviewedTranslationsCount;

  public static final String SERIALIZED_NAME_MANAGED_WORDS_COUNT = "managed_words_count";
  @SerializedName(SERIALIZED_NAME_MANAGED_WORDS_COUNT)
  private Integer managedWordsCount;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectShort project;

  public ProjectReport() {
  }

  public ProjectReport localesCount(Integer localesCount) {
    
    this.localesCount = localesCount;
    return this;
  }

   /**
   * Get localesCount
   * @return localesCount
  **/
  @javax.annotation.Nullable

  public Integer getLocalesCount() {
    return localesCount;
  }


  public void setLocalesCount(Integer localesCount) {
    this.localesCount = localesCount;
  }


  public ProjectReport keysCount(Integer keysCount) {
    
    this.keysCount = keysCount;
    return this;
  }

   /**
   * Get keysCount
   * @return keysCount
  **/
  @javax.annotation.Nullable

  public Integer getKeysCount() {
    return keysCount;
  }


  public void setKeysCount(Integer keysCount) {
    this.keysCount = keysCount;
  }


  public ProjectReport translationsCount(Integer translationsCount) {
    
    this.translationsCount = translationsCount;
    return this;
  }

   /**
   * Get translationsCount
   * @return translationsCount
  **/
  @javax.annotation.Nullable

  public Integer getTranslationsCount() {
    return translationsCount;
  }


  public void setTranslationsCount(Integer translationsCount) {
    this.translationsCount = translationsCount;
  }


  public ProjectReport untranslatedKeysCount(Integer untranslatedKeysCount) {
    
    this.untranslatedKeysCount = untranslatedKeysCount;
    return this;
  }

   /**
   * Get untranslatedKeysCount
   * @return untranslatedKeysCount
  **/
  @javax.annotation.Nullable

  public Integer getUntranslatedKeysCount() {
    return untranslatedKeysCount;
  }


  public void setUntranslatedKeysCount(Integer untranslatedKeysCount) {
    this.untranslatedKeysCount = untranslatedKeysCount;
  }


  public ProjectReport unverifiedTranslationsCount(Integer unverifiedTranslationsCount) {
    
    this.unverifiedTranslationsCount = unverifiedTranslationsCount;
    return this;
  }

   /**
   * Get unverifiedTranslationsCount
   * @return unverifiedTranslationsCount
  **/
  @javax.annotation.Nullable

  public Integer getUnverifiedTranslationsCount() {
    return unverifiedTranslationsCount;
  }


  public void setUnverifiedTranslationsCount(Integer unverifiedTranslationsCount) {
    this.unverifiedTranslationsCount = unverifiedTranslationsCount;
  }


  public ProjectReport reviewedTranslationsCount(Integer reviewedTranslationsCount) {
    
    this.reviewedTranslationsCount = reviewedTranslationsCount;
    return this;
  }

   /**
   * Get reviewedTranslationsCount
   * @return reviewedTranslationsCount
  **/
  @javax.annotation.Nullable

  public Integer getReviewedTranslationsCount() {
    return reviewedTranslationsCount;
  }


  public void setReviewedTranslationsCount(Integer reviewedTranslationsCount) {
    this.reviewedTranslationsCount = reviewedTranslationsCount;
  }


  public ProjectReport managedWordsCount(Integer managedWordsCount) {
    
    this.managedWordsCount = managedWordsCount;
    return this;
  }

   /**
   * Get managedWordsCount
   * @return managedWordsCount
  **/
  @javax.annotation.Nullable

  public Integer getManagedWordsCount() {
    return managedWordsCount;
  }


  public void setManagedWordsCount(Integer managedWordsCount) {
    this.managedWordsCount = managedWordsCount;
  }


  public ProjectReport project(ProjectShort project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public ProjectShort getProject() {
    return project;
  }


  public void setProject(ProjectShort project) {
    this.project = project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectReport projectReport = (ProjectReport) o;
    return Objects.equals(this.localesCount, projectReport.localesCount) &&
        Objects.equals(this.keysCount, projectReport.keysCount) &&
        Objects.equals(this.translationsCount, projectReport.translationsCount) &&
        Objects.equals(this.untranslatedKeysCount, projectReport.untranslatedKeysCount) &&
        Objects.equals(this.unverifiedTranslationsCount, projectReport.unverifiedTranslationsCount) &&
        Objects.equals(this.reviewedTranslationsCount, projectReport.reviewedTranslationsCount) &&
        Objects.equals(this.managedWordsCount, projectReport.managedWordsCount) &&
        Objects.equals(this.project, projectReport.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localesCount, keysCount, translationsCount, untranslatedKeysCount, unverifiedTranslationsCount, reviewedTranslationsCount, managedWordsCount, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectReport {\n");
    sb.append("    localesCount: ").append(toIndentedString(localesCount)).append("\n");
    sb.append("    keysCount: ").append(toIndentedString(keysCount)).append("\n");
    sb.append("    translationsCount: ").append(toIndentedString(translationsCount)).append("\n");
    sb.append("    untranslatedKeysCount: ").append(toIndentedString(untranslatedKeysCount)).append("\n");
    sb.append("    unverifiedTranslationsCount: ").append(toIndentedString(unverifiedTranslationsCount)).append("\n");
    sb.append("    reviewedTranslationsCount: ").append(toIndentedString(reviewedTranslationsCount)).append("\n");
    sb.append("    managedWordsCount: ").append(toIndentedString(managedWordsCount)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

