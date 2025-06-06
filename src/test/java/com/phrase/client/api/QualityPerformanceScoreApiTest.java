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
import com.phrase.client.model.CustomMetadataPropertyCreate422Response;
import com.phrase.client.model.QualityPerformanceScoreList200Response;
import com.phrase.client.model.QualityPerformanceScoreListRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QualityPerformanceScoreApi
 */
@Ignore
public class QualityPerformanceScoreApiTest {

    private final QualityPerformanceScoreApi api = new QualityPerformanceScoreApi();

    
    /**
     * Get Translation Quality
     *
     * Retrieves the quality scores for your Strings translations. Returns a score, measured by Phrase QPS
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void qualityPerformanceScoreListTest() throws ApiException {
        String projectId = null;
        QualityPerformanceScoreListRequest qualityPerformanceScoreListRequest = null;
        String xPhraseAppOTP = null;
        QualityPerformanceScoreList200Response response = api.qualityPerformanceScoreList(projectId, qualityPerformanceScoreListRequest, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
