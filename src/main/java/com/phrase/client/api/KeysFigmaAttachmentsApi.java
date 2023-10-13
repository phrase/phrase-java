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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysFigmaAttachmentsApi {
    private ApiClient localVarApiClient;

    public KeysFigmaAttachmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeysFigmaAttachmentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for figmaAttachmentAttachToKey
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public okhttp3.Call figmaAttachmentAttachToKeyCall(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/figma_attachments/{figma_attachment_id}/keys"
            .replaceAll("\\{" + "project_id" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "figma_attachment_id" + "\\}", localVarApiClient.escapeString(figmaAttachmentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (branch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("branch", branch));
        }

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call figmaAttachmentAttachToKeyValidateBeforeCall(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling figmaAttachmentAttachToKey(Async)");
        }
        
        // verify the required parameter 'figmaAttachmentId' is set
        if (figmaAttachmentId == null) {
            throw new ApiException("Missing the required parameter 'figmaAttachmentId' when calling figmaAttachmentAttachToKey(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling figmaAttachmentAttachToKey(Async)");
        }
        

        okhttp3.Call localVarCall = figmaAttachmentAttachToKeyCall(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch, _callback);
        return localVarCall;

    }

    /**
     * Attach the Figma attachment to a key
     * Attach the Figma attachment to a key
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public void figmaAttachmentAttachToKey(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch) throws ApiException {
        figmaAttachmentAttachToKeyWithHttpInfo(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch);
    }

    /**
     * Attach the Figma attachment to a key
     * Attach the Figma attachment to a key
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public ApiResponse<Void> figmaAttachmentAttachToKeyWithHttpInfo(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch) throws ApiException {
        okhttp3.Call localVarCall = figmaAttachmentAttachToKeyValidateBeforeCall(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Attach the Figma attachment to a key (asynchronously)
     * Attach the Figma attachment to a key
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public okhttp3.Call figmaAttachmentAttachToKeyAsync(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = figmaAttachmentAttachToKeyValidateBeforeCall(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for figmaAttachmentDetachFromKey
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public okhttp3.Call figmaAttachmentDetachFromKeyCall(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{project_id}/figma_attachments/{figma_attachment_id}/keys/{id}"
            .replaceAll("\\{" + "project_id" + "\\}", localVarApiClient.escapeString(projectId.toString()))
            .replaceAll("\\{" + "figma_attachment_id" + "\\}", localVarApiClient.escapeString(figmaAttachmentId.toString()))
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (branch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("branch", branch));
        }

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
    private okhttp3.Call figmaAttachmentDetachFromKeyValidateBeforeCall(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling figmaAttachmentDetachFromKey(Async)");
        }
        
        // verify the required parameter 'figmaAttachmentId' is set
        if (figmaAttachmentId == null) {
            throw new ApiException("Missing the required parameter 'figmaAttachmentId' when calling figmaAttachmentDetachFromKey(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling figmaAttachmentDetachFromKey(Async)");
        }
        

        okhttp3.Call localVarCall = figmaAttachmentDetachFromKeyCall(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch, _callback);
        return localVarCall;

    }

    /**
     * Detach the Figma attachment from a key
     * Detach the Figma attachment from a key
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public void figmaAttachmentDetachFromKey(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch) throws ApiException {
        figmaAttachmentDetachFromKeyWithHttpInfo(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch);
    }

    /**
     * Detach the Figma attachment from a key
     * Detach the Figma attachment from a key
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public ApiResponse<Void> figmaAttachmentDetachFromKeyWithHttpInfo(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch) throws ApiException {
        okhttp3.Call localVarCall = figmaAttachmentDetachFromKeyValidateBeforeCall(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Detach the Figma attachment from a key (asynchronously)
     * Detach the Figma attachment from a key
     * @param projectId Project ID (required)
     * @param figmaAttachmentId Figma attachment ID (required)
     * @param id ID (required)
     * @param xPhraseAppOTP Two-Factor-Authentication token (optional) (optional)
     * @param branch specify the branch to use (optional)
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
    public okhttp3.Call figmaAttachmentDetachFromKeyAsync(String projectId, String figmaAttachmentId, String id, String xPhraseAppOTP, String branch, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = figmaAttachmentDetachFromKeyValidateBeforeCall(projectId, figmaAttachmentId, id, xPhraseAppOTP, branch, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
