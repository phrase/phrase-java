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
import com.phrase.client.model.Format;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FormatsApi
 */
@Ignore
public class FormatsApiTest {

    private final FormatsApi api = new FormatsApi();

    
    /**
     * List formats
     *
     * Get a handy list of all localization file formats supported in Phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void formatsListTest() throws ApiException {
        List<Format> response = api.formatsList();

        // TODO: test validations
    }
    
}
