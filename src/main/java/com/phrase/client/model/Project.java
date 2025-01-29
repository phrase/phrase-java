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
import com.phrase.client.model.Account;
import com.phrase.client.model.Space1;
import com.phrase.client.model.UserPreview;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Project
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-29T15:15:40.351400890Z[Etc/UTC]")
public class Project {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_MAIN_FORMAT = "main_format";
  @SerializedName(SERIALIZED_NAME_MAIN_FORMAT)
  private String mainFormat;

  public static final String SERIALIZED_NAME_PROJECT_IMAGE_URL = "project_image_url";
  @SerializedName(SERIALIZED_NAME_PROJECT_IMAGE_URL)
  private String projectImageUrl;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private String media;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_SPACE = "space";
  @SerializedName(SERIALIZED_NAME_SPACE)
  private Space1 space;

  public static final String SERIALIZED_NAME_POINT_OF_CONTACT = "point_of_contact";
  @SerializedName(SERIALIZED_NAME_POINT_OF_CONTACT)
  private UserPreview pointOfContact;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Project() {
  }

  public Project id(String id) {
    
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


  public Project name(String name) {
    
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


  public Project slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public Project mainFormat(String mainFormat) {
    
    this.mainFormat = mainFormat;
    return this;
  }

   /**
   * Get mainFormat
   * @return mainFormat
  **/
  @javax.annotation.Nullable

  public String getMainFormat() {
    return mainFormat;
  }


  public void setMainFormat(String mainFormat) {
    this.mainFormat = mainFormat;
  }


  public Project projectImageUrl(String projectImageUrl) {
    
    this.projectImageUrl = projectImageUrl;
    return this;
  }

   /**
   * Get projectImageUrl
   * @return projectImageUrl
  **/
  @javax.annotation.Nullable

  public String getProjectImageUrl() {
    return projectImageUrl;
  }


  public void setProjectImageUrl(String projectImageUrl) {
    this.projectImageUrl = projectImageUrl;
  }


  public Project media(String media) {
    
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable

  public String getMedia() {
    return media;
  }


  public void setMedia(String media) {
    this.media = media;
  }


  public Project account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    this.account = account;
  }


  public Project space(Space1 space) {
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nullable

  public Space1 getSpace() {
    return space;
  }


  public void setSpace(Space1 space) {
    this.space = space;
  }


  public Project pointOfContact(UserPreview pointOfContact) {
    
    this.pointOfContact = pointOfContact;
    return this;
  }

   /**
   * Get pointOfContact
   * @return pointOfContact
  **/
  @javax.annotation.Nullable

  public UserPreview getPointOfContact() {
    return pointOfContact;
  }


  public void setPointOfContact(UserPreview pointOfContact) {
    this.pointOfContact = pointOfContact;
  }


  public Project createdAt(OffsetDateTime createdAt) {
    
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


  public Project updatedAt(OffsetDateTime updatedAt) {
    
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
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.slug, project.slug) &&
        Objects.equals(this.mainFormat, project.mainFormat) &&
        Objects.equals(this.projectImageUrl, project.projectImageUrl) &&
        Objects.equals(this.media, project.media) &&
        Objects.equals(this.account, project.account) &&
        Objects.equals(this.space, project.space) &&
        Objects.equals(this.pointOfContact, project.pointOfContact) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.updatedAt, project.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, mainFormat, projectImageUrl, media, account, space, pointOfContact, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    mainFormat: ").append(toIndentedString(mainFormat)).append("\n");
    sb.append("    projectImageUrl: ").append(toIndentedString(projectImageUrl)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    pointOfContact: ").append(toIndentedString(pointOfContact)).append("\n");
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

