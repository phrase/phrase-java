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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthorizationUpdateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-23T12:11:46.565072Z[Etc/UTC]")
public class AuthorizationUpdateParameters {
  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;


  public AuthorizationUpdateParameters note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * A note to help you remember what the access is used for.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Deploy Script", value = "A note to help you remember what the access is used for.")

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
  @ApiModelProperty(example = "[\"read\",\"write\"]", value = "A list of scopes that the access can be used for.")

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
  @ApiModelProperty(example = "2015-03-30T09:52:53Z", value = "Expiration date for the authorization token. Null means no expiration date (default).")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

