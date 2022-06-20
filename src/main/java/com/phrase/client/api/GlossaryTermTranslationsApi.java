/*
 * Phrase API Reference
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


import com.phrase.client.model.GlossaryTermTranslation;
import com.phrase.client.model.GlossaryTermTranslationCreateParameters;
import com.phrase.client.model.GlossaryTermTranslationUpdateParameters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlossaryTermTranslationsApi {
    private ApiClient localVarApiClient;

    public GlossaryTermTranslationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GlossaryTermTranslationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for glossaryTermTranslationCreate
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param glossaryTermTranslationCreateParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call glossaryTermTranslationCreateCall(String accountId, String glossaryId, String termId, GlossaryTermTranslationCreateParameters glossaryTermTranslationCreateParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = glossaryTermTranslationCreateParameters;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations"
            .replaceAll("\\{" + "account_id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "glossary_id" + "\\}", localVarApiClient.escapeString(glossaryId.toString()))
            .replaceAll("\\{" + "term_id" + "\\}", localVarApiClient.escapeString(termId.toString()));

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
    private okhttp3.Call glossaryTermTranslationCreateValidateBeforeCall(String accountId, String glossaryId, String termId, GlossaryTermTranslationCreateParameters glossaryTermTranslationCreateParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling glossaryTermTranslationCreate(Async)");
        }
        
        // verify the required parameter 'glossaryId' is set
        if (glossaryId == null) {
            throw new ApiException("Missing the required parameter 'glossaryId' when calling glossaryTermTranslationCreate(Async)");
        }
        
        // verify the required parameter 'termId' is set
        if (termId == null) {
            throw new ApiException("Missing the required parameter 'termId' when calling glossaryTermTranslationCreate(Async)");
        }
        
        // verify the required parameter 'glossaryTermTranslationCreateParameters' is set
        if (glossaryTermTranslationCreateParameters == null) {
            throw new ApiException("Missing the required parameter 'glossaryTermTranslationCreateParameters' when calling glossaryTermTranslationCreate(Async)");
        }
        

        okhttp3.Call localVarCall = glossaryTermTranslationCreateCall(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xPhraseAppOTP, _callback);
        return localVarCall;

    }

    /**
     * Create a translation for a term
     * Create a new translation for a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param glossaryTermTranslationCreateParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return GlossaryTermTranslation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public GlossaryTermTranslation glossaryTermTranslationCreate(String accountId, String glossaryId, String termId, GlossaryTermTranslationCreateParameters glossaryTermTranslationCreateParameters, String xPhraseAppOTP) throws ApiException {
        ApiResponse<GlossaryTermTranslation> localVarResp = glossaryTermTranslationCreateWithHttpInfo(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xPhraseAppOTP);
        return localVarResp.getData();
    }

    /**
     * Create a translation for a term
     * Create a new translation for a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param glossaryTermTranslationCreateParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return ApiResponse&lt;GlossaryTermTranslation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GlossaryTermTranslation> glossaryTermTranslationCreateWithHttpInfo(String accountId, String glossaryId, String termId, GlossaryTermTranslationCreateParameters glossaryTermTranslationCreateParameters, String xPhraseAppOTP) throws ApiException {
        okhttp3.Call localVarCall = glossaryTermTranslationCreateValidateBeforeCall(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xPhraseAppOTP, null);
        Type localVarReturnType = new TypeToken<GlossaryTermTranslation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a translation for a term (asynchronously)
     * Create a new translation for a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param glossaryTermTranslationCreateParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call glossaryTermTranslationCreateAsync(String accountId, String glossaryId, String termId, GlossaryTermTranslationCreateParameters glossaryTermTranslationCreateParameters, String xPhraseAppOTP, final ApiCallback<GlossaryTermTranslation> _callback) throws ApiException {

        okhttp3.Call localVarCall = glossaryTermTranslationCreateValidateBeforeCall(accountId, glossaryId, termId, glossaryTermTranslationCreateParameters, xPhraseAppOTP, _callback);
        Type localVarReturnType = new TypeToken<GlossaryTermTranslation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for glossaryTermTranslationDelete
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call glossaryTermTranslationDeleteCall(String accountId, String glossaryId, String termId, String id, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id}"
            .replaceAll("\\{" + "account_id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "glossary_id" + "\\}", localVarApiClient.escapeString(glossaryId.toString()))
            .replaceAll("\\{" + "term_id" + "\\}", localVarApiClient.escapeString(termId.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xPhraseAppOTP != null) {
            localVarHeaderParams.put("X-PhraseApp-OTP", localVarApiClient.parameterToString(xPhraseAppOTP));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic", "Token" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call glossaryTermTranslationDeleteValidateBeforeCall(String accountId, String glossaryId, String termId, String id, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling glossaryTermTranslationDelete(Async)");
        }
        
        // verify the required parameter 'glossaryId' is set
        if (glossaryId == null) {
            throw new ApiException("Missing the required parameter 'glossaryId' when calling glossaryTermTranslationDelete(Async)");
        }
        
        // verify the required parameter 'termId' is set
        if (termId == null) {
            throw new ApiException("Missing the required parameter 'termId' when calling glossaryTermTranslationDelete(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling glossaryTermTranslationDelete(Async)");
        }
        

        okhttp3.Call localVarCall = glossaryTermTranslationDeleteCall(accountId, glossaryId, termId, id, xPhraseAppOTP, _callback);
        return localVarCall;

    }

    /**
     * Delete a translation for a term
     * Delete an existing translation of a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public void glossaryTermTranslationDelete(String accountId, String glossaryId, String termId, String id, String xPhraseAppOTP) throws ApiException {
        glossaryTermTranslationDeleteWithHttpInfo(accountId, glossaryId, termId, id, xPhraseAppOTP);
    }

    /**
     * Delete a translation for a term
     * Delete an existing translation of a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> glossaryTermTranslationDeleteWithHttpInfo(String accountId, String glossaryId, String termId, String id, String xPhraseAppOTP) throws ApiException {
        okhttp3.Call localVarCall = glossaryTermTranslationDeleteValidateBeforeCall(accountId, glossaryId, termId, id, xPhraseAppOTP, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a translation for a term (asynchronously)
     * Delete an existing translation of a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call glossaryTermTranslationDeleteAsync(String accountId, String glossaryId, String termId, String id, String xPhraseAppOTP, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = glossaryTermTranslationDeleteValidateBeforeCall(accountId, glossaryId, termId, id, xPhraseAppOTP, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for glossaryTermTranslationUpdate
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param glossaryTermTranslationUpdateParameters  (required)
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
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call glossaryTermTranslationUpdateCall(String accountId, String glossaryId, String termId, String id, GlossaryTermTranslationUpdateParameters glossaryTermTranslationUpdateParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = glossaryTermTranslationUpdateParameters;

        // create path and map variables
        String localVarPath = "/accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id}"
            .replaceAll("\\{" + "account_id" + "\\}", localVarApiClient.escapeString(accountId.toString()))
            .replaceAll("\\{" + "glossary_id" + "\\}", localVarApiClient.escapeString(glossaryId.toString()))
            .replaceAll("\\{" + "term_id" + "\\}", localVarApiClient.escapeString(termId.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call glossaryTermTranslationUpdateValidateBeforeCall(String accountId, String glossaryId, String termId, String id, GlossaryTermTranslationUpdateParameters glossaryTermTranslationUpdateParameters, String xPhraseAppOTP, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling glossaryTermTranslationUpdate(Async)");
        }
        
        // verify the required parameter 'glossaryId' is set
        if (glossaryId == null) {
            throw new ApiException("Missing the required parameter 'glossaryId' when calling glossaryTermTranslationUpdate(Async)");
        }
        
        // verify the required parameter 'termId' is set
        if (termId == null) {
            throw new ApiException("Missing the required parameter 'termId' when calling glossaryTermTranslationUpdate(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling glossaryTermTranslationUpdate(Async)");
        }
        
        // verify the required parameter 'glossaryTermTranslationUpdateParameters' is set
        if (glossaryTermTranslationUpdateParameters == null) {
            throw new ApiException("Missing the required parameter 'glossaryTermTranslationUpdateParameters' when calling glossaryTermTranslationUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = glossaryTermTranslationUpdateCall(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xPhraseAppOTP, _callback);
        return localVarCall;

    }

    /**
     * Update a translation for a term
     * Update an existing translation for a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param glossaryTermTranslationUpdateParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return GlossaryTermTranslation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public GlossaryTermTranslation glossaryTermTranslationUpdate(String accountId, String glossaryId, String termId, String id, GlossaryTermTranslationUpdateParameters glossaryTermTranslationUpdateParameters, String xPhraseAppOTP) throws ApiException {
        ApiResponse<GlossaryTermTranslation> localVarResp = glossaryTermTranslationUpdateWithHttpInfo(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xPhraseAppOTP);
        return localVarResp.getData();
    }

    /**
     * Update a translation for a term
     * Update an existing translation for a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param glossaryTermTranslationUpdateParameters  (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @return ApiResponse&lt;GlossaryTermTranslation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GlossaryTermTranslation> glossaryTermTranslationUpdateWithHttpInfo(String accountId, String glossaryId, String termId, String id, GlossaryTermTranslationUpdateParameters glossaryTermTranslationUpdateParameters, String xPhraseAppOTP) throws ApiException {
        okhttp3.Call localVarCall = glossaryTermTranslationUpdateValidateBeforeCall(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xPhraseAppOTP, null);
        Type localVarReturnType = new TypeToken<GlossaryTermTranslation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a translation for a term (asynchronously)
     * Update an existing translation for a term in a term base (previously: glossary).
     * @param accountId Account ID (required)
     * @param glossaryId Glossary ID (required)
     * @param termId Term ID (required)
     * @param id ID (required)
     * @param glossaryTermTranslationUpdateParameters  (required)
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
        <tr><td> 429 </td><td> Rate Limiting </td><td>  * X-Rate-Limit-Limit -  <br>  * X-Rate-Limit-Remaining -  <br>  * X-Rate-Limit-Reset -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call glossaryTermTranslationUpdateAsync(String accountId, String glossaryId, String termId, String id, GlossaryTermTranslationUpdateParameters glossaryTermTranslationUpdateParameters, String xPhraseAppOTP, final ApiCallback<GlossaryTermTranslation> _callback) throws ApiException {

        okhttp3.Call localVarCall = glossaryTermTranslationUpdateValidateBeforeCall(accountId, glossaryId, termId, id, glossaryTermTranslationUpdateParameters, xPhraseAppOTP, _callback);
        Type localVarReturnType = new TypeToken<GlossaryTermTranslation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
