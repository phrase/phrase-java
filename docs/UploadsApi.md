# UploadsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadCreate**](UploadsApi.md#uploadCreate) | **POST** /projects/{project_id}/uploads | Upload a new file
[**uploadShow**](UploadsApi.md#uploadShow) | **GET** /projects/{project_id}/uploads/{id} | Get a single upload
[**uploadsList**](UploadsApi.md#uploadsList) | **GET** /projects/{project_id}/uploads | List uploads


<a name="uploadCreate"></a>
# **uploadCreate**
> Upload uploadCreate(projectId, xPhraseAppOTP, branch, _file, fileFormat, localeId, tags, updateTranslations, updateDescriptions, convertEmoji, skipUploadTags, skipUnverification, fileEncoding, localeMapping, formatOptions, autotranslate, markReviewed, tagOnlyAffectedKeys)

Upload a new file

Upload a new language file. Creates necessary resources in your project.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.UploadsApi;

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

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = "branch_example"; // String | specify the branch to use
    File _file = new File("/path/to/file"); // File | File to be imported
    String fileFormat = "fileFormat_example"; // String | File format. Auto-detected when possible and not specified.
    String localeId = "localeId_example"; // String | Locale of the file's content. Can be the name or public id of the locale. Preferred is the public id.
    String tags = "tags_example"; // String | List of tags separated by comma to be associated with the new keys contained in the upload.
    Boolean updateTranslations = true; // Boolean | Indicates whether existing translations should be updated with the file content.
    Boolean updateDescriptions = true; // Boolean | Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions.
    Boolean convertEmoji = true; // Boolean | This option is obsolete. Providing the option will cause a bad request error.
    Boolean skipUploadTags = true; // Boolean | Indicates whether the upload should not create upload tags.
    Boolean skipUnverification = true; // Boolean | Indicates whether the upload should unverify updated translations.
    String fileEncoding = "fileEncoding_example"; // String | Enforces a specific encoding on the file contents. Valid options are \\\"UTF-8\\\", \\\"UTF-16\\\" and \\\"ISO-8859-1\\\".
    Object localeMapping = null; // Object | Optional, format specific mapping between locale names and the columns the translations to those locales are contained in.
    Object formatOptions = null; // Object | Additional options available for specific formats. See our format guide for complete list.
    Boolean autotranslate = true; // Boolean | If set, translations for the uploaded language will be fetched automatically.
    Boolean markReviewed = true; // Boolean | Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow is enabled for the project.
    Boolean tagOnlyAffectedKeys = false; // Boolean | Indicates whether only keys affected (created or updated) by the upload should be tagged. The default is `false`
    try {
      Upload result = apiInstance.uploadCreate(projectId, xPhraseAppOTP, branch, _file, fileFormat, localeId, tags, updateTranslations, updateDescriptions, convertEmoji, skipUploadTags, skipUnverification, fileEncoding, localeMapping, formatOptions, autotranslate, markReviewed, tagOnlyAffectedKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadCreate");
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
 **branch** | **String**| specify the branch to use | [optional]
 **_file** | **File**| File to be imported | [optional]
 **fileFormat** | **String**| File format. Auto-detected when possible and not specified. | [optional]
 **localeId** | **String**| Locale of the file&#39;s content. Can be the name or public id of the locale. Preferred is the public id. | [optional]
 **tags** | **String**| List of tags separated by comma to be associated with the new keys contained in the upload. | [optional]
 **updateTranslations** | **Boolean**| Indicates whether existing translations should be updated with the file content. | [optional]
 **updateDescriptions** | **Boolean**| Existing key descriptions will be updated with the file content. Empty descriptions overwrite existing descriptions. | [optional]
 **convertEmoji** | **Boolean**| This option is obsolete. Providing the option will cause a bad request error. | [optional]
 **skipUploadTags** | **Boolean**| Indicates whether the upload should not create upload tags. | [optional]
 **skipUnverification** | **Boolean**| Indicates whether the upload should unverify updated translations. | [optional]
 **fileEncoding** | **String**| Enforces a specific encoding on the file contents. Valid options are \\\&quot;UTF-8\\\&quot;, \\\&quot;UTF-16\\\&quot; and \\\&quot;ISO-8859-1\\\&quot;. | [optional]
 **localeMapping** | [**Object**](Object.md)| Optional, format specific mapping between locale names and the columns the translations to those locales are contained in. | [optional]
 **formatOptions** | [**Object**](Object.md)| Additional options available for specific formats. See our format guide for complete list. | [optional]
 **autotranslate** | **Boolean**| If set, translations for the uploaded language will be fetched automatically. | [optional]
 **markReviewed** | **Boolean**| Indicated whether the imported translations should be marked as reviewed. This setting is available if the review workflow is enabled for the project. | [optional]
 **tagOnlyAffectedKeys** | **Boolean**| Indicates whether only keys affected (created or updated) by the upload should be tagged. The default is &#x60;false&#x60; | [optional] [default to false]

### Return type

[**Upload**](Upload.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="uploadShow"></a>
# **uploadShow**
> Upload uploadShow(projectId, id, xPhraseAppOTP, branch)

Get a single upload

View details and summary for a single upload.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.UploadsApi;

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

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    String branch = "my-feature-branch"; // String | specify the branch to use
    try {
      Upload result = apiInstance.uploadShow(projectId, id, xPhraseAppOTP, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadShow");
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

[**Upload**](Upload.md)

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

<a name="uploadsList"></a>
# **uploadsList**
> List&lt;Upload&gt; uploadsList(projectId, xPhraseAppOTP, page, perPage, branch)

List uploads

List all uploads for the given project.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.UploadsApi;

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

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String projectId = "projectId_example"; // String | Project ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String branch = "my-feature-branch"; // String | specify the branch to use
    try {
      List<Upload> result = apiInstance.uploadsList(projectId, xPhraseAppOTP, page, perPage, branch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadsList");
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
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **branch** | **String**| specify the branch to use | [optional]

### Return type

[**List&lt;Upload&gt;**](Upload.md)

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

