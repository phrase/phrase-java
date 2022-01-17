# GlossaryTermTranslationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glossaryTermTranslationCreate**](GlossaryTermTranslationsApi.md#glossaryTermTranslationCreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations | Create a glossary term translation
[**glossaryTermTranslationDelete**](GlossaryTermTranslationsApi.md#glossaryTermTranslationDelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Delete a glossary term translation
[**glossaryTermTranslationUpdate**](GlossaryTermTranslationsApi.md#glossaryTermTranslationUpdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Update a glossary term translation


<a name="glossaryTermTranslationCreate"></a>
# **glossaryTermTranslationCreate**
> GlossaryTermTranslation glossaryTermTranslationCreate(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xPhraseAppOTP)

Create a glossary term translation

Create a new glossary term translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GlossaryTermTranslationsApi;

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

    GlossaryTermTranslationsApi apiInstance = new GlossaryTermTranslationsApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String termId = "termId_example"; // String | Term ID
    GlossaryTermTranslationCreateParameters glossaryTermTranslationCreateParameters = new GlossaryTermTranslationCreateParameters(); // GlossaryTermTranslationCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      GlossaryTermTranslation result = apiInstance.glossaryTermTranslationCreate(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryTermTranslationsApi#glossaryTermTranslationCreate");
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
 **glossaryId** | **String**| Glossary ID |
 **termId** | **String**| Term ID |
 **glossaryTermTranslationCreateParameters** | [**GlossaryTermTranslationCreateParameters**](GlossaryTermTranslationCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTermTranslation**](GlossaryTermTranslation.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="glossaryTermTranslationDelete"></a>
# **glossaryTermTranslationDelete**
> glossaryTermTranslationDelete(accountId, glossaryId, termId, id, xPhraseAppOTP)

Delete a glossary term translation

Delete an existing glossary term translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GlossaryTermTranslationsApi;

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

    GlossaryTermTranslationsApi apiInstance = new GlossaryTermTranslationsApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String termId = "termId_example"; // String | Term ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.glossaryTermTranslationDelete(accountId, glossaryId, termId, id, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryTermTranslationsApi#glossaryTermTranslationDelete");
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
 **glossaryId** | **String**| Glossary ID |
 **termId** | **String**| Term ID |
 **id** | **String**| ID |
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
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="glossaryTermTranslationUpdate"></a>
# **glossaryTermTranslationUpdate**
> GlossaryTermTranslation glossaryTermTranslationUpdate(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xPhraseAppOTP)

Update a glossary term translation

Update an existing glossary term translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.GlossaryTermTranslationsApi;

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

    GlossaryTermTranslationsApi apiInstance = new GlossaryTermTranslationsApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String termId = "termId_example"; // String | Term ID
    String id = "id_example"; // String | ID
    GlossaryTermTranslationUpdateParameters glossaryTermTranslationUpdateParameters = new GlossaryTermTranslationUpdateParameters(); // GlossaryTermTranslationUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      GlossaryTermTranslation result = apiInstance.glossaryTermTranslationUpdate(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlossaryTermTranslationsApi#glossaryTermTranslationUpdate");
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
 **glossaryId** | **String**| Glossary ID |
 **termId** | **String**| Term ID |
 **id** | **String**| ID |
 **glossaryTermTranslationUpdateParameters** | [**GlossaryTermTranslationUpdateParameters**](GlossaryTermTranslationUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTermTranslation**](GlossaryTermTranslation.md)

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

