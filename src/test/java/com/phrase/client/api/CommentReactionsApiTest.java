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
import com.phrase.client.model.CommentReaction;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentReactionsApi
 */
@Ignore
public class CommentReactionsApiTest {

    private final CommentReactionsApi api = new CommentReactionsApi();

    
    /**
     * Create a reaction
     *
     * Create a new reaction for a comment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactionCreateTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String commentId = null;
        String xPhraseAppOTP = null;
        String branch = null;
        String emoji = null;
        CommentReaction response = api.reactionCreate(projectId, keyId, commentId, xPhraseAppOTP, branch, emoji);

        // TODO: test validations
    }
    
    /**
     * Delete a reaction
     *
     * Delete an existing reaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactionDeleteTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String commentId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.reactionDelete(projectId, keyId, commentId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single reaction
     *
     * Get details on a single reaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactionShowTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String commentId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        CommentReaction response = api.reactionShow(projectId, keyId, commentId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * List reactions
     *
     * List all reactions for a comment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactionsListTest() throws ApiException {
        String projectId = null;
        String keyId = null;
        String commentId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        List<CommentReaction> response = api.reactionsList(projectId, keyId, commentId, xPhraseAppOTP, page, perPage, branch);

        // TODO: test validations
    }
    
}
