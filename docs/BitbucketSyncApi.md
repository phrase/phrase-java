# BitbucketSyncApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bitbucketSyncExport**](BitbucketSyncApi.md#bitbucketSyncExport) | **POST** /bitbucket_syncs/{id}/export | Export from Phrase to Bitbucket
[**bitbucketSyncImport**](BitbucketSyncApi.md#bitbucketSyncImport) | **POST** /bitbucket_syncs/{id}/import | Import to Phrase from Bitbucket
[**bitbucketSyncsList**](BitbucketSyncApi.md#bitbucketSyncsList) | **GET** /bitbucket_syncs | List Bitbucket syncs


<a name="bitbucketSyncExport"></a>
# **bitbucketSyncExport**
> BitbucketSyncExportResponse bitbucketSyncExport(id, bitbucketSyncExportParameters, xPhraseAppOTP)

Export from Phrase to Bitbucket

Export translations from Phrase to Bitbucket according to the .phraseapp.yml file within the Bitbucket Repository.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.BitbucketSyncApi;

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
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BitbucketSyncApi apiInstance = new BitbucketSyncApi(defaultClient);
    String id = "id_example"; // String | ID
    BitbucketSyncExportParameters bitbucketSyncExportParameters = new BitbucketSyncExportParameters(); // BitbucketSyncExportParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      BitbucketSyncExportResponse result = apiInstance.bitbucketSyncExport(id, bitbucketSyncExportParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitbucketSyncApi#bitbucketSyncExport");
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
 **bitbucketSyncExportParameters** | [**BitbucketSyncExportParameters**](BitbucketSyncExportParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**BitbucketSyncExportResponse**](BitbucketSyncExportResponse.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token), [bearerAuth](../README.md#bearerAuth)

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

<a name="bitbucketSyncImport"></a>
# **bitbucketSyncImport**
> bitbucketSyncImport(id, bitbucketSyncImportParameters, xPhraseAppOTP)

Import to Phrase from Bitbucket

Import translations from Bitbucket to Phrase according to the .phraseapp.yml file within the Bitbucket repository.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.BitbucketSyncApi;

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
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BitbucketSyncApi apiInstance = new BitbucketSyncApi(defaultClient);
    String id = "id_example"; // String | ID
    BitbucketSyncImportParameters bitbucketSyncImportParameters = new BitbucketSyncImportParameters(); // BitbucketSyncImportParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.bitbucketSyncImport(id, bitbucketSyncImportParameters, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitbucketSyncApi#bitbucketSyncImport");
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
 **bitbucketSyncImportParameters** | [**BitbucketSyncImportParameters**](BitbucketSyncImportParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="bitbucketSyncsList"></a>
# **bitbucketSyncsList**
> List&lt;BitbucketSync&gt; bitbucketSyncsList(xPhraseAppOTP, accountId)

List Bitbucket syncs

List all Bitbucket repositories for which synchronisation with Phrase is activated.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.BitbucketSyncApi;

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
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BitbucketSyncApi apiInstance = new BitbucketSyncApi(defaultClient);
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String accountId = abcd1234; // String | Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts.
    try {
      List<BitbucketSync> result = apiInstance.bitbucketSyncsList(xPhraseAppOTP, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitbucketSyncApi#bitbucketSyncsList");
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
 **accountId** | **String**| Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts. | [optional]

### Return type

[**List&lt;BitbucketSync&gt;**](BitbucketSync.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

