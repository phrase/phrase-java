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
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TagWithStats1Statistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T14:04:54.173713Z[Etc/UTC]")
public class TagWithStats1Statistics {
  public static final String SERIALIZED_NAME_KEYS_TOTAL_COUNT = "keys_total_count";
  @SerializedName(SERIALIZED_NAME_KEYS_TOTAL_COUNT)
  private Integer keysTotalCount;

  public static final String SERIALIZED_NAME_TRANSLATIONS_COMPLETED_COUNT = "translations_completed_count";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS_COMPLETED_COUNT)
  private Integer translationsCompletedCount;

  public static final String SERIALIZED_NAME_TRANSLATIONS_UNVERIFIED_COUNT = "translations_unverified_count";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS_UNVERIFIED_COUNT)
  private Integer translationsUnverifiedCount;

  public static final String SERIALIZED_NAME_KEYS_UNTRANSLATED_COUNT = "keys_untranslated_count";
  @SerializedName(SERIALIZED_NAME_KEYS_UNTRANSLATED_COUNT)
  private Integer keysUntranslatedCount;

  public TagWithStats1Statistics() {
  }

  public TagWithStats1Statistics keysTotalCount(Integer keysTotalCount) {
    
    this.keysTotalCount = keysTotalCount;
    return this;
  }

   /**
   * Get keysTotalCount
   * @return keysTotalCount
  **/
  @javax.annotation.Nullable

  public Integer getKeysTotalCount() {
    return keysTotalCount;
  }


  public void setKeysTotalCount(Integer keysTotalCount) {
    this.keysTotalCount = keysTotalCount;
  }


  public TagWithStats1Statistics translationsCompletedCount(Integer translationsCompletedCount) {
    
    this.translationsCompletedCount = translationsCompletedCount;
    return this;
  }

   /**
   * Get translationsCompletedCount
   * @return translationsCompletedCount
  **/
  @javax.annotation.Nullable

  public Integer getTranslationsCompletedCount() {
    return translationsCompletedCount;
  }


  public void setTranslationsCompletedCount(Integer translationsCompletedCount) {
    this.translationsCompletedCount = translationsCompletedCount;
  }


  public TagWithStats1Statistics translationsUnverifiedCount(Integer translationsUnverifiedCount) {
    
    this.translationsUnverifiedCount = translationsUnverifiedCount;
    return this;
  }

   /**
   * Get translationsUnverifiedCount
   * @return translationsUnverifiedCount
  **/
  @javax.annotation.Nullable

  public Integer getTranslationsUnverifiedCount() {
    return translationsUnverifiedCount;
  }


  public void setTranslationsUnverifiedCount(Integer translationsUnverifiedCount) {
    this.translationsUnverifiedCount = translationsUnverifiedCount;
  }


  public TagWithStats1Statistics keysUntranslatedCount(Integer keysUntranslatedCount) {
    
    this.keysUntranslatedCount = keysUntranslatedCount;
    return this;
  }

   /**
   * Get keysUntranslatedCount
   * @return keysUntranslatedCount
  **/
  @javax.annotation.Nullable

  public Integer getKeysUntranslatedCount() {
    return keysUntranslatedCount;
  }


  public void setKeysUntranslatedCount(Integer keysUntranslatedCount) {
    this.keysUntranslatedCount = keysUntranslatedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagWithStats1Statistics tagWithStats1Statistics = (TagWithStats1Statistics) o;
    return Objects.equals(this.keysTotalCount, tagWithStats1Statistics.keysTotalCount) &&
        Objects.equals(this.translationsCompletedCount, tagWithStats1Statistics.translationsCompletedCount) &&
        Objects.equals(this.translationsUnverifiedCount, tagWithStats1Statistics.translationsUnverifiedCount) &&
        Objects.equals(this.keysUntranslatedCount, tagWithStats1Statistics.keysUntranslatedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keysTotalCount, translationsCompletedCount, translationsUnverifiedCount, keysUntranslatedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagWithStats1Statistics {\n");
    sb.append("    keysTotalCount: ").append(toIndentedString(keysTotalCount)).append("\n");
    sb.append("    translationsCompletedCount: ").append(toIndentedString(translationsCompletedCount)).append("\n");
    sb.append("    translationsUnverifiedCount: ").append(toIndentedString(translationsUnverifiedCount)).append("\n");
    sb.append("    keysUntranslatedCount: ").append(toIndentedString(keysUntranslatedCount)).append("\n");
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

