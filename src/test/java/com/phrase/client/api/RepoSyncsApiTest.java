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
import com.phrase.client.model.RepoSync;
import com.phrase.client.model.RepoSyncEvent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RepoSyncsApi
 */
@Ignore
public class RepoSyncsApiTest {

    private final RepoSyncsApi api = new RepoSyncsApi();

    
    /**
     * Activate a Repo Sync
     *
     * Activate a deactivated Repo Sync. Active syncs can be used to import and export translations, and imports to Phrase are automatically triggered by pushes to the repository, if configured.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncActivateTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        RepoSync response = api.repoSyncActivate(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Deactivate a Repo Sync
     *
     * Deactivate an active Repo Sync. Import and export can&#39;t be performed on deactivated syncs and the pushes to the repository won&#39;t trigger the import to Phrase.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncDeactivateTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        RepoSync response = api.repoSyncDeactivate(accountId, id, xPhraseAppOTP);

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
    
    /**
     * Repository Syncs History
     *
     * Get the history of a single Repo Sync. The history includes all imports and exports performed by the Repo Sync.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncEventsTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        List<RepoSyncEvent> response = api.repoSyncEvents(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Export to code repository
     *
     * &gt; Beta: this feature will change in the future.  Export translations from Phrase Strings to repository provider according to the .phrase.yml file within the code repository.  *Export is done asynchronously and may take several seconds depending on the project size.*
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncExportTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        RepoSyncEvent response = api.repoSyncExport(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Import from code repository
     *
     * &gt; Beta: this feature will change in the future.  Import translations from repository provider to Phrase Strings according to the .phrase.yml file within the code repository.  _Import is done asynchronously and may take several seconds depending on the project size._
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncImportTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        RepoSyncEvent response = api.repoSyncImport(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get Repo Syncs
     *
     * Lists all Repo Syncs from an account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncListTest() throws ApiException {
        String accountId = null;
        String xPhraseAppOTP = null;
        List<RepoSync> response = api.repoSyncList(accountId, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get a single Repo Sync
     *
     * Shows a single Repo Sync setting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repoSyncShowTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        RepoSync response = api.repoSyncShow(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
