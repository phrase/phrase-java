# GitLabSyncApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gitlabSyncDelete**](GitLabSyncApi.md#gitlabSyncDelete) | **DELETE** /gitlab_syncs/{id} | Delete single Sync Setting
[**gitlabSyncExport**](GitLabSyncApi.md#gitlabSyncExport) | **POST** /gitlab_syncs/{gitlab_sync_id}/export | Export from Phrase Strings to GitLab
[**gitlabSyncHistory**](GitLabSyncApi.md#gitlabSyncHistory) | **GET** /gitlab_syncs/{gitlab_sync_id}/history | History of single Sync Setting
[**gitlabSyncImport**](GitLabSyncApi.md#gitlabSyncImport) | **POST** /gitlab_syncs/{gitlab_sync_id}/import | Import from GitLab to Phrase
[**gitlabSyncList**](GitLabSyncApi.md#gitlabSyncList) | **GET** /gitlab_syncs | List GitLab syncs
[**gitlabSyncShow**](GitLabSyncApi.md#gitlabSyncShow) | **GET** /gitlab_syncs/{id} | Get single Sync Setting
[**gitlabSyncUpdate**](GitLabSyncApi.md#gitlabSyncUpdate) | **PUT** /gitlab_syncs/{id} | Update single Sync Setting


<a name="gitlabSyncDelete"></a>
# **gitlabSyncDelete**
> gitlabSyncDelete(id, xPhraseAppOTP, accountId)

Delete single Sync Setting

Deletes a single GitLab Sync Setting.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String accountId = "abcd1234"; // String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
    try {
      apiInstance.gitlabSyncDelete(id, xPhraseAppOTP, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The resource was deleted successfully. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="gitlabSyncExport"></a>
# **gitlabSyncExport**
> GitlabSyncExport gitlabSyncExport(gitlabSyncId, gitlabSyncExportParameters, xPhraseAppOTP)

Export from Phrase Strings to GitLab

Export translations from Phrase Strings to GitLab according to the .phraseapp.yml file within the GitLab repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Export is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String gitlabSyncId = "gitlabSyncId_example"; // String | Gitlab Sync ID
    GitlabSyncExportParameters gitlabSyncExportParameters = new GitlabSyncExportParameters(); // GitlabSyncExportParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      GitlabSyncExport result = apiInstance.gitlabSyncExport(gitlabSyncId, gitlabSyncExportParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncExport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gitlabSyncId** | **String**| Gitlab Sync ID |
 **gitlabSyncExportParameters** | [**GitlabSyncExportParameters**](GitlabSyncExportParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GitlabSyncExport**](GitlabSyncExport.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="gitlabSyncHistory"></a>
# **gitlabSyncHistory**
> List&lt;GitlabSyncHistory&gt; gitlabSyncHistory(gitlabSyncId, xPhraseAppOTP, page, perPage, accountId)

History of single Sync Setting

List history for a single Sync Setting.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String gitlabSyncId = "gitlabSyncId_example"; // String | Gitlab Sync ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String accountId = "abcd1234"; // String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
    try {
      List<GitlabSyncHistory> result = apiInstance.gitlabSyncHistory(gitlabSyncId, xPhraseAppOTP, page, perPage, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gitlabSyncId** | **String**| Gitlab Sync ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **accountId** | **String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**List&lt;GitlabSyncHistory&gt;**](GitlabSyncHistory.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  * Pagination -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="gitlabSyncImport"></a>
# **gitlabSyncImport**
> List&lt;Upload&gt; gitlabSyncImport(gitlabSyncId, gitlabSyncImportParameters, xPhraseAppOTP)

Import from GitLab to Phrase

Import translations from GitLab to Phrase Strings according to the .phraseapp.yml file within the GitLab repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Import is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String gitlabSyncId = "gitlabSyncId_example"; // String | Gitlab Sync ID
    GitlabSyncImportParameters gitlabSyncImportParameters = new GitlabSyncImportParameters(); // GitlabSyncImportParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      List<Upload> result = apiInstance.gitlabSyncImport(gitlabSyncId, gitlabSyncImportParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncImport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gitlabSyncId** | **String**| Gitlab Sync ID |
 **gitlabSyncImportParameters** | [**GitlabSyncImportParameters**](GitlabSyncImportParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**List&lt;Upload&gt;**](Upload.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  * Pagination -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="gitlabSyncList"></a>
# **gitlabSyncList**
> List&lt;GitlabSync&gt; gitlabSyncList(xPhraseAppOTP, accountId)

List GitLab syncs

List all GitLab Sync Settings for which synchronisation with Phrase Strings and GitLab is activated.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String accountId = "abcd1234"; // String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
    try {
      List<GitlabSync> result = apiInstance.gitlabSyncList(xPhraseAppOTP, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**List&lt;GitlabSync&gt;**](GitlabSync.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  * Pagination -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="gitlabSyncShow"></a>
# **gitlabSyncShow**
> GitlabSync gitlabSyncShow(id, xPhraseAppOTP, accountId)

Get single Sync Setting

Shows a single GitLab Sync Setting.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String accountId = "abcd1234"; // String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
    try {
      GitlabSync result = apiInstance.gitlabSyncShow(id, xPhraseAppOTP, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncShow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**GitlabSync**](GitlabSync.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="gitlabSyncUpdate"></a>
# **gitlabSyncUpdate**
> GitlabSync gitlabSyncUpdate(id, xPhraseAppOTP, accountId, phraseProjectCode, gitlabProjectId, gitlabBranchName)

Update single Sync Setting

Updates a single GitLab Sync Setting.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GitLabSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    Token.setApiKeyPrefix("token");

    GitLabSyncApi apiInstance = new GitLabSyncApi(defaultClient);
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String accountId = "abcd1234"; // String | Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts.
    String phraseProjectCode = "3456abcd"; // String | Code of the related Phrase Strings Project.
    Integer gitlabProjectId = 12345; // Integer | ID of the related GitLab Project.
    String gitlabBranchName = "feature-development"; // String | Name of the GitLab Branch.
    try {
      GitlabSync result = apiInstance.gitlabSyncUpdate(id, xPhraseAppOTP, accountId, phraseProjectCode, gitlabProjectId, gitlabBranchName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GitLabSyncApi#gitlabSyncUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **accountId** | **String**| Account ID to specify the actual account the GitLab Sync should be created in. Required if the requesting user is a member of multiple accounts. | [optional]
 **phraseProjectCode** | **String**| Code of the related Phrase Strings Project. | [optional]
 **gitlabProjectId** | **Integer**| ID of the related GitLab Project. | [optional]
 **gitlabBranchName** | **String**| Name of the GitLab Branch. | [optional]

### Return type

[**GitlabSync**](GitlabSync.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

