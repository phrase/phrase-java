/*
 * Phrase Strings API Reference
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@phrase.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.phrase.client.api;

import com.phrase.client.ApiCallback;
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.ApiResponse;
import com.phrase.client.Configuration;
import com.phrase.client.Pair;
import com.phrase.client.ProgressRequestBody;
import com.phrase.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.phrase.client.model.CustomMetadataPropertyCreate422Response;
import com.phrase.client.model.GithubSyncExportParameters;
import com.phrase.client.model.GithubSyncImportParameters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GitHubSyncApi {
    private ApiClient localVarApiClient;

    public GitHubSyncApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GitHubSyncApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for githubSyncExport
     * @param githubSyncExportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call githubSyncExportCall(GithubSyncExportParameters githubSyncExportParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = githubSyncExportParameters;

        // create path and map variables
        String localVarPath = "/github_syncs/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPhraseAppOTP != null) {
            localVarHeaderParams.put("X-PhraseApp-OTP", localVarApiClient.parameterToString(xPhraseAppOTP));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic", "Token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call githubSyncExportValidateBeforeCall(GithubSyncExportParameters githubSyncExportParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'githubSyncExportParameters' is set
        if (githubSyncExportParameters == null) {
            throw new ApiException("Missing the required parameter 'githubSyncExportParameters' when calling githubSyncExport(Async)");
        }
        

        okhttp3.Call localVarCall = githubSyncExportCall(githubSyncExportParameters, xPhraseAppOTP, _callback);
        return localVarCall;

    }

    /**
     * Export from Phrase Strings to GitHub
     * Export translations from Phrase Strings to GitHub according to the .phraseapp.yml file within the GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Export is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     * @param githubSyncExportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public void githubSyncExport(GithubSyncExportParameters githubSyncExportParameters, String xPhraseAppOTP) throws ApiException {
        githubSyncExportWithHttpInfo(githubSyncExportParameters, xPhraseAppOTP);
    }

    /**
     * Export from Phrase Strings to GitHub
     * Export translations from Phrase Strings to GitHub according to the .phraseapp.yml file within the GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Export is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     * @param githubSyncExportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> githubSyncExportWithHttpInfo(GithubSyncExportParameters githubSyncExportParameters, String xPhraseAppOTP) throws ApiException {
        okhttp3.Call localVarCall = githubSyncExportValidateBeforeCall(githubSyncExportParameters, xPhraseAppOTP, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Export from Phrase Strings to GitHub (asynchronously)
     * Export translations from Phrase Strings to GitHub according to the .phraseapp.yml file within the GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Export is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     * @param githubSyncExportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call githubSyncExportAsync(GithubSyncExportParameters githubSyncExportParameters, String xPhraseAppOTP, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = githubSyncExportValidateBeforeCall(githubSyncExportParameters, xPhraseAppOTP, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for githubSyncImport
     * @param githubSyncImportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call githubSyncImportCall(GithubSyncImportParameters githubSyncImportParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = githubSyncImportParameters;

        // create path and map variables
        String localVarPath = "/github_syncs/import";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPhraseAppOTP != null) {
            localVarHeaderParams.put("X-PhraseApp-OTP", localVarApiClient.parameterToString(xPhraseAppOTP));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic", "Token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call githubSyncImportValidateBeforeCall(GithubSyncImportParameters githubSyncImportParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'githubSyncImportParameters' is set
        if (githubSyncImportParameters == null) {
            throw new ApiException("Missing the required parameter 'githubSyncImportParameters' when calling githubSyncImport(Async)");
        }
        

        okhttp3.Call localVarCall = githubSyncImportCall(githubSyncImportParameters, xPhraseAppOTP, _callback);
        return localVarCall;

    }

    /**
     * Import to Phrase Strings from GitHub
     * Import files to Phrase Strings from your connected GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Import is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     * @param githubSyncImportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public void githubSyncImport(GithubSyncImportParameters githubSyncImportParameters, String xPhraseAppOTP) throws ApiException {
        githubSyncImportWithHttpInfo(githubSyncImportParameters, xPhraseAppOTP);
    }

    /**
     * Import to Phrase Strings from GitHub
     * Import files to Phrase Strings from your connected GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Import is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     * @param githubSyncImportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> githubSyncImportWithHttpInfo(GithubSyncImportParameters githubSyncImportParameters, String xPhraseAppOTP) throws ApiException {
        okhttp3.Call localVarCall = githubSyncImportValidateBeforeCall(githubSyncImportParameters, xPhraseAppOTP, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Import to Phrase Strings from GitHub (asynchronously)
     * Import files to Phrase Strings from your connected GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Import is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     * @param githubSyncImportParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call githubSyncImportAsync(GithubSyncImportParameters githubSyncImportParameters, String xPhraseAppOTP, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = githubSyncImportValidateBeforeCall(githubSyncImportParameters, xPhraseAppOTP, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
