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

/**
 * TranslationCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-29T13:54:24.676955Z[Etc/UTC]")
public class TranslationCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_LOCALE_ID = "locale_id";
  @SerializedName(SERIALIZED_NAME_LOCALE_ID)
  private String localeId;

  public static final String SERIALIZED_NAME_KEY_ID = "key_id";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private String keyId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_PLURAL_SUFFIX = "plural_suffix";
  @SerializedName(SERIALIZED_NAME_PLURAL_SUFFIX)
  private String pluralSuffix;

  public static final String SERIALIZED_NAME_UNVERIFIED = "unverified";
  @SerializedName(SERIALIZED_NAME_UNVERIFIED)
  private Boolean unverified;

  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  private Boolean excluded;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE = "autotranslate";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE)
  private Boolean autotranslate;


  public TranslationCreateParameters branch(String branch) {
    
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


  public TranslationCreateParameters localeId(String localeId) {
    
    this.localeId = localeId;
    return this;
  }

   /**
   * Locale. Can be the name or public id of the locale. Preferred is the public id.
   * @return localeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234cdef1234abcd1234cdef1234", value = "Locale. Can be the name or public id of the locale. Preferred is the public id.")

  public String getLocaleId() {
    return localeId;
  }


  public void setLocaleId(String localeId) {
    this.localeId = localeId;
  }


  public TranslationCreateParameters keyId(String keyId) {
    
    this.keyId = keyId;
    return this;
  }

   /**
   * Key
   * @return keyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234cdef1234abcd1234cdef1234", value = "Key")

  public String getKeyId() {
    return keyId;
  }


  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  public TranslationCreateParameters content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Translation content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My translation", value = "Translation content")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public TranslationCreateParameters pluralSuffix(String pluralSuffix) {
    
    this.pluralSuffix = pluralSuffix;
    return this;
  }

   /**
   * Plural suffix. Can be one of: zero, one, two, few, many, other. Must be specified if the key associated to the translation is pluralized.
   * @return pluralSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plural suffix. Can be one of: zero, one, two, few, many, other. Must be specified if the key associated to the translation is pluralized.")

  public String getPluralSuffix() {
    return pluralSuffix;
  }


  public void setPluralSuffix(String pluralSuffix) {
    this.pluralSuffix = pluralSuffix;
  }


  public TranslationCreateParameters unverified(Boolean unverified) {
    
    this.unverified = unverified;
    return this;
  }

   /**
   * Indicates whether translation is unverified. Part of the &lt;a href&#x3D;\&quot;https://help.phrase.com/help/verification-and-proofreading\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Advanced Workflows&lt;/a&gt; feature.
   * @return unverified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether translation is unverified. Part of the <a href=\"https://help.phrase.com/help/verification-and-proofreading\" target=\"_blank\">Advanced Workflows</a> feature.")

  public Boolean getUnverified() {
    return unverified;
  }


  public void setUnverified(Boolean unverified) {
    this.unverified = unverified;
  }


  public TranslationCreateParameters excluded(Boolean excluded) {
    
    this.excluded = excluded;
    return this;
  }

   /**
   * Indicates whether translation is excluded.
   * @return excluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether translation is excluded.")

  public Boolean getExcluded() {
    return excluded;
  }


  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }


  public TranslationCreateParameters autotranslate(Boolean autotranslate) {
    
    this.autotranslate = autotranslate;
    return this;
  }

   /**
   * Indicates whether the translation should be auto-translated. Responses with status 422 if provided for translation within a non-default locale or the project does not have the Autopilot feature enabled.
   * @return autotranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the translation should be auto-translated. Responses with status 422 if provided for translation within a non-default locale or the project does not have the Autopilot feature enabled.")

  public Boolean getAutotranslate() {
    return autotranslate;
  }


  public void setAutotranslate(Boolean autotranslate) {
    this.autotranslate = autotranslate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslationCreateParameters translationCreateParameters = (TranslationCreateParameters) o;
    return Objects.equals(this.branch, translationCreateParameters.branch) &&
        Objects.equals(this.localeId, translationCreateParameters.localeId) &&
        Objects.equals(this.keyId, translationCreateParameters.keyId) &&
        Objects.equals(this.content, translationCreateParameters.content) &&
        Objects.equals(this.pluralSuffix, translationCreateParameters.pluralSuffix) &&
        Objects.equals(this.unverified, translationCreateParameters.unverified) &&
        Objects.equals(this.excluded, translationCreateParameters.excluded) &&
        Objects.equals(this.autotranslate, translationCreateParameters.autotranslate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, localeId, keyId, content, pluralSuffix, unverified, excluded, autotranslate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    localeId: ").append(toIndentedString(localeId)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    pluralSuffix: ").append(toIndentedString(pluralSuffix)).append("\n");
    sb.append("    unverified: ").append(toIndentedString(unverified)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    autotranslate: ").append(toIndentedString(autotranslate)).append("\n");
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

