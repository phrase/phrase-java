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
import com.phrase.client.model.NotificationGroupDetail;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationGroupsApi
 */
@Ignore
public class NotificationGroupsApiTest {

    private final NotificationGroupsApi api = new NotificationGroupsApi();

    
    /**
     * List notification groups
     *
     * List all notification groups from the current user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationGroupsListTest() throws ApiException {
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<Object> response = api.notificationGroupsList(xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Mark all notification groups as read
     *
     * Mark all notification groups of the current user as read
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationGroupsMarkAllAsReadTest() throws ApiException {
        String xPhraseAppOTP = null;
        List<Object> response = api.notificationGroupsMarkAllAsRead(xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Mark a notification group as read
     *
     * Mark a notifications group of the current user as read
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationGroupsMarkAsReadTest() throws ApiException {
        String id = null;
        String xPhraseAppOTP = null;
        NotificationGroupDetail response = api.notificationGroupsMarkAsRead(id, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
