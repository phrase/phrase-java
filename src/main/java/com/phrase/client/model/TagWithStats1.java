/*
 * Phrase API Reference
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
import com.phrase.client.model.TagWithStats1Statistics1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TagWithStats1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-21T07:06:01.182370Z[Etc/UTC]")
public class TagWithStats1 {
  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private List<TagWithStats1Statistics1> statistics = null;


  public TagWithStats1 statistics(List<TagWithStats1Statistics1> statistics) {
    
    this.statistics = statistics;
    return this;
  }

  public TagWithStats1 addStatisticsItem(TagWithStats1Statistics1 statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TagWithStats1Statistics1> getStatistics() {
    return statistics;
  }


  public void setStatistics(List<TagWithStats1Statistics1> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagWithStats1 tagWithStats1 = (TagWithStats1) o;
    return Objects.equals(this.statistics, tagWithStats1.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagWithStats1 {\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

