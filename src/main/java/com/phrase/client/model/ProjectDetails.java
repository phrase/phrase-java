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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.phrase.client.model.Account;
import com.phrase.client.model.Project;
import com.phrase.client.model.ProjectDetails1;
import com.phrase.client.model.Space1;
import com.phrase.client.model.UserPreview;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * ProjectDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-23T13:43:41.769776Z[Etc/UTC]")
public class ProjectDetails {
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

  public static final String SERIALIZED_NAME_SHARES_TRANSLATION_MEMORY = "shares_translation_memory";
  @SerializedName(SERIALIZED_NAME_SHARES_TRANSLATION_MEMORY)
  private Boolean sharesTranslationMemory;


  public ProjectDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProjectDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectDetails slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public ProjectDetails mainFormat(String mainFormat) {
    
    this.mainFormat = mainFormat;
    return this;
  }

   /**
   * Get mainFormat
   * @return mainFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMainFormat() {
    return mainFormat;
  }


  public void setMainFormat(String mainFormat) {
    this.mainFormat = mainFormat;
  }


  public ProjectDetails projectImageUrl(String projectImageUrl) {
    
    this.projectImageUrl = projectImageUrl;
    return this;
  }

   /**
   * Get projectImageUrl
   * @return projectImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectImageUrl() {
    return projectImageUrl;
  }


  public void setProjectImageUrl(String projectImageUrl) {
    this.projectImageUrl = projectImageUrl;
  }


  public ProjectDetails media(String media) {
    
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMedia() {
    return media;
  }


  public void setMedia(String media) {
    this.media = media;
  }


  public ProjectDetails account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    this.account = account;
  }


  public ProjectDetails space(Space1 space) {
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Space1 getSpace() {
    return space;
  }


  public void setSpace(Space1 space) {
    this.space = space;
  }


  public ProjectDetails pointOfContact(UserPreview pointOfContact) {
    
    this.pointOfContact = pointOfContact;
    return this;
  }

   /**
   * Get pointOfContact
   * @return pointOfContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserPreview getPointOfContact() {
    return pointOfContact;
  }


  public void setPointOfContact(UserPreview pointOfContact) {
    this.pointOfContact = pointOfContact;
  }


  public ProjectDetails createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ProjectDetails updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ProjectDetails sharesTranslationMemory(Boolean sharesTranslationMemory) {
    
    this.sharesTranslationMemory = sharesTranslationMemory;
    return this;
  }

   /**
   * Get sharesTranslationMemory
   * @return sharesTranslationMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSharesTranslationMemory() {
    return sharesTranslationMemory;
  }


  public void setSharesTranslationMemory(Boolean sharesTranslationMemory) {
    this.sharesTranslationMemory = sharesTranslationMemory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetails projectDetails = (ProjectDetails) o;
    return Objects.equals(this.id, projectDetails.id) &&
        Objects.equals(this.name, projectDetails.name) &&
        Objects.equals(this.slug, projectDetails.slug) &&
        Objects.equals(this.mainFormat, projectDetails.mainFormat) &&
        Objects.equals(this.projectImageUrl, projectDetails.projectImageUrl) &&
        Objects.equals(this.media, projectDetails.media) &&
        Objects.equals(this.account, projectDetails.account) &&
        Objects.equals(this.space, projectDetails.space) &&
        Objects.equals(this.pointOfContact, projectDetails.pointOfContact) &&
        Objects.equals(this.createdAt, projectDetails.createdAt) &&
        Objects.equals(this.updatedAt, projectDetails.updatedAt) &&
        Objects.equals(this.sharesTranslationMemory, projectDetails.sharesTranslationMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, slug, mainFormat, projectImageUrl, media, account, space, pointOfContact, createdAt, updatedAt, sharesTranslationMemory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetails {\n");
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
    sb.append("    sharesTranslationMemory: ").append(toIndentedString(sharesTranslationMemory)).append("\n");
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

