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
import com.phrase.client.model.ProjectShort;
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomMetadataProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-13T13:34:41.741567Z[Etc/UTC]")
public class CustomMetadataProperty {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private CustomMetadataDataType dataType;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserPreview user;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<ProjectShort> projects;

  public static final String SERIALIZED_NAME_VALUE_OPTIONS = "value_options";
  @SerializedName(SERIALIZED_NAME_VALUE_OPTIONS)
  private List<String> valueOptions;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public CustomMetadataProperty() {
  }

  public CustomMetadataProperty id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomMetadataProperty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomMetadataProperty description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomMetadataProperty dataType(CustomMetadataDataType dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable

  public CustomMetadataDataType getDataType() {
    return dataType;
  }


  public void setDataType(CustomMetadataDataType dataType) {
    this.dataType = dataType;
  }


  public CustomMetadataProperty user(UserPreview user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public UserPreview getUser() {
    return user;
  }


  public void setUser(UserPreview user) {
    this.user = user;
  }


  public CustomMetadataProperty projects(List<ProjectShort> projects) {
    
    this.projects = projects;
    return this;
  }

  public CustomMetadataProperty addProjectsItem(ProjectShort projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @javax.annotation.Nullable

  public List<ProjectShort> getProjects() {
    return projects;
  }


  public void setProjects(List<ProjectShort> projects) {
    this.projects = projects;
  }


  public CustomMetadataProperty valueOptions(List<String> valueOptions) {
    
    this.valueOptions = valueOptions;
    return this;
  }

  public CustomMetadataProperty addValueOptionsItem(String valueOptionsItem) {
    if (this.valueOptions == null) {
      this.valueOptions = new ArrayList<>();
    }
    this.valueOptions.add(valueOptionsItem);
    return this;
  }

   /**
   * Get valueOptions
   * @return valueOptions
  **/
  @javax.annotation.Nullable

  public List<String> getValueOptions() {
    return valueOptions;
  }


  public void setValueOptions(List<String> valueOptions) {
    this.valueOptions = valueOptions;
  }


  public CustomMetadataProperty createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomMetadataProperty updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMetadataProperty customMetadataProperty = (CustomMetadataProperty) o;
    return Objects.equals(this.id, customMetadataProperty.id) &&
        Objects.equals(this.name, customMetadataProperty.name) &&
        Objects.equals(this.description, customMetadataProperty.description) &&
        Objects.equals(this.dataType, customMetadataProperty.dataType) &&
        Objects.equals(this.user, customMetadataProperty.user) &&
        Objects.equals(this.projects, customMetadataProperty.projects) &&
        Objects.equals(this.valueOptions, customMetadataProperty.valueOptions) &&
        Objects.equals(this.createdAt, customMetadataProperty.createdAt) &&
        Objects.equals(this.updatedAt, customMetadataProperty.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dataType, user, projects, valueOptions, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMetadataProperty {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    valueOptions: ").append(toIndentedString(valueOptions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

