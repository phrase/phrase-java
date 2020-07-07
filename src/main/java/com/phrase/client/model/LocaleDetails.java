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
import com.phrase.client.model.Locale;
import com.phrase.client.model.LocaleDetails1;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.LocaleStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * LocaleDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-07T12:03:36.530Z[Etc/UTC]")
public class LocaleDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_MAIN = "main";
  @SerializedName(SERIALIZED_NAME_MAIN)
  private Boolean main;

  public static final String SERIALIZED_NAME_RTL = "rtl";
  @SerializedName(SERIALIZED_NAME_RTL)
  private Boolean rtl;

  public static final String SERIALIZED_NAME_PLURAL_FORMS = "plural_forms";
  @SerializedName(SERIALIZED_NAME_PLURAL_FORMS)
  private List<String> pluralForms = null;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE = "source_locale";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE)
  private LocalePreview sourceLocale;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private LocaleStatistics statistics;


  public LocaleDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LocaleDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocaleDetails code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public LocaleDetails _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public LocaleDetails main(Boolean main) {
    
    this.main = main;
    return this;
  }

   /**
   * Get main
   * @return main
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMain() {
    return main;
  }


  public void setMain(Boolean main) {
    this.main = main;
  }


  public LocaleDetails rtl(Boolean rtl) {
    
    this.rtl = rtl;
    return this;
  }

   /**
   * Get rtl
   * @return rtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRtl() {
    return rtl;
  }


  public void setRtl(Boolean rtl) {
    this.rtl = rtl;
  }


  public LocaleDetails pluralForms(List<String> pluralForms) {
    
    this.pluralForms = pluralForms;
    return this;
  }

  public LocaleDetails addPluralFormsItem(String pluralFormsItem) {
    if (this.pluralForms == null) {
      this.pluralForms = new ArrayList<>();
    }
    this.pluralForms.add(pluralFormsItem);
    return this;
  }

   /**
   * Get pluralForms
   * @return pluralForms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPluralForms() {
    return pluralForms;
  }


  public void setPluralForms(List<String> pluralForms) {
    this.pluralForms = pluralForms;
  }


  public LocaleDetails sourceLocale(LocalePreview sourceLocale) {
    
    this.sourceLocale = sourceLocale;
    return this;
  }

   /**
   * Get sourceLocale
   * @return sourceLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalePreview getSourceLocale() {
    return sourceLocale;
  }


  public void setSourceLocale(LocalePreview sourceLocale) {
    this.sourceLocale = sourceLocale;
  }


  public LocaleDetails createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LocaleDetails updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public LocaleDetails statistics(LocaleStatistics statistics) {
    
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocaleStatistics getStatistics() {
    return statistics;
  }


  public void setStatistics(LocaleStatistics statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleDetails localeDetails = (LocaleDetails) o;
    return Objects.equals(this.id, localeDetails.id) &&
        Objects.equals(this.name, localeDetails.name) &&
        Objects.equals(this.code, localeDetails.code) &&
        Objects.equals(this._default, localeDetails._default) &&
        Objects.equals(this.main, localeDetails.main) &&
        Objects.equals(this.rtl, localeDetails.rtl) &&
        Objects.equals(this.pluralForms, localeDetails.pluralForms) &&
        Objects.equals(this.sourceLocale, localeDetails.sourceLocale) &&
        Objects.equals(this.createdAt, localeDetails.createdAt) &&
        Objects.equals(this.updatedAt, localeDetails.updatedAt) &&
        Objects.equals(this.statistics, localeDetails.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, _default, main, rtl, pluralForms, sourceLocale, createdAt, updatedAt, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    rtl: ").append(toIndentedString(rtl)).append("\n");
    sb.append("    pluralForms: ").append(toIndentedString(pluralForms)).append("\n");
    sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

