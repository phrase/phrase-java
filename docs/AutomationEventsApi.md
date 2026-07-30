# AutomationEventsApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountAutomationEventsList**](AutomationEventsApi.md#accountAutomationEventsList) | **GET** /accounts/{account_id}/automation_events | List automation events for an account
[**automationEventsList**](AutomationEventsApi.md#automationEventsList) | **GET** /accounts/{account_id}/automations/{automation_id}/events | List events for an automation


<a name="accountAutomationEventsList"></a>
# **accountAutomationEventsList**
> List&lt;AutomationEvent&gt; accountAutomationEventsList(accountId, xPhraseAppOTP, page, perPage, automationId, state, triggeredBy, projectId, projectIds, createdAfter, createdBefore)

List automation events for an account

Returns the run history across all automations in the account, newest-first.  Use &#x60;automation_id&#x60; to narrow results to a single automation. Use &#x60;project_id&#x60; or &#x60;project_ids&#x60; to narrow by project.  For feature availability, see [Jobs (Strings)](https://support.phrase.com/hc/en-us/articles/5784100517788-Jobs-Strings). 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.AutomationEventsApi;

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

    AutomationEventsApi apiInstance = new AutomationEventsApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String automationId = "automationId_example"; // String | Filter events to a single automation by its ID.
    String state = "success"; // String | Filter events by outcome state. Unrecognized values are ignored.
    String triggeredBy = "manual"; // String | Filter events by what triggered the automation run. Unrecognized values are ignored.
    String projectId = "projectId_example"; // String | Filter events by project ID. Accepts a single ID or a comma-separated list of IDs.
    List<String> projectIds = Arrays.asList(); // List<String> | Filter events by one or more project IDs.
    String createdAfter = "2023-01-01T00:00:00Z"; // String | Return only events created after this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time.
    String createdBefore = "2023-01-01T00:00:00Z"; // String | Return only events created before this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time.
    try {
      List<AutomationEvent> result = apiInstance.accountAutomationEventsList(accountId, xPhraseAppOTP, page, perPage, automationId, state, triggeredBy, projectId, projectIds, createdAfter, createdBefore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationEventsApi#accountAutomationEventsList");
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
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **automationId** | **String**| Filter events to a single automation by its ID. | [optional]
 **state** | **String**| Filter events by outcome state. Unrecognized values are ignored. | [optional] [enum: success, failure, in_progress]
 **triggeredBy** | **String**| Filter events by what triggered the automation run. Unrecognized values are ignored. | [optional] [enum: manual, schedule, upload, upload_batch]
 **projectId** | **String**| Filter events by project ID. Accepts a single ID or a comma-separated list of IDs. | [optional]
 **projectIds** | [**List&lt;String&gt;**](String.md)| Filter events by one or more project IDs. | [optional]
 **createdAfter** | **String**| Return only events created after this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time. | [optional]
 **createdBefore** | **String**| Return only events created before this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time. | [optional]

### Return type

[**List&lt;AutomationEvent&gt;**](AutomationEvent.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  * Pagination -  <br>  |
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

<a name="automationEventsList"></a>
# **automationEventsList**
> List&lt;AutomationEvent&gt; automationEventsList(accountId, id, xPhraseAppOTP, page, perPage, state, triggeredBy, projectId, projectIds, createdAfter, createdBefore)

List events for an automation

Returns the run history for a specific automation, newest-first.  For feature availability, see [Jobs (Strings)](https://support.phrase.com/hc/en-us/articles/5784100517788-Jobs-Strings). 

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.AutomationEventsApi;

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

    AutomationEventsApi apiInstance = new AutomationEventsApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    Integer page = 1; // Integer | Page number
    Integer perPage = 25; // Integer | Limit on the number of objects to be returned, between 1 and 100. 25 by default
    String state = "success"; // String | Filter events by outcome state. Unrecognized values are ignored.
    String triggeredBy = "manual"; // String | Filter events by what triggered the automation run. Unrecognized values are ignored.
    String projectId = "projectId_example"; // String | Filter events by project ID. Accepts a single ID or a comma-separated list of IDs.
    List<String> projectIds = Arrays.asList(); // List<String> | Filter events by one or more project IDs.
    String createdAfter = "2023-01-01T00:00:00Z"; // String | Return only events created after this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time.
    String createdBefore = "2023-01-01T00:00:00Z"; // String | Return only events created before this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time.
    try {
      List<AutomationEvent> result = apiInstance.automationEventsList(accountId, id, xPhraseAppOTP, page, perPage, state, triggeredBy, projectId, projectIds, createdAfter, createdBefore);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationEventsApi#automationEventsList");
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
 **page** | **Integer**| Page number | [optional]
 **perPage** | **Integer**| Limit on the number of objects to be returned, between 1 and 100. 25 by default | [optional]
 **state** | **String**| Filter events by outcome state. Unrecognized values are ignored. | [optional] [enum: success, failure, in_progress]
 **triggeredBy** | **String**| Filter events by what triggered the automation run. Unrecognized values are ignored. | [optional] [enum: manual, schedule, upload, upload_batch]
 **projectId** | **String**| Filter events by project ID. Accepts a single ID or a comma-separated list of IDs. | [optional]
 **projectIds** | [**List&lt;String&gt;**](String.md)| Filter events by one or more project IDs. | [optional]
 **createdAfter** | **String**| Return only events created after this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time. | [optional]
 **createdBefore** | **String**| Return only events created before this ISO 8601 timestamp. Returns 400 if the value is not a valid date-time. | [optional]

### Return type

[**List&lt;AutomationEvent&gt;**](AutomationEvent.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  * Pagination -  <br>  |
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not found. The requested resource does not exist or is not visible to the authenticated user. Verify the identifiers in the request path and that the token has access to them, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

