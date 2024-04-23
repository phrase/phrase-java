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
import com.phrase.client.model.CustomMetadataDataType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomMetadataPropertiesCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T09:18:16.513569Z[Etc/UTC]")
public class CustomMetadataPropertiesCreateParameters {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private CustomMetadataDataType dataType;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<String> projectIds;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VALUE_OPTIONS = "value_options";
  @SerializedName(SERIALIZED_NAME_VALUE_OPTIONS)
  private List<String> valueOptions;

  public CustomMetadataPropertiesCreateParameters() {
  }

  public CustomMetadataPropertiesCreateParameters name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the property
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomMetadataPropertiesCreateParameters dataType(CustomMetadataDataType dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nonnull

  public CustomMetadataDataType getDataType() {
    return dataType;
  }


  public void setDataType(CustomMetadataDataType dataType) {
    this.dataType = dataType;
  }


  public CustomMetadataPropertiesCreateParameters projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public CustomMetadataPropertiesCreateParameters addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * ids of projects that the property belongs to
   * @return projectIds
  **/
  @javax.annotation.Nullable

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  public CustomMetadataPropertiesCreateParameters description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description of property
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomMetadataPropertiesCreateParameters valueOptions(List<String> valueOptions) {
    
    this.valueOptions = valueOptions;
    return this;
  }

  public CustomMetadataPropertiesCreateParameters addValueOptionsItem(String valueOptionsItem) {
    if (this.valueOptions == null) {
      this.valueOptions = new ArrayList<>();
    }
    this.valueOptions.add(valueOptionsItem);
    return this;
  }

   /**
   * value options of property (only applies to single or multi select properties)
   * @return valueOptions
  **/
  @javax.annotation.Nullable

  public List<String> getValueOptions() {
    return valueOptions;
  }


  public void setValueOptions(List<String> valueOptions) {
    this.valueOptions = valueOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMetadataPropertiesCreateParameters customMetadataPropertiesCreateParameters = (CustomMetadataPropertiesCreateParameters) o;
    return Objects.equals(this.name, customMetadataPropertiesCreateParameters.name) &&
        Objects.equals(this.dataType, customMetadataPropertiesCreateParameters.dataType) &&
        Objects.equals(this.projectIds, customMetadataPropertiesCreateParameters.projectIds) &&
        Objects.equals(this.description, customMetadataPropertiesCreateParameters.description) &&
        Objects.equals(this.valueOptions, customMetadataPropertiesCreateParameters.valueOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dataType, projectIds, description, valueOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMetadataPropertiesCreateParameters {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    valueOptions: ").append(toIndentedString(valueOptions)).append("\n");
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

