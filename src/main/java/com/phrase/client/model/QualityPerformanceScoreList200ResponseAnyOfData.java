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
import com.phrase.client.model.QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QualityPerformanceScoreList200ResponseAnyOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-09T13:24:15.729012872Z[Etc/UTC]")
public class QualityPerformanceScoreList200ResponseAnyOfData {
  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private List<QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner> translations;

  public QualityPerformanceScoreList200ResponseAnyOfData() {
  }

  public QualityPerformanceScoreList200ResponseAnyOfData translations(List<QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner> translations) {
    
    this.translations = translations;
    return this;
  }

  public QualityPerformanceScoreList200ResponseAnyOfData addTranslationsItem(QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable

  public List<QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner> getTranslations() {
    return translations;
  }


  public void setTranslations(List<QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner> translations) {
    this.translations = translations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityPerformanceScoreList200ResponseAnyOfData qualityPerformanceScoreList200ResponseAnyOfData = (QualityPerformanceScoreList200ResponseAnyOfData) o;
    return Objects.equals(this.translations, qualityPerformanceScoreList200ResponseAnyOfData.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityPerformanceScoreList200ResponseAnyOfData {\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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

