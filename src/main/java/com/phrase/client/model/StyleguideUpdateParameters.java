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
 * StyleguideUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T12:21:39.016318Z[Etc/UTC]")
public class StyleguideUpdateParameters {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

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


  public StyleguideUpdateParameters title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Style guide title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Web application style guide", value = "Style guide title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StyleguideUpdateParameters audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Audience description
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "customer-facing", value = "Audience description")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public StyleguideUpdateParameters targetAudience(String targetAudience) {
    
    this.targetAudience = targetAudience;
    return this;
  }

   /**
   * Can be one of: not_specified, children, teenager, young_adults, adults, old_adults.
   * @return targetAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "teenager", value = "Can be one of: not_specified, children, teenager, young_adults, adults, old_adults.")

  public String getTargetAudience() {
    return targetAudience;
  }


  public void setTargetAudience(String targetAudience) {
    this.targetAudience = targetAudience;
  }


  public StyleguideUpdateParameters grammaticalPerson(String grammaticalPerson) {
    
    this.grammaticalPerson = grammaticalPerson;
    return this;
  }

   /**
   * Can be one of: not_specified, first_person_singular, second_person_singular, third_person_singular_masculine, third_person_singular_feminine, third_person_singular_neuter, first_person_plural, second_person_plural, third_person_plural.
   * @return grammaticalPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "first_person_singular", value = "Can be one of: not_specified, first_person_singular, second_person_singular, third_person_singular_masculine, third_person_singular_feminine, third_person_singular_neuter, first_person_plural, second_person_plural, third_person_plural.")

  public String getGrammaticalPerson() {
    return grammaticalPerson;
  }


  public void setGrammaticalPerson(String grammaticalPerson) {
    this.grammaticalPerson = grammaticalPerson;
  }


  public StyleguideUpdateParameters vocabularyType(String vocabularyType) {
    
    this.vocabularyType = vocabularyType;
    return this;
  }

   /**
   * Can be one of: not_specified, popular, technical, fictional.
   * @return vocabularyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "technical", value = "Can be one of: not_specified, popular, technical, fictional.")

  public String getVocabularyType() {
    return vocabularyType;
  }


  public void setVocabularyType(String vocabularyType) {
    this.vocabularyType = vocabularyType;
  }


  public StyleguideUpdateParameters business(String business) {
    
    this.business = business;
    return this;
  }

   /**
   * Description of the business
   * @return business
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "We are a travel site that helps customers find the best hotels and flights.", value = "Description of the business")

  public String getBusiness() {
    return business;
  }


  public void setBusiness(String business) {
    this.business = business;
  }


  public StyleguideUpdateParameters companyBranding(String companyBranding) {
    
    this.companyBranding = companyBranding;
    return this;
  }

   /**
   * Company branding to remain consistent.
   * @return companyBranding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME Inc. should never be translated.", value = "Company branding to remain consistent.")

  public String getCompanyBranding() {
    return companyBranding;
  }


  public void setCompanyBranding(String companyBranding) {
    this.companyBranding = companyBranding;
  }


  public StyleguideUpdateParameters formatting(String formatting) {
    
    this.formatting = formatting;
    return this;
  }

   /**
   * Formatting requirements and character limitations.
   * @return formatting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Never use capital letters", value = "Formatting requirements and character limitations.")

  public String getFormatting() {
    return formatting;
  }


  public void setFormatting(String formatting) {
    this.formatting = formatting;
  }


  public StyleguideUpdateParameters glossaryTerms(String glossaryTerms) {
    
    this.glossaryTerms = glossaryTerms;
    return this;
  }

   /**
   * List of terms and/or phrases that need to be translated consistently.
   * @return glossaryTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Apartment, cabin, loft", value = "List of terms and/or phrases that need to be translated consistently.")

  public String getGlossaryTerms() {
    return glossaryTerms;
  }


  public void setGlossaryTerms(String glossaryTerms) {
    this.glossaryTerms = glossaryTerms;
  }


  public StyleguideUpdateParameters grammarConsistency(String grammarConsistency) {
    
    this.grammarConsistency = grammarConsistency;
    return this;
  }

   /**
   * Formal or informal pronouns, consistent conjugation, grammatical gender
   * @return grammarConsistency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Formal or informal pronouns, consistent conjugation, grammatical gender")

  public String getGrammarConsistency() {
    return grammarConsistency;
  }


  public void setGrammarConsistency(String grammarConsistency) {
    this.grammarConsistency = grammarConsistency;
  }


  public StyleguideUpdateParameters literalTranslation(String literalTranslation) {
    
    this.literalTranslation = literalTranslation;
    return this;
  }

   /**
   * Can be one of: Cultural/Conversational, Literal, Neutral.
   * @return literalTranslation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Neutral", value = "Can be one of: Cultural/Conversational, Literal, Neutral.")

  public String getLiteralTranslation() {
    return literalTranslation;
  }


  public void setLiteralTranslation(String literalTranslation) {
    this.literalTranslation = literalTranslation;
  }


  public StyleguideUpdateParameters overallTone(String overallTone) {
    
    this.overallTone = overallTone;
    return this;
  }

   /**
   * Tone requirement descriptions
   * @return overallTone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tone should be fun and light", value = "Tone requirement descriptions")

  public String getOverallTone() {
    return overallTone;
  }


  public void setOverallTone(String overallTone) {
    this.overallTone = overallTone;
  }


  public StyleguideUpdateParameters samples(String samples) {
    
    this.samples = samples;
    return this;
  }

   /**
   * Provide links to sample product pages, FAQ pages, etc. to give the translator a point of reference. You can also provide past translations. Even snippets or short paragraphs are helpful for maintaining consistency.
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.myexample.com/my/document/path/to/samples.pdf", value = "Provide links to sample product pages, FAQ pages, etc. to give the translator a point of reference. You can also provide past translations. Even snippets or short paragraphs are helpful for maintaining consistency.")

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
    StyleguideUpdateParameters styleguideUpdateParameters = (StyleguideUpdateParameters) o;
    return Objects.equals(this.title, styleguideUpdateParameters.title) &&
        Objects.equals(this.audience, styleguideUpdateParameters.audience) &&
        Objects.equals(this.targetAudience, styleguideUpdateParameters.targetAudience) &&
        Objects.equals(this.grammaticalPerson, styleguideUpdateParameters.grammaticalPerson) &&
        Objects.equals(this.vocabularyType, styleguideUpdateParameters.vocabularyType) &&
        Objects.equals(this.business, styleguideUpdateParameters.business) &&
        Objects.equals(this.companyBranding, styleguideUpdateParameters.companyBranding) &&
        Objects.equals(this.formatting, styleguideUpdateParameters.formatting) &&
        Objects.equals(this.glossaryTerms, styleguideUpdateParameters.glossaryTerms) &&
        Objects.equals(this.grammarConsistency, styleguideUpdateParameters.grammarConsistency) &&
        Objects.equals(this.literalTranslation, styleguideUpdateParameters.literalTranslation) &&
        Objects.equals(this.overallTone, styleguideUpdateParameters.overallTone) &&
        Objects.equals(this.samples, styleguideUpdateParameters.samples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, audience, targetAudience, grammaticalPerson, vocabularyType, business, companyBranding, formatting, glossaryTerms, grammarConsistency, literalTranslation, overallTone, samples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleguideUpdateParameters {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

