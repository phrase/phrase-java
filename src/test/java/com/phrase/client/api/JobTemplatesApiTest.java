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
import com.phrase.client.model.JobTemplate;
import com.phrase.client.model.JobTemplateCreateParameters;
import com.phrase.client.model.JobTemplateUpdateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobTemplatesApi
 */
@Ignore
public class JobTemplatesApiTest {

    private final JobTemplatesApi api = new JobTemplatesApi();

    
    /**
     * Create a job template
     *
     * Create a new job template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobTemplateCreateTest() throws ApiException {
        String projectId = null;
        JobTemplateCreateParameters jobTemplateCreateParameters = null;
        String xPhraseAppOTP = null;
        Object response = api.jobTemplateCreate(projectId, jobTemplateCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete a job template
     *
     * Delete an existing job template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobTemplateDeleteTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.jobTemplateDelete(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single job template
     *
     * Get details on a single job template for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobTemplateShowTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        Object response = api.jobTemplateShow(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Update a job template
     *
     * Update an existing job template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobTemplateUpdateTest() throws ApiException {
        String projectId = null;
        String id = null;
        JobTemplateUpdateParameters jobTemplateUpdateParameters = null;
        String xPhraseAppOTP = null;
        Object response = api.jobTemplateUpdate(projectId, id, jobTemplateUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List job templates
     *
     * List all job templates for the given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobTemplatesListTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        List<JobTemplate> response = api.jobTemplatesList(projectId, xPhraseAppOTP, page, perPage, branch);

        // TODO: test validations
    }
    
}
