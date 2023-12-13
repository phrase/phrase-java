# CustomMetadataApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customMetadataPropertiesDelete**](CustomMetadataApi.md#customMetadataPropertiesDelete) | **DELETE** /accounts/{account_id}/custom_metadata/properties/{id} | Destroy property
[**customMetadataPropertiesList**](CustomMetadataApi.md#customMetadataPropertiesList) | **GET** /accounts/{account_id}/custom_metadata/properties | List properties
[**customMetadataPropertyCreate**](CustomMetadataApi.md#customMetadataPropertyCreate) | **POST** /accounts/{account_id}/custom_metadata/properties | Create a property
[**customMetadataPropertyShow**](CustomMetadataApi.md#customMetadataPropertyShow) | **GET** /accounts/{account_id}/custom_metadata/properties/{id} | Get a single property
[**customMetadataPropertyUpdate**](CustomMetadataApi.md#customMetadataPropertyUpdate) | **PATCH** /accounts/{account_id}/custom_metadata/properties/{id} | Update a property


<a name="customMetadataPropertiesDelete"></a>
# **customMetadataPropertiesDelete**
> customMetadataPropertiesDelete(accountId, id, xPhraseAppOTP)

Destroy property

Destroy a custom metadata property of an account.  This endpoint is only available to accounts with advanced plans or above. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.CustomMetadataApi;

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

    CustomMetadataApi apiInstance = new CustomMetadataApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      apiInstance.customMetadataPropertiesDelete(accountId, id, xPhraseAppOTP);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMetadataApi#customMetadataPropertiesDelete");
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

<a name="customMetadataPropertiesList"></a>
# **customMetadataPropertiesList**
> List&lt;CustomMetadataProperty&gt; customMetadataPropertiesList(accountId, xPhraseAppOTP, dataType, projectId, page, perPage, sort, order)

List properties

List all custom metadata properties for an account.  This endpoint is only available to accounts with advanced plans or above. 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.CustomMetadataApi;

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

    CustomMetadataApi apiInstance = new CustomMetadataApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    CustomMetadataDataType dataType = CustomMetadataDataType.fromValue("boolean"); // CustomMetadataDataType | Data Type of Custom Metadata Property
    String projectId = "abcd1234cdef1234abcd1234cdef1234"; // String | id of project that the properties belong to
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String sort = "updated_at"; // String | Sort criteria. Can be one of: name, data_type, created_at.
    String order = "desc"; // String | Order direction. Can be one of: asc, desc.
    try {
      List<CustomMetadataProperty> result = apiInstance.customMetadataPropertiesList(accountId, xPhraseAppOTP, dataType, projectId, page, perPage, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMetadataApi#customMetadataPropertiesList");
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
 **dataType** | [**CustomMetadataDataType**](.md)| Data Type of Custom Metadata Property | [optional] [enum: boolean, date, link, multi_select, number, single_select, string, text]
 **projectId** | **String**| id of project that the properties belong to | [optional]
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **sort** | **String**| Sort criteria. Can be one of: name, data_type, created_at. | [optional]
 **order** | **String**| Order direction. Can be one of: asc, desc. | [optional]

### Return type

[**List&lt;CustomMetadataProperty&gt;**](CustomMetadataProperty.md)

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

<a name="customMetadataPropertyCreate"></a>
# **customMetadataPropertyCreate**
> CustomMetadataProperty customMetadataPropertyCreate(accountId, name, dataType, xPhraseAppOTP, description, projectIds, valueOptions)

Create a property

Create a new custom metadata property.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.CustomMetadataApi;

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

    CustomMetadataApi apiInstance = new CustomMetadataApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String name = "[\"Fruit\"]"; // String | name of the property
    CustomMetadataDataType dataType = CustomMetadataDataType.fromValue("boolean"); // CustomMetadataDataType | Data Type of Custom Metadata Property
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String description = "[\"A healthy snack for all ages\"]"; // String | description of property
    List<String> projectIds = Arrays.asList(); // List<String> | ids of projects that the property belongs to
    List<String> valueOptions = Arrays.asList(); // List<String> | value options of property (only applies to single or multi select properties)
    try {
      CustomMetadataProperty result = apiInstance.customMetadataPropertyCreate(accountId, name, dataType, xPhraseAppOTP, description, projectIds, valueOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMetadataApi#customMetadataPropertyCreate");
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
 **name** | **String**| name of the property |
 **dataType** | [**CustomMetadataDataType**](.md)| Data Type of Custom Metadata Property | [enum: boolean, date, link, multi_select, number, single_select, string, text]
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **description** | **String**| description of property | [optional]
 **projectIds** | [**List&lt;String&gt;**](String.md)| ids of projects that the property belongs to | [optional]
 **valueOptions** | [**List&lt;String&gt;**](String.md)| value options of property (only applies to single or multi select properties) | [optional]

### Return type

[**CustomMetadataProperty**](CustomMetadataProperty.md)

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
**422** | Unprocessable entity |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="customMetadataPropertyShow"></a>
# **customMetadataPropertyShow**
> CustomMetadataProperty customMetadataPropertyShow(accountId, id, xPhraseAppOTP)

Get a single property

Get details of a single custom property.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.CustomMetadataApi;

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

    CustomMetadataApi apiInstance = new CustomMetadataApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      CustomMetadataProperty result = apiInstance.customMetadataPropertyShow(accountId, id, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMetadataApi#customMetadataPropertyShow");
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
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**CustomMetadataProperty**](CustomMetadataProperty.md)

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

<a name="customMetadataPropertyUpdate"></a>
# **customMetadataPropertyUpdate**
> CustomMetadataProperty customMetadataPropertyUpdate(accountId, id, xPhraseAppOTP, name, description, projectIds, valueOptions)

Update a property

Update an existing custom metadata property.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.CustomMetadataApi;

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

    CustomMetadataApi apiInstance = new CustomMetadataApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String name = "[\"Fruit\"]"; // String | name of the property
    String description = "[\"A healthy snack for all ages\"]"; // String | description of property
    List<String> projectIds = Arrays.asList(); // List<String> | ids of projects that the property belongs to
    List<String> valueOptions = Arrays.asList(); // List<String> | value options of property (only applies to single or multi select properties)
    try {
      CustomMetadataProperty result = apiInstance.customMetadataPropertyUpdate(accountId, id, xPhraseAppOTP, name, description, projectIds, valueOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMetadataApi#customMetadataPropertyUpdate");
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
 **id** | **String**| ID |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]
 **name** | **String**| name of the property | [optional]
 **description** | **String**| description of property | [optional]
 **projectIds** | [**List&lt;String&gt;**](String.md)| ids of projects that the property belongs to | [optional]
 **valueOptions** | [**List&lt;String&gt;**](String.md)| value options of property (only applies to single or multi select properties) | [optional]

### Return type

[**CustomMetadataProperty**](CustomMetadataProperty.md)

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
