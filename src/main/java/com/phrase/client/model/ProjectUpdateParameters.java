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
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProjectUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T11:19:38.214546240Z[Etc/UTC]")
public class ProjectUpdateParameters {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POINT_OF_CONTACT = "point_of_contact";
  @SerializedName(SERIALIZED_NAME_POINT_OF_CONTACT)
  private String pointOfContact;

  public static final String SERIALIZED_NAME_MAIN_FORMAT = "main_format";
  @SerializedName(SERIALIZED_NAME_MAIN_FORMAT)
  private String mainFormat;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private String media;

  public static final String SERIALIZED_NAME_SHARES_TRANSLATION_MEMORY = "shares_translation_memory";
  @SerializedName(SERIALIZED_NAME_SHARES_TRANSLATION_MEMORY)
  private Boolean sharesTranslationMemory;

  public static final String SERIALIZED_NAME_PROJECT_IMAGE = "project_image";
  @SerializedName(SERIALIZED_NAME_PROJECT_IMAGE)
  private File projectImage;

  public static final String SERIALIZED_NAME_REMOVE_PROJECT_IMAGE = "remove_project_image";
  @SerializedName(SERIALIZED_NAME_REMOVE_PROJECT_IMAGE)
  private Boolean removeProjectImage;

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

  /**
   * (Optional) Sets the default encoding for Uploads. If you leave it empty, we will try to guess it automatically for you when you Upload a file. You can still override this value by setting the &lt;a href&#x3D;&#39;#post-/projects/-project_id-/uploads&#39;&gt;&#x60;file_encoding&#x60;&lt;/a&gt; parameter for Uploads.
   */
  @JsonAdapter(DefaultEncodingEnum.Adapter.class)
  public enum DefaultEncodingEnum {
    UTF_8("UTF-8"),
    
    UTF_16("UTF-16"),
    
    UTF_16BE("UTF-16BE"),
    
    UTF_16LE("UTF-16LE"),
    
    ISO_8859_1("ISO-8859-1");

    private String value;

    DefaultEncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultEncodingEnum fromValue(String value) {
      for (DefaultEncodingEnum b : DefaultEncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultEncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultEncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultEncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultEncodingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_ENCODING = "default_encoding";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ENCODING)
  private DefaultEncodingEnum defaultEncoding;

  public ProjectUpdateParameters() {
  }

  public ProjectUpdateParameters accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Required if the requesting user is a member of multiple accounts. Account ID to specify the actual account the project should be created in.
   * @return accountId
  **/
  @javax.annotation.Nullable

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProjectUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * (Optional) Name of the project
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectUpdateParameters pointOfContact(String pointOfContact) {
    
    this.pointOfContact = pointOfContact;
    return this;
  }

   /**
   * (Optional) User ID of the point of contact for the project. Pass &#x60;null&#x60; to unset.
   * @return pointOfContact
  **/
  @javax.annotation.Nullable

  public String getPointOfContact() {
    return pointOfContact;
  }


  public void setPointOfContact(String pointOfContact) {
    this.pointOfContact = pointOfContact;
  }


  public ProjectUpdateParameters mainFormat(String mainFormat) {
    
    this.mainFormat = mainFormat;
    return this;
  }

   /**
   * (Optional) Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/sections/6111343326364\&quot;&gt;Format Guide&lt;/a&gt; or our &lt;a href&#x3D;\&quot;#formats\&quot;&gt;Formats API Endpoint&lt;/a&gt;.
   * @return mainFormat
  **/
  @javax.annotation.Nullable

  public String getMainFormat() {
    return mainFormat;
  }


  public void setMainFormat(String mainFormat) {
    this.mainFormat = mainFormat;
  }


  public ProjectUpdateParameters media(String media) {
    
    this.media = media;
    return this;
  }

   /**
   * (Optional) Main technology stack used in the project. It affects for example the suggested placeholder style. Predefined values include: &#x60;Ruby&#x60;, &#x60;JavaScript&#x60;, &#x60;AngularJS&#x60;, &#x60;React&#x60;, &#x60;iOS&#x60;, &#x60;Android&#x60;, &#x60;Python&#x60;, &#x60;PHP&#x60;, &#x60;Java&#x60;, &#x60;Go&#x60;, &#x60;Windows Phone&#x60;, &#x60;Rails&#x60;, &#x60;Node.js&#x60;, &#x60;.NET&#x60;, &#x60;Django&#x60;, &#x60;Symfony&#x60;, &#x60;Yii Framework&#x60;, &#x60;Zend Framework&#x60;, &#x60;Apple App Store Description&#x60;, &#x60;Google Play Description&#x60;, but it can also take any other value.
   * @return media
  **/
  @javax.annotation.Nullable

  public String getMedia() {
    return media;
  }


  public void setMedia(String media) {
    this.media = media;
  }


  public ProjectUpdateParameters sharesTranslationMemory(Boolean sharesTranslationMemory) {
    
    this.sharesTranslationMemory = sharesTranslationMemory;
    return this;
  }

   /**
   * (Optional) Indicates whether the project should share the account&#39;s translation memory
   * @return sharesTranslationMemory
  **/
  @javax.annotation.Nullable

  public Boolean getSharesTranslationMemory() {
    return sharesTranslationMemory;
  }


  public void setSharesTranslationMemory(Boolean sharesTranslationMemory) {
    this.sharesTranslationMemory = sharesTranslationMemory;
  }


  public ProjectUpdateParameters projectImage(File projectImage) {
    
    this.projectImage = projectImage;
    return this;
  }

   /**
   * (Optional) Image to identify the project
   * @return projectImage
  **/
  @javax.annotation.Nullable

  public File getProjectImage() {
    return projectImage;
  }


  public void setProjectImage(File projectImage) {
    this.projectImage = projectImage;
  }


  public ProjectUpdateParameters removeProjectImage(Boolean removeProjectImage) {
    
    this.removeProjectImage = removeProjectImage;
    return this;
  }

   /**
   * (Optional) Indicates whether the project image should be deleted.
   * @return removeProjectImage
  **/
  @javax.annotation.Nullable

  public Boolean getRemoveProjectImage() {
    return removeProjectImage;
  }


  public void setRemoveProjectImage(Boolean removeProjectImage) {
    this.removeProjectImage = removeProjectImage;
  }


  public ProjectUpdateParameters workflow(String workflow) {
    
    this.workflow = workflow;
    return this;
  }

   /**
   * (Optional) Review Workflow. \&quot;simple\&quot; / \&quot;review\&quot;. &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5784094755484\&quot;&gt;Read more&lt;/a&gt;
   * @return workflow
  **/
  @javax.annotation.Nullable

  public String getWorkflow() {
    return workflow;
  }


  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }


