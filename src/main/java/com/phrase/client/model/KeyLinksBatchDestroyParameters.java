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
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * KeyLinksBatchDestroyParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-06T09:19:59.383351363Z[Etc/UTC]")
public class KeyLinksBatchDestroyParameters {
  public static final String SERIALIZED_NAME_CHILD_KEY_IDS = "child_key_ids";
  @SerializedName(SERIALIZED_NAME_CHILD_KEY_IDS)
  private List<String> childKeyIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_UNLINK_PARENT = "unlink_parent";
  @SerializedName(SERIALIZED_NAME_UNLINK_PARENT)
  private Boolean unlinkParent = false;

  public KeyLinksBatchDestroyParameters() {
  }

  public KeyLinksBatchDestroyParameters childKeyIds(List<String> childKeyIds) {
    
    this.childKeyIds = childKeyIds;
    return this;
  }

  public KeyLinksBatchDestroyParameters addChildKeyIdsItem(String childKeyIdsItem) {
    if (this.childKeyIds == null) {
      this.childKeyIds = new ArrayList<>();
    }
    this.childKeyIds.add(childKeyIdsItem);
    return this;
  }

   /**
   * The IDs of the child keys to unlink from the parent key.
   * @return childKeyIds
  **/
  @javax.annotation.Nonnull

  public List<String> getChildKeyIds() {
    return childKeyIds;
  }


  public void setChildKeyIds(List<String> childKeyIds) {
    this.childKeyIds = childKeyIds;
  }


  public KeyLinksBatchDestroyParameters unlinkParent(Boolean unlinkParent) {
    
    this.unlinkParent = unlinkParent;
    return this;
  }

   /**
   * Whether to unlink the parent key as well and unmark it as linked-key.
   * @return unlinkParent
  **/
  @javax.annotation.Nullable

  public Boolean getUnlinkParent() {
    return unlinkParent;
  }


  public void setUnlinkParent(Boolean unlinkParent) {
    this.unlinkParent = unlinkParent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyLinksBatchDestroyParameters keyLinksBatchDestroyParameters = (KeyLinksBatchDestroyParameters) o;
    return Objects.equals(this.childKeyIds, keyLinksBatchDestroyParameters.childKeyIds) &&
        Objects.equals(this.unlinkParent, keyLinksBatchDestroyParameters.unlinkParent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childKeyIds, unlinkParent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyLinksBatchDestroyParameters {\n");
    sb.append("    childKeyIds: ").append(toIndentedString(childKeyIds)).append("\n");
    sb.append("    unlinkParent: ").append(toIndentedString(unlinkParent)).append("\n");
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

