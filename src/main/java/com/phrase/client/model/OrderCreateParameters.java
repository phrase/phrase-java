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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-11T15:19:37.223566Z[Etc/UTC]")
public class OrderCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_LSP = "lsp";
  @SerializedName(SERIALIZED_NAME_LSP)
  private String lsp;

  public static final String SERIALIZED_NAME_SOURCE_LOCALE_ID = "source_locale_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE_ID)
  private String sourceLocaleId;

  public static final String SERIALIZED_NAME_TARGET_LOCALE_IDS = "target_locale_ids";
  @SerializedName(SERIALIZED_NAME_TARGET_LOCALE_IDS)
  private List<String> targetLocaleIds = null;

  public static final String SERIALIZED_NAME_TRANSLATION_TYPE = "translation_type";
  @SerializedName(SERIALIZED_NAME_TRANSLATION_TYPE)
  private String translationType;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STYLEGUIDE_ID = "styleguide_id";
  @SerializedName(SERIALIZED_NAME_STYLEGUIDE_ID)
  private String styleguideId;

  public static final String SERIALIZED_NAME_UNVERIFY_TRANSLATIONS_UPON_DELIVERY = "unverify_translations_upon_delivery";
  @SerializedName(SERIALIZED_NAME_UNVERIFY_TRANSLATIONS_UPON_DELIVERY)
  private Boolean unverifyTranslationsUponDelivery;

  public static final String SERIALIZED_NAME_INCLUDE_UNTRANSLATED_KEYS = "include_untranslated_keys";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNTRANSLATED_KEYS)
  private Boolean includeUntranslatedKeys;

  public static final String SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS = "include_unverified_translations";
  @SerializedName(SERIALIZED_NAME_INCLUDE_UNVERIFIED_TRANSLATIONS)
  private Boolean includeUnverifiedTranslations;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Boolean quality;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Boolean priority;


  public OrderCreateParameters branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * specify the branch to use
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-feature-branch", value = "specify the branch to use")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public OrderCreateParameters lsp(String lsp) {
    
    this.lsp = lsp;
    return this;
  }

   /**
   * Name of the LSP that should process this order. Can be one of gengo, textmaster.
   * @return lsp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "textmaster", value = "Name of the LSP that should process this order. Can be one of gengo, textmaster.")

  public String getLsp() {
    return lsp;
  }


  public void setLsp(String lsp) {
    this.lsp = lsp;
  }


  public OrderCreateParameters sourceLocaleId(String sourceLocaleId) {
    
    this.sourceLocaleId = sourceLocaleId;
    return this;
  }

   /**
   * Source locale for the order. Can be the name or public id of the source locale. Preferred is the public id.
   * @return sourceLocaleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234abcd1234", value = "Source locale for the order. Can be the name or public id of the source locale. Preferred is the public id.")

  public String getSourceLocaleId() {
    return sourceLocaleId;
  }


  public void setSourceLocaleId(String sourceLocaleId) {
    this.sourceLocaleId = sourceLocaleId;
  }


  public OrderCreateParameters targetLocaleIds(List<String> targetLocaleIds) {
    
    this.targetLocaleIds = targetLocaleIds;
    return this;
  }

  public OrderCreateParameters addTargetLocaleIdsItem(String targetLocaleIdsItem) {
    if (this.targetLocaleIds == null) {
      this.targetLocaleIds = new ArrayList<>();
    }
    this.targetLocaleIds.add(targetLocaleIdsItem);
    return this;
  }

   /**
   * List of target locales you want the source content translate to. Can be the name or public id of the target locales. Preferred is the public id.
   * @return targetLocaleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1234abcd1234abcd1234abcd1234abcd\",\"abcd1234abcd1234abcd1234abcd1234\"]", value = "List of target locales you want the source content translate to. Can be the name or public id of the target locales. Preferred is the public id.")

  public List<String> getTargetLocaleIds() {
    return targetLocaleIds;
  }


  public void setTargetLocaleIds(List<String> targetLocaleIds) {
    this.targetLocaleIds = targetLocaleIds;
  }


  public OrderCreateParameters translationType(String translationType) {
    
    this.translationType = translationType;
    return this;
  }

   /**
   * Name of the quality level, availability depends on the LSP. Can be one of:  standard, pro (for orders processed by Gengo) and one of regular, premium, enterprise (for orders processed by TextMaster)
   * @return translationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "premium", value = "Name of the quality level, availability depends on the LSP. Can be one of:  standard, pro (for orders processed by Gengo) and one of regular, premium, enterprise (for orders processed by TextMaster)")

  public String getTranslationType() {
    return translationType;
  }


  public void setTranslationType(String translationType) {
    this.translationType = translationType;
  }


  public OrderCreateParameters tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Tag you want to order translations for.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-awesome-feature", value = "Tag you want to order translations for.")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public OrderCreateParameters message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message that is displayed to the translators for description.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please make everything sound really nice :)", value = "Message that is displayed to the translators for description.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public OrderCreateParameters styleguideId(String styleguideId) {
    
    this.styleguideId = styleguideId;
    return this;
  }

   /**
   * Style guide for translators to be sent with the order.
   * @return styleguideId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234abcd1234abcd1234abcd1234abcd", value = "Style guide for translators to be sent with the order.")

  public String getStyleguideId() {
    return styleguideId;
  }


  public void setStyleguideId(String styleguideId) {
    this.styleguideId = styleguideId;
  }


  public OrderCreateParameters unverifyTranslationsUponDelivery(Boolean unverifyTranslationsUponDelivery) {
    
    this.unverifyTranslationsUponDelivery = unverifyTranslationsUponDelivery;
    return this;
  }

   /**
   * Unverify translations upon delivery.
   * @return unverifyTranslationsUponDelivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unverify translations upon delivery.")

  public Boolean getUnverifyTranslationsUponDelivery() {
    return unverifyTranslationsUponDelivery;
  }


  public void setUnverifyTranslationsUponDelivery(Boolean unverifyTranslationsUponDelivery) {
    this.unverifyTranslationsUponDelivery = unverifyTranslationsUponDelivery;
  }


  public OrderCreateParameters includeUntranslatedKeys(Boolean includeUntranslatedKeys) {
    
    this.includeUntranslatedKeys = includeUntranslatedKeys;
    return this;
  }

   /**
   * Order translations for keys with untranslated content in the selected target locales.
   * @return includeUntranslatedKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order translations for keys with untranslated content in the selected target locales.")

  public Boolean getIncludeUntranslatedKeys() {
    return includeUntranslatedKeys;
  }


  public void setIncludeUntranslatedKeys(Boolean includeUntranslatedKeys) {
    this.includeUntranslatedKeys = includeUntranslatedKeys;
  }


  public OrderCreateParameters includeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
    return this;
  }

   /**
   * Order translations for keys with unverified content in the selected target locales.
   * @return includeUnverifiedTranslations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order translations for keys with unverified content in the selected target locales.")

  public Boolean getIncludeUnverifiedTranslations() {
    return includeUnverifiedTranslations;
  }


  public void setIncludeUnverifiedTranslations(Boolean includeUnverifiedTranslations) {
    this.includeUnverifiedTranslations = includeUnverifiedTranslations;
  }


  public OrderCreateParameters category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category to use (required for orders processed by TextMaster).
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C021", value = "Category to use (required for orders processed by TextMaster).")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public OrderCreateParameters quality(Boolean quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Extra proofreading option to ensure consistency in vocabulary and style. Only available for orders processed by TextMaster.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra proofreading option to ensure consistency in vocabulary and style. Only available for orders processed by TextMaster.")

  public Boolean getQuality() {
    return quality;
  }


  public void setQuality(Boolean quality) {
    this.quality = quality;
  }


  public OrderCreateParameters priority(Boolean priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Indicates whether the priority option should be ordered which decreases turnaround time by 30%. Available only for orders processed by TextMaster.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the priority option should be ordered which decreases turnaround time by 30%. Available only for orders processed by TextMaster.")

  public Boolean getPriority() {
    return priority;
  }


  public void setPriority(Boolean priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateParameters orderCreateParameters = (OrderCreateParameters) o;
    return Objects.equals(this.branch, orderCreateParameters.branch) &&
        Objects.equals(this.lsp, orderCreateParameters.lsp) &&
        Objects.equals(this.sourceLocaleId, orderCreateParameters.sourceLocaleId) &&
        Objects.equals(this.targetLocaleIds, orderCreateParameters.targetLocaleIds) &&
        Objects.equals(this.translationType, orderCreateParameters.translationType) &&
        Objects.equals(this.tag, orderCreateParameters.tag) &&
        Objects.equals(this.message, orderCreateParameters.message) &&
        Objects.equals(this.styleguideId, orderCreateParameters.styleguideId) &&
        Objects.equals(this.unverifyTranslationsUponDelivery, orderCreateParameters.unverifyTranslationsUponDelivery) &&
        Objects.equals(this.includeUntranslatedKeys, orderCreateParameters.includeUntranslatedKeys) &&
        Objects.equals(this.includeUnverifiedTranslations, orderCreateParameters.includeUnverifiedTranslations) &&
        Objects.equals(this.category, orderCreateParameters.category) &&
        Objects.equals(this.quality, orderCreateParameters.quality) &&
        Objects.equals(this.priority, orderCreateParameters.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, lsp, sourceLocaleId, targetLocaleIds, translationType, tag, message, styleguideId, unverifyTranslationsUponDelivery, includeUntranslatedKeys, includeUnverifiedTranslations, category, quality, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    lsp: ").append(toIndentedString(lsp)).append("\n");
    sb.append("    sourceLocaleId: ").append(toIndentedString(sourceLocaleId)).append("\n");
    sb.append("    targetLocaleIds: ").append(toIndentedString(targetLocaleIds)).append("\n");
    sb.append("    translationType: ").append(toIndentedString(translationType)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    styleguideId: ").append(toIndentedString(styleguideId)).append("\n");
    sb.append("    unverifyTranslationsUponDelivery: ").append(toIndentedString(unverifyTranslationsUponDelivery)).append("\n");
    sb.append("    includeUntranslatedKeys: ").append(toIndentedString(includeUntranslatedKeys)).append("\n");
    sb.append("    includeUnverifiedTranslations: ").append(toIndentedString(includeUnverifiedTranslations)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

