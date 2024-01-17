# OrganizationJobTemplateLocalesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationJobTemplateLocaleDelete**](OrganizationJobTemplateLocalesApi.md#organizationJobTemplateLocaleDelete) | **DELETE** /accounts/{account_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Delete an organization job template locale
[**organizationJobTemplateLocaleShow**](OrganizationJobTemplateLocalesApi.md#organizationJobTemplateLocaleShow) | **GET** /accounts/{account_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Get a single organization job template locale
[**organizationJobTemplateLocaleUpdate**](OrganizationJobTemplateLocalesApi.md#organizationJobTemplateLocaleUpdate) | **PATCH** /accounts/{account_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Update an organization job template locale
[**organizationJobTemplateLocalesCreate**](OrganizationJobTemplateLocalesApi.md#organizationJobTemplateLocalesCreate) | **POST** /accounts/{account_id}/job_templates/{job_template_id}/locales | Create an organization job template locale
[**organizationJobTemplateLocalesList**](OrganizationJobTemplateLocalesApi.md#organizationJobTemplateLocalesList) | **GET** /accounts/{account_id}/job_templates/{job_template_id}/locales | List organization job template locales


<a name="organizationJobTemplateLocaleDelete"></a>
# **organizationJobTemplateLocaleDelete**
> organizationJobTemplateLocaleDelete(accountId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP)

Delete an organization job template locale

Delete an existing organization job template locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.OrganizationJobTemplateLocalesApi;

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

    OrganizationJobTemplateLocalesApi apiInstance = new OrganizationJobTemplateLocalesApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String jobTemplateLocaleId = "jobTemplateLocaleId_example"; // String | Job Template Locale ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.organizationJobTemplateLocaleDelete(accountId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationJobTemplateLocalesApi#organizationJobTemplateLocaleDelete");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocaleId** | **String**| Job Template Locale ID |
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

<a name="organizationJobTemplateLocaleShow"></a>
# **organizationJobTemplateLocaleShow**
> JobTemplateLocales organizationJobTemplateLocaleShow(accountId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP)

Get a single organization job template locale

Get a single job template locale for a given organization job template.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.OrganizationJobTemplateLocalesApi;

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

    OrganizationJobTemplateLocalesApi apiInstance = new OrganizationJobTemplateLocalesApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String jobTemplateLocaleId = "jobTemplateLocaleId_example"; // String | Job Template Locale ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobTemplateLocales result = apiInstance.organizationJobTemplateLocaleShow(accountId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationJobTemplateLocalesApi#organizationJobTemplateLocaleShow");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocaleId** | **String**| Job Template Locale ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobTemplateLocales**](JobTemplateLocales.md)

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

<a name="organizationJobTemplateLocaleUpdate"></a>
# **organizationJobTemplateLocaleUpdate**
> JobTemplateLocales organizationJobTemplateLocaleUpdate(accountId, jobTemplateId, jobTemplateLocaleId, organizationJobTemplateLocaleUpdateParameters, xPhraseAppOTP)

Update an organization job template locale

Update an existing organization job template locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.OrganizationJobTemplateLocalesApi;

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

    OrganizationJobTemplateLocalesApi apiInstance = new OrganizationJobTemplateLocalesApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String jobTemplateLocaleId = "jobTemplateLocaleId_example"; // String | Job Template Locale ID
    OrganizationJobTemplateLocaleUpdateParameters organizationJobTemplateLocaleUpdateParameters = new OrganizationJobTemplateLocaleUpdateParameters(); // OrganizationJobTemplateLocaleUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobTemplateLocales result = apiInstance.organizationJobTemplateLocaleUpdate(accountId, jobTemplateId, jobTemplateLocaleId, organizationJobTemplateLocaleUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationJobTemplateLocalesApi#organizationJobTemplateLocaleUpdate");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocaleId** | **String**| Job Template Locale ID |
 **organizationJobTemplateLocaleUpdateParameters** | [**OrganizationJobTemplateLocaleUpdateParameters**](OrganizationJobTemplateLocaleUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobTemplateLocales**](JobTemplateLocales.md)

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

<a name="organizationJobTemplateLocalesCreate"></a>
# **organizationJobTemplateLocalesCreate**
> JobTemplateLocales organizationJobTemplateLocalesCreate(accountId, jobTemplateId, organizationJobTemplateLocalesCreateParameters, xPhraseAppOTP)

Create an organization job template locale

Create a new organization job template locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.OrganizationJobTemplateLocalesApi;

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

    OrganizationJobTemplateLocalesApi apiInstance = new OrganizationJobTemplateLocalesApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    OrganizationJobTemplateLocalesCreateParameters organizationJobTemplateLocalesCreateParameters = new OrganizationJobTemplateLocalesCreateParameters(); // OrganizationJobTemplateLocalesCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobTemplateLocales result = apiInstance.organizationJobTemplateLocalesCreate(accountId, jobTemplateId, organizationJobTemplateLocalesCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationJobTemplateLocalesApi#organizationJobTemplateLocalesCreate");
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
 **jobTemplateId** | **String**| Job Template ID |
 **organizationJobTemplateLocalesCreateParameters** | [**OrganizationJobTemplateLocalesCreateParameters**](OrganizationJobTemplateLocalesCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobTemplateLocales**](JobTemplateLocales.md)

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

<a name="organizationJobTemplateLocalesList"></a>
# **organizationJobTemplateLocalesList**
> List&lt;JobTemplateLocales&gt; organizationJobTemplateLocalesList(accountId, jobTemplateId, xPhraseAppOTP, page, perPage)

List organization job template locales

List all job template locales for a given organization job template.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.OrganizationJobTemplateLocalesApi;

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

    OrganizationJobTemplateLocalesApi apiInstance = new OrganizationJobTemplateLocalesApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    try {
      List<JobTemplateLocales> result = apiInstance.organizationJobTemplateLocalesList(accountId, jobTemplateId, xPhraseAppOTP, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationJobTemplateLocalesApi#organizationJobTemplateLocalesList");
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
 **jobTemplateId** | **String**| Job Template ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]

### Return type

[**List&lt;JobTemplateLocales&gt;**](JobTemplateLocales.md)

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

