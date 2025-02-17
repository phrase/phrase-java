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
 * KeyLinksCreateParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-17T08:54:37.526605703Z[Etc/UTC]")
public class KeyLinksCreateParameters {
  public static final String SERIALIZED_NAME_CHILD_KEY_IDS = "child_key_ids";
  @SerializedName(SERIALIZED_NAME_CHILD_KEY_IDS)
  private List<String> childKeyIds = new ArrayList<>();

  public KeyLinksCreateParameters() {
  }

  public KeyLinksCreateParameters childKeyIds(List<String> childKeyIds) {
    
    this.childKeyIds = childKeyIds;
    return this;
  }

  public KeyLinksCreateParameters addChildKeyIdsItem(String childKeyIdsItem) {
    if (this.childKeyIds == null) {
      this.childKeyIds = new ArrayList<>();
    }
    this.childKeyIds.add(childKeyIdsItem);
    return this;
  }

   /**
   * The IDs of the child keys to link to the parent key. Can be left empty, to only mark the given translation-key as parent
   * @return childKeyIds
  **/
  @javax.annotation.Nonnull

  public List<String> getChildKeyIds() {
    return childKeyIds;
  }


  public void setChildKeyIds(List<String> childKeyIds) {
    this.childKeyIds = childKeyIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyLinksCreateParameters keyLinksCreateParameters = (KeyLinksCreateParameters) o;
    return Objects.equals(this.childKeyIds, keyLinksCreateParameters.childKeyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childKeyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyLinksCreateParameters {\n");
    sb.append("    childKeyIds: ").append(toIndentedString(childKeyIds)).append("\n");
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

