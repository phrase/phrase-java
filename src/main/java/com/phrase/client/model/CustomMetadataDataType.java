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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * data type of the property
 */
@JsonAdapter(CustomMetadataDataType.Adapter.class)
public enum CustomMetadataDataType {
  
  BOOLEAN("boolean"),
  
  DATE("date"),
  
  LINK("link"),
  
  MULTI_SELECT("multi_select"),
  
  NUMBER("number"),
  
  SINGLE_SELECT("single_select"),
  
  STRING("string"),
  
  TEXT("text");

  private String value;

  CustomMetadataDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomMetadataDataType fromValue(String value) {
    for (CustomMetadataDataType b : CustomMetadataDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CustomMetadataDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomMetadataDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomMetadataDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CustomMetadataDataType.fromValue(value);
    }
  }
}

