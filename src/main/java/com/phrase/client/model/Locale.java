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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Locale
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T08:36:59.339814Z[Etc/UTC]")
public class Locale {
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
  private List<String> pluralForms;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE = "source_locale";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE)
  private LocalePreview sourceLocale;

  public static final String SERIALIZED_NAME_FALLBACK_LOCALE = "fallback_locale";
  @SerializedName(SERIALIZED_NAME_FALLBACK_LOCALE)
  private LocalePreview fallbackLocale;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Locale() {
  }

  public Locale id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Locale name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Locale code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public Locale _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public Locale main(Boolean main) {
    
    this.main = main;
    return this;
  }

   /**
   * Get main
   * @return main
  **/
  @javax.annotation.Nullable

  public Boolean getMain() {
    return main;
  }


  public void setMain(Boolean main) {
    this.main = main;
  }


  public Locale rtl(Boolean rtl) {
    
    this.rtl = rtl;
    return this;
  }

   /**
   * Get rtl
   * @return rtl
  **/
  @javax.annotation.Nullable

  public Boolean getRtl() {
    return rtl;
  }


  public void setRtl(Boolean rtl) {
    this.rtl = rtl;
  }


  public Locale pluralForms(List<String> pluralForms) {
    
    this.pluralForms = pluralForms;
    return this;
  }

  public Locale addPluralFormsItem(String pluralFormsItem) {
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

  public List<String> getPluralForms() {
    return pluralForms;
  }


  public void setPluralForms(List<String> pluralForms) {
    this.pluralForms = pluralForms;
  }


  public Locale sourceLocale(LocalePreview sourceLocale) {
    
    this.sourceLocale = sourceLocale;
    return this;
  }

   /**
   * Get sourceLocale
   * @return sourceLocale
  **/
  @javax.annotation.Nullable

  public LocalePreview getSourceLocale() {
    return sourceLocale;
  }


  public void setSourceLocale(LocalePreview sourceLocale) {
    this.sourceLocale = sourceLocale;
  }


  public Locale fallbackLocale(LocalePreview fallbackLocale) {
    
    this.fallbackLocale = fallbackLocale;
    return this;
  }

   /**
   * Get fallbackLocale
   * @return fallbackLocale
  **/
  @javax.annotation.Nullable

  public LocalePreview getFallbackLocale() {
    return fallbackLocale;
  }


  public void setFallbackLocale(LocalePreview fallbackLocale) {
    this.fallbackLocale = fallbackLocale;
  }


  public Locale createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Locale updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locale locale = (Locale) o;
    return Objects.equals(this.id, locale.id) &&
        Objects.equals(this.name, locale.name) &&
        Objects.equals(this.code, locale.code) &&
        Objects.equals(this._default, locale._default) &&
        Objects.equals(this.main, locale.main) &&
        Objects.equals(this.rtl, locale.rtl) &&
        Objects.equals(this.pluralForms, locale.pluralForms) &&
        Objects.equals(this.sourceLocale, locale.sourceLocale) &&
        Objects.equals(this.fallbackLocale, locale.fallbackLocale) &&
        Objects.equals(this.createdAt, locale.createdAt) &&
        Objects.equals(this.updatedAt, locale.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, code, _default, main, rtl, pluralForms, sourceLocale, fallbackLocale, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locale {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    rtl: ").append(toIndentedString(rtl)).append("\n");
    sb.append("    pluralForms: ").append(toIndentedString(pluralForms)).append("\n");
    sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
    sb.append("    fallbackLocale: ").append(toIndentedString(fallbackLocale)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

