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
import com.phrase.client.model.LocaleDownload;
import com.phrase.client.model.LocaleDownloadCreateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocaleDownloadsApi
 */
@Ignore
public class LocaleDownloadsApiTest {

    private final LocaleDownloadsApi api = new LocaleDownloadsApi();

    
    /**
     * Initiate async download of a locale
     *
     * Prepare a locale for download in a specific file format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeDownloadCreateTest() throws ApiException {
        String projectId = null;
        String localeId = null;
        LocaleDownloadCreateParameters localeDownloadCreateParameters = null;
        String xPhraseAppOTP = null;
        String ifModifiedSince = null;
        String ifNoneMatch = null;
        LocaleDownload response = api.localeDownloadCreate(projectId, localeId, localeDownloadCreateParameters, xPhraseAppOTP, ifModifiedSince, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Show status of an async locale download
     *
     * Show status of already started async locale download. If the download is finished, the download link will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void localeDownloadShowTest() throws ApiException {
        String projectId = null;
        String localeId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String ifModifiedSince = null;
        String ifNoneMatch = null;
        LocaleDownload response = api.localeDownloadShow(projectId, localeId, id, xPhraseAppOTP, ifModifiedSince, ifNoneMatch);

        // TODO: test validations
    }
    
}
