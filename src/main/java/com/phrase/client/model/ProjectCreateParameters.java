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
import java.io.File;
import java.io.IOException;

/**
 * ProjectCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T05:10:29.770909Z[Etc/UTC]")
public class ProjectCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MAIN_FORMAT = "main_format";
  @SerializedName(SERIALIZED_NAME_MAIN_FORMAT)
  private String mainFormat;

  public static final String SERIALIZED_NAME_SHARES_TRANSLATION_MEMORY = "shares_translation_memory";
  @SerializedName(SERIALIZED_NAME_SHARES_TRANSLATION_MEMORY)
  private Boolean sharesTranslationMemory;

  public static final String SERIALIZED_NAME_PROJECT_IMAGE = "project_image";
  @SerializedName(SERIALIZED_NAME_PROJECT_IMAGE)
  private File projectImage;

  public static final String SERIALIZED_NAME_REMOVE_PROJECT_IMAGE = "remove_project_image";
  @SerializedName(SERIALIZED_NAME_REMOVE_PROJECT_IMAGE)
  private Boolean removeProjectImage;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SOURCE_PROJECT_ID = "source_project_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_PROJECT_ID)
  private String sourceProjectId;

  public static final String SERIALIZED_NAME_WORKFLOW = "workflow";
  @SerializedName(SERIALIZED_NAME_WORKFLOW)
  private String workflow;

  public static final String SERIALIZED_NAME_MACHINE_TRANSLATION_ENABLED = "machine_translation_enabled";
  @SerializedName(SERIALIZED_NAME_MACHINE_TRANSLATION_ENABLED)
  private Boolean machineTranslationEnabled;

  public static final String SERIALIZED_NAME_ENABLE_BRANCHING = "enable_branching";
  @SerializedName(SERIALIZED_NAME_ENABLE_BRANCHING)
  private Boolean enableBranching;

  public static final String SERIALIZED_NAME_PROTECT_MASTER_BRANCH = "protect_master_branch";
  @SerializedName(SERIALIZED_NAME_PROTECT_MASTER_BRANCH)
  private Boolean protectMasterBranch;

  public static final String SERIALIZED_NAME_ENABLE_ALL_DATA_TYPE_TRANSLATION_KEYS_FOR_TRANSLATORS = "enable_all_data_type_translation_keys_for_translators";
  @SerializedName(SERIALIZED_NAME_ENABLE_ALL_DATA_TYPE_TRANSLATION_KEYS_FOR_TRANSLATORS)
  private Boolean enableAllDataTypeTranslationKeysForTranslators;

  public static final String SERIALIZED_NAME_ENABLE_ICU_MESSAGE_FORMAT = "enable_icu_message_format";
  @SerializedName(SERIALIZED_NAME_ENABLE_ICU_MESSAGE_FORMAT)
  private Boolean enableIcuMessageFormat;

  public static final String SERIALIZED_NAME_ZERO_PLURAL_FORM_ENABLED = "zero_plural_form_enabled";
  @SerializedName(SERIALIZED_NAME_ZERO_PLURAL_FORM_ENABLED)
  private Boolean zeroPluralFormEnabled;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_ENABLED = "autotranslate_enabled";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_ENABLED)
  private Boolean autotranslateEnabled;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_CHECK_NEW_TRANSLATION_KEYS = "autotranslate_check_new_translation_keys";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_CHECK_NEW_TRANSLATION_KEYS)
  private Boolean autotranslateCheckNewTranslationKeys;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_CHECK_NEW_UPLOADS = "autotranslate_check_new_uploads";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_CHECK_NEW_UPLOADS)
  private Boolean autotranslateCheckNewUploads;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_CHECK_NEW_LOCALES = "autotranslate_check_new_locales";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_CHECK_NEW_LOCALES)
  private Boolean autotranslateCheckNewLocales;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_MARK_AS_UNVERIFIED = "autotranslate_mark_as_unverified";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_MARK_AS_UNVERIFIED)
  private Boolean autotranslateMarkAsUnverified;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_USE_MACHINE_TRANSLATION = "autotranslate_use_machine_translation";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_USE_MACHINE_TRANSLATION)
  private Boolean autotranslateUseMachineTranslation;

  public static final String SERIALIZED_NAME_AUTOTRANSLATE_USE_TRANSLATION_MEMORY = "autotranslate_use_translation_memory";
  @SerializedName(SERIALIZED_NAME_AUTOTRANSLATE_USE_TRANSLATION_MEMORY)
  private Boolean autotranslateUseTranslationMemory;

  public static final String SERIALIZED_NAME_SMART_SUGGEST_ENABLED = "smart_suggest_enabled";
  @SerializedName(SERIALIZED_NAME_SMART_SUGGEST_ENABLED)
  private Boolean smartSuggestEnabled;

  public static final String SERIALIZED_NAME_SMART_SUGGEST_USE_GLOSSARY = "smart_suggest_use_glossary";
  @SerializedName(SERIALIZED_NAME_SMART_SUGGEST_USE_GLOSSARY)
  private Boolean smartSuggestUseGlossary;

  public static final String SERIALIZED_NAME_SMART_SUGGEST_USE_MACHINE_TRANSLATION = "smart_suggest_use_machine_translation";
  @SerializedName(SERIALIZED_NAME_SMART_SUGGEST_USE_MACHINE_TRANSLATION)
  private Boolean smartSuggestUseMachineTranslation;


  public ProjectCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the project
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Android Project", value = "Name of the project")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectCreateParameters mainFormat(String mainFormat) {
    
    this.mainFormat = mainFormat;
    return this;
  }

   /**
   * Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see &lt;a href&#x3D;\&quot;https://help.phrase.com/help/supported-platforms-and-formats\&quot;&gt;Format Guide&lt;/a&gt; or our &lt;a href&#x3D;\&quot;#formats\&quot;&gt;Formats API Endpoint&lt;/a&gt;.
   * @return mainFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yml", value = "Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see <a href=\"https://help.phrase.com/help/supported-platforms-and-formats\">Format Guide</a> or our <a href=\"#formats\">Formats API Endpoint</a>.")

  public String getMainFormat() {
    return mainFormat;
  }


  public void setMainFormat(String mainFormat) {
    this.mainFormat = mainFormat;
  }


  public ProjectCreateParameters sharesTranslationMemory(Boolean sharesTranslationMemory) {
    
    this.sharesTranslationMemory = sharesTranslationMemory;
    return this;
  }

   /**
   * Indicates whether the project should share the account&#39;s translation memory
   * @return sharesTranslationMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the project should share the account's translation memory")

  public Boolean getSharesTranslationMemory() {
    return sharesTranslationMemory;
  }


  public void setSharesTranslationMemory(Boolean sharesTranslationMemory) {
    this.sharesTranslationMemory = sharesTranslationMemory;
  }


  public ProjectCreateParameters projectImage(File projectImage) {
    
    this.projectImage = projectImage;
    return this;
  }

   /**
   * Image to identify the project
   * @return projectImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image to identify the project")

  public File getProjectImage() {
    return projectImage;
  }


  public void setProjectImage(File projectImage) {
    this.projectImage = projectImage;
  }


  public ProjectCreateParameters removeProjectImage(Boolean removeProjectImage) {
    
    this.removeProjectImage = removeProjectImage;
    return this;
  }

   /**
   * Indicates whether the project image should be deleted.
   * @return removeProjectImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the project image should be deleted.")

  public Boolean getRemoveProjectImage() {
    return removeProjectImage;
  }


  public void setRemoveProjectImage(Boolean removeProjectImage) {
    this.removeProjectImage = removeProjectImage;
  }


  public ProjectCreateParameters accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234", value = "Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProjectCreateParameters sourceProjectId(String sourceProjectId) {
    
    this.sourceProjectId = sourceProjectId;
    return this;
  }

   /**
   * When a source project ID is given, a clone of that project will be created, including all locales, keys and translations as well as the main project settings if they are not defined otherwise through the params.
   * @return sourceProjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234", value = "When a source project ID is given, a clone of that project will be created, including all locales, keys and translations as well as the main project settings if they are not defined otherwise through the params.")

  public String getSourceProjectId() {
    return sourceProjectId;
  }


  public void setSourceProjectId(String sourceProjectId) {
    this.sourceProjectId = sourceProjectId;
  }


  public ProjectCreateParameters workflow(String workflow) {
    
    this.workflow = workflow;
    return this;
  }

   /**
   * (Optional) Review Workflow. \&quot;simple\&quot; / \&quot;review\&quot;. &lt;a href&#x3D;\&quot;https://help.phrase.com/help/advanced-review-workflow\&quot;&gt;Read more&lt;/a&gt;
   * @return workflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "review", value = "(Optional) Review Workflow. \"simple\" / \"review\". <a href=\"https://help.phrase.com/help/advanced-review-workflow\">Read more</a>")

  public String getWorkflow() {
    return workflow;
  }


  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }


  public ProjectCreateParameters machineTranslationEnabled(Boolean machineTranslationEnabled) {
    
    this.machineTranslationEnabled = machineTranslationEnabled;
    return this;
  }

   /**
   * (Optional) Enable machine translation support in the project. Required for Autopilot and Smart Suggest
   * @return machineTranslationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Enable machine translation support in the project. Required for Autopilot and Smart Suggest")

  public Boolean getMachineTranslationEnabled() {
    return machineTranslationEnabled;
  }


  public void setMachineTranslationEnabled(Boolean machineTranslationEnabled) {
    this.machineTranslationEnabled = machineTranslationEnabled;
  }


  public ProjectCreateParameters enableBranching(Boolean enableBranching) {
    
    this.enableBranching = enableBranching;
    return this;
  }

   /**
   * (Optional) Enable branching in the project
   * @return enableBranching
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Enable branching in the project")

  public Boolean getEnableBranching() {
    return enableBranching;
  }


  public void setEnableBranching(Boolean enableBranching) {
    this.enableBranching = enableBranching;
  }


  public ProjectCreateParameters protectMasterBranch(Boolean protectMasterBranch) {
    
    this.protectMasterBranch = protectMasterBranch;
    return this;
  }

   /**
   * (Optional) Protect the master branch in project where branching is enabled
   * @return protectMasterBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Protect the master branch in project where branching is enabled")

  public Boolean getProtectMasterBranch() {
    return protectMasterBranch;
  }


  public void setProtectMasterBranch(Boolean protectMasterBranch) {
    this.protectMasterBranch = protectMasterBranch;
  }


  public ProjectCreateParameters enableAllDataTypeTranslationKeysForTranslators(Boolean enableAllDataTypeTranslationKeysForTranslators) {
    
    this.enableAllDataTypeTranslationKeysForTranslators = enableAllDataTypeTranslationKeysForTranslators;
    return this;
  }

   /**
   * (Optional) Otherwise, translators are not allowed to edit translations other than strings
   * @return enableAllDataTypeTranslationKeysForTranslators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Otherwise, translators are not allowed to edit translations other than strings")

  public Boolean getEnableAllDataTypeTranslationKeysForTranslators() {
    return enableAllDataTypeTranslationKeysForTranslators;
  }


  public void setEnableAllDataTypeTranslationKeysForTranslators(Boolean enableAllDataTypeTranslationKeysForTranslators) {
    this.enableAllDataTypeTranslationKeysForTranslators = enableAllDataTypeTranslationKeysForTranslators;
  }


  public ProjectCreateParameters enableIcuMessageFormat(Boolean enableIcuMessageFormat) {
    
    this.enableIcuMessageFormat = enableIcuMessageFormat;
    return this;
  }

   /**
   * (Optional) We can validate and highlight your ICU messages. &lt;a href&#x3D;\&quot;https://help.phrase.com/help/icu-message-format\&quot;&gt;Read more&lt;/a&gt;
   * @return enableIcuMessageFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) We can validate and highlight your ICU messages. <a href=\"https://help.phrase.com/help/icu-message-format\">Read more</a>")

  public Boolean getEnableIcuMessageFormat() {
    return enableIcuMessageFormat;
  }


  public void setEnableIcuMessageFormat(Boolean enableIcuMessageFormat) {
    this.enableIcuMessageFormat = enableIcuMessageFormat;
  }


  public ProjectCreateParameters zeroPluralFormEnabled(Boolean zeroPluralFormEnabled) {
    
    this.zeroPluralFormEnabled = zeroPluralFormEnabled;
    return this;
  }

   /**
   * (Optional) Displays the input fields for the &#39;ZERO&#39; plural form for every key as well although only some languages require the &#39;ZERO&#39; explicitly.
   * @return zeroPluralFormEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Displays the input fields for the 'ZERO' plural form for every key as well although only some languages require the 'ZERO' explicitly.")

  public Boolean getZeroPluralFormEnabled() {
    return zeroPluralFormEnabled;
  }


  public void setZeroPluralFormEnabled(Boolean zeroPluralFormEnabled) {
    this.zeroPluralFormEnabled = zeroPluralFormEnabled;
  }


  public ProjectCreateParameters autotranslateEnabled(Boolean autotranslateEnabled) {
    
    this.autotranslateEnabled = autotranslateEnabled;
    return this;
  }

   /**
   * (Optional) Autopilot, requires machine_translation_enabled. &lt;a href&#x3D;\&quot;https://help.phrase.com/help/autopilot\&quot;&gt;Read more&lt;/a&gt;
   * @return autotranslateEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Autopilot, requires machine_translation_enabled. <a href=\"https://help.phrase.com/help/autopilot\">Read more</a>")

  public Boolean getAutotranslateEnabled() {
    return autotranslateEnabled;
  }


  public void setAutotranslateEnabled(Boolean autotranslateEnabled) {
    this.autotranslateEnabled = autotranslateEnabled;
  }


  public ProjectCreateParameters autotranslateCheckNewTranslationKeys(Boolean autotranslateCheckNewTranslationKeys) {
    
    this.autotranslateCheckNewTranslationKeys = autotranslateCheckNewTranslationKeys;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateCheckNewTranslationKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires autotranslate_enabled to be true")

  public Boolean getAutotranslateCheckNewTranslationKeys() {
    return autotranslateCheckNewTranslationKeys;
  }


  public void setAutotranslateCheckNewTranslationKeys(Boolean autotranslateCheckNewTranslationKeys) {
    this.autotranslateCheckNewTranslationKeys = autotranslateCheckNewTranslationKeys;
  }


  public ProjectCreateParameters autotranslateCheckNewUploads(Boolean autotranslateCheckNewUploads) {
    
    this.autotranslateCheckNewUploads = autotranslateCheckNewUploads;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateCheckNewUploads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires autotranslate_enabled to be true")

  public Boolean getAutotranslateCheckNewUploads() {
    return autotranslateCheckNewUploads;
  }


  public void setAutotranslateCheckNewUploads(Boolean autotranslateCheckNewUploads) {
    this.autotranslateCheckNewUploads = autotranslateCheckNewUploads;
  }


  public ProjectCreateParameters autotranslateCheckNewLocales(Boolean autotranslateCheckNewLocales) {
    
    this.autotranslateCheckNewLocales = autotranslateCheckNewLocales;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateCheckNewLocales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires autotranslate_enabled to be true")

  public Boolean getAutotranslateCheckNewLocales() {
    return autotranslateCheckNewLocales;
  }


  public void setAutotranslateCheckNewLocales(Boolean autotranslateCheckNewLocales) {
    this.autotranslateCheckNewLocales = autotranslateCheckNewLocales;
  }


  public ProjectCreateParameters autotranslateMarkAsUnverified(Boolean autotranslateMarkAsUnverified) {
    
    this.autotranslateMarkAsUnverified = autotranslateMarkAsUnverified;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateMarkAsUnverified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires autotranslate_enabled to be true")

  public Boolean getAutotranslateMarkAsUnverified() {
    return autotranslateMarkAsUnverified;
  }


  public void setAutotranslateMarkAsUnverified(Boolean autotranslateMarkAsUnverified) {
    this.autotranslateMarkAsUnverified = autotranslateMarkAsUnverified;
  }


  public ProjectCreateParameters autotranslateUseMachineTranslation(Boolean autotranslateUseMachineTranslation) {
    
    this.autotranslateUseMachineTranslation = autotranslateUseMachineTranslation;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateUseMachineTranslation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires autotranslate_enabled to be true")

  public Boolean getAutotranslateUseMachineTranslation() {
    return autotranslateUseMachineTranslation;
  }


  public void setAutotranslateUseMachineTranslation(Boolean autotranslateUseMachineTranslation) {
    this.autotranslateUseMachineTranslation = autotranslateUseMachineTranslation;
  }


  public ProjectCreateParameters autotranslateUseTranslationMemory(Boolean autotranslateUseTranslationMemory) {
    
    this.autotranslateUseTranslationMemory = autotranslateUseTranslationMemory;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateUseTranslationMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires autotranslate_enabled to be true")

  public Boolean getAutotranslateUseTranslationMemory() {
    return autotranslateUseTranslationMemory;
  }


  public void setAutotranslateUseTranslationMemory(Boolean autotranslateUseTranslationMemory) {
    this.autotranslateUseTranslationMemory = autotranslateUseTranslationMemory;
  }


  public ProjectCreateParameters smartSuggestEnabled(Boolean smartSuggestEnabled) {
    
    this.smartSuggestEnabled = smartSuggestEnabled;
    return this;
  }

   /**
   * (Optional) Smart Suggest, requires machine_translation_enabled
   * @return smartSuggestEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Smart Suggest, requires machine_translation_enabled")

  public Boolean getSmartSuggestEnabled() {
    return smartSuggestEnabled;
  }


  public void setSmartSuggestEnabled(Boolean smartSuggestEnabled) {
    this.smartSuggestEnabled = smartSuggestEnabled;
  }


  public ProjectCreateParameters smartSuggestUseGlossary(Boolean smartSuggestUseGlossary) {
    
    this.smartSuggestUseGlossary = smartSuggestUseGlossary;
    return this;
  }

   /**
   * (Optional) Requires smart_suggest_enabled to be true
   * @return smartSuggestUseGlossary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires smart_suggest_enabled to be true")

  public Boolean getSmartSuggestUseGlossary() {
    return smartSuggestUseGlossary;
  }


  public void setSmartSuggestUseGlossary(Boolean smartSuggestUseGlossary) {
    this.smartSuggestUseGlossary = smartSuggestUseGlossary;
  }


  public ProjectCreateParameters smartSuggestUseMachineTranslation(Boolean smartSuggestUseMachineTranslation) {
    
    this.smartSuggestUseMachineTranslation = smartSuggestUseMachineTranslation;
    return this;
  }

   /**
   * (Optional) Requires smart_suggest_enabled to be true
   * @return smartSuggestUseMachineTranslation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "(Optional) Requires smart_suggest_enabled to be true")

  public Boolean getSmartSuggestUseMachineTranslation() {
    return smartSuggestUseMachineTranslation;
  }


  public void setSmartSuggestUseMachineTranslation(Boolean smartSuggestUseMachineTranslation) {
    this.smartSuggestUseMachineTranslation = smartSuggestUseMachineTranslation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateParameters projectCreateParameters = (ProjectCreateParameters) o;
    return Objects.equals(this.name, projectCreateParameters.name) &&
        Objects.equals(this.mainFormat, projectCreateParameters.mainFormat) &&
        Objects.equals(this.sharesTranslationMemory, projectCreateParameters.sharesTranslationMemory) &&
        Objects.equals(this.projectImage, projectCreateParameters.projectImage) &&
        Objects.equals(this.removeProjectImage, projectCreateParameters.removeProjectImage) &&
        Objects.equals(this.accountId, projectCreateParameters.accountId) &&
        Objects.equals(this.sourceProjectId, projectCreateParameters.sourceProjectId) &&
        Objects.equals(this.workflow, projectCreateParameters.workflow) &&
        Objects.equals(this.machineTranslationEnabled, projectCreateParameters.machineTranslationEnabled) &&
        Objects.equals(this.enableBranching, projectCreateParameters.enableBranching) &&
        Objects.equals(this.protectMasterBranch, projectCreateParameters.protectMasterBranch) &&
        Objects.equals(this.enableAllDataTypeTranslationKeysForTranslators, projectCreateParameters.enableAllDataTypeTranslationKeysForTranslators) &&
        Objects.equals(this.enableIcuMessageFormat, projectCreateParameters.enableIcuMessageFormat) &&
        Objects.equals(this.zeroPluralFormEnabled, projectCreateParameters.zeroPluralFormEnabled) &&
        Objects.equals(this.autotranslateEnabled, projectCreateParameters.autotranslateEnabled) &&
        Objects.equals(this.autotranslateCheckNewTranslationKeys, projectCreateParameters.autotranslateCheckNewTranslationKeys) &&
        Objects.equals(this.autotranslateCheckNewUploads, projectCreateParameters.autotranslateCheckNewUploads) &&
        Objects.equals(this.autotranslateCheckNewLocales, projectCreateParameters.autotranslateCheckNewLocales) &&
        Objects.equals(this.autotranslateMarkAsUnverified, projectCreateParameters.autotranslateMarkAsUnverified) &&
        Objects.equals(this.autotranslateUseMachineTranslation, projectCreateParameters.autotranslateUseMachineTranslation) &&
        Objects.equals(this.autotranslateUseTranslationMemory, projectCreateParameters.autotranslateUseTranslationMemory) &&
        Objects.equals(this.smartSuggestEnabled, projectCreateParameters.smartSuggestEnabled) &&
        Objects.equals(this.smartSuggestUseGlossary, projectCreateParameters.smartSuggestUseGlossary) &&
        Objects.equals(this.smartSuggestUseMachineTranslation, projectCreateParameters.smartSuggestUseMachineTranslation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mainFormat, sharesTranslationMemory, projectImage, removeProjectImage, accountId, sourceProjectId, workflow, machineTranslationEnabled, enableBranching, protectMasterBranch, enableAllDataTypeTranslationKeysForTranslators, enableIcuMessageFormat, zeroPluralFormEnabled, autotranslateEnabled, autotranslateCheckNewTranslationKeys, autotranslateCheckNewUploads, autotranslateCheckNewLocales, autotranslateMarkAsUnverified, autotranslateUseMachineTranslation, autotranslateUseTranslationMemory, smartSuggestEnabled, smartSuggestUseGlossary, smartSuggestUseMachineTranslation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mainFormat: ").append(toIndentedString(mainFormat)).append("\n");
    sb.append("    sharesTranslationMemory: ").append(toIndentedString(sharesTranslationMemory)).append("\n");
    sb.append("    projectImage: ").append(toIndentedString(projectImage)).append("\n");
    sb.append("    removeProjectImage: ").append(toIndentedString(removeProjectImage)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    machineTranslationEnabled: ").append(toIndentedString(machineTranslationEnabled)).append("\n");
    sb.append("    enableBranching: ").append(toIndentedString(enableBranching)).append("\n");
    sb.append("    protectMasterBranch: ").append(toIndentedString(protectMasterBranch)).append("\n");
    sb.append("    enableAllDataTypeTranslationKeysForTranslators: ").append(toIndentedString(enableAllDataTypeTranslationKeysForTranslators)).append("\n");
    sb.append("    enableIcuMessageFormat: ").append(toIndentedString(enableIcuMessageFormat)).append("\n");
    sb.append("    zeroPluralFormEnabled: ").append(toIndentedString(zeroPluralFormEnabled)).append("\n");
    sb.append("    autotranslateEnabled: ").append(toIndentedString(autotranslateEnabled)).append("\n");
    sb.append("    autotranslateCheckNewTranslationKeys: ").append(toIndentedString(autotranslateCheckNewTranslationKeys)).append("\n");
    sb.append("    autotranslateCheckNewUploads: ").append(toIndentedString(autotranslateCheckNewUploads)).append("\n");
    sb.append("    autotranslateCheckNewLocales: ").append(toIndentedString(autotranslateCheckNewLocales)).append("\n");
    sb.append("    autotranslateMarkAsUnverified: ").append(toIndentedString(autotranslateMarkAsUnverified)).append("\n");
    sb.append("    autotranslateUseMachineTranslation: ").append(toIndentedString(autotranslateUseMachineTranslation)).append("\n");
    sb.append("    autotranslateUseTranslationMemory: ").append(toIndentedString(autotranslateUseTranslationMemory)).append("\n");
    sb.append("    smartSuggestEnabled: ").append(toIndentedString(smartSuggestEnabled)).append("\n");
    sb.append("    smartSuggestUseGlossary: ").append(toIndentedString(smartSuggestUseGlossary)).append("\n");
    sb.append("    smartSuggestUseMachineTranslation: ").append(toIndentedString(smartSuggestUseMachineTranslation)).append("\n");
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

