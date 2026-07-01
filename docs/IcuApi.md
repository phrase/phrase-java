# IcuApi

All URIs are relative to *https://api.phrase.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**icuSkeleton**](IcuApi.md#icuSkeleton) | **POST** /icu/skeleton | Build ICU skeletons


<a name="icuSkeleton"></a>
# **icuSkeleton**
> Icu icuSkeleton(icuSkeletonParameters, xPhraseAppOTP)

Build ICU skeletons

Generates ICU (International Components for Unicode) message format skeletons for a given source string across one or more locales. An ICU skeleton strips the literal text from a pluralized or select message while preserving its structural rules — argument names, plural categories, select cases, and ordinal forms — adjusted to the pluralization rules of each requested locale.  Use this endpoint to normalize translation templates before importing them into locale files, or to validate that a source string carries the plural forms required by a target language.  Either &#x60;content&#x60; or &#x60;id&#x60; must be provided — supplying both or neither returns 400. When &#x60;id&#x60; is used and the referenced translation does not exist, the endpoint returns 404. When the source string is not valid ICU message format syntax, the endpoint returns 422 with an &#x60;error&#x60; field describing the parse failure. 

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
    Token.setApiKeyPrefix("token");

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
**400** | Bad request. The request could not be parsed or a parameter failed validation. Verify the request body, the content type, and the parameter types, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**401** | Unauthorized. Authentication failed because the access token is missing, expired, or invalid. Supply a valid access token and retry. |  -  |
**403** | Forbidden. The credentials are valid but not permitted for this request: the access token may lack the required scope, the user may lack permission on the resource, or the account plan may not include the feature. Use a token with the required scope on an account and user that hold the necessary permissions. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**404** | Not found. The requested resource does not exist or is not visible to the authenticated user. Verify the identifiers in the request path and that the token has access to them, then retry. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |
**422** | Unprocessable entity. Returned when the source string is not valid ICU message format syntax. The response body contains an &#x60;error&#x60; field with a human-readable description of the parse failure. Correct the ICU syntax in the source string and retry. |  -  |
**429** | Too many requests. The rate limit has been exceeded. Wait until the time indicated by the &#x60;X-Rate-Limit-Reset&#x60; response header before retrying. |  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  |

