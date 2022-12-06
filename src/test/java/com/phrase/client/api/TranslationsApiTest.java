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
import com.phrase.client.model.AffectedCount;
import com.phrase.client.model.Translation;
import com.phrase.client.model.TranslationCreateParameters;
import com.phrase.client.model.TranslationDetails;
import com.phrase.client.model.TranslationExcludeParameters;
import com.phrase.client.model.TranslationIncludeParameters;
import com.phrase.client.model.TranslationReviewParameters;
import com.phrase.client.model.TranslationUnverifyParameters;
import com.phrase.client.model.TranslationUpdateParameters;
import com.phrase.client.model.TranslationVerifyParameters;
import com.phrase.client.model.TranslationsExcludeParameters;
import com.phrase.client.model.TranslationsIncludeParameters;
import com.phrase.client.model.TranslationsReviewParameters;
import com.phrase.client.model.TranslationsSearchParameters;
import com.phrase.client.model.TranslationsUnverifyParameters;
import com.phrase.client.model.TranslationsVerifyParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranslationsApi
 */
@Ignore
public class TranslationsApiTest {

    private final TranslationsApi api = new TranslationsApi();

    
    /**
     * Create a translation
     *
     * Create a translation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationCreateTest() throws ApiException {
        String projectId = null;
        TranslationCreateParameters translationCreateParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationCreate(projectId, translationCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Exclude a translation from export
     *
     * Set exclude from export flag on an existing translation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationExcludeTest() throws ApiException {
        String projectId = null;
        String id = null;
        TranslationExcludeParameters translationExcludeParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationExclude(projectId, id, translationExcludeParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Include a translation
     *
     * Remove exclude from export flag from an existing translation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationIncludeTest() throws ApiException {
        String projectId = null;
        String id = null;
        TranslationIncludeParameters translationIncludeParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationInclude(projectId, id, translationIncludeParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Review a translation
     *
     * Mark an existing translation as reviewed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationReviewTest() throws ApiException {
        String projectId = null;
        String id = null;
        TranslationReviewParameters translationReviewParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationReview(projectId, id, translationReviewParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get a single translation
     *
     * Get details on a single translation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationShowTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        TranslationDetails response = api.translationShow(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Mark a translation as unverified
     *
     * Mark an existing translation as unverified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationUnverifyTest() throws ApiException {
        String projectId = null;
        String id = null;
        TranslationUnverifyParameters translationUnverifyParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationUnverify(projectId, id, translationUnverifyParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Update a translation
     *
     * Update an existing translation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationUpdateTest() throws ApiException {
        String projectId = null;
        String id = null;
        TranslationUpdateParameters translationUpdateParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationUpdate(projectId, id, translationUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Verify a translation
     *
     * Verify an existing translation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationVerifyTest() throws ApiException {
        String projectId = null;
        String id = null;
        TranslationVerifyParameters translationVerifyParameters = null;
        String xPhraseAppOTP = null;
        TranslationDetails response = api.translationVerify(projectId, id, translationVerifyParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List translations by key
     *
     * List translations for a specific key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsByKeyTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        String sort = null;
        String order = null;
        String q = null;
        List<Translation> response = api.translationsByKey(projectId, keyId, xPhraseAppOTP, page, perPage, branch, sort, order, q);

        // TODO: test validations
    }
    
    /**
     * List translations by locale
     *
     * List translations for a specific locale. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsByLocaleTest() throws ApiException {
        String projectId = null;
        String localeId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        String sort = null;
        String order = null;
        String q = null;
        List<Translation> response = api.translationsByLocale(projectId, localeId, xPhraseAppOTP, page, perPage, branch, sort, order, q);

        // TODO: test validations
    }
    
    /**
     * Exclude translations by query
     *
     * Exclude translations matching query from locale export.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsExcludeCollectionTest() throws ApiException {
        String projectId = null;
        TranslationsExcludeParameters translationsExcludeParameters = null;
        String xPhraseAppOTP = null;
        AffectedCount response = api.translationsExcludeCollection(projectId, translationsExcludeParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Include translations by query
     *
     * Include translations matching query in locale export.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsIncludeCollectionTest() throws ApiException {
        String projectId = null;
        TranslationsIncludeParameters translationsIncludeParameters = null;
        String xPhraseAppOTP = null;
        AffectedCount response = api.translationsIncludeCollection(projectId, translationsIncludeParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List all translations
     *
     * List translations for the given project. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsListTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        String sort = null;
        String order = null;
        String q = null;
        List<Translation> response = api.translationsList(projectId, xPhraseAppOTP, page, perPage, branch, sort, order, q);

        // TODO: test validations
    }
    
    /**
     * Review translations selected by query
     *
     * Review translations matching query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsReviewCollectionTest() throws ApiException {
        String projectId = null;
        TranslationsReviewParameters translationsReviewParameters = null;
        String xPhraseAppOTP = null;
        AffectedCount response = api.translationsReviewCollection(projectId, translationsReviewParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Search translations
     *
     * Search translations for the given project. Provides the same search interface as &lt;code&gt;translations#index&lt;/code&gt; but allows POST requests to avoid limitations imposed by GET requests. If you want to download all translations for one locale we recommend to use the &lt;code&gt;locales#download&lt;/code&gt; endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsSearchTest() throws ApiException {
        String projectId = null;
        TranslationsSearchParameters translationsSearchParameters = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<Translation> response = api.translationsSearch(projectId, translationsSearchParameters, xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Unverify translations by query
     *
     * Mark translations matching query as unverified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsUnverifyCollectionTest() throws ApiException {
        String projectId = null;
        TranslationsUnverifyParameters translationsUnverifyParameters = null;
        String xPhraseAppOTP = null;
        AffectedCount response = api.translationsUnverifyCollection(projectId, translationsUnverifyParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Verify translations by query
     *
     * Verify translations matching query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsVerifyCollectionTest() throws ApiException {
        String projectId = null;
        TranslationsVerifyParameters translationsVerifyParameters = null;
        String xPhraseAppOTP = null;
        AffectedCount response = api.translationsVerifyCollection(projectId, translationsVerifyParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
