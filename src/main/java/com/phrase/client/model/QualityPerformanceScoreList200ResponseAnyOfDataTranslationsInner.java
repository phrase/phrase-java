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
import java.math.BigDecimal;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T09:35:18.127109159Z[Etc/UTC]")
public class QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner {
  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private String engine;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner() {
  }

  public QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner engine(String engine) {
    
    this.engine = engine;
    return this;
  }

   /**
   * Engine used for the translation scoring
   * @return engine
  **/
  @javax.annotation.Nullable

  public String getEngine() {
    return engine;
  }


  public void setEngine(String engine) {
    this.engine = engine;
  }


  public QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner score(BigDecimal score) {
    
    this.score = score;
    return this;
  }

   /**
   * Quality score for the translation
   * @return score
  **/
  @javax.annotation.Nullable

  public BigDecimal getScore() {
    return score;
  }


  public void setScore(BigDecimal score) {
    this.score = score;
  }


  public QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * One of the translation ids passed in arguments
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner qualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner = (QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner) o;
    return Objects.equals(this.engine, qualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner.engine) &&
        Objects.equals(this.score, qualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner.score) &&
        Objects.equals(this.id, qualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, score, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityPerformanceScoreList200ResponseAnyOfDataTranslationsInner {\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

