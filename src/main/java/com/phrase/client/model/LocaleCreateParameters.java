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
 * LocaleCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-24T13:52:31.068Z[Etc/UTC]")
public class LocaleCreateParameters {
  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

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

  public static final String SERIALIZED_NAME_SOURCE_LOCALE_ID = "source_locale_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_LOCALE_ID)
  private String sourceLocaleId;

  public static final String SERIALIZED_NAME_UNVERIFY_NEW_TRANSLATIONS = "unverify_new_translations";
  @SerializedName(SERIALIZED_NAME_UNVERIFY_NEW_TRANSLATIONS)
  private Boolean unverifyNewTranslations;

  public static final String SERIALIZED_NAME_UNVERIFY_UPDATED_TRANSLATIONS = "unverify_updated_translations";
  @SerializedName(SERIALIZED_NAME_UNVERIFY_UPDATED_TRANSLATIONS)
  private Boolean unverifyUpdatedTranslations;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE = "autotranslate";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE)
  private Boolean autotranslate;


  public LocaleCreateParameters branch(String branch) {
    
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


  public LocaleCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Locale name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "Locale name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocaleCreateParameters code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Locale ISO code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de-DE", value = "Locale ISO code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public LocaleCreateParameters _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Indicates whether locale is the default locale. If set to true, the previous default locale the project is no longer the default locale.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether locale is the default locale. If set to true, the previous default locale the project is no longer the default locale.")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public LocaleCreateParameters main(Boolean main) {
    
    this.main = main;
    return this;
  }

   /**
   * Indicates whether locale is a main locale. Main locales are part of the &lt;a href&#x3D;\&quot;https://help.phrase.com/help/verification-and-proofreading\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Verification System&lt;/a&gt; feature.
   * @return main
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether locale is a main locale. Main locales are part of the <a href=\"https://help.phrase.com/help/verification-and-proofreading\" target=\"_blank\">Verification System</a> feature.")

  public Boolean getMain() {
    return main;
  }


  public void setMain(Boolean main) {
    this.main = main;
  }


  public LocaleCreateParameters rtl(Boolean rtl) {
    
    this.rtl = rtl;
    return this;
  }

   /**
   * Indicates whether locale is a RTL (Right-to-Left) locale.
   * @return rtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether locale is a RTL (Right-to-Left) locale.")

  public Boolean getRtl() {
    return rtl;
  }


  public void setRtl(Boolean rtl) {
    this.rtl = rtl;
  }


  public LocaleCreateParameters sourceLocaleId(String sourceLocaleId) {
    
    this.sourceLocaleId = sourceLocaleId;
    return this;
  }

   /**
   * Source locale. Can be the name or public id of the locale. Preferred is the public id.
   * @return sourceLocaleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234abcd1234abcd1234abcd1234", value = "Source locale. Can be the name or public id of the locale. Preferred is the public id.")

  public String getSourceLocaleId() {
    return sourceLocaleId;
  }


  public void setSourceLocaleId(String sourceLocaleId) {
    this.sourceLocaleId = sourceLocaleId;
  }


  public LocaleCreateParameters unverifyNewTranslations(Boolean unverifyNewTranslations) {
    
    this.unverifyNewTranslations = unverifyNewTranslations;
    return this;
  }

   /**
   * Indicates that new translations for this locale should be marked as unverified. Part of the &lt;a href&#x3D;\&quot;https://help.phrase.com/help/verification-and-proofreading\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Advanced Workflows&lt;/a&gt; feature.
   * @return unverifyNewTranslations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that new translations for this locale should be marked as unverified. Part of the <a href=\"https://help.phrase.com/help/verification-and-proofreading\" target=\"_blank\">Advanced Workflows</a> feature.")

  public Boolean getUnverifyNewTranslations() {
    return unverifyNewTranslations;
  }


  public void setUnverifyNewTranslations(Boolean unverifyNewTranslations) {
    this.unverifyNewTranslations = unverifyNewTranslations;
  }


  public LocaleCreateParameters unverifyUpdatedTranslations(Boolean unverifyUpdatedTranslations) {
    
    this.unverifyUpdatedTranslations = unverifyUpdatedTranslations;
    return this;
  }

   /**
   * Indicates that updated translations for this locale should be marked as unverified. Part of the &lt;a href&#x3D;\&quot;https://help.phrase.com/help/verification-and-proofreading\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Advanced Workflows&lt;/a&gt; feature.
   * @return unverifyUpdatedTranslations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that updated translations for this locale should be marked as unverified. Part of the <a href=\"https://help.phrase.com/help/verification-and-proofreading\" target=\"_blank\">Advanced Workflows</a> feature.")

  public Boolean getUnverifyUpdatedTranslations() {
    return unverifyUpdatedTranslations;
  }


  public void setUnverifyUpdatedTranslations(Boolean unverifyUpdatedTranslations) {
    this.unverifyUpdatedTranslations = unverifyUpdatedTranslations;
  }


  public LocaleCreateParameters autotranslate(Boolean autotranslate) {
    
    this.autotranslate = autotranslate;
    return this;
  }

   /**
   * If set, translations for this locale will be fetched automatically, right after creation.
   * @return autotranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set, translations for this locale will be fetched automatically, right after creation.")

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
    LocaleCreateParameters localeCreateParameters = (LocaleCreateParameters) o;
    return Objects.equals(this.branch, localeCreateParameters.branch) &&
        Objects.equals(this.name, localeCreateParameters.name) &&
        Objects.equals(this.code, localeCreateParameters.code) &&
        Objects.equals(this._default, localeCreateParameters._default) &&
        Objects.equals(this.main, localeCreateParameters.main) &&
        Objects.equals(this.rtl, localeCreateParameters.rtl) &&
        Objects.equals(this.sourceLocaleId, localeCreateParameters.sourceLocaleId) &&
        Objects.equals(this.unverifyNewTranslations, localeCreateParameters.unverifyNewTranslations) &&
        Objects.equals(this.unverifyUpdatedTranslations, localeCreateParameters.unverifyUpdatedTranslations) &&
        Objects.equals(this.autotranslate, localeCreateParameters.autotranslate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, code, _default, main, rtl, sourceLocaleId, unverifyNewTranslations, unverifyUpdatedTranslations, autotranslate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleCreateParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    rtl: ").append(toIndentedString(rtl)).append("\n");
    sb.append("    sourceLocaleId: ").append(toIndentedString(sourceLocaleId)).append("\n");
    sb.append("    unverifyNewTranslations: ").append(toIndentedString(unverifyNewTranslations)).append("\n");
    sb.append("    unverifyUpdatedTranslations: ").append(toIndentedString(unverifyUpdatedTranslations)).append("\n");
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
