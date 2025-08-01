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
 * AuthorizationUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T06:43:11.225647232Z[Etc/UTC]")
public class AuthorizationUpdateParameters {
  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public AuthorizationUpdateParameters() {
  }

  public AuthorizationUpdateParameters note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * A note to help you remember what the access is used for.
   * @return note
  **/
  @javax.annotation.Nullable

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public AuthorizationUpdateParameters scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public AuthorizationUpdateParameters addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * A list of scopes that the access can be used for.
   * @return scopes
  **/
  @javax.annotation.Nullable

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public AuthorizationUpdateParameters expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Expiration date for the authorization token. Null means no expiration date (default).
   * @return expiresAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationUpdateParameters authorizationUpdateParameters = (AuthorizationUpdateParameters) o;
    return Objects.equals(this.note, authorizationUpdateParameters.note) &&
        Objects.equals(this.scopes, authorizationUpdateParameters.scopes) &&
        Objects.equals(this.expiresAt, authorizationUpdateParameters.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, scopes, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationUpdateParameters {\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

