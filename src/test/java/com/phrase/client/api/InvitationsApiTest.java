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
import com.phrase.client.model.Invitation;
import com.phrase.client.model.InvitationCreateParameters;
import com.phrase.client.model.InvitationUpdateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvitationsApi
 */
@Ignore
public class InvitationsApiTest {

    private final InvitationsApi api = new InvitationsApi();

    
    /**
     * Create a new invitation
     *
     * Invite a person to an account. Developers and translators need &lt;code&gt;project_ids&lt;/code&gt; and &lt;code&gt;locale_ids&lt;/code&gt; assigned to access them. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invitationCreateTest() throws ApiException {
        String accountId = null;
        InvitationCreateParameters invitationCreateParameters = null;
        String xPhraseAppOTP = null;
        Invitation response = api.invitationCreate(accountId, invitationCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete an invitation
     *
     * Delete an existing invitation (must not be accepted yet). Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invitationDeleteTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        api.invitationDelete(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Resend an invitation
     *
     * Resend the invitation email (must not be accepted yet). Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invitationResendTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        Invitation response = api.invitationResend(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get a single invitation
     *
     * Get details on a single invitation. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invitationShowTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        Invitation response = api.invitationShow(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Update an invitation
     *
     * Update an existing invitation (must not be accepted yet). The &lt;code&gt;email&lt;/code&gt; cannot be updated. Developers and translators need &lt;code&gt;project_ids&lt;/code&gt; and &lt;code&gt;locale_ids&lt;/code&gt; assigned to access them. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invitationUpdateTest() throws ApiException {
        String accountId = null;
        String id = null;
        InvitationUpdateParameters invitationUpdateParameters = null;
        String xPhraseAppOTP = null;
        Invitation response = api.invitationUpdate(accountId, id, invitationUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List invitations
     *
     * List invitations for an account. It will also list the accessible resources like projects and locales the invited user has access to. In case nothing is shown the default access from the role is used. Access token scope must include &lt;code&gt;team.manage&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invitationsListTest() throws ApiException {
        String accountId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<Invitation> response = api.invitationsList(accountId, xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
}