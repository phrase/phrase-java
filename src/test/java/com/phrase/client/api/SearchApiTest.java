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
import com.phrase.client.model.AccountSearchResult;
import com.phrase.client.model.SearchInAccountParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Search across projects
     *
     * Search for keys and translations in all account projects  *Note: Search is limited to 10000 results and may not include recently updated data depending on the project sizes.* 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchInAccountTest() throws ApiException {
        String accountId = null;
        SearchInAccountParameters searchInAccountParameters = null;
        String xPhraseAppOTP = null;
        AccountSearchResult response = api.searchInAccount(accountId, searchInAccountParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
