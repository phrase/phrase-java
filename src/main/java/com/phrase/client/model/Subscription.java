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

/**
 * Subscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T12:53:36.818230Z[Etc/UTC]")
public class Subscription {
  public static final String SERIALIZED_NAME_IS_CURRENT = "is_current";
  @SerializedName(SERIALIZED_NAME_IS_CURRENT)
  private Boolean isCurrent;

  public static final String SERIALIZED_NAME_TRIAL_EXPIRED = "trial_expired";
  @SerializedName(SERIALIZED_NAME_TRIAL_EXPIRED)
  private Boolean trialExpired;


  public Subscription isCurrent(Boolean isCurrent) {
    
    this.isCurrent = isCurrent;
    return this;
  }

   /**
   * Get isCurrent
   * @return isCurrent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCurrent() {
    return isCurrent;
  }


  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }


  public Subscription trialExpired(Boolean trialExpired) {
    
    this.trialExpired = trialExpired;
    return this;
  }

   /**
   * Get trialExpired
   * @return trialExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTrialExpired() {
    return trialExpired;
  }


  public void setTrialExpired(Boolean trialExpired) {
    this.trialExpired = trialExpired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.isCurrent, subscription.isCurrent) &&
        Objects.equals(this.trialExpired, subscription.trialExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCurrent, trialExpired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
    sb.append("    trialExpired: ").append(toIndentedString(trialExpired)).append("\n");
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

