# MachineTranslationApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**machineTranslationLocaleProviderMappingsCreate**](MachineTranslationApi.md#machineTranslationLocaleProviderMappingsCreate) | **POST** /accounts/{account_id}/machine_translation_locale_provider_mappings | Create a locale provider mapping
[**machineTranslationLocaleProviderMappingsDestroy**](MachineTranslationApi.md#machineTranslationLocaleProviderMappingsDestroy) | **DELETE** /accounts/{account_id}/machine_translation_locale_provider_mappings | Delete a locale provider mapping
[**machineTranslationSettingsShow**](MachineTranslationApi.md#machineTranslationSettingsShow) | **GET** /accounts/{account_id}/machine_translation_settings | Get machine translation settings
[**machineTranslationSettingsUpdate**](MachineTranslationApi.md#machineTranslationSettingsUpdate) | **PATCH** /accounts/{account_id}/machine_translation_settings | Update machine translation settings


<a name="machineTranslationLocaleProviderMappingsCreate"></a>
# **machineTranslationLocaleProviderMappingsCreate**
> MachineTranslationLocaleProviderMapping machineTranslationLocaleProviderMappingsCreate(accountId, machineTranslationLocaleProviderMappingsCreateParameters, xPhraseAppOTP)

Create a locale provider mapping

Creates a locale-pair-specific machine translation provider override for the account. When a mapping exists for a given source/target locale pair, that provider is used instead of the account default. Only one mapping may exist per source/target locale pair; attempting to create a duplicate returns a validation error. The source and target locale codes must differ. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.MachineTranslationApi;

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

    MachineTranslationApi apiInstance = new MachineTranslationApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    MachineTranslationLocaleProviderMappingsCreateParameters machineTranslationLocaleProviderMappingsCreateParameters = new MachineTranslationLocaleProviderMappingsCreateParameters(); // MachineTranslationLocaleProviderMappingsCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      MachineTranslationLocaleProviderMapping result = apiInstance.machineTranslationLocaleProviderMappingsCreate(accountId, machineTranslationLocaleProviderMappingsCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MachineTranslationApi#machineTranslationLocaleProviderMappingsCreate");
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
 **accountId** | **String**| Account ID |
 **machineTranslationLocaleProviderMappingsCreateParameters** | [**MachineTranslationLocaleProviderMappingsCreateParameters**](MachineTranslationLocaleProviderMappingsCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**MachineTranslationLocaleProviderMapping**](MachineTranslationLocaleProviderMapping.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**422** | Unprocessable entity. The request was well-formed but failed validation. The response body lists each offending field in the &#x60;errors&#x60; array, with its resource, field, and a human-readable message. Correct the listed fields and retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="machineTranslationLocaleProviderMappingsDestroy"></a>
# **machineTranslationLocaleProviderMappingsDestroy**
> machineTranslationLocaleProviderMappingsDestroy(accountId, sourceLocaleCode, targetLocaleCode, xPhraseAppOTP)

Delete a locale provider mapping

Removes the machine translation provider override for the specified source and target locale pair. The mapping is identified by locale codes supplied as query parameters rather than a path ID. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.MachineTranslationApi;

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

    MachineTranslationApi apiInstance = new MachineTranslationApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String sourceLocaleCode = "en"; // String | The locale code of the source language of the mapping to delete.
    String targetLocaleCode = "de"; // String | The locale code of the target language of the mapping to delete.
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.machineTranslationLocaleProviderMappingsDestroy(accountId, sourceLocaleCode, targetLocaleCode, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling MachineTranslationApi#machineTranslationLocaleProviderMappingsDestroy");
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
 **accountId** | **String**| Account ID |
 **sourceLocaleCode** | **String**| The locale code of the source language of the mapping to delete. |
 **targetLocaleCode** | **String**| The locale code of the target language of the mapping to delete. |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

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
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not found. The requested resource does not exist or is not visible to the authenticated user. Verify the identifiers in the request path and that the token has access to them, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="machineTranslationSettingsShow"></a>
# **machineTranslationSettingsShow**
> MachineTranslationSettings machineTranslationSettingsShow(accountId, xPhraseAppOTP)

Get machine translation settings

Returns the machine translation configuration for the account, including the default translation service, current machine translation unit usage, and any locale-pair-specific provider mappings. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.MachineTranslationApi;

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

    MachineTranslationApi apiInstance = new MachineTranslationApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      MachineTranslationSettings result = apiInstance.machineTranslationSettingsShow(accountId, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MachineTranslationApi#machineTranslationSettingsShow");
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
 **accountId** | **String**| Account ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**MachineTranslationSettings**](MachineTranslationSettings.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="machineTranslationSettingsUpdate"></a>
# **machineTranslationSettingsUpdate**
> MachineTranslationSettings machineTranslationSettingsUpdate(accountId, machineTranslationSettingsUpdateParameters, xPhraseAppOTP)

Update machine translation settings

Sets the default machine translation service for the account. Requires write access to the account&#39;s machine translation settings. Passing an empty or absent value for &#x60;default_service&#x60; resets the account to its plan default (Microsoft Translate). 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.MachineTranslationApi;

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

    MachineTranslationApi apiInstance = new MachineTranslationApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    MachineTranslationSettingsUpdateParameters machineTranslationSettingsUpdateParameters = new MachineTranslationSettingsUpdateParameters(); // MachineTranslationSettingsUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      MachineTranslationSettings result = apiInstance.machineTranslationSettingsUpdate(accountId, machineTranslationSettingsUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MachineTranslationApi#machineTranslationSettingsUpdate");
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
 **accountId** | **String**| Account ID |
 **machineTranslationSettingsUpdateParameters** | [**MachineTranslationSettingsUpdateParameters**](MachineTranslationSettingsUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**MachineTranslationSettings**](MachineTranslationSettings.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**422** | Unprocessable entity. The request was well-formed but failed validation. The response body lists each offending field in the &#x60;errors&#x60; array, with its resource, field, and a human-readable message. Correct the listed fields and retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

