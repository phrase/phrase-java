# TermsInTermBaseApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**glossaryTermCreate**](TermsInTermBaseApi.md#glossaryTermCreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms | Create a term
[**glossaryTermDelete**](TermsInTermBaseApi.md#glossaryTermDelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Delete a term
[**glossaryTermShow**](TermsInTermBaseApi.md#glossaryTermShow) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Get a single term
[**glossaryTermUpdate**](TermsInTermBaseApi.md#glossaryTermUpdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Update a term
[**glossaryTermsList**](TermsInTermBaseApi.md#glossaryTermsList) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms | List terms


<a name="glossaryTermCreate"></a>
# **glossaryTermCreate**
> GlossaryTerm glossaryTermCreate(accountId, glossaryId, glossaryTermCreateParameters, xPhraseAppOTP)

Create a term

Create a new term in a term base (previously: glossary).

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TermsInTermBaseApi;

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

    TermsInTermBaseApi apiInstance = new TermsInTermBaseApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    GlossaryTermCreateParameters glossaryTermCreateParameters = new GlossaryTermCreateParameters(); // GlossaryTermCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      GlossaryTerm result = apiInstance.glossaryTermCreate(accountId, glossaryId, glossaryTermCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsInTermBaseApi#glossaryTermCreate");
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
 **glossaryTermCreateParameters** | [**GlossaryTermCreateParameters**](GlossaryTermCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTerm**](GlossaryTerm.md)

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

<a name="glossaryTermDelete"></a>
# **glossaryTermDelete**
> glossaryTermDelete(accountId, glossaryId, id, xPhraseAppOTP)

Delete a term

Delete an existing term in a term base (previously: glossary).

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TermsInTermBaseApi;

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

    TermsInTermBaseApi apiInstance = new TermsInTermBaseApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.glossaryTermDelete(accountId, glossaryId, id, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsInTermBaseApi#glossaryTermDelete");
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

<a name="glossaryTermShow"></a>
# **glossaryTermShow**
> GlossaryTerm glossaryTermShow(accountId, glossaryId, id, xPhraseAppOTP)

Get a single term

Get details for a single term in the term base (previously: glossary).

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TermsInTermBaseApi;

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

    TermsInTermBaseApi apiInstance = new TermsInTermBaseApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      GlossaryTerm result = apiInstance.glossaryTermShow(accountId, glossaryId, id, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsInTermBaseApi#glossaryTermShow");
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
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTerm**](GlossaryTerm.md)

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

<a name="glossaryTermUpdate"></a>
# **glossaryTermUpdate**
> GlossaryTerm glossaryTermUpdate(accountId, glossaryId, id, glossaryTermUpdateParameters, xPhraseAppOTP)

Update a term

Update an existing term in a term base (previously: glossary).

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TermsInTermBaseApi;

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

    TermsInTermBaseApi apiInstance = new TermsInTermBaseApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String id = "id_example"; // String | ID
    GlossaryTermUpdateParameters glossaryTermUpdateParameters = new GlossaryTermUpdateParameters(); // GlossaryTermUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      GlossaryTerm result = apiInstance.glossaryTermUpdate(accountId, glossaryId, id, glossaryTermUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsInTermBaseApi#glossaryTermUpdate");
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
 **id** | **String**| ID |
 **glossaryTermUpdateParameters** | [**GlossaryTermUpdateParameters**](GlossaryTermUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**GlossaryTerm**](GlossaryTerm.md)

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

<a name="glossaryTermsList"></a>
# **glossaryTermsList**
> List&lt;GlossaryTerm&gt; glossaryTermsList(accountId, glossaryId, xPhraseAppOTP, page, perPage)

List terms

List all terms in term bases (previously: glossary) that the current user has access to.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.TermsInTermBaseApi;

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

    TermsInTermBaseApi apiInstance = new TermsInTermBaseApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String glossaryId = "glossaryId_example"; // String | Glossary ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | allows you to specify a page size up to 100 items, 25 by default
    try {
      List<GlossaryTerm> result = apiInstance.glossaryTermsList(accountId, glossaryId, xPhraseAppOTP, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TermsInTermBaseApi#glossaryTermsList");
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
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| allows you to specify a page size up to 100 items, 25 by default | [optional]

### Return type

[**List&lt;GlossaryTerm&gt;**](GlossaryTerm.md)

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