  public ProjectUpdateParameters machineTranslationEnabled(Boolean machineTranslationEnabled) {
    
    this.machineTranslationEnabled = machineTranslationEnabled;
    return this;
  }

   /**
   * (Optional) Enable machine translation support in the project. Required for Pre-Translation
   * @return machineTranslationEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getMachineTranslationEnabled() {
    return machineTranslationEnabled;
  }


  public void setMachineTranslationEnabled(Boolean machineTranslationEnabled) {
    this.machineTranslationEnabled = machineTranslationEnabled;
  }


  public ProjectUpdateParameters enableBranching(Boolean enableBranching) {
    
    this.enableBranching = enableBranching;
    return this;
  }

   /**
   * (Optional) Enable branching in the project
   * @return enableBranching
  **/
  @javax.annotation.Nullable

  public Boolean getEnableBranching() {
    return enableBranching;
  }


  public void setEnableBranching(Boolean enableBranching) {
    this.enableBranching = enableBranching;
  }


  public ProjectUpdateParameters protectMasterBranch(Boolean protectMasterBranch) {
    
    this.protectMasterBranch = protectMasterBranch;
    return this;
  }

   /**
   * (Optional) Protect the master branch in project where branching is enabled
   * @return protectMasterBranch
  **/
  @javax.annotation.Nullable

  public Boolean getProtectMasterBranch() {
    return protectMasterBranch;
  }


  public void setProtectMasterBranch(Boolean protectMasterBranch) {
    this.protectMasterBranch = protectMasterBranch;
  }


  public ProjectUpdateParameters enableAllDataTypeTranslationKeysForTranslators(Boolean enableAllDataTypeTranslationKeysForTranslators) {
    
    this.enableAllDataTypeTranslationKeysForTranslators = enableAllDataTypeTranslationKeysForTranslators;
    return this;
  }

   /**
   * (Optional) Otherwise, translators are not allowed to edit translations other than strings
   * @return enableAllDataTypeTranslationKeysForTranslators
  **/
  @javax.annotation.Nullable

  public Boolean getEnableAllDataTypeTranslationKeysForTranslators() {
    return enableAllDataTypeTranslationKeysForTranslators;
  }


  public void setEnableAllDataTypeTranslationKeysForTranslators(Boolean enableAllDataTypeTranslationKeysForTranslators) {
    this.enableAllDataTypeTranslationKeysForTranslators = enableAllDataTypeTranslationKeysForTranslators;
  }


  public ProjectUpdateParameters enableIcuMessageFormat(Boolean enableIcuMessageFormat) {
    
    this.enableIcuMessageFormat = enableIcuMessageFormat;
    return this;
  }

