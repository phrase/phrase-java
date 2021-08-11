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

import com.phrase.client.ApiException;
import java.io.File;
import com.phrase.client.model.Locale;
import com.phrase.client.model.LocaleCreateParameters;
import com.phrase.client.model.LocaleDetails;
import com.phrase.client.model.LocalePreview1;
import com.phrase.client.model.LocaleUpdateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocalesApi
 */
@Ignore
public class LocalesApiTest {

    private final LocalesApi api = new LocalesApi();

    
    /**
     * List locales used in account
     *
     * List all locales unique by locale code used across all projects within an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountLocalesTest() throws ApiException {
        String id = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<LocalePreview1> response = api.accountLocales(id, xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Create a locale
     *
     * Create a new locale.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeCreateTest() throws ApiException {
        String projectId = null;
        LocaleCreateParameters localeCreateParameters = null;
        String xPhraseAppOTP = null;
        LocaleDetails response = api.localeCreate(projectId, localeCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete a locale
     *
     * Delete an existing locale.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeDeleteTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.localeDelete(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Download a locale
     *
     * Download a locale in a specific file format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeDownloadTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        String fileFormat = null;
        String tags = null;
        String tag = null;
        Boolean includeEmptyTranslations = null;
        Boolean excludeEmptyZeroForms = null;
        Boolean includeTranslatedKeys = null;
        Boolean keepNotranslateTags = null;
        Boolean convertEmoji = null;
        Object formatOptions = null;
        String encoding = null;
        Boolean skipUnverifiedTranslations = null;
        Boolean includeUnverifiedTranslations = null;
        Boolean useLastReviewedVersion = null;
        String fallbackLocaleId = null;
        String sourceLocaleId = null;
        File response = api.localeDownload(projectId, id, xPhraseAppOTP, branch, fileFormat, tags, tag, includeEmptyTranslations, excludeEmptyZeroForms, includeTranslatedKeys, keepNotranslateTags, convertEmoji, formatOptions, encoding, skipUnverifiedTranslations, includeUnverifiedTranslations, useLastReviewedVersion, fallbackLocaleId, sourceLocaleId);

        // TODO: test validations
    }
    
    /**
     * Get a single locale
     *
     * Get details on a single locale for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeShowTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        LocaleDetails response = api.localeShow(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Update a locale
     *
     * Update an existing locale.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeUpdateTest() throws ApiException {
        String projectId = null;
        String id = null;
        LocaleUpdateParameters localeUpdateParameters = null;
        String xPhraseAppOTP = null;
        LocaleDetails response = api.localeUpdate(projectId, id, localeUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List locales
     *
     * List all locales for the given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localesListTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String sortBy = null;
        String branch = null;
        List<Locale> response = api.localesList(projectId, xPhraseAppOTP, page, perPage, sortBy, branch);

        // TODO: test validations
    }
    
}
