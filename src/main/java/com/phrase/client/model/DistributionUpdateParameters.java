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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DistributionUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-03T14:19:25.301772Z[Etc/UTC]")
public class DistributionUpdateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<String> platforms;

  public static final String SERIALIZED_NAME_LOCALE_IDS = "locale_ids";
  @SerializedName(SERIALIZED_NAME_LOCALE_IDS)
  private List<String> localeIds;

  public static final String SERIALIZED_NAME_FORMAT_OPTIONS = "format_options";
  @SerializedName(SERIALIZED_NAME_FORMAT_OPTIONS)
  private Map<String, String> formatOptions = new HashMap<>();

  public static final String SERIALIZED_NAME_FALLBACK_LOCALES_ENABLED = "fallback_locales_enabled";
  @SerializedName(SERIALIZED_NAME_FALLBACK_LOCALES_ENABLED)
  private Boolean fallbackLocalesEnabled;

  public static final String SERIALIZED_NAME_FALLBACK_TO_NON_REGIONAL_LOCALE = "fallback_to_non_regional_locale";
  @SerializedName(SERIALIZED_NAME_FALLBACK_TO_NON_REGIONAL_LOCALE)
  private Boolean fallbackToNonRegionalLocale;

  public static final String SERIALIZED_NAME_FALLBACK_TO_DEFAULT_LOCALE = "fallback_to_default_locale";
  @SerializedName(SERIALIZED_NAME_FALLBACK_TO_DEFAULT_LOCALE)
  private Boolean fallbackToDefaultLocale;

  public static final String SERIALIZED_NAME_USE_LAST_REVIEWED_VERSION = "use_last_reviewed_version";
  @SerializedName(SERIALIZED_NAME_USE_LAST_REVIEWED_VERSION)
  private Boolean useLastReviewedVersion;

  public DistributionUpdateParameters() {
  }

  public DistributionUpdateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the distribution
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DistributionUpdateParameters projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Project id the distribution should be assigned to.
   * @return projectId
  **/
  @javax.annotation.Nullable

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public DistributionUpdateParameters platforms(List<String> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public DistributionUpdateParameters addPlatformsItem(String platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * List of platforms the distribution should support.
   * @return platforms
  **/
  @javax.annotation.Nullable

  public List<String> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  public DistributionUpdateParameters localeIds(List<String> localeIds) {
    
    this.localeIds = localeIds;
    return this;
  }

  public DistributionUpdateParameters addLocaleIdsItem(String localeIdsItem) {
    if (this.localeIds == null) {
      this.localeIds = new ArrayList<>();
    }
    this.localeIds.add(localeIdsItem);
    return this;
  }

   /**
   * List of locale ids that will be part of distribution releases
   * @return localeIds
  **/
  @javax.annotation.Nullable

  public List<String> getLocaleIds() {
    return localeIds;
  }


  public void setLocaleIds(List<String> localeIds) {
    this.localeIds = localeIds;
  }


  public DistributionUpdateParameters formatOptions(Map<String, String> formatOptions) {
    
    this.formatOptions = formatOptions;
    return this;
  }

  public DistributionUpdateParameters putFormatOptionsItem(String key, String formatOptionsItem) {
    if (this.formatOptions == null) {
      this.formatOptions = new HashMap<>();
    }
    this.formatOptions.put(key, formatOptionsItem);
    return this;
  }

   /**
   * Additional formatting and render options. Only &lt;code&gt;enclose_in_cdata&lt;/code&gt; is available for platform &lt;code&gt;android&lt;/code&gt;.
   * @return formatOptions
  **/
  @javax.annotation.Nullable

  public Map<String, String> getFormatOptions() {
    return formatOptions;
  }


  public void setFormatOptions(Map<String, String> formatOptions) {
    this.formatOptions = formatOptions;
  }


  public DistributionUpdateParameters fallbackLocalesEnabled(Boolean fallbackLocalesEnabled) {
    
    this.fallbackLocalesEnabled = fallbackLocalesEnabled;
    return this;
  }

   /**
   * Use fallback locale if there is no translation in the current locale.
   * @return fallbackLocalesEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getFallbackLocalesEnabled() {
    return fallbackLocalesEnabled;
  }


  public void setFallbackLocalesEnabled(Boolean fallbackLocalesEnabled) {
    this.fallbackLocalesEnabled = fallbackLocalesEnabled;
  }


  public DistributionUpdateParameters fallbackToNonRegionalLocale(Boolean fallbackToNonRegionalLocale) {
    
    this.fallbackToNonRegionalLocale = fallbackToNonRegionalLocale;
    return this;
  }

   /**
   * Indicates whether to fallback to non regional locale when locale can not be found
   * @return fallbackToNonRegionalLocale
  **/
  @javax.annotation.Nullable

  public Boolean getFallbackToNonRegionalLocale() {
    return fallbackToNonRegionalLocale;
  }


  public void setFallbackToNonRegionalLocale(Boolean fallbackToNonRegionalLocale) {
    this.fallbackToNonRegionalLocale = fallbackToNonRegionalLocale;
  }


  public DistributionUpdateParameters fallbackToDefaultLocale(Boolean fallbackToDefaultLocale) {
    
    this.fallbackToDefaultLocale = fallbackToDefaultLocale;
    return this;
  }

   /**
   * Indicates whether to fallback to projects default locale when locale can not be found
   * @return fallbackToDefaultLocale
  **/
  @javax.annotation.Nullable

  public Boolean getFallbackToDefaultLocale() {
    return fallbackToDefaultLocale;
  }


  public void setFallbackToDefaultLocale(Boolean fallbackToDefaultLocale) {
    this.fallbackToDefaultLocale = fallbackToDefaultLocale;
  }


  public DistributionUpdateParameters useLastReviewedVersion(Boolean useLastReviewedVersion) {
    
    this.useLastReviewedVersion = useLastReviewedVersion;
    return this;
  }

   /**
   * Use last reviewed instead of latest translation in a project
   * @return useLastReviewedVersion
  **/
  @javax.annotation.Nullable

  public Boolean getUseLastReviewedVersion() {
    return useLastReviewedVersion;
  }


  public void setUseLastReviewedVersion(Boolean useLastReviewedVersion) {
    this.useLastReviewedVersion = useLastReviewedVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionUpdateParameters distributionUpdateParameters = (DistributionUpdateParameters) o;
    return Objects.equals(this.name, distributionUpdateParameters.name) &&
        Objects.equals(this.projectId, distributionUpdateParameters.projectId) &&
        Objects.equals(this.platforms, distributionUpdateParameters.platforms) &&
        Objects.equals(this.localeIds, distributionUpdateParameters.localeIds) &&
        Objects.equals(this.formatOptions, distributionUpdateParameters.formatOptions) &&
        Objects.equals(this.fallbackLocalesEnabled, distributionUpdateParameters.fallbackLocalesEnabled) &&
        Objects.equals(this.fallbackToNonRegionalLocale, distributionUpdateParameters.fallbackToNonRegionalLocale) &&
        Objects.equals(this.fallbackToDefaultLocale, distributionUpdateParameters.fallbackToDefaultLocale) &&
        Objects.equals(this.useLastReviewedVersion, distributionUpdateParameters.useLastReviewedVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId, platforms, localeIds, formatOptions, fallbackLocalesEnabled, fallbackToNonRegionalLocale, fallbackToDefaultLocale, useLastReviewedVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionUpdateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    localeIds: ").append(toIndentedString(localeIds)).append("\n");
    sb.append("    formatOptions: ").append(toIndentedString(formatOptions)).append("\n");
    sb.append("    fallbackLocalesEnabled: ").append(toIndentedString(fallbackLocalesEnabled)).append("\n");
    sb.append("    fallbackToNonRegionalLocale: ").append(toIndentedString(fallbackToNonRegionalLocale)).append("\n");
    sb.append("    fallbackToDefaultLocale: ").append(toIndentedString(fallbackToDefaultLocale)).append("\n");
    sb.append("    useLastReviewedVersion: ").append(toIndentedString(useLastReviewedVersion)).append("\n");
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

