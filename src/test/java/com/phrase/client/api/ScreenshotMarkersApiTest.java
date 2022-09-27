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
import com.phrase.client.model.ScreenshotMarker;
import com.phrase.client.model.ScreenshotMarkerCreateParameters;
import com.phrase.client.model.ScreenshotMarkerUpdateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScreenshotMarkersApi
 */
@Ignore
public class ScreenshotMarkersApiTest {

    private final ScreenshotMarkersApi api = new ScreenshotMarkersApi();

    
    /**
     * Create a screenshot marker
     *
     * Create a new screenshot marker.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenshotMarkerCreateTest() throws ApiException {
        String projectId = null;
        String screenshotId = null;
        ScreenshotMarkerCreateParameters screenshotMarkerCreateParameters = null;
        String xPhraseAppOTP = null;
        ScreenshotMarker response = api.screenshotMarkerCreate(projectId, screenshotId, screenshotMarkerCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete a screenshot marker
     *
     * Delete an existing screenshot marker.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenshotMarkerDeleteTest() throws ApiException {
        String projectId = null;
        String screenshotId = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.screenshotMarkerDelete(projectId, screenshotId, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single screenshot marker
     *
     * Get details on a single screenshot marker for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenshotMarkerShowTest() throws ApiException {
        String projectId = null;
        String screenshotId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        ScreenshotMarker response = api.screenshotMarkerShow(projectId, screenshotId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Update a screenshot marker
     *
     * Update an existing screenshot marker.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenshotMarkerUpdateTest() throws ApiException {
        String projectId = null;
        String screenshotId = null;
        ScreenshotMarkerUpdateParameters screenshotMarkerUpdateParameters = null;
        String xPhraseAppOTP = null;
        ScreenshotMarker response = api.screenshotMarkerUpdate(projectId, screenshotId, screenshotMarkerUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List screenshot markers
     *
     * List all screenshot markers for the given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenshotMarkersListTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        List<ScreenshotMarker> response = api.screenshotMarkersList(projectId, id, xPhraseAppOTP, page, perPage, branch);

        // TODO: test validations
    }
    
}
