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
import com.phrase.client.model.GithubSyncExportParameters;
import com.phrase.client.model.GithubSyncImportParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GitHubSyncApi
 */
@Ignore
public class GitHubSyncApiTest {

    private final GitHubSyncApi api = new GitHubSyncApi();

    
    /**
     * Export from Phrase Strings to GitHub
     *
     * Export translations from Phrase Strings to GitHub according to the .phraseapp.yml file within the GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Export is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void githubSyncExportTest() throws ApiException {
        GithubSyncExportParameters githubSyncExportParameters = null;
        String xPhraseAppOTP = null;
        api.githubSyncExport(githubSyncExportParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Import to Phrase Strings from GitHub
     *
     * Import files to Phrase Strings from your connected GitHub repository. &lt;br&gt;&lt;br&gt;&lt;i&gt;Note: Import is done asynchronously and may take several seconds depending on the project size.&lt;/i&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void githubSyncImportTest() throws ApiException {
        GithubSyncImportParameters githubSyncImportParameters = null;
        String xPhraseAppOTP = null;
        api.githubSyncImport(githubSyncImportParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
