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
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StyleguideDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-29T14:54:39.680646Z[Etc/UTC]")
public class StyleguideDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PUBLIC_URL = "public_url";
  @SerializedName(SERIALIZED_NAME_PUBLIC_URL)
  private String publicUrl;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_TARGET_AUDIENCE = "target_audience";
  @SerializedName(SERIALIZED_NAME_TARGET_AUDIENCE)
  private String targetAudience;

  public static final String SERIALIZED_NAME_GRAMMATICAL_PERSON = "grammatical_person";
  @SerializedName(SERIALIZED_NAME_GRAMMATICAL_PERSON)
  private String grammaticalPerson;

  public static final String SERIALIZED_NAME_VOCABULARY_TYPE = "vocabulary_type";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_TYPE)
  private String vocabularyType;

  public static final String SERIALIZED_NAME_BUSINESS = "business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private String business;

  public static final String SERIALIZED_NAME_COMPANY_BRANDING = "company_branding";
  @SerializedName(SERIALIZED_NAME_COMPANY_BRANDING)
  private String companyBranding;

  public static final String SERIALIZED_NAME_FORMATTING = "formatting";
  @SerializedName(SERIALIZED_NAME_FORMATTING)
  private String formatting;

  public static final String SERIALIZED_NAME_GLOSSARY_TERMS = "glossary_terms";
  @SerializedName(SERIALIZED_NAME_GLOSSARY_TERMS)
  private String glossaryTerms;

  public static final String SERIALIZED_NAME_GRAMMAR_CONSISTENCY = "grammar_consistency";
  @SerializedName(SERIALIZED_NAME_GRAMMAR_CONSISTENCY)
  private String grammarConsistency;

  public static final String SERIALIZED_NAME_LITERAL_TRANSLATION = "literal_translation";
  @SerializedName(SERIALIZED_NAME_LITERAL_TRANSLATION)
  private String literalTranslation;

  public static final String SERIALIZED_NAME_OVERALL_TONE = "overall_tone";
  @SerializedName(SERIALIZED_NAME_OVERALL_TONE)
  private String overallTone;

  public static final String SERIALIZED_NAME_SAMPLES = "samples";
  @SerializedName(SERIALIZED_NAME_SAMPLES)
  private String samples;

  public StyleguideDetails() {
  }

  public StyleguideDetails id(String id) {
    
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


  public StyleguideDetails title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StyleguideDetails createdAt(OffsetDateTime createdAt) {
    
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


  public StyleguideDetails updatedAt(OffsetDateTime updatedAt) {
    
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


  public StyleguideDetails publicUrl(String publicUrl) {
    
    this.publicUrl = publicUrl;
    return this;
  }

   /**
   * Get publicUrl
   * @return publicUrl
  **/
  @javax.annotation.Nullable

  public String getPublicUrl() {
    return publicUrl;
  }


  public void setPublicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
  }


  public StyleguideDetails audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public StyleguideDetails targetAudience(String targetAudience) {
    
    this.targetAudience = targetAudience;
    return this;
  }

   /**
   * Get targetAudience
   * @return targetAudience
  **/
  @javax.annotation.Nullable

  public String getTargetAudience() {
    return targetAudience;
  }


  public void setTargetAudience(String targetAudience) {
    this.targetAudience = targetAudience;
  }


  public StyleguideDetails grammaticalPerson(String grammaticalPerson) {
    
    this.grammaticalPerson = grammaticalPerson;
    return this;
  }

   /**
   * Get grammaticalPerson
   * @return grammaticalPerson
  **/
  @javax.annotation.Nullable

  public String getGrammaticalPerson() {
    return grammaticalPerson;
  }


  public void setGrammaticalPerson(String grammaticalPerson) {
    this.grammaticalPerson = grammaticalPerson;
  }


  public StyleguideDetails vocabularyType(String vocabularyType) {
    
    this.vocabularyType = vocabularyType;
    return this;
  }

   /**
   * Get vocabularyType
   * @return vocabularyType
  **/
  @javax.annotation.Nullable

  public String getVocabularyType() {
    return vocabularyType;
  }


  public void setVocabularyType(String vocabularyType) {
    this.vocabularyType = vocabularyType;
  }


  public StyleguideDetails business(String business) {
    
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @javax.annotation.Nullable

  public String getBusiness() {
    return business;
  }


  public void setBusiness(String business) {
    this.business = business;
  }


  public StyleguideDetails companyBranding(String companyBranding) {
    
    this.companyBranding = companyBranding;
    return this;
  }

   /**
   * Get companyBranding
   * @return companyBranding
  **/
  @javax.annotation.Nullable

  public String getCompanyBranding() {
    return companyBranding;
  }


  public void setCompanyBranding(String companyBranding) {
    this.companyBranding = companyBranding;
  }


  public StyleguideDetails formatting(String formatting) {
    
    this.formatting = formatting;
    return this;
  }

   /**
   * Get formatting
   * @return formatting
  **/
  @javax.annotation.Nullable

  public String getFormatting() {
    return formatting;
  }


  public void setFormatting(String formatting) {
    this.formatting = formatting;
  }


  public StyleguideDetails glossaryTerms(String glossaryTerms) {
    
    this.glossaryTerms = glossaryTerms;
    return this;
  }

   /**
   * Get glossaryTerms
   * @return glossaryTerms
  **/
  @javax.annotation.Nullable

  public String getGlossaryTerms() {
    return glossaryTerms;
  }


  public void setGlossaryTerms(String glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }


  public StyleguideDetails grammarConsistency(String grammarConsistency) {
    
    this.grammarConsistency = grammarConsistency;
    return this;
  }

   /**
   * Get grammarConsistency
   * @return grammarConsistency
  **/
  @javax.annotation.Nullable

  public String getGrammarConsistency() {
    return grammarConsistency;
  }


  public void setGrammarConsistency(String grammarConsistency) {
    this.grammarConsistency = grammarConsistency;
  }


  public StyleguideDetails literalTranslation(String literalTranslation) {
    
    this.literalTranslation = literalTranslation;
    return this;
  }

   /**
   * Get literalTranslation
   * @return literalTranslation
  **/
  @javax.annotation.Nullable

  public String getLiteralTranslation() {
    return literalTranslation;
  }


  public void setLiteralTranslation(String literalTranslation) {
    this.literalTranslation = literalTranslation;
  }


  public StyleguideDetails overallTone(String overallTone) {
    
    this.overallTone = overallTone;
    return this;
  }

   /**
   * Get overallTone
   * @return overallTone
  **/
  @javax.annotation.Nullable

  public String getOverallTone() {
    return overallTone;
  }


  public void setOverallTone(String overallTone) {
    this.overallTone = overallTone;
  }


  public StyleguideDetails samples(String samples) {
    
    this.samples = samples;
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @javax.annotation.Nullable

  public String getSamples() {
    return samples;
  }


  public void setSamples(String samples) {
    this.samples = samples;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StyleguideDetails styleguideDetails = (StyleguideDetails) o;
    return Objects.equals(this.id, styleguideDetails.id) &&
        Objects.equals(this.title, styleguideDetails.title) &&
        Objects.equals(this.createdAt, styleguideDetails.createdAt) &&
        Objects.equals(this.updatedAt, styleguideDetails.updatedAt) &&
        Objects.equals(this.publicUrl, styleguideDetails.publicUrl) &&
        Objects.equals(this.audience, styleguideDetails.audience) &&
        Objects.equals(this.targetAudience, styleguideDetails.targetAudience) &&
        Objects.equals(this.grammaticalPerson, styleguideDetails.grammaticalPerson) &&
        Objects.equals(this.vocabularyType, styleguideDetails.vocabularyType) &&
        Objects.equals(this.business, styleguideDetails.business) &&
        Objects.equals(this.companyBranding, styleguideDetails.companyBranding) &&
        Objects.equals(this.formatting, styleguideDetails.formatting) &&
        Objects.equals(this.glossaryTerms, styleguideDetails.glossaryTerms) &&
        Objects.equals(this.grammarConsistency, styleguideDetails.grammarConsistency) &&
        Objects.equals(this.literalTranslation, styleguideDetails.literalTranslation) &&
        Objects.equals(this.overallTone, styleguideDetails.overallTone) &&
        Objects.equals(this.samples, styleguideDetails.samples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, createdAt, updatedAt, publicUrl, audience, targetAudience, grammaticalPerson, vocabularyType, business, companyBranding, formatting, glossaryTerms, grammarConsistency, literalTranslation, overallTone, samples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleguideDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    publicUrl: ").append(toIndentedString(publicUrl)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    targetAudience: ").append(toIndentedString(targetAudience)).append("\n");
    sb.append("    grammaticalPerson: ").append(toIndentedString(grammaticalPerson)).append("\n");
    sb.append("    vocabularyType: ").append(toIndentedString(vocabularyType)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    companyBranding: ").append(toIndentedString(companyBranding)).append("\n");
    sb.append("    formatting: ").append(toIndentedString(formatting)).append("\n");
    sb.append("    glossaryTerms: ").append(toIndentedString(glossaryTerms)).append("\n");
    sb.append("    grammarConsistency: ").append(toIndentedString(grammarConsistency)).append("\n");
    sb.append("    literalTranslation: ").append(toIndentedString(literalTranslation)).append("\n");
    sb.append("    overallTone: ").append(toIndentedString(overallTone)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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

