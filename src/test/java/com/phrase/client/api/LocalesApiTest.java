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
import java.io.File;
import java.io.IOException;
import com.phrase.client.model.Locale;
import com.phrase.client.model.LocaleCreateParameters;
import com.phrase.client.model.LocaleDetails;
import com.phrase.client.model.LocalePreview1;
import com.phrase.client.model.LocaleUpdateParameters;

import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.HttpBasicAuth;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

/**
 * API tests for LocalesApi
 */
public class LocalesApiTest {

	MockWebServer mockBackend = new MockWebServer();

    private LocalesApi api;

    @Before
    public void setUp() throws IOException {
        mockBackend.start();

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(mockBackend.url("/").toString());

        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("TOKEN");
        Basic.setPassword("");

        api = new LocalesApi(defaultClient);
    }

    @After
    public void tearDown() throws IOException {
        mockBackend.shutdown();
    }

    /**
     * List locales used in account
     *
     * List all locales unique by locale code used across all projects within an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    public void accountLocalesTest() throws ApiException {
    }

    /**
     * Create a locale
     *
     * Create a new locale.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
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
    @Ignore
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
    public void localeDownloadTest() throws ApiException, IOException, InterruptedException {
        String body = "{\"key\":\"value\"}";

        MockResponse mockResponse = new MockResponse()
            .addHeader("Content-Type", "application/json; charset=utf-8")
            .setBody(body);

        mockBackend.enqueue(mockResponse);


        Map<String, String> nestedFormatOptionsMap = new HashMap<>();
        nestedFormatOptionsMap.put("nested_option", "sub_option");

        Map<String, Object> formatOptionsMap = new HashMap<>();
        formatOptionsMap.put("omit_separator_space", "true");
        formatOptionsMap.put("fallback_language", "en");
        formatOptionsMap.put("more_options", nestedFormatOptionsMap);

        String projectId = "MY_PROJECT_ID";
        String id = "MY_ID";
        String xPhraseAppOTP = null;
        String ifModifiedSince = null;
        String ifNoneMatch = null;
        String branch = null;
        String fileFormat = null;
        String tags = null;
        String tag = null;
        Boolean includeEmptyTranslations = null;
        Boolean excludeEmptyZeroForms = null;
        Boolean includeTranslatedKeys = null;
        Boolean keepNotranslateTags = null;
        Boolean convertEmoji = null;
        Object formatOptions = formatOptionsMap;
        String encoding = null;
        Boolean skipUnverifiedTranslations = null;
        Boolean includeUnverifiedTranslations = null;
        Boolean useLastReviewedVersion = null;
        String fallbackLocaleId = null;
        String sourceLocaleId = null;
        Object customMetadataFilters = null;
        File response = api.localeDownload(projectId, id, xPhraseAppOTP, ifModifiedSince, ifNoneMatch, branch, fileFormat, tags, tag, includeEmptyTranslations, excludeEmptyZeroForms, includeTranslatedKeys, keepNotranslateTags, convertEmoji, formatOptions, encoding, skipUnverifiedTranslations, includeUnverifiedTranslations, useLastReviewedVersion, fallbackLocaleId, sourceLocaleId, customMetadataFilters);

        String fileContents = new String(java.nio.file.Files.readAllBytes(response.toPath()));
        Assert.assertEquals("Correct file contents", fileContents, body);

        RecordedRequest recordedRequest = mockBackend.takeRequest();
        // for some reason with deep nested query params, ordering of query params change
        Assert.assertEquals("Request path", "//projects/MY_PROJECT_ID/locales/MY_ID/download?format_options%5Bomit_separator_space%5D=true&format_options%5Bmore_options%5D%5Bnested_option%5D=sub_option&format_options%5Bfallback_language%5D=en", recordedRequest.getPath());
    }

    /**
     * Get a single locale
     *
     * Get details on a single locale for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
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
    @Ignore
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
    public void localesListTest() throws ApiException, InterruptedException {
        String body = "[{\"id\": \"ae0ce77b64dbf7e8315b5da8ecbb42c0\",\"name\": \"de-DE\",\"code\": \"de-DE\",\"default\": false,\"main\": false,\"rtl\": false,\"plural_forms\": [\"zero\",\"one\",\"other\"],\"created_at\": \"2022-10-27T11:03:39Z\",\"updated_at\": \"2023-10-05T09:49:28Z\",\"source_locale\": null,\"fallback_locale\": null},{\"id\": \"95060c3b178252e0c5d1936493e93108\",\"name\": \"en-US\",\"code\": \"en-US\",\"default\": true,\"main\": false,\"rtl\": false,\"plural_forms\": [\"zero\",\"one\",\"other\"],\"created_at\": \"2022-10-27T11:03:39Z\",\"updated_at\": \"2023-10-05T09:50:20Z\",\"source_locale\": null,\"fallback_locale\": null},{\"id\": \"97b4b258d9000f256a97276561294b5b\",\"name\": \"sh\",\"code\": \"sr-Latn-RS\",\"default\": false,\"main\": false,\"rtl\": false,\"plural_forms\": [\"zero\",\"one\",\"few\",\"other\"],\"created_at\": \"2022-10-27T11:03:39Z\",\"updated_at\": \"2023-05-10T08:22:18Z\",\"source_locale\": null,\"fallback_locale\": null}]";

        MockResponse mockResponse = new MockResponse()
            .addHeader("Content-Type", "application/json; charset=utf-8")
            .setBody(body);

        mockBackend.enqueue(mockResponse);

        String projectId = "MY_PROJECT_ID";
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String sortBy = null;
        String branch = "MY_BRANCH";
        List<Locale> response = api.localesList(projectId, xPhraseAppOTP, page, perPage, sortBy, branch);

        Assert.assertEquals("Correct number of elements", response.size(), 3);
        Assert.assertEquals("Correct locale name", response.get(0).getName(), "de-DE");

        RecordedRequest recordedRequest = mockBackend.takeRequest();
        Assert.assertEquals("Request path", "//projects/MY_PROJECT_ID/locales?branch=MY_BRANCH", recordedRequest.getPath());
    }

}
