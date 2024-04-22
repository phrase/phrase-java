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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AuthorizationWithToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T07:19:18.171014Z[Etc/UTC]")
public class AuthorizationWithToken {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_TOKEN_LAST_EIGHT = "token_last_eight";
  @SerializedName(SERIALIZED_NAME_TOKEN_LAST_EIGHT)
  private String tokenLastEight;

  public static final String SERIALIZED_NAME_HASHED_TOKEN = "hashed_token";
  @SerializedName(SERIALIZED_NAME_HASHED_TOKEN)
  private String hashedToken;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public AuthorizationWithToken() {
  }

  public AuthorizationWithToken id(String id) {
    
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


  public AuthorizationWithToken note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public AuthorizationWithToken tokenLastEight(String tokenLastEight) {
    
    this.tokenLastEight = tokenLastEight;
    return this;
  }

   /**
   * Get tokenLastEight
   * @return tokenLastEight
  **/
  @javax.annotation.Nullable

  public String getTokenLastEight() {
    return tokenLastEight;
  }


  public void setTokenLastEight(String tokenLastEight) {
    this.tokenLastEight = tokenLastEight;
  }


  public AuthorizationWithToken hashedToken(String hashedToken) {
    
    this.hashedToken = hashedToken;
    return this;
  }

   /**
   * Get hashedToken
   * @return hashedToken
  **/
  @javax.annotation.Nullable

  public String getHashedToken() {
    return hashedToken;
  }


  public void setHashedToken(String hashedToken) {
    this.hashedToken = hashedToken;
  }


  public AuthorizationWithToken scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public AuthorizationWithToken addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public AuthorizationWithToken expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public AuthorizationWithToken createdAt(OffsetDateTime createdAt) {
    
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


  public AuthorizationWithToken updatedAt(OffsetDateTime updatedAt) {
    
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


  public AuthorizationWithToken token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationWithToken authorizationWithToken = (AuthorizationWithToken) o;
    return Objects.equals(this.id, authorizationWithToken.id) &&
        Objects.equals(this.note, authorizationWithToken.note) &&
        Objects.equals(this.tokenLastEight, authorizationWithToken.tokenLastEight) &&
        Objects.equals(this.hashedToken, authorizationWithToken.hashedToken) &&
        Objects.equals(this.scopes, authorizationWithToken.scopes) &&
        Objects.equals(this.expiresAt, authorizationWithToken.expiresAt) &&
        Objects.equals(this.createdAt, authorizationWithToken.createdAt) &&
        Objects.equals(this.updatedAt, authorizationWithToken.updatedAt) &&
        Objects.equals(this.token, authorizationWithToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, note, tokenLastEight, hashedToken, scopes, expiresAt, createdAt, updatedAt, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationWithToken {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    tokenLastEight: ").append(toIndentedString(tokenLastEight)).append("\n");
    sb.append("    hashedToken: ").append(toIndentedString(hashedToken)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

