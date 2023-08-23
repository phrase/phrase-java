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
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.StyleguidePreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TranslationOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-23T12:08:43.151010Z[Etc/UTC]")
public class TranslationOrder {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LSP = "lsp";
  @SerializedName(SERIALIZED_NAME_LSP)
  private String lsp;

  public static final String SERIALIZED_NAME_AMOUNT_IN_CENTS = "amount_in_cents";
  @SerializedName(SERIALIZED_NAME_AMOUNT_IN_CENTS)
  private Integer amountInCents;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TRANSLATION_TYPE = "translation_type";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_TYPE)
  private String translationType;

  public static final String SERIALIZED_NAME_PROGRESS_PERCENT = "progress_percent";
  @SerializedName(SERIALIZED_NAME_PROGRESS_PERCENT)
  private Integer progressPercent;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE = "source_locale";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE)
  private LocalePreview sourceLocale;

  public static final String SERIALIZED_NAME_TARGET_LOCALES = "target_locales";
  @SerializedName(SERIALIZED_NAME_TARGET_LOCALES)
  private List<LocalePreview> targetLocales = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_STYLEGUIDE = "styleguide";
  @SerializedName(SERIALIZED_NAME_STYLEGUIDE)
  private StyleguidePreview styleguide;

  public static final String SERIALIZED_NAME_UNVERIFY_TRANSLATIONS_UPON_DELIVERY = "unverify_translations_upon_delivery";
  @SerializedName(SERIALIZED_NAME_UNVERIFY_TRANSLATIONS_UPON_DELIVERY)
  private Boolean unverifyTranslationsUponDelivery;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Boolean quality;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Boolean priority;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public TranslationOrder id(String id) {
    
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


  public TranslationOrder name(String name) {
    
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


  public TranslationOrder lsp(String lsp) {
    
    this.lsp = lsp;
    return this;
  }

   /**
   * Get lsp
   * @return lsp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLsp() {
    return lsp;
  }


  public void setLsp(String lsp) {
    this.lsp = lsp;
  }


  public TranslationOrder amountInCents(Integer amountInCents) {
    
    this.amountInCents = amountInCents;
    return this;
  }

   /**
   * Get amountInCents
   * @return amountInCents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAmountInCents() {
    return amountInCents;
  }


  public void setAmountInCents(Integer amountInCents) {
    this.amountInCents = amountInCents;
  }


  public TranslationOrder currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TranslationOrder message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public TranslationOrder state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public TranslationOrder translationType(String translationType) {
    
    this.translationType = translationType;
    return this;
  }

   /**
   * Get translationType
   * @return translationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTranslationType() {
    return translationType;
  }


  public void setTranslationType(String translationType) {
    this.translationType = translationType;
  }


  public TranslationOrder progressPercent(Integer progressPercent) {
    
    this.progressPercent = progressPercent;
    return this;
  }

   /**
   * Get progressPercent
   * @return progressPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProgressPercent() {
    return progressPercent;
  }


  public void setProgressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
  }


  public TranslationOrder sourceLocale(LocalePreview sourceLocale) {
    
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


  public TranslationOrder targetLocales(List<LocalePreview> targetLocales) {
    
    this.targetLocales = targetLocales;
    return this;
  }

  public TranslationOrder addTargetLocalesItem(LocalePreview targetLocalesItem) {
    if (this.targetLocales == null) {
      this.targetLocales = new ArrayList<>();
    }
    this.targetLocales.add(targetLocalesItem);
    return this;
  }

   /**
   * Get targetLocales
   * @return targetLocales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocalePreview> getTargetLocales() {
    return targetLocales;
  }


  public void setTargetLocales(List<LocalePreview> targetLocales) {
    this.targetLocales = targetLocales;
  }


  public TranslationOrder tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public TranslationOrder styleguide(StyleguidePreview styleguide) {
    
    this.styleguide = styleguide;
    return this;
  }

   /**
   * Get styleguide
   * @return styleguide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StyleguidePreview getStyleguide() {
    return styleguide;
  }


  public void setStyleguide(StyleguidePreview styleguide) {
    this.styleguide = styleguide;
  }


  public TranslationOrder unverifyTranslationsUponDelivery(Boolean unverifyTranslationsUponDelivery) {
    
    this.unverifyTranslationsUponDelivery = unverifyTranslationsUponDelivery;
    return this;
  }

   /**
   * Get unverifyTranslationsUponDelivery
   * @return unverifyTranslationsUponDelivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUnverifyTranslationsUponDelivery() {
    return unverifyTranslationsUponDelivery;
  }


  public void setUnverifyTranslationsUponDelivery(Boolean unverifyTranslationsUponDelivery) {
    this.unverifyTranslationsUponDelivery = unverifyTranslationsUponDelivery;
  }


  public TranslationOrder quality(Boolean quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getQuality() {
    return quality;
  }


  public void setQuality(Boolean quality) {
    this.quality = quality;
  }


  public TranslationOrder priority(Boolean priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPriority() {
    return priority;
  }


  public void setPriority(Boolean priority) {
    this.priority = priority;
  }


  public TranslationOrder createdAt(OffsetDateTime createdAt) {
    
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


  public TranslationOrder updatedAt(OffsetDateTime updatedAt) {
    
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
    TranslationOrder translationOrder = (TranslationOrder) o;
    return Objects.equals(this.id, translationOrder.id) &&
        Objects.equals(this.name, translationOrder.name) &&
        Objects.equals(this.lsp, translationOrder.lsp) &&
        Objects.equals(this.amountInCents, translationOrder.amountInCents) &&
        Objects.equals(this.currency, translationOrder.currency) &&
        Objects.equals(this.message, translationOrder.message) &&
        Objects.equals(this.state, translationOrder.state) &&
        Objects.equals(this.translationType, translationOrder.translationType) &&
        Objects.equals(this.progressPercent, translationOrder.progressPercent) &&
        Objects.equals(this.sourceLocale, translationOrder.sourceLocale) &&
        Objects.equals(this.targetLocales, translationOrder.targetLocales) &&
        Objects.equals(this.tag, translationOrder.tag) &&
        Objects.equals(this.styleguide, translationOrder.styleguide) &&
        Objects.equals(this.unverifyTranslationsUponDelivery, translationOrder.unverifyTranslationsUponDelivery) &&
        Objects.equals(this.quality, translationOrder.quality) &&
        Objects.equals(this.priority, translationOrder.priority) &&
        Objects.equals(this.createdAt, translationOrder.createdAt) &&
        Objects.equals(this.updatedAt, translationOrder.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lsp, amountInCents, currency, message, state, translationType, progressPercent, sourceLocale, targetLocales, tag, styleguide, unverifyTranslationsUponDelivery, quality, priority, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lsp: ").append(toIndentedString(lsp)).append("\n");
    sb.append("    amountInCents: ").append(toIndentedString(amountInCents)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    translationType: ").append(toIndentedString(translationType)).append("\n");
    sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
    sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
    sb.append("    targetLocales: ").append(toIndentedString(targetLocales)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    styleguide: ").append(toIndentedString(styleguide)).append("\n");
    sb.append("    unverifyTranslationsUponDelivery: ").append(toIndentedString(unverifyTranslationsUponDelivery)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