   /**
   * (Optional) We can validate and highlight your ICU messages. &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5822319545116\&quot;&gt;Read more&lt;/a&gt;
   * @return enableIcuMessageFormat
  **/
  @javax.annotation.Nullable

  public Boolean getEnableIcuMessageFormat() {
    return enableIcuMessageFormat;
  }


  public void setEnableIcuMessageFormat(Boolean enableIcuMessageFormat) {
    this.enableIcuMessageFormat = enableIcuMessageFormat;
  }


  public ProjectUpdateParameters zeroPluralFormEnabled(Boolean zeroPluralFormEnabled) {
    
    this.zeroPluralFormEnabled = zeroPluralFormEnabled;
    return this;
  }

   /**
   * (Optional) Displays the input fields for the &#39;ZERO&#39; plural form for every key as well although only some languages require the &#39;ZERO&#39; explicitly.
   * @return zeroPluralFormEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getZeroPluralFormEnabled() {
    return zeroPluralFormEnabled;
  }


  public void setZeroPluralFormEnabled(Boolean zeroPluralFormEnabled) {
    this.zeroPluralFormEnabled = zeroPluralFormEnabled;
  }


  public ProjectUpdateParameters autotranslateEnabled(Boolean autotranslateEnabled) {
    
    this.autotranslateEnabled = autotranslateEnabled;
    return this;
  }

   /**
   * (Optional) Autopilot, requires machine_translation_enabled. &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5822187934364\&quot;&gt;Read more&lt;/a&gt;
   * @return autotranslateEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateEnabled() {
    return autotranslateEnabled;
  }


  public void setAutotranslateEnabled(Boolean autotranslateEnabled) {
    this.autotranslateEnabled = autotranslateEnabled;
  }


  public ProjectUpdateParameters autotranslateCheckNewTranslationKeys(Boolean autotranslateCheckNewTranslationKeys) {
    
    this.autotranslateCheckNewTranslationKeys = autotranslateCheckNewTranslationKeys;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateCheckNewTranslationKeys
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateCheckNewTranslationKeys() {
    return autotranslateCheckNewTranslationKeys;
  }


  public void setAutotranslateCheckNewTranslationKeys(Boolean autotranslateCheckNewTranslationKeys) {
    this.autotranslateCheckNewTranslationKeys = autotranslateCheckNewTranslationKeys;
  }


  public ProjectUpdateParameters autotranslateCheckNewUploads(Boolean autotranslateCheckNewUploads) {
    
    this.autotranslateCheckNewUploads = autotranslateCheckNewUploads;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateCheckNewUploads
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateCheckNewUploads() {
    return autotranslateCheckNewUploads;
  }


  public void setAutotranslateCheckNewUploads(Boolean autotranslateCheckNewUploads) {
    this.autotranslateCheckNewUploads = autotranslateCheckNewUploads;
  }


  public ProjectUpdateParameters autotranslateCheckNewLocales(Boolean autotranslateCheckNewLocales) {
    
    this.autotranslateCheckNewLocales = autotranslateCheckNewLocales;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateCheckNewLocales
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateCheckNewLocales() {
    return autotranslateCheckNewLocales;
  }


  public void setAutotranslateCheckNewLocales(Boolean autotranslateCheckNewLocales) {
    this.autotranslateCheckNewLocales = autotranslateCheckNewLocales;
  }


  public ProjectUpdateParameters autotranslateMarkAsUnverified(Boolean autotranslateMarkAsUnverified) {
    
    this.autotranslateMarkAsUnverified = autotranslateMarkAsUnverified;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateMarkAsUnverified
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateMarkAsUnverified() {
    return autotranslateMarkAsUnverified;
  }


  public void setAutotranslateMarkAsUnverified(Boolean autotranslateMarkAsUnverified) {
    this.autotranslateMarkAsUnverified = autotranslateMarkAsUnverified;
  }


  public ProjectUpdateParameters autotranslateUseMachineTranslation(Boolean autotranslateUseMachineTranslation) {
    
    this.autotranslateUseMachineTranslation = autotranslateUseMachineTranslation;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateUseMachineTranslation
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateUseMachineTranslation() {
    return autotranslateUseMachineTranslation;
  }


  public void setAutotranslateUseMachineTranslation(Boolean autotranslateUseMachineTranslation) {
    this.autotranslateUseMachineTranslation = autotranslateUseMachineTranslation;
  }


  public ProjectUpdateParameters autotranslateUseTranslationMemory(Boolean autotranslateUseTranslationMemory) {
    
    this.autotranslateUseTranslationMemory = autotranslateUseTranslationMemory;
    return this;
  }

   /**
   * (Optional) Requires autotranslate_enabled to be true
   * @return autotranslateUseTranslationMemory
  **/
  @javax.annotation.Nullable

  public Boolean getAutotranslateUseTranslationMemory() {
    return autotranslateUseTranslationMemory;
  }


