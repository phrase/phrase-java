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
import com.phrase.client.model.AffectedResources;
import com.phrase.client.model.KeyCreateParameters;
import com.phrase.client.model.KeyUpdateParameters;
import com.phrase.client.model.KeysExcludeParameters;
import com.phrase.client.model.KeysIncludeParameters;
import com.phrase.client.model.KeysSearchParameters;
import com.phrase.client.model.KeysTagParameters;
import com.phrase.client.model.KeysUntagParameters;
import com.phrase.client.model.TranslationKey;
import com.phrase.client.model.TranslationKeyDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KeysApi
 */
@Ignore
public class KeysApiTest {

    private final KeysApi api = new KeysApi();

    
    /**
     * Create a key
     *
     * Create a new key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyCreateTest() throws ApiException {
        String projectId = null;
        KeyCreateParameters keyCreateParameters = null;
        String xPhraseAppOTP = null;
        TranslationKeyDetails response = api.keyCreate(projectId, keyCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete a key
     *
     * Delete an existing key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyDeleteTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.keyDelete(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single key
     *
     * Get details on a single key for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyShowTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        TranslationKeyDetails response = api.keyShow(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Update a key
     *
     * Update an existing key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keyUpdateTest() throws ApiException {
        String projectId = null;
        String id = null;
        KeyUpdateParameters keyUpdateParameters = null;
        String xPhraseAppOTP = null;
        TranslationKeyDetails response = api.keyUpdate(projectId, id, keyUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete collection of keys
     *
     * Delete all keys matching query. Same constraints as list. Please limit the number of affected keys to about 1,000 as you might experience timeouts otherwise.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysDeleteCollectionTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        String branch = null;
        String q = null;
        String localeId = null;
        AffectedResources response = api.keysDeleteCollection(projectId, xPhraseAppOTP, branch, q, localeId);

        // TODO: test validations
    }
    
    /**
     * Exclude a locale on a collection of keys
     *
     * Exclude a locale on keys matching query. Same constraints as list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysExcludeTest() throws ApiException {
        String projectId = null;
        KeysExcludeParameters keysExcludeParameters = null;
        String xPhraseAppOTP = null;
        AffectedResources response = api.keysExclude(projectId, keysExcludeParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Include a locale on a collection of keys
     *
     * Include a locale on keys matching query. Same constraints as list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysIncludeTest() throws ApiException {
        String projectId = null;
        KeysIncludeParameters keysIncludeParameters = null;
        String xPhraseAppOTP = null;
        AffectedResources response = api.keysInclude(projectId, keysIncludeParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List keys
     *
     * List all keys for the given project. Alternatively you can POST requests to /search.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysListTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        String sort = null;
        String order = null;
        String q = null;
        String localeId = null;
        List<TranslationKey> response = api.keysList(projectId, xPhraseAppOTP, page, perPage, branch, sort, order, q, localeId);

        // TODO: test validations
    }
    
    /**
     * Search keys
     *
     * Search keys for the given project matching query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysSearchTest() throws ApiException {
        String projectId = null;
        KeysSearchParameters keysSearchParameters = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<TranslationKey> response = api.keysSearch(projectId, keysSearchParameters, xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Add tags to collection of keys
     *
     * Tags all keys matching query. Same constraints as list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysTagTest() throws ApiException {
        String projectId = null;
        KeysTagParameters keysTagParameters = null;
        String xPhraseAppOTP = null;
        AffectedResources response = api.keysTag(projectId, keysTagParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Remove tags from collection of keys
     *
     * Removes specified tags from keys matching query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysUntagTest() throws ApiException {
        String projectId = null;
        KeysUntagParameters keysUntagParameters = null;
        String xPhraseAppOTP = null;
        AffectedResources response = api.keysUntag(projectId, keysUntagParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
