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
import com.phrase.client.model.Comment;
import com.phrase.client.model.CommentCreateParameters;
import com.phrase.client.model.CommentMarkReadParameters;
import com.phrase.client.model.CommentUpdateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
@Ignore
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * Create a comment
     *
     * Create a new comment for a key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentCreateTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        CommentCreateParameters commentCreateParameters = null;
        String xPhraseAppOTP = null;
        Comment response = api.commentCreate(projectId, keyId, commentCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete a comment
     *
     * Delete an existing comment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentDeleteTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.commentDelete(projectId, keyId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Check if comment is read
     *
     * Check if comment was marked as read. Returns 204 if read, 404 if unread.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentMarkCheckTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.commentMarkCheck(projectId, keyId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Mark a comment as read
     *
     * Mark a comment as read.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentMarkReadTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String id = null;
        CommentMarkReadParameters commentMarkReadParameters = null;
        String xPhraseAppOTP = null;
        api.commentMarkRead(projectId, keyId, id, commentMarkReadParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Mark a comment as unread
     *
     * Mark a comment as unread.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentMarkUnreadTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.commentMarkUnread(projectId, keyId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single comment
     *
     * Get details on a single comment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentShowTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        Comment response = api.commentShow(projectId, keyId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Update a comment
     *
     * Update an existing comment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentUpdateTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String id = null;
        CommentUpdateParameters commentUpdateParameters = null;
        String xPhraseAppOTP = null;
        Comment response = api.commentUpdate(projectId, keyId, id, commentUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List comments
     *
     * List all comments for a key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commentsListTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        String query = null;
        List<String> localeIds = null;
        List<String> filters = null;
        String order = null;
        List<Comment> response = api.commentsList(projectId, keyId, xPhraseAppOTP, page, perPage, branch, query, localeIds, filters, order);

        // TODO: test validations
    }
    
}
