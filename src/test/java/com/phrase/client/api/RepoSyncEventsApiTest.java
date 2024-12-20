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
import com.phrase.client.model.RepoSyncEvent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RepoSyncEventsApi
 */
@Ignore
public class RepoSyncEventsApiTest {

    private final RepoSyncEventsApi api = new RepoSyncEventsApi();

    
    /**
     * Repository Syncs History
     *
     * Get the history of a single Repo Sync. The history includes all imports and exports performed by the Repo Sync.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncEventListTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        List<RepoSyncEvent> response = api.repoSyncEventList(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get a single Repo Sync Event
     *
     * Shows a single Repo Sync event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncEventShowTest() throws ApiException {
        String accountId = null;
        String repoSyncId = null;
        String id = null;
        String xPhraseAppOTP = null;
        RepoSyncEvent response = api.repoSyncEventShow(accountId, repoSyncId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
