# TranslationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**translationCreate**](TranslationsApi.md#translationCreate) | **POST** /projects/{project_id}/translations | Create a translation
[**translationExclude**](TranslationsApi.md#translationExclude) | **PATCH** /projects/{project_id}/translations/{id}/exclude | Exclude a translation from export
[**translationInclude**](TranslationsApi.md#translationInclude) | **PATCH** /projects/{project_id}/translations/{id}/include | Include a translation
[**translationReview**](TranslationsApi.md#translationReview) | **PATCH** /projects/{project_id}/translations/{id}/review | Review a translation
[**translationShow**](TranslationsApi.md#translationShow) | **GET** /projects/{project_id}/translations/{id} | Get a single translation
[**translationUnverify**](TranslationsApi.md#translationUnverify) | **PATCH** /projects/{project_id}/translations/{id}/unverify | Mark a translation as unverified
[**translationUpdate**](TranslationsApi.md#translationUpdate) | **PATCH** /projects/{project_id}/translations/{id} | Update a translation
[**translationVerify**](TranslationsApi.md#translationVerify) | **PATCH** /projects/{project_id}/translations/{id}/verify | Verify a translation
[**translationsByKey**](TranslationsApi.md#translationsByKey) | **GET** /projects/{project_id}/keys/{key_id}/translations | List translations by key
[**translationsByLocale**](TranslationsApi.md#translationsByLocale) | **GET** /projects/{project_id}/locales/{locale_id}/translations | List translations by locale
[**translationsExcludeCollection**](TranslationsApi.md#translationsExcludeCollection) | **PATCH** /projects/{project_id}/translations/exclude | Exclude translations by query
[**translationsIncludeCollection**](TranslationsApi.md#translationsIncludeCollection) | **PATCH** /projects/{project_id}/translations/include | Include translations by query
[**translationsList**](TranslationsApi.md#translationsList) | **GET** /projects/{project_id}/translations | List all translations
[**translationsReviewCollection**](TranslationsApi.md#translationsReviewCollection) | **PATCH** /projects/{project_id}/translations/review | Review translations selected by query
[**translationsSearch**](TranslationsApi.md#translationsSearch) | **POST** /projects/{project_id}/translations/search | Search translations
[**translationsUnverifyCollection**](TranslationsApi.md#translationsUnverifyCollection) | **PATCH** /projects/{project_id}/translations/unverify | Unverify translations by query
[**translationsVerifyCollection**](TranslationsApi.md#translationsVerifyCollection) | **PATCH** /projects/{project_id}/translations/verify | Verify translations by query


<a name="translationCreate"></a>
# **translationCreate**
> TranslationDetails translationCreate(projectId, translationCreateParameters, xPhraseAppOTP)

Create a translation

Create a translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationCreateParameters translationCreateParameters = new TranslationCreateParameters(); // TranslationCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationCreate(projectId, translationCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationCreate");
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
 **translationCreateParameters** | [**TranslationCreateParameters**](TranslationCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationExclude"></a>
# **translationExclude**
> TranslationDetails translationExclude(projectId, id, translationExcludeParameters, xPhraseAppOTP)

Exclude a translation from export

Set exclude from export flag on an existing translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    TranslationExcludeParameters translationExcludeParameters = new TranslationExcludeParameters(); // TranslationExcludeParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationExclude(projectId, id, translationExcludeParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationExclude");
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
 **id** | **String**| ID |
 **translationExcludeParameters** | [**TranslationExcludeParameters**](TranslationExcludeParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationInclude"></a>
# **translationInclude**
> TranslationDetails translationInclude(projectId, id, translationIncludeParameters, xPhraseAppOTP)

Include a translation

Remove exclude from export flag from an existing translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    TranslationIncludeParameters translationIncludeParameters = new TranslationIncludeParameters(); // TranslationIncludeParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationInclude(projectId, id, translationIncludeParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationInclude");
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
 **id** | **String**| ID |
 **translationIncludeParameters** | [**TranslationIncludeParameters**](TranslationIncludeParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationReview"></a>
# **translationReview**
> TranslationDetails translationReview(projectId, id, translationReviewParameters, xPhraseAppOTP)

Review a translation

Mark an existing translation as reviewed.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    TranslationReviewParameters translationReviewParameters = new TranslationReviewParameters(); // TranslationReviewParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationReview(projectId, id, translationReviewParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationReview");
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
 **id** | **String**| ID |
 **translationReviewParameters** | [**TranslationReviewParameters**](TranslationReviewParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationShow"></a>
# **translationShow**
> TranslationDetails translationShow(projectId, id, xPhraseAppOTP, branch)

Get a single translation

Get details on a single translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      TranslationDetails result = apiInstance.translationShow(projectId, id, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationShow");
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
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationUnverify"></a>
# **translationUnverify**
> TranslationDetails translationUnverify(projectId, id, translationUnverifyParameters, xPhraseAppOTP)

Mark a translation as unverified

Mark an existing translation as unverified.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    TranslationUnverifyParameters translationUnverifyParameters = new TranslationUnverifyParameters(); // TranslationUnverifyParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationUnverify(projectId, id, translationUnverifyParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationUnverify");
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
 **id** | **String**| ID |
 **translationUnverifyParameters** | [**TranslationUnverifyParameters**](TranslationUnverifyParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationUpdate"></a>
# **translationUpdate**
> TranslationDetails translationUpdate(projectId, id, translationUpdateParameters, xPhraseAppOTP)

Update a translation

Update an existing translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    TranslationUpdateParameters translationUpdateParameters = new TranslationUpdateParameters(); // TranslationUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationUpdate(projectId, id, translationUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationUpdate");
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
 **id** | **String**| ID |
 **translationUpdateParameters** | [**TranslationUpdateParameters**](TranslationUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationVerify"></a>
# **translationVerify**
> TranslationDetails translationVerify(projectId, id, translationVerifyParameters, xPhraseAppOTP)

Verify a translation

Verify an existing translation.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    TranslationVerifyParameters translationVerifyParameters = new TranslationVerifyParameters(); // TranslationVerifyParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      TranslationDetails result = apiInstance.translationVerify(projectId, id, translationVerifyParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationVerify");
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
 **id** | **String**| ID |
 **translationVerifyParameters** | [**TranslationVerifyParameters**](TranslationVerifyParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**TranslationDetails**](TranslationDetails.md)

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

<a name="translationsByKey"></a>
# **translationsByKey**
> List&lt;Translation&gt; translationsByKey(projectId, keyId, xPhraseAppOTP, page, perPage, branch, sort, order, q)

List translations by key

List translations for a specific key.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String branch = my-feature-branch; // String | specify the branch to use
    String sort = updated_at; // String | Sort criteria. Can be one of: key_name, created_at, updated_at.
    String order = desc; // String | Order direction. Can be one of: asc, desc.
    String q = PhraseApp*%20unverified:true%20excluded:true%20tags:feature,center; // String | Specify a query to find translations by content (including wildcards).<br><br> The following qualifiers are supported in the query:<br> <ul>   <li><code>id:translation_id,...</code> for queries on a comma-separated list of ids</li>   <li><code>unverified:{true|false}</code> for verification status</li>   <li><code>tags:XYZ</code> for tags on the translation</li>   <li><code>excluded:{true|false}</code> for exclusion status</li>   <li><code>updated_at:{>=|<=}2013-02-21T00:00:00Z</code> for date range queries</li> </ul> Find more examples <a href=\"#overview--usage-examples\">here</a>. 
    try {
      List<Translation> result = apiInstance.translationsByKey(projectId, keyId, xPhraseAppOTP, page, perPage, branch, sort, order, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsByKey");
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
 **keyId** | **String**| Translation Key ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]
 **sort** | **String**| Sort criteria. Can be one of: key_name, created_at, updated_at. | [optional]
 **order** | **String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **String**| Specify a query to find translations by content (including wildcards).&lt;br&gt;&lt;br&gt; The following qualifiers are supported in the query:&lt;br&gt; &lt;ul&gt;   &lt;li&gt;&lt;code&gt;id:translation_id,...&lt;/code&gt; for queries on a comma-separated list of ids&lt;/li&gt;   &lt;li&gt;&lt;code&gt;unverified:{true|false}&lt;/code&gt; for verification status&lt;/li&gt;   &lt;li&gt;&lt;code&gt;tags:XYZ&lt;/code&gt; for tags on the translation&lt;/li&gt;   &lt;li&gt;&lt;code&gt;excluded:{true|false}&lt;/code&gt; for exclusion status&lt;/li&gt;   &lt;li&gt;&lt;code&gt;updated_at:{&gt;&#x3D;|&lt;&#x3D;}2013-02-21T00:00:00Z&lt;/code&gt; for date range queries&lt;/li&gt; &lt;/ul&gt; Find more examples &lt;a href&#x3D;\&quot;#overview--usage-examples\&quot;&gt;here&lt;/a&gt;.  | [optional]

### Return type

[**List&lt;Translation&gt;**](Translation.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

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

<a name="translationsByLocale"></a>
# **translationsByLocale**
> List&lt;Translation&gt; translationsByLocale(projectId, localeId, xPhraseAppOTP, page, perPage, branch, sort, order, q)

List translations by locale

List translations for a specific locale. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String localeId = "localeId_example"; // String | Locale ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String branch = my-feature-branch; // String | specify the branch to use
    String sort = updated_at; // String | Sort criteria. Can be one of: key_name, created_at, updated_at.
    String order = desc; // String | Order direction. Can be one of: asc, desc.
    String q = PhraseApp*%20unverified:true%20excluded:true%20tags:feature,center; // String | Specify a query to find translations by content (including wildcards).<br><br> <i>Note: Search is limited to 10000 results and may not include recently updated data (depending on the project size).</i><br> The following qualifiers are supported in the query:<br> <ul>   <li><code>id:translation_id,...</code> for queries on a comma-separated list of ids</li>   <li><code>unverified:{true|false}</code> for verification status</li>   <li><code>tags:XYZ</code> for tags on the translation</li>   <li><code>excluded:{true|false}</code> for exclusion status</li>   <li><code>updated_at:{>=|<=}2013-02-21T00:00:00Z</code> for date range queries</li> </ul> Find more examples <a href=\"#overview--usage-examples\">here</a>. 
    try {
      List<Translation> result = apiInstance.translationsByLocale(projectId, localeId, xPhraseAppOTP, page, perPage, branch, sort, order, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsByLocale");
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
 **localeId** | **String**| Locale ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]
 **sort** | **String**| Sort criteria. Can be one of: key_name, created_at, updated_at. | [optional]
 **order** | **String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **String**| Specify a query to find translations by content (including wildcards).&lt;br&gt;&lt;br&gt; &lt;i&gt;Note: Search is limited to 10000 results and may not include recently updated data (depending on the project size).&lt;/i&gt;&lt;br&gt; The following qualifiers are supported in the query:&lt;br&gt; &lt;ul&gt;   &lt;li&gt;&lt;code&gt;id:translation_id,...&lt;/code&gt; for queries on a comma-separated list of ids&lt;/li&gt;   &lt;li&gt;&lt;code&gt;unverified:{true|false}&lt;/code&gt; for verification status&lt;/li&gt;   &lt;li&gt;&lt;code&gt;tags:XYZ&lt;/code&gt; for tags on the translation&lt;/li&gt;   &lt;li&gt;&lt;code&gt;excluded:{true|false}&lt;/code&gt; for exclusion status&lt;/li&gt;   &lt;li&gt;&lt;code&gt;updated_at:{&gt;&#x3D;|&lt;&#x3D;}2013-02-21T00:00:00Z&lt;/code&gt; for date range queries&lt;/li&gt; &lt;/ul&gt; Find more examples &lt;a href&#x3D;\&quot;#overview--usage-examples\&quot;&gt;here&lt;/a&gt;.  | [optional]

### Return type

[**List&lt;Translation&gt;**](Translation.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

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

<a name="translationsExcludeCollection"></a>
# **translationsExcludeCollection**
> AffectedCount translationsExcludeCollection(projectId, translationsExcludeParameters, xPhraseAppOTP)

Exclude translations by query

Exclude translations matching query from locale export.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationsExcludeParameters translationsExcludeParameters = new TranslationsExcludeParameters(); // TranslationsExcludeParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AffectedCount result = apiInstance.translationsExcludeCollection(projectId, translationsExcludeParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsExcludeCollection");
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
 **translationsExcludeParameters** | [**TranslationsExcludeParameters**](TranslationsExcludeParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsIncludeCollection"></a>
# **translationsIncludeCollection**
> AffectedCount translationsIncludeCollection(projectId, translationsIncludeParameters, xPhraseAppOTP)

Include translations by query

Include translations matching query in locale export.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationsIncludeParameters translationsIncludeParameters = new TranslationsIncludeParameters(); // TranslationsIncludeParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AffectedCount result = apiInstance.translationsIncludeCollection(projectId, translationsIncludeParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsIncludeCollection");
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
 **translationsIncludeParameters** | [**TranslationsIncludeParameters**](TranslationsIncludeParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsList"></a>
# **translationsList**
> List&lt;Translation&gt; translationsList(projectId, xPhraseAppOTP, ifModifiedSince, ifNoneMatch, page, perPage, branch, sort, order, q)

List all translations

List translations for the given project. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String ifModifiedSince = "ifModifiedSince_example"; // String | Last modified condition, see <a href=\"#overview--conditional-get-requests--http-caching\">Conditional GET requests / HTTP Caching</a> (optional)
    String ifNoneMatch = "ifNoneMatch_example"; // String | ETag condition, see <a href=\"#overview--conditional-get-requests--http-caching\">Conditional GET requests / HTTP Caching</a> (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String branch = my-feature-branch; // String | specify the branch to use
    String sort = updated_at; // String | Sort criteria. Can be one of: key_name, created_at, updated_at.
    String order = desc; // String | Order direction. Can be one of: asc, desc.
    String q = PhraseApp*%20unverified:true%20excluded:true%20tags:feature,center; // String | Specify a query to find translations by content (including wildcards).<br><br> <i>Note: Search is limited to 10000 results and may not include recently updated data (depending on the project size).</i><br> The following qualifiers are supported in the query:<br> <ul>   <li><code>id:translation_id,...</code> for queries on a comma-separated list of ids</li>   <li><code>tags:XYZ</code> for tags on the translation</li>   <li><code>unverified:{true|false}</code> for verification status</li>   <li><code>excluded:{true|false}</code> for exclusion status</li>   <li><code>updated_at:{>=|<=}2013-02-21T00:00:00Z</code> for date range queries</li> </ul> Find more examples <a href=\"#overview--usage-examples\">here</a>. 
    try {
      List<Translation> result = apiInstance.translationsList(projectId, xPhraseAppOTP, ifModifiedSince, ifNoneMatch, page, perPage, branch, sort, order, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsList");
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
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **ifModifiedSince** | **String**| Last modified condition, see &lt;a href&#x3D;\&quot;#overview--conditional-get-requests--http-caching\&quot;&gt;Conditional GET requests / HTTP Caching&lt;/a&gt; (optional) | [optional]
 **ifNoneMatch** | **String**| ETag condition, see &lt;a href&#x3D;\&quot;#overview--conditional-get-requests--http-caching\&quot;&gt;Conditional GET requests / HTTP Caching&lt;/a&gt; (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]
 **sort** | **String**| Sort criteria. Can be one of: key_name, created_at, updated_at. | [optional]
 **order** | **String**| Order direction. Can be one of: asc, desc. | [optional]
 **q** | **String**| Specify a query to find translations by content (including wildcards).&lt;br&gt;&lt;br&gt; &lt;i&gt;Note: Search is limited to 10000 results and may not include recently updated data (depending on the project size).&lt;/i&gt;&lt;br&gt; The following qualifiers are supported in the query:&lt;br&gt; &lt;ul&gt;   &lt;li&gt;&lt;code&gt;id:translation_id,...&lt;/code&gt; for queries on a comma-separated list of ids&lt;/li&gt;   &lt;li&gt;&lt;code&gt;tags:XYZ&lt;/code&gt; for tags on the translation&lt;/li&gt;   &lt;li&gt;&lt;code&gt;unverified:{true|false}&lt;/code&gt; for verification status&lt;/li&gt;   &lt;li&gt;&lt;code&gt;excluded:{true|false}&lt;/code&gt; for exclusion status&lt;/li&gt;   &lt;li&gt;&lt;code&gt;updated_at:{&gt;&#x3D;|&lt;&#x3D;}2013-02-21T00:00:00Z&lt;/code&gt; for date range queries&lt;/li&gt; &lt;/ul&gt; Find more examples &lt;a href&#x3D;\&quot;#overview--usage-examples\&quot;&gt;here&lt;/a&gt;.  | [optional]

### Return type

[**List&lt;Translation&gt;**](Translation.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

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

<a name="translationsReviewCollection"></a>
# **translationsReviewCollection**
> AffectedCount translationsReviewCollection(projectId, translationsReviewParameters, xPhraseAppOTP)

Review translations selected by query

Review translations matching query.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationsReviewParameters translationsReviewParameters = new TranslationsReviewParameters(); // TranslationsReviewParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AffectedCount result = apiInstance.translationsReviewCollection(projectId, translationsReviewParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsReviewCollection");
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
 **translationsReviewParameters** | [**TranslationsReviewParameters**](TranslationsReviewParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsSearch"></a>
# **translationsSearch**
> List&lt;Translation&gt; translationsSearch(projectId, translationsSearchParameters, xPhraseAppOTP, page, perPage)

Search translations

Search translations for the given project. Provides the same search interface as &lt;code&gt;translations#index&lt;/code&gt; but allows POST requests to avoid limitations imposed by GET requests. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationsSearchParameters translationsSearchParameters = new TranslationsSearchParameters(); // TranslationsSearchParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    try {
      List<Translation> result = apiInstance.translationsSearch(projectId, translationsSearchParameters, xPhraseAppOTP, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsSearch");
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
 **translationsSearchParameters** | [**TranslationsSearchParameters**](TranslationsSearchParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]

### Return type

[**List&lt;Translation&gt;**](Translation.md)

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

<a name="translationsUnverifyCollection"></a>
# **translationsUnverifyCollection**
> AffectedCount translationsUnverifyCollection(projectId, translationsUnverifyParameters, xPhraseAppOTP)

Unverify translations by query

Mark translations matching query as unverified.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationsUnverifyParameters translationsUnverifyParameters = new TranslationsUnverifyParameters(); // TranslationsUnverifyParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AffectedCount result = apiInstance.translationsUnverifyCollection(projectId, translationsUnverifyParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsUnverifyCollection");
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
 **translationsUnverifyParameters** | [**TranslationsUnverifyParameters**](TranslationsUnverifyParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

<a name="translationsVerifyCollection"></a>
# **translationsVerifyCollection**
> AffectedCount translationsVerifyCollection(projectId, translationsVerifyParameters, xPhraseAppOTP)

Verify translations by query

Verify translations matching query.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TranslationsApi;

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

    TranslationsApi apiInstance = new TranslationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    TranslationsVerifyParameters translationsVerifyParameters = new TranslationsVerifyParameters(); // TranslationsVerifyParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AffectedCount result = apiInstance.translationsVerifyCollection(projectId, translationsVerifyParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationsApi#translationsVerifyCollection");
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
 **translationsVerifyParameters** | [**TranslationsVerifyParameters**](TranslationsVerifyParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AffectedCount**](AffectedCount.md)

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

