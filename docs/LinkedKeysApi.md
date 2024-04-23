# LinkedKeysApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keyLinksBatchDestroy**](LinkedKeysApi.md#keyLinksBatchDestroy) | **DELETE** /projects/{project_id}/keys/{id}/key_links | Batch unlink child keys from a parent key
[**keyLinksCreate**](LinkedKeysApi.md#keyLinksCreate) | **POST** /projects/{project_id}/keys/{id}/key_links | Link child keys to a parent key
[**keyLinksDestroy**](LinkedKeysApi.md#keyLinksDestroy) | **DELETE** /projects/{project_id}/keys/{id}/key_links/{child_key_id} | Unlink a child key from a parent key
[**keyLinksIndex**](LinkedKeysApi.md#keyLinksIndex) | **GET** /projects/{project_id}/keys/{id}/key_links | List child keys of a parent key


<a name="keyLinksBatchDestroy"></a>
# **keyLinksBatchDestroy**
> keyLinksBatchDestroy(projectId, id, keyLinksBatchDestroyParameters, xPhraseAppOTP)

Batch unlink child keys from a parent key

Unlinks multiple child keys from a given parent key in a single operation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.LinkedKeysApi;

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

    LinkedKeysApi apiInstance = new LinkedKeysApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | Parent Translation Key ID
    KeyLinksBatchDestroyParameters keyLinksBatchDestroyParameters = new KeyLinksBatchDestroyParameters(); // KeyLinksBatchDestroyParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.keyLinksBatchDestroy(projectId, id, keyLinksBatchDestroyParameters, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedKeysApi#keyLinksBatchDestroy");
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
 **projectId** | **String**| Project ID |
 **id** | **String**| Parent Translation Key ID |
 **keyLinksBatchDestroyParameters** | [**KeyLinksBatchDestroyParameters**](KeyLinksBatchDestroyParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="keyLinksCreate"></a>
# **keyLinksCreate**
> KeyLink keyLinksCreate(projectId, id, keyLinksCreateParameters, xPhraseAppOTP)

Link child keys to a parent key

Creates links between a given parent key and one or more child keys.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.LinkedKeysApi;

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

    LinkedKeysApi apiInstance = new LinkedKeysApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | Parent Translation Key ID
    KeyLinksCreateParameters keyLinksCreateParameters = new KeyLinksCreateParameters(); // KeyLinksCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      KeyLink result = apiInstance.keyLinksCreate(projectId, id, keyLinksCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedKeysApi#keyLinksCreate");
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
 **projectId** | **String**| Project ID |
 **id** | **String**| Parent Translation Key ID |
 **keyLinksCreateParameters** | [**KeyLinksCreateParameters**](KeyLinksCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**KeyLink**](KeyLink.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="keyLinksDestroy"></a>
# **keyLinksDestroy**
> keyLinksDestroy(projectId, id, childKeyId, xPhraseAppOTP)

Unlink a child key from a parent key

Unlinks a single child key from a given parent key.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.LinkedKeysApi;

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

    LinkedKeysApi apiInstance = new LinkedKeysApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | Parent Translation Key ID
    String childKeyId = "childKeyId_example"; // String | The ID of the child key to unlink.
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.keyLinksDestroy(projectId, id, childKeyId, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedKeysApi#keyLinksDestroy");
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
 **projectId** | **String**| Project ID |
 **id** | **String**| Parent Translation Key ID |
 **childKeyId** | **String**| The ID of the child key to unlink. |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="keyLinksIndex"></a>
# **keyLinksIndex**
> KeyLink keyLinksIndex(projectId, id, xPhraseAppOTP)

List child keys of a parent key

Returns detailed information about a parent key, including its linked child keys.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.LinkedKeysApi;

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

    LinkedKeysApi apiInstance = new LinkedKeysApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | Parent Translation Key ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      KeyLink result = apiInstance.keyLinksIndex(projectId, id, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedKeysApi#keyLinksIndex");
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
 **projectId** | **String**| Project ID |
 **id** | **String**| Parent Translation Key ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**KeyLink**](KeyLink.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |

