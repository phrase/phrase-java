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
import com.phrase.client.model.OrderConfirmParameters;
import com.phrase.client.model.OrderCreateParameters;
import com.phrase.client.model.TranslationOrder;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Ignore
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    
    /**
     * Confirm an order
     *
     * Confirm an existing order and send it to the provider for translation. Same constraints as for create.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderConfirmTest() throws ApiException {
        String projectId = null;
        String id = null;
        OrderConfirmParameters orderConfirmParameters = null;
        String xPhraseAppOTP = null;
        TranslationOrder response = api.orderConfirm(projectId, id, orderConfirmParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Create a new order
     *
     * Create a new order. Access token scope must include &#x60;orders.create&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderCreateTest() throws ApiException {
        String projectId = null;
        OrderCreateParameters orderCreateParameters = null;
        String xPhraseAppOTP = null;
        TranslationOrder response = api.orderCreate(projectId, orderCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Cancel an order
     *
     * Cancel an existing order. Must not yet be confirmed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderDeleteTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        api.orderDelete(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * Get a single order
     *
     * Get details on a single order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderShowTest() throws ApiException {
        String projectId = null;
        String id = null;
        String xPhraseAppOTP = null;
        String branch = null;
        TranslationOrder response = api.orderShow(projectId, id, xPhraseAppOTP, branch);

        // TODO: test validations
    }
    
    /**
     * List orders
     *
     * List all orders for the given project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ordersListTest() throws ApiException {
        String projectId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        String branch = null;
        List<TranslationOrder> response = api.ordersList(projectId, xPhraseAppOTP, page, perPage, branch);

        // TODO: test validations
    }
    
}
