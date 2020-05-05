# JobLocalesApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobLocaleComplete**](JobLocalesApi.md#jobLocaleComplete) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/complete | Complete a job locale
[**jobLocaleDelete**](JobLocalesApi.md#jobLocaleDelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/locales/{id} | Delete a job locale
[**jobLocaleReopen**](JobLocalesApi.md#jobLocaleReopen) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/reopen | Reopen a job locale
[**jobLocaleShow**](JobLocalesApi.md#jobLocaleShow) | **GET** /projects/{project_id}/jobs/{job_id}/locale/{id} | Get a single job locale
[**jobLocaleUpdate**](JobLocalesApi.md#jobLocaleUpdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/locales/{id} | Update a job locale
[**jobLocalesCreate**](JobLocalesApi.md#jobLocalesCreate) | **POST** /projects/{project_id}/jobs/{job_id}/locales | Create a job locale
[**jobLocalesList**](JobLocalesApi.md#jobLocalesList) | **GET** /projects/{project_id}/jobs/{job_id}/locales | List job locales


<a name="jobLocaleComplete"></a>
# **jobLocaleComplete**
> JobLocale jobLocaleComplete(projectId, jobId, id, jobLocaleCompleteParameters, xPhraseAppOTP)

Complete a job locale

Mark a job locale as completed.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | ID
    JobLocaleCompleteParameters jobLocaleCompleteParameters = new JobLocaleCompleteParameters(); // JobLocaleCompleteParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobLocale result = apiInstance.jobLocaleComplete(projectId, jobId, id, jobLocaleCompleteParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocaleComplete");
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
 **jobId** | **String**| Job ID |
 **id** | **String**| ID |
 **jobLocaleCompleteParameters** | [**JobLocaleCompleteParameters**](JobLocaleCompleteParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocaleDelete"></a>
# **jobLocaleDelete**
> jobLocaleDelete(projectId, jobId, id, xPhraseAppOTP, branch)

Delete a job locale

Delete an existing job locale.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      apiInstance.jobLocaleDelete(projectId, jobId, id, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocaleDelete");
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
 **jobId** | **String**| Job ID |
 **id** | **String**| ID |
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

<a name="jobLocaleReopen"></a>
# **jobLocaleReopen**
> JobLocale jobLocaleReopen(projectId, jobId, id, jobLocaleReopenParameters, xPhraseAppOTP)

Reopen a job locale

Mark a job locale as uncompleted.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | ID
    JobLocaleReopenParameters jobLocaleReopenParameters = new JobLocaleReopenParameters(); // JobLocaleReopenParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobLocale result = apiInstance.jobLocaleReopen(projectId, jobId, id, jobLocaleReopenParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocaleReopen");
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
 **jobId** | **String**| Job ID |
 **id** | **String**| ID |
 **jobLocaleReopenParameters** | [**JobLocaleReopenParameters**](JobLocaleReopenParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocaleShow"></a>
# **jobLocaleShow**
> JobLocale jobLocaleShow(projectId, jobId, id, xPhraseAppOTP, branch)

Get a single job locale

Get a single job locale for a given job.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      JobLocale result = apiInstance.jobLocaleShow(projectId, jobId, id, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocaleShow");
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
 **jobId** | **String**| Job ID |
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocaleUpdate"></a>
# **jobLocaleUpdate**
> JobLocale jobLocaleUpdate(projectId, jobId, id, jobLocaleUpdateParameters, xPhraseAppOTP)

Update a job locale

Update an existing job locale.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | ID
    JobLocaleUpdateParameters jobLocaleUpdateParameters = new JobLocaleUpdateParameters(); // JobLocaleUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobLocale result = apiInstance.jobLocaleUpdate(projectId, jobId, id, jobLocaleUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocaleUpdate");
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
 **jobId** | **String**| Job ID |
 **id** | **String**| ID |
 **jobLocaleUpdateParameters** | [**JobLocaleUpdateParameters**](JobLocaleUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobLocale**](JobLocale.md)

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

<a name="jobLocalesCreate"></a>
# **jobLocalesCreate**
> jobLocalesCreate(projectId, jobId, jobLocalesCreateParameters, xPhraseAppOTP)

Create a job locale

Create a new job locale.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    JobLocalesCreateParameters jobLocalesCreateParameters = new JobLocalesCreateParameters(); // JobLocalesCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.jobLocalesCreate(projectId, jobId, jobLocalesCreateParameters, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocalesCreate");
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
 **jobId** | **String**| Job ID |
 **jobLocalesCreateParameters** | [**JobLocalesCreateParameters**](JobLocalesCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

null (empty response body)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The resource has been created |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="jobLocalesList"></a>
# **jobLocalesList**
> List&lt;JobLocale&gt; jobLocalesList(projectId, jobId, xPhraseAppOTP, page, perPage, branch)

List job locales

List all job locales for a given job.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.JobLocalesApi;

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

    JobLocalesApi apiInstance = new JobLocalesApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 10; // Integer | allows you to specify a page size up to 100 items, 10 by default
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      List<JobLocale> result = apiInstance.jobLocalesList(projectId, jobId, xPhraseAppOTP, page, perPage, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobLocalesApi#jobLocalesList");
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
 **jobId** | **String**| Job ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

[**List&lt;JobLocale&gt;**](JobLocale.md)

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

