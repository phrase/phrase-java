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
import com.phrase.client.model.LocalePreview;
import java.io.IOException;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LocaleReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T12:08:18.620848Z[Etc/UTC]")
public class LocaleReport {
  public static final String SERIALIZED_NAME_KEYS_COUNT = "keys_count";
  @SerializedName(SERIALIZED_NAME_KEYS_COUNT)
  private Integer keysCount;

  public static final String SERIALIZED_NAME_TRANSLATED_TRANSLATIONS_PERCENTAGE = "translated_translations_percentage";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_TRANSLATIONS_PERCENTAGE)
  private Integer translatedTranslationsPercentage;

  public static final String SERIALIZED_NAME_UNVERIFIED_TRANSLATIONS_PERCENTAGE = "unverified_translations_percentage";
  @SerializedName(SERIALIZED_NAME_UNVERIFIED_TRANSLATIONS_PERCENTAGE)
  private Integer unverifiedTranslationsPercentage;

  public static final String SERIALIZED_NAME_REVIEWED_TRANSLATIONS_PERCENTAGE = "reviewed_translations_percentage";
  @SerializedName(SERIALIZED_NAME_REVIEWED_TRANSLATIONS_PERCENTAGE)
  private Integer reviewedTranslationsPercentage;

  public static final String SERIALIZED_NAME_UNTRANSLATED_KEYS_PERCENTAGE = "untranslated_keys_percentage";
  @SerializedName(SERIALIZED_NAME_UNTRANSLATED_KEYS_PERCENTAGE)
  private Integer untranslatedKeysPercentage;

  public static final String SERIALIZED_NAME_COMPLETED_TRANSLATIONS_COUNT = "completed_translations_count";
  @SerializedName(SERIALIZED_NAME_COMPLETED_TRANSLATIONS_COUNT)
  private Integer completedTranslationsCount;

  public static final String SERIALIZED_NAME_UNTRANSLATED_KEYS_COUNT = "untranslated_keys_count";
  @SerializedName(SERIALIZED_NAME_UNTRANSLATED_KEYS_COUNT)
  private Integer untranslatedKeysCount;

  public static final String SERIALIZED_NAME_UNVERIFIED_TRANSLATIONS_COUNT = "unverified_translations_count";
  @SerializedName(SERIALIZED_NAME_UNVERIFIED_TRANSLATIONS_COUNT)
  private Integer unverifiedTranslationsCount;

  public static final String SERIALIZED_NAME_REVIEWED_TRANSLATIONS_COUNT = "reviewed_translations_count";
  @SerializedName(SERIALIZED_NAME_REVIEWED_TRANSLATIONS_COUNT)
  private Integer reviewedTranslationsCount;

  public static final String SERIALIZED_NAME_SOURCE_WORD_COUNT = "source_word_count";
  @SerializedName(SERIALIZED_NAME_SOURCE_WORD_COUNT)
  private Integer sourceWordCount;

  public static final String SERIALIZED_NAME_WORD_COUNT = "word_count";
  @SerializedName(SERIALIZED_NAME_WORD_COUNT)
  private Integer wordCount;

  public static final String SERIALIZED_NAME_WORD_COUNT_UNVERIFIED = "word_count_unverified";
  @SerializedName(SERIALIZED_NAME_WORD_COUNT_UNVERIFIED)
  private Integer wordCountUnverified;

  public static final String SERIALIZED_NAME_WORD_COUNT_MISSING = "word_count_missing";
  @SerializedName(SERIALIZED_NAME_WORD_COUNT_MISSING)
  private Integer wordCountMissing;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private LocalePreview locale;

  public LocaleReport() {
  }

  public LocaleReport keysCount(Integer keysCount) {
    
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


  public LocaleReport translatedTranslationsPercentage(Integer translatedTranslationsPercentage) {
    
    this.translatedTranslationsPercentage = translatedTranslationsPercentage;
    return this;
  }

   /**
   * Get translatedTranslationsPercentage
   * @return translatedTranslationsPercentage
  **/
  @javax.annotation.Nullable

  public Integer getTranslatedTranslationsPercentage() {
    return translatedTranslationsPercentage;
  }


  public void setTranslatedTranslationsPercentage(Integer translatedTranslationsPercentage) {
    this.translatedTranslationsPercentage = translatedTranslationsPercentage;
  }


  public LocaleReport unverifiedTranslationsPercentage(Integer unverifiedTranslationsPercentage) {
    
    this.unverifiedTranslationsPercentage = unverifiedTranslationsPercentage;
    return this;
  }

   /**
   * Get unverifiedTranslationsPercentage
   * @return unverifiedTranslationsPercentage
  **/
  @javax.annotation.Nullable

  public Integer getUnverifiedTranslationsPercentage() {
    return unverifiedTranslationsPercentage;
  }


  public void setUnverifiedTranslationsPercentage(Integer unverifiedTranslationsPercentage) {
    this.unverifiedTranslationsPercentage = unverifiedTranslationsPercentage;
  }


  public LocaleReport reviewedTranslationsPercentage(Integer reviewedTranslationsPercentage) {
    
    this.reviewedTranslationsPercentage = reviewedTranslationsPercentage;
    return this;
  }

   /**
   * Get reviewedTranslationsPercentage
   * @return reviewedTranslationsPercentage
  **/
  @javax.annotation.Nullable

  public Integer getReviewedTranslationsPercentage() {
    return reviewedTranslationsPercentage;
  }


  public void setReviewedTranslationsPercentage(Integer reviewedTranslationsPercentage) {
    this.reviewedTranslationsPercentage = reviewedTranslationsPercentage;
  }


  public LocaleReport untranslatedKeysPercentage(Integer untranslatedKeysPercentage) {
    
    this.untranslatedKeysPercentage = untranslatedKeysPercentage;
    return this;
  }

   /**
   * Get untranslatedKeysPercentage
   * @return untranslatedKeysPercentage
  **/
  @javax.annotation.Nullable

  public Integer getUntranslatedKeysPercentage() {
    return untranslatedKeysPercentage;
  }


  public void setUntranslatedKeysPercentage(Integer untranslatedKeysPercentage) {
    this.untranslatedKeysPercentage = untranslatedKeysPercentage;
  }


  public LocaleReport completedTranslationsCount(Integer completedTranslationsCount) {
    
    this.completedTranslationsCount = completedTranslationsCount;
    return this;
  }

   /**
   * Get completedTranslationsCount
   * @return completedTranslationsCount
  **/
  @javax.annotation.Nullable

  public Integer getCompletedTranslationsCount() {
    return completedTranslationsCount;
  }


  public void setCompletedTranslationsCount(Integer completedTranslationsCount) {
    this.completedTranslationsCount = completedTranslationsCount;
  }


  public LocaleReport untranslatedKeysCount(Integer untranslatedKeysCount) {
    
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


  public LocaleReport unverifiedTranslationsCount(Integer unverifiedTranslationsCount) {
    
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


  public LocaleReport reviewedTranslationsCount(Integer reviewedTranslationsCount) {
    
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


  public LocaleReport sourceWordCount(Integer sourceWordCount) {
    
    this.sourceWordCount = sourceWordCount;
    return this;
  }

   /**
   * Get sourceWordCount
   * @return sourceWordCount
  **/
  @javax.annotation.Nullable

  public Integer getSourceWordCount() {
    return sourceWordCount;
  }


  public void setSourceWordCount(Integer sourceWordCount) {
    this.sourceWordCount = sourceWordCount;
  }


  public LocaleReport wordCount(Integer wordCount) {
    
    this.wordCount = wordCount;
    return this;
  }

   /**
   * Get wordCount
   * @return wordCount
  **/
  @javax.annotation.Nullable

  public Integer getWordCount() {
    return wordCount;
  }


  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }


  public LocaleReport wordCountUnverified(Integer wordCountUnverified) {
    
    this.wordCountUnverified = wordCountUnverified;
    return this;
  }

   /**
   * Get wordCountUnverified
   * @return wordCountUnverified
  **/
  @javax.annotation.Nullable

  public Integer getWordCountUnverified() {
    return wordCountUnverified;
  }


  public void setWordCountUnverified(Integer wordCountUnverified) {
    this.wordCountUnverified = wordCountUnverified;
  }


  public LocaleReport wordCountMissing(Integer wordCountMissing) {
    
    this.wordCountMissing = wordCountMissing;
    return this;
  }

   /**
   * Get wordCountMissing
   * @return wordCountMissing
  **/
  @javax.annotation.Nullable

  public Integer getWordCountMissing() {
    return wordCountMissing;
  }


  public void setWordCountMissing(Integer wordCountMissing) {
    this.wordCountMissing = wordCountMissing;
  }


  public LocaleReport locale(LocalePreview locale) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleReport localeReport = (LocaleReport) o;
    return Objects.equals(this.keysCount, localeReport.keysCount) &&
        Objects.equals(this.translatedTranslationsPercentage, localeReport.translatedTranslationsPercentage) &&
        Objects.equals(this.unverifiedTranslationsPercentage, localeReport.unverifiedTranslationsPercentage) &&
        Objects.equals(this.reviewedTranslationsPercentage, localeReport.reviewedTranslationsPercentage) &&
        Objects.equals(this.untranslatedKeysPercentage, localeReport.untranslatedKeysPercentage) &&
        Objects.equals(this.completedTranslationsCount, localeReport.completedTranslationsCount) &&
        Objects.equals(this.untranslatedKeysCount, localeReport.untranslatedKeysCount) &&
        Objects.equals(this.unverifiedTranslationsCount, localeReport.unverifiedTranslationsCount) &&
        Objects.equals(this.reviewedTranslationsCount, localeReport.reviewedTranslationsCount) &&
        Objects.equals(this.sourceWordCount, localeReport.sourceWordCount) &&
        Objects.equals(this.wordCount, localeReport.wordCount) &&
        Objects.equals(this.wordCountUnverified, localeReport.wordCountUnverified) &&
        Objects.equals(this.wordCountMissing, localeReport.wordCountMissing) &&
        Objects.equals(this.locale, localeReport.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keysCount, translatedTranslationsPercentage, unverifiedTranslationsPercentage, reviewedTranslationsPercentage, untranslatedKeysPercentage, completedTranslationsCount, untranslatedKeysCount, unverifiedTranslationsCount, reviewedTranslationsCount, sourceWordCount, wordCount, wordCountUnverified, wordCountMissing, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleReport {\n");
    sb.append("    keysCount: ").append(toIndentedString(keysCount)).append("\n");
    sb.append("    translatedTranslationsPercentage: ").append(toIndentedString(translatedTranslationsPercentage)).append("\n");
    sb.append("    unverifiedTranslationsPercentage: ").append(toIndentedString(unverifiedTranslationsPercentage)).append("\n");
    sb.append("    reviewedTranslationsPercentage: ").append(toIndentedString(reviewedTranslationsPercentage)).append("\n");
    sb.append("    untranslatedKeysPercentage: ").append(toIndentedString(untranslatedKeysPercentage)).append("\n");
    sb.append("    completedTranslationsCount: ").append(toIndentedString(completedTranslationsCount)).append("\n");
    sb.append("    untranslatedKeysCount: ").append(toIndentedString(untranslatedKeysCount)).append("\n");
    sb.append("    unverifiedTranslationsCount: ").append(toIndentedString(unverifiedTranslationsCount)).append("\n");
    sb.append("    reviewedTranslationsCount: ").append(toIndentedString(reviewedTranslationsCount)).append("\n");
    sb.append("    sourceWordCount: ").append(toIndentedString(sourceWordCount)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    wordCountUnverified: ").append(toIndentedString(wordCountUnverified)).append("\n");
    sb.append("    wordCountMissing: ").append(toIndentedString(wordCountMissing)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

