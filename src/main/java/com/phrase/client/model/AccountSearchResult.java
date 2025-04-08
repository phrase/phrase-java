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
import com.phrase.client.model.KeyPreview;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.Project;
import com.phrase.client.model.Translation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSearchResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-08T08:12:17.446320092Z[Etc/UTC]")
public class AccountSearchResult {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_EXCERPT = "excerpt";
  @SerializedName(SERIALIZED_NAME_EXCERPT)
  private String excerpt;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private KeyPreview key;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private LocalePreview locale;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_TRANSLATION = "translation";
  @SerializedName(SERIALIZED_NAME_TRANSLATION)
  private Translation translation;

  public static final String SERIALIZED_NAME_OTHER_TRANSLATIONS = "other_translations";
  @SerializedName(SERIALIZED_NAME_OTHER_TRANSLATIONS)
  private List<Translation> otherTranslations;

  public AccountSearchResult() {
  }

  public AccountSearchResult query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public AccountSearchResult excerpt(String excerpt) {
    
    this.excerpt = excerpt;
    return this;
  }

   /**
   * Get excerpt
   * @return excerpt
  **/
  @javax.annotation.Nullable

  public String getExcerpt() {
    return excerpt;
  }


  public void setExcerpt(String excerpt) {
    this.excerpt = excerpt;
  }


  public AccountSearchResult key(KeyPreview key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable

  public KeyPreview getKey() {
    return key;
  }


  public void setKey(KeyPreview key) {
    this.key = key;
  }


  public AccountSearchResult locale(LocalePreview locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable

  public LocalePreview getLocale() {
    return locale;
  }


  public void setLocale(LocalePreview locale) {
    this.locale = locale;
  }


  public AccountSearchResult project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public Project getProject() {
    return project;
  }


  public void setProject(Project project) {
    this.project = project;
  }


  public AccountSearchResult translation(Translation translation) {
    
    this.translation = translation;
    return this;
  }

   /**
   * Get translation
   * @return translation
  **/
  @javax.annotation.Nullable

  public Translation getTranslation() {
    return translation;
  }


  public void setTranslation(Translation translation) {
    this.translation = translation;
  }


  public AccountSearchResult otherTranslations(List<Translation> otherTranslations) {
    
    this.otherTranslations = otherTranslations;
    return this;
  }

  public AccountSearchResult addOtherTranslationsItem(Translation otherTranslationsItem) {
    if (this.otherTranslations == null) {
      this.otherTranslations = new ArrayList<>();
    }
    this.otherTranslations.add(otherTranslationsItem);
    return this;
  }

   /**
   * Get otherTranslations
   * @return otherTranslations
  **/
  @javax.annotation.Nullable

  public List<Translation> getOtherTranslations() {
    return otherTranslations;
  }


  public void setOtherTranslations(List<Translation> otherTranslations) {
    this.otherTranslations = otherTranslations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchResult accountSearchResult = (AccountSearchResult) o;
    return Objects.equals(this.query, accountSearchResult.query) &&
        Objects.equals(this.excerpt, accountSearchResult.excerpt) &&
        Objects.equals(this.key, accountSearchResult.key) &&
        Objects.equals(this.locale, accountSearchResult.locale) &&
        Objects.equals(this.project, accountSearchResult.project) &&
        Objects.equals(this.translation, accountSearchResult.translation) &&
        Objects.equals(this.otherTranslations, accountSearchResult.otherTranslations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, excerpt, key, locale, project, translation, otherTranslations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchResult {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
    sb.append("    otherTranslations: ").append(toIndentedString(otherTranslations)).append("\n");
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

