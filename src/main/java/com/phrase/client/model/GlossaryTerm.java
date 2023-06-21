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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.phrase.client.model.GlossaryTermTranslation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * GlossaryTerm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-21T11:16:44.039956Z[Etc/UTC]")
public class GlossaryTerm {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private String term;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRANSLATABLE = "translatable";
  @SerializedName(SERIALIZED_NAME_TRANSLATABLE)
  private Boolean translatable;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "case_sensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private List<GlossaryTermTranslation> translations = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public GlossaryTerm id(String id) {
    
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


  public GlossaryTerm term(String term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTerm() {
    return term;
  }


  public void setTerm(String term) {
    this.term = term;
  }


  public GlossaryTerm description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GlossaryTerm translatable(Boolean translatable) {
    
    this.translatable = translatable;
    return this;
  }

   /**
   * Get translatable
   * @return translatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTranslatable() {
    return translatable;
  }


  public void setTranslatable(Boolean translatable) {
    this.translatable = translatable;
  }


  public GlossaryTerm caseSensitive(Boolean caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public GlossaryTerm translations(List<GlossaryTermTranslation> translations) {
    
    this.translations = translations;
    return this;
  }

  public GlossaryTerm addTranslationsItem(GlossaryTermTranslation translationsItem) {
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
  @ApiModelProperty(value = "")

  public List<GlossaryTermTranslation> getTranslations() {
    return translations;
  }


  public void setTranslations(List<GlossaryTermTranslation> translations) {
    this.translations = translations;
  }


  public GlossaryTerm createdAt(OffsetDateTime createdAt) {
    
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


  public GlossaryTerm updatedAt(OffsetDateTime updatedAt) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryTerm glossaryTerm = (GlossaryTerm) o;
    return Objects.equals(this.id, glossaryTerm.id) &&
        Objects.equals(this.term, glossaryTerm.term) &&
        Objects.equals(this.description, glossaryTerm.description) &&
        Objects.equals(this.translatable, glossaryTerm.translatable) &&
        Objects.equals(this.caseSensitive, glossaryTerm.caseSensitive) &&
        Objects.equals(this.translations, glossaryTerm.translations) &&
        Objects.equals(this.createdAt, glossaryTerm.createdAt) &&
        Objects.equals(this.updatedAt, glossaryTerm.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, term, description, translatable, caseSensitive, translations, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTerm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    translatable: ").append(toIndentedString(translatable)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

