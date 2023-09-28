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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StyleguideDetails1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-28T09:50:22.991012Z[Etc/UTC]")
public class StyleguideDetails1 {
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


  public StyleguideDetails1 publicUrl(String publicUrl) {
    
    this.publicUrl = publicUrl;
    return this;
  }

   /**
   * Get publicUrl
   * @return publicUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublicUrl() {
    return publicUrl;
  }


  public void setPublicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
  }


  public StyleguideDetails1 audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public StyleguideDetails1 targetAudience(String targetAudience) {
    
    this.targetAudience = targetAudience;
    return this;
  }

   /**
   * Get targetAudience
   * @return targetAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetAudience() {
    return targetAudience;
  }


  public void setTargetAudience(String targetAudience) {
    this.targetAudience = targetAudience;
  }


  public StyleguideDetails1 grammaticalPerson(String grammaticalPerson) {
    
    this.grammaticalPerson = grammaticalPerson;
    return this;
  }

   /**
   * Get grammaticalPerson
   * @return grammaticalPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrammaticalPerson() {
    return grammaticalPerson;
  }


  public void setGrammaticalPerson(String grammaticalPerson) {
    this.grammaticalPerson = grammaticalPerson;
  }


  public StyleguideDetails1 vocabularyType(String vocabularyType) {
    
    this.vocabularyType = vocabularyType;
    return this;
  }

   /**
   * Get vocabularyType
   * @return vocabularyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVocabularyType() {
    return vocabularyType;
  }


  public void setVocabularyType(String vocabularyType) {
    this.vocabularyType = vocabularyType;
  }


  public StyleguideDetails1 business(String business) {
    
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusiness() {
    return business;
  }


  public void setBusiness(String business) {
    this.business = business;
  }


  public StyleguideDetails1 companyBranding(String companyBranding) {
    
    this.companyBranding = companyBranding;
    return this;
  }

   /**
   * Get companyBranding
   * @return companyBranding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompanyBranding() {
    return companyBranding;
  }


  public void setCompanyBranding(String companyBranding) {
    this.companyBranding = companyBranding;
  }


  public StyleguideDetails1 formatting(String formatting) {
    
    this.formatting = formatting;
    return this;
  }

   /**
   * Get formatting
   * @return formatting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormatting() {
    return formatting;
  }


  public void setFormatting(String formatting) {
    this.formatting = formatting;
  }


  public StyleguideDetails1 glossaryTerms(String glossaryTerms) {
    
    this.glossaryTerms = glossaryTerms;
    return this;
  }

   /**
   * Get glossaryTerms
   * @return glossaryTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlossaryTerms() {
    return glossaryTerms;
  }


  public void setGlossaryTerms(String glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }


  public StyleguideDetails1 grammarConsistency(String grammarConsistency) {
    
    this.grammarConsistency = grammarConsistency;
    return this;
  }

   /**
   * Get grammarConsistency
   * @return grammarConsistency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGrammarConsistency() {
    return grammarConsistency;
  }


  public void setGrammarConsistency(String grammarConsistency) {
    this.grammarConsistency = grammarConsistency;
  }


  public StyleguideDetails1 literalTranslation(String literalTranslation) {
    
    this.literalTranslation = literalTranslation;
    return this;
  }

   /**
   * Get literalTranslation
   * @return literalTranslation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLiteralTranslation() {
    return literalTranslation;
  }


  public void setLiteralTranslation(String literalTranslation) {
    this.literalTranslation = literalTranslation;
  }


  public StyleguideDetails1 overallTone(String overallTone) {
    
    this.overallTone = overallTone;
    return this;
  }

   /**
   * Get overallTone
   * @return overallTone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOverallTone() {
    return overallTone;
  }


  public void setOverallTone(String overallTone) {
    this.overallTone = overallTone;
  }


  public StyleguideDetails1 samples(String samples) {
    
    this.samples = samples;
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSamples() {
    return samples;
  }


  public void setSamples(String samples) {
    this.samples = samples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StyleguideDetails1 styleguideDetails1 = (StyleguideDetails1) o;
    return Objects.equals(this.publicUrl, styleguideDetails1.publicUrl) &&
        Objects.equals(this.audience, styleguideDetails1.audience) &&
        Objects.equals(this.targetAudience, styleguideDetails1.targetAudience) &&
        Objects.equals(this.grammaticalPerson, styleguideDetails1.grammaticalPerson) &&
        Objects.equals(this.vocabularyType, styleguideDetails1.vocabularyType) &&
        Objects.equals(this.business, styleguideDetails1.business) &&
        Objects.equals(this.companyBranding, styleguideDetails1.companyBranding) &&
        Objects.equals(this.formatting, styleguideDetails1.formatting) &&
        Objects.equals(this.glossaryTerms, styleguideDetails1.glossaryTerms) &&
        Objects.equals(this.grammarConsistency, styleguideDetails1.grammarConsistency) &&
        Objects.equals(this.literalTranslation, styleguideDetails1.literalTranslation) &&
        Objects.equals(this.overallTone, styleguideDetails1.overallTone) &&
        Objects.equals(this.samples, styleguideDetails1.samples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicUrl, audience, targetAudience, grammaticalPerson, vocabularyType, business, companyBranding, formatting, glossaryTerms, grammarConsistency, literalTranslation, overallTone, samples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleguideDetails1 {\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

