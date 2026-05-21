# ProjectsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectCreate**](ProjectsApi.md#projectCreate) | **POST** /projects | Create a project
[**projectDelete**](ProjectsApi.md#projectDelete) | **DELETE** /projects/{id} | Delete a project
[**projectShow**](ProjectsApi.md#projectShow) | **GET** /projects/{id} | Get a single project
[**projectUpdate**](ProjectsApi.md#projectUpdate) | **PATCH** /projects/{id} | Update a project
[**projectsList**](ProjectsApi.md#projectsList) | **GET** /projects | List projects


<a name="projectCreate"></a>
# **projectCreate**
> ProjectDetails projectCreate(projectCreateParameters, xPhraseAppOTP)

Create a project

Create a new project in the given account.  When &#x60;source_project_id&#x60; is supplied, the new project is created as a clone of that project. All locales, keys, and translations are copied asynchronously after the response is returned, so they may not be available immediately. Settings from the source project are inherited unless explicitly overridden in the request; in clone mode, the &#x60;shares_translation_memory&#x60; field is ignored and inherited from the source.  &#x60;shares_translation_memory&#x60; defaults to &#x60;true&#x60; when omitted on a non-clone create. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    ProjectCreateParameters projectCreateParameters = new ProjectCreateParameters(); // ProjectCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      ProjectDetails result = apiInstance.projectCreate(projectCreateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#projectCreate");
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
 **projectCreateParameters** | [**ProjectCreateParameters**](ProjectCreateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ProjectDetails**](ProjectDetails.md)

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="projectDelete"></a>
# **projectDelete**
> projectDelete(id, xPhraseAppOTP)

Delete a project

Delete an existing project. Associated repository syncs and OTA distributions are removed. A &#x60;project:delete&#x60; event is dispatched. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.projectDelete(id, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#projectDelete");
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
**204** | The resource was deleted successfully. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="projectShow"></a>
# **projectShow**
> ProjectDetails projectShow(id, xPhraseAppOTP)

Get a single project

Get details on a single project.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      ProjectDetails result = apiInstance.projectShow(id, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#projectShow");
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
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ProjectDetails**](ProjectDetails.md)

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="projectUpdate"></a>
# **projectUpdate**
> ProjectDetails projectUpdate(id, projectUpdateParameters, xPhraseAppOTP)

Update a project

Update an existing project.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String id = "id_example"; // String | ID
    ProjectUpdateParameters projectUpdateParameters = new ProjectUpdateParameters(); // ProjectUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      ProjectDetails result = apiInstance.projectUpdate(id, projectUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#projectUpdate");
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
 **projectUpdateParameters** | [**ProjectUpdateParameters**](ProjectUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**ProjectDetails**](ProjectDetails.md)

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="projectsList"></a>
# **projectsList**
> List&lt;Project&gt; projectsList(xPhraseAppOTP, page, perPage, accountId, sortBy, filters, q)

List projects

List all projects the current user has access to.  When the &#x60;account_id&#x60; query parameter is omitted, the response includes projects across every account the user is a member of. Pass &#x60;account_id&#x60; to scope the results to a single account. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.ProjectsApi;

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

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String accountId = "accountId_example"; // String | Filter by Account ID
    String sortBy = "name_asc"; // String | Sort projects. Valid values are `name_asc`, `name_desc`, `updated_at_asc`, `updated_at_desc`, `space_asc`, and `space_desc`. The trailing direction segment is optional; if omitted or invalid, projects are sorted ascending. Any other value is ignored and the default ordering is returned.
    List<String> filters = Arrays.asList(); // List<String> | Filter projects. The only supported value is `favorites`, which restricts the results to projects the current user has starred.
    String q = "name:android"; // String | Search query. The only supported syntax is `name:<text>` — for example `name:android` returns projects whose name matches `android` (case-insensitive substring). Any value that does not match the `name:` prefix is ignored.
    try {
      List<Project> result = apiInstance.projectsList(xPhraseAppOTP, page, perPage, accountId, sortBy, filters, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#projectsList");
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
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **accountId** | **String**| Filter by Account ID | [optional]
 **sortBy** | **String**| Sort projects. Valid values are &#x60;name_asc&#x60;, &#x60;name_desc&#x60;, &#x60;updated_at_asc&#x60;, &#x60;updated_at_desc&#x60;, &#x60;space_asc&#x60;, and &#x60;space_desc&#x60;. The trailing direction segment is optional; if omitted or invalid, projects are sorted ascending. Any other value is ignored and the default ordering is returned. | [optional] [enum: name_asc, name_desc, updated_at_asc, updated_at_desc, space_asc, space_desc]
 **filters** | [**List&lt;String&gt;**](String.md)| Filter projects. The only supported value is &#x60;favorites&#x60;, which restricts the results to projects the current user has starred. | [optional] [enum: favorites]
 **q** | **String**| Search query. The only supported syntax is &#x60;name:&lt;text&gt;&#x60; — for example &#x60;name:android&#x60; returns projects whose name matches &#x60;android&#x60; (case-insensitive substring). Any value that does not match the &#x60;name:&#x60; prefix is ignored. | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  * Pagination -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

