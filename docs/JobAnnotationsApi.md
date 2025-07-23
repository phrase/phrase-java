# JobAnnotationsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jobAnnotationDelete**](JobAnnotationsApi.md#jobAnnotationDelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/annotations/{id} | Delete a job annotation
[**jobAnnotationUpdate**](JobAnnotationsApi.md#jobAnnotationUpdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/annotations/{id} | Create/Update a job annotation
[**jobAnnotationsList**](JobAnnotationsApi.md#jobAnnotationsList) | **GET** /projects/{project_id}/jobs/{job_id}/annotations | List job annotations
[**jobLocaleAnnotationDelete**](JobAnnotationsApi.md#jobLocaleAnnotationDelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/locales/{job_locale_id}/annotations/{id} | Delete a job locale annotation
[**jobLocaleAnnotationUpdate**](JobAnnotationsApi.md#jobLocaleAnnotationUpdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/locales/{job_locale_id}/annotations/{id} | Create/Update a job locale annotation
[**jobLocaleAnnotationsList**](JobAnnotationsApi.md#jobLocaleAnnotationsList) | **GET** /projects/{project_id}/jobs/{job_id}/locales/{job_locale_id}/annotations | List job locale annotations


<a name="jobAnnotationDelete"></a>
# **jobAnnotationDelete**
> jobAnnotationDelete(projectId, jobId, id, xPhraseAppOTP, branch)

Delete a job annotation

Delete an annotation for a job.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobAnnotationsApi;

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

    JobAnnotationsApi apiInstance = new JobAnnotationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | Name of the annotation to delete.
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = "my-feature-branch"; // String | Branch to use
    try {
      apiInstance.jobAnnotationDelete(projectId, jobId, id, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobAnnotationsApi#jobAnnotationDelete");
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
 **id** | **String**| Name of the annotation to delete. |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| Branch to use | [optional]

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
**204** | No Content |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="jobAnnotationUpdate"></a>
# **jobAnnotationUpdate**
> JobAnnotation jobAnnotationUpdate(projectId, jobId, id, jobAnnotationUpdateParameters, xPhraseAppOTP)

Create/Update a job annotation

Create or update an annotation for a job. If the annotation already exists, it will be updated; otherwise, a new annotation will be created.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobAnnotationsApi;

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

    JobAnnotationsApi apiInstance = new JobAnnotationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String id = "id_example"; // String | Name of the annotation to set or update.
    JobAnnotationUpdateParameters jobAnnotationUpdateParameters = new JobAnnotationUpdateParameters(); // JobAnnotationUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobAnnotation result = apiInstance.jobAnnotationUpdate(projectId, jobId, id, jobAnnotationUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobAnnotationsApi#jobAnnotationUpdate");
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
 **id** | **String**| Name of the annotation to set or update. |
 **jobAnnotationUpdateParameters** | [**JobAnnotationUpdateParameters**](JobAnnotationUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobAnnotation**](JobAnnotation.md)

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

<a name="jobAnnotationsList"></a>
# **jobAnnotationsList**
> List&lt;JobAnnotation&gt; jobAnnotationsList(projectId, jobId, xPhraseAppOTP, branch)

List job annotations

Retrieve a list of annotations for a job.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobAnnotationsApi;

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

    JobAnnotationsApi apiInstance = new JobAnnotationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = "my-feature-branch"; // String | Branch to use
    try {
      List<JobAnnotation> result = apiInstance.jobAnnotationsList(projectId, jobId, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobAnnotationsApi#jobAnnotationsList");
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
 **branch** | **String**| Branch to use | [optional]

### Return type

[**List&lt;JobAnnotation&gt;**](JobAnnotation.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="jobLocaleAnnotationDelete"></a>
# **jobLocaleAnnotationDelete**
> jobLocaleAnnotationDelete(projectId, jobId, jobLocaleId, id, xPhraseAppOTP, branch)

Delete a job locale annotation

Delete an annotation for a job locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobAnnotationsApi;

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

    JobAnnotationsApi apiInstance = new JobAnnotationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String jobLocaleId = "jobLocaleId_example"; // String | Job Locale ID
    String id = "id_example"; // String | Name of the annotation to delete.
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = "my-feature-branch"; // String | Branch to use
    try {
      apiInstance.jobLocaleAnnotationDelete(projectId, jobId, jobLocaleId, id, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobAnnotationsApi#jobLocaleAnnotationDelete");
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
 **jobLocaleId** | **String**| Job Locale ID |
 **id** | **String**| Name of the annotation to delete. |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| Branch to use | [optional]

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
**204** | No Content |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="jobLocaleAnnotationUpdate"></a>
# **jobLocaleAnnotationUpdate**
> JobAnnotation jobLocaleAnnotationUpdate(projectId, jobId, jobLocaleId, id, jobAnnotationUpdateParameters, xPhraseAppOTP)

Create/Update a job locale annotation

Create or update an annotation for a job locale. If the annotation already exists, it will be updated; otherwise, a new annotation will be created.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobAnnotationsApi;

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

    JobAnnotationsApi apiInstance = new JobAnnotationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String jobLocaleId = "jobLocaleId_example"; // String | Job Locale ID
    String id = "id_example"; // String | Name of the annotation to set or update.
    JobAnnotationUpdateParameters jobAnnotationUpdateParameters = new JobAnnotationUpdateParameters(); // JobAnnotationUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      JobAnnotation result = apiInstance.jobLocaleAnnotationUpdate(projectId, jobId, jobLocaleId, id, jobAnnotationUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobAnnotationsApi#jobLocaleAnnotationUpdate");
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
 **jobLocaleId** | **String**| Job Locale ID |
 **id** | **String**| Name of the annotation to set or update. |
 **jobAnnotationUpdateParameters** | [**JobAnnotationUpdateParameters**](JobAnnotationUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**JobAnnotation**](JobAnnotation.md)

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

<a name="jobLocaleAnnotationsList"></a>
# **jobLocaleAnnotationsList**
> List&lt;JobAnnotation&gt; jobLocaleAnnotationsList(projectId, jobId, jobLocaleId, xPhraseAppOTP, branch)

List job locale annotations

Retrieve a list of annotations for a job locale.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.JobAnnotationsApi;

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

    JobAnnotationsApi apiInstance = new JobAnnotationsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String jobId = "jobId_example"; // String | Job ID
    String jobLocaleId = "jobLocaleId_example"; // String | Job Locale ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = "my-feature-branch"; // String | Branch to use
    try {
      List<JobAnnotation> result = apiInstance.jobLocaleAnnotationsList(projectId, jobId, jobLocaleId, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobAnnotationsApi#jobLocaleAnnotationsList");
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
 **jobLocaleId** | **String**| Job Locale ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| Branch to use | [optional]

### Return type

[**List&lt;JobAnnotation&gt;**](JobAnnotation.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

