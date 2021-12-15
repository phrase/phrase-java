# IcuApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**icuSkeleton**](IcuApi.md#icuSkeleton) | **POST** /icu/skeleton | Build icu skeletons


<a name="icuSkeleton"></a>
# **icuSkeleton**
> Icu icuSkeleton(icuSkeletonParameters, xPhraseAppOTP)

Build icu skeletons

Returns icu skeletons for multiple locale codes based on a source content.

### Example
```java
// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.IcuApi;

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

    IcuApi apiInstance = new IcuApi(defaultClient);
    IcuSkeletonParameters icuSkeletonParameters = new IcuSkeletonParameters(); // IcuSkeletonParameters | 
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      Icu result = apiInstance.icuSkeleton(icuSkeletonParameters, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IcuApi#icuSkeleton");
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
 **icuSkeletonParameters** | [**IcuSkeletonParameters**](IcuSkeletonParameters.md)|  |
 **xPhraseAppOTP** | **String**| Two-Factor-Authentication token (optional) | [optional]

### Return type

[**Icu**](Icu.md)

### Authorization

[Basic](../README.md#Basic), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  * Link -  <br>  |
**400** | Bad request |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not Found |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**429** | Rate Limiting |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