  public void setAutotranslateUseTranslationMemory(Boolean autotranslateUseTranslationMemory) {
    this.autotranslateUseTranslationMemory = autotranslateUseTranslationMemory;
  }


  public ProjectUpdateParameters defaultEncoding(DefaultEncodingEnum defaultEncoding) {
    
    this.defaultEncoding = defaultEncoding;
    return this;
  }

   /**
   * (Optional) Sets the default encoding for Uploads. If you leave it empty, we will try to guess it automatically for you when you Upload a file. You can still override this value by setting the &lt;a href&#x3D;&#39;#post-/projects/-project_id-/uploads&#39;&gt;&#x60;file_encoding&#x60;&lt;/a&gt; parameter for Uploads.
   * @return defaultEncoding
  **/
  @javax.annotation.Nullable

  public DefaultEncodingEnum getDefaultEncoding() {
    return defaultEncoding;
  }


  public void setDefaultEncoding(DefaultEncodingEnum defaultEncoding) {
    this.defaultEncoding = defaultEncoding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateParameters projectUpdateParameters = (ProjectUpdateParameters) o;
    return Objects.equals(this.accountId, projectUpdateParameters.accountId) &&
        Objects.equals(this.name, projectUpdateParameters.name) &&
        Objects.equals(this.pointOfContact, projectUpdateParameters.pointOfContact) &&
        Objects.equals(this.mainFormat, projectUpdateParameters.mainFormat) &&
        Objects.equals(this.media, projectUpdateParameters.media) &&
        Objects.equals(this.sharesTranslationMemory, projectUpdateParameters.sharesTranslationMemory) &&
        Objects.equals(this.projectImage, projectUpdateParameters.projectImage) &&
        Objects.equals(this.removeProjectImage, projectUpdateParameters.removeProjectImage) &&
        Objects.equals(this.workflow, projectUpdateParameters.workflow) &&
        Objects.equals(this.machineTranslationEnabled, projectUpdateParameters.machineTranslationEnabled) &&
        Objects.equals(this.enableBranching, projectUpdateParameters.enableBranching) &&
        Objects.equals(this.protectMasterBranch, projectUpdateParameters.protectMasterBranch) &&
        Objects.equals(this.enableAllDataTypeTranslationKeysForTranslators, projectUpdateParameters.enableAllDataTypeTranslationKeysForTranslators) &&
        Objects.equals(this.enableIcuMessageFormat, projectUpdateParameters.enableIcuMessageFormat) &&
        Objects.equals(this.zeroPluralFormEnabled, projectUpdateParameters.zeroPluralFormEnabled) &&
        Objects.equals(this.autotranslateEnabled, projectUpdateParameters.autotranslateEnabled) &&
        Objects.equals(this.autotranslateCheckNewTranslationKeys, projectUpdateParameters.autotranslateCheckNewTranslationKeys) &&
        Objects.equals(this.autotranslateCheckNewUploads, projectUpdateParameters.autotranslateCheckNewUploads) &&
        Objects.equals(this.autotranslateCheckNewLocales, projectUpdateParameters.autotranslateCheckNewLocales) &&
        Objects.equals(this.autotranslateMarkAsUnverified, projectUpdateParameters.autotranslateMarkAsUnverified) &&
        Objects.equals(this.autotranslateUseMachineTranslation, projectUpdateParameters.autotranslateUseMachineTranslation) &&
        Objects.equals(this.autotranslateUseTranslationMemory, projectUpdateParameters.autotranslateUseTranslationMemory) &&
        Objects.equals(this.defaultEncoding, projectUpdateParameters.defaultEncoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, pointOfContact, mainFormat, media, sharesTranslationMemory, projectImage, removeProjectImage, workflow, machineTranslationEnabled, enableBranching, protectMasterBranch, enableAllDataTypeTranslationKeysForTranslators, enableIcuMessageFormat, zeroPluralFormEnabled, autotranslateEnabled, autotranslateCheckNewTranslationKeys, autotranslateCheckNewUploads, autotranslateCheckNewLocales, autotranslateMarkAsUnverified, autotranslateUseMachineTranslation, autotranslateUseTranslationMemory, defaultEncoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateParameters {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pointOfContact: ").append(toIndentedString(pointOfContact)).append("\n");
    sb.append("    mainFormat: ").append(toIndentedString(mainFormat)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    sharesTranslationMemory: ").append(toIndentedString(sharesTranslationMemory)).append("\n");
    sb.append("    projectImage: ").append(toIndentedString(projectImage)).append("\n");
    sb.append("    removeProjectImage: ").append(toIndentedString(removeProjectImage)).append("\n");
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
    sb.append("    defaultEncoding: ").append(toIndentedString(defaultEncoding)).append("\n");
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

