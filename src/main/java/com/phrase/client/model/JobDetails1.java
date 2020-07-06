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
import com.phrase.client.model.KeyPreview;
import com.phrase.client.model.LocalePreview;
import com.phrase.client.model.UserPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobDetails1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-06T11:25:33.271Z[Etc/UTC]")
public class JobDetails1 {
  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private UserPreview owner;

  public static final String SERIALIZED_NAME_JOB_TAG_NAME = "job_tag_name";
  @SerializedName(SERIALIZED_NAME_JOB_TAG_NAME)
  private String jobTagName;

  public static final String SERIALIZED_NAME_LOCALES = "locales";
  @SerializedName(SERIALIZED_NAME_LOCALES)
  private List<LocalePreview> locales = null;

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<KeyPreview> keys = null;


  public JobDetails1 owner(UserPreview owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserPreview getOwner() {
    return owner;
  }


  public void setOwner(UserPreview owner) {
    this.owner = owner;
  }


  public JobDetails1 jobTagName(String jobTagName) {
    
    this.jobTagName = jobTagName;
    return this;
  }

   /**
   * Get jobTagName
   * @return jobTagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobTagName() {
    return jobTagName;
  }


  public void setJobTagName(String jobTagName) {
    this.jobTagName = jobTagName;
  }


  public JobDetails1 locales(List<LocalePreview> locales) {
    
    this.locales = locales;
    return this;
  }

  public JobDetails1 addLocalesItem(LocalePreview localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

   /**
   * Get locales
   * @return locales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LocalePreview> getLocales() {
    return locales;
  }


  public void setLocales(List<LocalePreview> locales) {
    this.locales = locales;
  }


  public JobDetails1 keys(List<KeyPreview> keys) {
    
    this.keys = keys;
    return this;
  }

  public JobDetails1 addKeysItem(KeyPreview keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyPreview> getKeys() {
    return keys;
  }


  public void setKeys(List<KeyPreview> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetails1 jobDetails1 = (JobDetails1) o;
    return Objects.equals(this.owner, jobDetails1.owner) &&
        Objects.equals(this.jobTagName, jobDetails1.jobTagName) &&
        Objects.equals(this.locales, jobDetails1.locales) &&
        Objects.equals(this.keys, jobDetails1.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, jobTagName, locales, keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetails1 {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    jobTagName: ").append(toIndentedString(jobTagName)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

