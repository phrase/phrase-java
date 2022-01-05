# SearchApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchInAccount**](SearchApi.md#searchInAccount) | **POST** /accounts/{account_id}/search | Search across projects


<a name="searchInAccount"></a>
# **searchInAccount**
> AccountSearchResult searchInAccount(accountId, searchInAccountParameters, xPhraseAppOTP)

Search across projects

Search for keys and translations in all account projects

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.SearchApi;

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

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String accountId = "accountId_example"; // String | Account ID
    SearchInAccountParameters searchInAccountParameters = new SearchInAccountParameters(); // SearchInAccountParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AccountSearchResult result = apiInstance.searchInAccount(accountId, searchInAccountParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchInAccount");
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
 **searchInAccountParameters** | [**SearchInAccountParameters**](SearchInAccountParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**AccountSearchResult**](AccountSearchResult.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token), [bearerAuth](../README.md#bearerAuth)

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

