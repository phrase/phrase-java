# JobTemplateLocalesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobTemplateLocaleDelete**](JobTemplateLocalesApi.md#jobTemplateLocaleDelete) | **DELETE** /projects/{project_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Delete a job template locale
[**jobTemplateLocaleShow**](JobTemplateLocalesApi.md#jobTemplateLocaleShow) | **GET** /projects/{project_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Get a single job template locale
[**jobTemplateLocaleUpdate**](JobTemplateLocalesApi.md#jobTemplateLocaleUpdate) | **PATCH** /projects/{project_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Update a job template locale
[**jobTemplateLocalesCreate**](JobTemplateLocalesApi.md#jobTemplateLocalesCreate) | **POST** /projects/{project_id}/job_templates/{job_template_id}/locales | Create a job template locale
[**jobTemplateLocalesList**](JobTemplateLocalesApi.md#jobTemplateLocalesList) | **GET** /projects/{project_id}/job_templates/{job_template_id}/locales | List job template locales


<a name="jobTemplateLocaleDelete"></a>
# **jobTemplateLocaleDelete**
> jobTemplateLocaleDelete(projectId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP, branch)

Delete a job template locale

Delete an existing job template locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobTemplateLocalesApi;

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

    JobTemplateLocalesApi apiInstance = new JobTemplateLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String jobTemplateLocaleId = "jobTemplateLocaleId_example"; // String | Job Template Locale ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      apiInstance.jobTemplateLocaleDelete(projectId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTemplateLocalesApi#jobTemplateLocaleDelete");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocaleId** | **String**| Job Template Locale ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| specify the branch to use | [optional]

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

<a name="jobTemplateLocaleShow"></a>
# **jobTemplateLocaleShow**
> Object jobTemplateLocaleShow(projectId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP, branch)

Get a single job template locale

Get a single job template locale for a given job template.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobTemplateLocalesApi;

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

    JobTemplateLocalesApi apiInstance = new JobTemplateLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String jobTemplateLocaleId = "jobTemplateLocaleId_example"; // String | Job Template Locale ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      Object result = apiInstance.jobTemplateLocaleShow(projectId, jobTemplateId, jobTemplateLocaleId, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTemplateLocalesApi#jobTemplateLocaleShow");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocaleId** | **String**| Job Template Locale ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

**Object**

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

<a name="jobTemplateLocaleUpdate"></a>
# **jobTemplateLocaleUpdate**
> Object jobTemplateLocaleUpdate(projectId, jobTemplateId, jobTemplateLocaleId, jobTemplateLocaleUpdateParameters, xPhraseAppOTP)

Update a job template locale

Update an existing job template locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobTemplateLocalesApi;

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

    JobTemplateLocalesApi apiInstance = new JobTemplateLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String jobTemplateLocaleId = "jobTemplateLocaleId_example"; // String | Job Template Locale ID
    JobTemplateLocaleUpdateParameters jobTemplateLocaleUpdateParameters = new JobTemplateLocaleUpdateParameters(); // JobTemplateLocaleUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      Object result = apiInstance.jobTemplateLocaleUpdate(projectId, jobTemplateId, jobTemplateLocaleId, jobTemplateLocaleUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTemplateLocalesApi#jobTemplateLocaleUpdate");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocaleId** | **String**| Job Template Locale ID |
 **jobTemplateLocaleUpdateParameters** | [**JobTemplateLocaleUpdateParameters**](JobTemplateLocaleUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

**Object**

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

<a name="jobTemplateLocalesCreate"></a>
# **jobTemplateLocalesCreate**
> JobTemplateLocale jobTemplateLocalesCreate(projectId, jobTemplateId, jobTemplateLocalesCreateParameters, xPhraseAppOTP)

Create a job template locale

Create a new job template locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobTemplateLocalesApi;

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

    JobTemplateLocalesApi apiInstance = new JobTemplateLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    JobTemplateLocalesCreateParameters jobTemplateLocalesCreateParameters = new JobTemplateLocalesCreateParameters(); // JobTemplateLocalesCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobTemplateLocale result = apiInstance.jobTemplateLocalesCreate(projectId, jobTemplateId, jobTemplateLocalesCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTemplateLocalesApi#jobTemplateLocalesCreate");
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
 **jobTemplateId** | **String**| Job Template ID |
 **jobTemplateLocalesCreateParameters** | [**JobTemplateLocalesCreateParameters**](JobTemplateLocalesCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobTemplateLocale**](JobTemplateLocale.md)

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

<a name="jobTemplateLocalesList"></a>
# **jobTemplateLocalesList**
> List&lt;Object&gt; jobTemplateLocalesList(projectId, jobTemplateId, xPhraseAppOTP, page, perPage, branch)

List job template locales

List all job template locales for a given job template.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobTemplateLocalesApi;

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

    JobTemplateLocalesApi apiInstance = new JobTemplateLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobTemplateId = "jobTemplateId_example"; // String | Job Template ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | allows you to specify a page size up to 100 items, 25 by default
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      List<Object> result = apiInstance.jobTemplateLocalesList(projectId, jobTemplateId, xPhraseAppOTP, page, perPage, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTemplateLocalesApi#jobTemplateLocalesList");
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
 **jobTemplateId** | **String**| Job Template ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| allows you to specify a page size up to 100 items, 25 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

**List&lt;Object&gt;**

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

