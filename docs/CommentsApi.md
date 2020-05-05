# CommentsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commentCreate**](CommentsApi.md#commentCreate) | **POST** /projects/{project_id}/keys/{key_id}/comments | Create a comment
[**commentDelete**](CommentsApi.md#commentDelete) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id} | Delete a comment
[**commentMarkCheck**](CommentsApi.md#commentMarkCheck) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Check if comment is read
[**commentMarkRead**](CommentsApi.md#commentMarkRead) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as read
[**commentMarkUnread**](CommentsApi.md#commentMarkUnread) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as unread
[**commentShow**](CommentsApi.md#commentShow) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id} | Get a single comment
[**commentUpdate**](CommentsApi.md#commentUpdate) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id} | Update a comment
[**commentsList**](CommentsApi.md#commentsList) | **GET** /projects/{project_id}/keys/{key_id}/comments | List comments


<a name="commentCreate"></a>
# **commentCreate**
> commentCreate(projectId, keyId, commentCreateParameters, xPhraseAppOTP)

Create a comment

Create a new comment for a key.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    CommentCreateParameters commentCreateParameters = new CommentCreateParameters(); // CommentCreateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.commentCreate(projectId, keyId, commentCreateParameters, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentCreate");
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
 **commentCreateParameters** | [**CommentCreateParameters**](CommentCreateParameters.md)|  |
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

<a name="commentDelete"></a>
# **commentDelete**
> commentDelete(projectId, keyId, id, xPhraseAppOTP, branch)

Delete a comment

Delete an existing comment.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      apiInstance.commentDelete(projectId, keyId, id, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentDelete");
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

<a name="commentMarkCheck"></a>
# **commentMarkCheck**
> commentMarkCheck(projectId, keyId, id, xPhraseAppOTP, branch)

Check if comment is read

Check if comment was marked as read. Returns 204 if read, 404 if unread.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      apiInstance.commentMarkCheck(projectId, keyId, id, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentMarkCheck");
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

<a name="commentMarkRead"></a>
# **commentMarkRead**
> commentMarkRead(projectId, keyId, id, commentMarkReadParameters, xPhraseAppOTP)

Mark a comment as read

Mark a comment as read.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String id = "id_example"; // String | ID
    CommentMarkReadParameters commentMarkReadParameters = new CommentMarkReadParameters(); // CommentMarkReadParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.commentMarkRead(projectId, keyId, id, commentMarkReadParameters, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentMarkRead");
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
 **id** | **String**| ID |
 **commentMarkReadParameters** | [**CommentMarkReadParameters**](CommentMarkReadParameters.md)|  |
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
**204** | The resource was deleted successfully. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="commentMarkUnread"></a>
# **commentMarkUnread**
> commentMarkUnread(projectId, keyId, id, xPhraseAppOTP, branch)

Mark a comment as unread

Mark a comment as unread.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      apiInstance.commentMarkUnread(projectId, keyId, id, xPhraseAppOTP, branch);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentMarkUnread");
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

<a name="commentShow"></a>
# **commentShow**
> Comment commentShow(projectId, keyId, id, xPhraseAppOTP, branch)

Get a single comment

Get details on a single comment.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      Comment result = apiInstance.commentShow(projectId, keyId, id, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentShow");
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
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

[**Comment**](Comment.md)

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

<a name="commentUpdate"></a>
# **commentUpdate**
> Comment commentUpdate(projectId, keyId, id, commentUpdateParameters, xPhraseAppOTP)

Update a comment

Update an existing comment.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String id = "id_example"; // String | ID
    CommentUpdateParameters commentUpdateParameters = new CommentUpdateParameters(); // CommentUpdateParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      Comment result = apiInstance.commentUpdate(projectId, keyId, id, commentUpdateParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentUpdate");
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
 **id** | **String**| ID |
 **commentUpdateParameters** | [**CommentUpdateParameters**](CommentUpdateParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Comment**](Comment.md)

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

<a name="commentsList"></a>
# **commentsList**
> List&lt;Comment&gt; commentsList(projectId, keyId, xPhraseAppOTP, page, perPage, branch)

List comments

List all comments for a key.

### Example
```java
// Import classes:
import org.phrase.client.ApiClient;
import org.phrase.client.ApiException;
import org.phrase.client.Configuration;
import org.phrase.client.auth.*;
import org.phrase.client.models.*;
import org.phrase.client.api.CommentsApi;

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

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String keyId = "keyId_example"; // String | Translation Key ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 10; // Integer | allows you to specify a page size up to 100 items, 10 by default
    String branch = my-feature-branch; // String | specify the branch to use
    try {
      List<Comment> result = apiInstance.commentsList(projectId, keyId, xPhraseAppOTP, page, perPage, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#commentsList");
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
 **perPage** | **Integer**| allows you to specify a page size up to 100 items, 10 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

[**List&lt;Comment&gt;**](Comment.md)

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

