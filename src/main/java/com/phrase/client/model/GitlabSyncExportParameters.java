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
 * GitlabSyncExportParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-23T08:32:58.836790Z[Etc/UTC]")
public class GitlabSyncExportParameters {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;


  public GitlabSyncExportParameters accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd1234", value = "Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitlabSyncExportParameters gitlabSyncExportParameters = (GitlabSyncExportParameters) o;
    return Objects.equals(this.accountId, gitlabSyncExportParameters.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitlabSyncExportParameters {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

