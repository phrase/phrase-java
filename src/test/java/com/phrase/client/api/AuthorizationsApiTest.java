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

import com.phrase.client.ApiException;
import com.phrase.client.model.Authorization;
import com.phrase.client.model.AuthorizationCreateParameters;
import com.phrase.client.model.AuthorizationUpdateParameters;
import com.phrase.client.model.AuthorizationWithToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizationsApi
 */
@Ignore
public class AuthorizationsApiTest {

    private final AuthorizationsApi api = new AuthorizationsApi();

    
    /**
     * Create an authorization
     *
     * Create a new authorization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizationCreateTest() throws ApiException {
        AuthorizationCreateParameters authorizationCreateParameters = null;
        String xPhraseAppOTP = null;
        AuthorizationWithToken response = api.authorizationCreate(authorizationCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete an authorization
     *
     * Delete an existing authorization. API calls using that token will stop working.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizationDeleteTest() throws ApiException {
        String id = null;
        String xPhraseAppOTP = null;
        api.authorizationDelete(id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get a single authorization
     *
     * Get details on a single authorization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizationShowTest() throws ApiException {
        String id = null;
        String xPhraseAppOTP = null;
        Authorization response = api.authorizationShow(id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Update an authorization
     *
     * Update an existing authorization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizationUpdateTest() throws ApiException {
        String id = null;
        AuthorizationUpdateParameters authorizationUpdateParameters = null;
        String xPhraseAppOTP = null;
        Authorization response = api.authorizationUpdate(id, authorizationUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List authorizations
     *
     * List all your authorizations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizationsListTest() throws ApiException {
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<Authorization> response = api.authorizationsList(xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
}
