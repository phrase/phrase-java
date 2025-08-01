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
 * GlossaryTermUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T06:43:11.225647232Z[Etc/UTC]")
public class GlossaryTermUpdateParameters {
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

  public GlossaryTermUpdateParameters() {
  }

  public GlossaryTermUpdateParameters term(String term) {
    
    this.term = term;
    return this;
  }

   /**
   * Glossary term
   * @return term
  **/
  @javax.annotation.Nullable

  public String getTerm() {
    return term;
  }


  public void setTerm(String term) {
    this.term = term;
  }


  public GlossaryTermUpdateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of term
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GlossaryTermUpdateParameters translatable(Boolean translatable) {
    
    this.translatable = translatable;
    return this;
  }

   /**
   * Indicates whether the term should be used for all languages or can be translated
   * @return translatable
  **/
  @javax.annotation.Nullable

  public Boolean getTranslatable() {
    return translatable;
  }


  public void setTranslatable(Boolean translatable) {
    this.translatable = translatable;
  }


  public GlossaryTermUpdateParameters caseSensitive(Boolean caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Indicates whether the term is case sensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlossaryTermUpdateParameters glossaryTermUpdateParameters = (GlossaryTermUpdateParameters) o;
    return Objects.equals(this.term, glossaryTermUpdateParameters.term) &&
        Objects.equals(this.description, glossaryTermUpdateParameters.description) &&
        Objects.equals(this.translatable, glossaryTermUpdateParameters.translatable) &&
        Objects.equals(this.caseSensitive, glossaryTermUpdateParameters.caseSensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, description, translatable, caseSensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlossaryTermUpdateParameters {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    translatable: ").append(toIndentedString(translatable)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
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

