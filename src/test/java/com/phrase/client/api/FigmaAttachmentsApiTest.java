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
import com.phrase.client.model.FigmaAttachment;
import com.phrase.client.model.FigmaAttachmentCreateParameters;
import com.phrase.client.model.FigmaAttachmentUpdateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FigmaAttachmentsApi
 */
@Ignore
public class FigmaAttachmentsApiTest {

    private final FigmaAttachmentsApi api = new FigmaAttachmentsApi();

    
    /**
     * Create a Figma attachment
     *
     * Create a new Figma attachment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void figmaAttachmentCreateTest() throws ApiException {
        String projectId = null;
        FigmaAttachmentCreateParameters figmaAttachmentCreateParameters = null;
        String xPhraseAppOTP = null;
        String branch = null;
        FigmaAttachment response = api.figmaAttachmentCreate(projectId, figmaAttachmentCreateParameters, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Delete a Figma attachment
     *
     * Delete an existing Figma attachment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void figmaAttachmentDeleteTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.figmaAttachmentDelete(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single Figma attachment
     *
     * Get details on a single Figma attachment for a given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void figmaAttachmentShowTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        FigmaAttachment response = api.figmaAttachmentShow(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Update a Figma attachment
     *
     * Update an existing Figma attachment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void figmaAttachmentUpdateTest() throws ApiException {
        String projectId = null;
        String id = null;
        FigmaAttachmentUpdateParameters figmaAttachmentUpdateParameters = null;
        String xPhraseAppOTP = null;
        String branch = null;
        FigmaAttachment response = api.figmaAttachmentUpdate(projectId, id, figmaAttachmentUpdateParameters, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * List Figma attachments
     *
     * List all Figma attachments for the given project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void figmaAttachmentsListTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        List<FigmaAttachment> response = api.figmaAttachmentsList(projectId, xPhraseAppOTP, page, perPage, branch);

        // TODO: test validations
    }
    
}