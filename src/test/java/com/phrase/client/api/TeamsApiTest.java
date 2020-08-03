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
import com.phrase.client.model.Team;
import com.phrase.client.model.TeamCreateParameters;
import com.phrase.client.model.TeamDetail;
import com.phrase.client.model.TeamUpdateParameters;
import com.phrase.client.model.TeamsProjectsCreateParameters;
import com.phrase.client.model.TeamsSpacesCreateParameters;
import com.phrase.client.model.TeamsUsersCreateParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
@Ignore
public class TeamsApiTest {

    private final TeamsApi api = new TeamsApi();

    
    /**
     * Create a Team
     *
     * Create a new Team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamCreateTest() throws ApiException {
        String accountId = null;
        TeamCreateParameters teamCreateParameters = null;
        String xPhraseAppOTP = null;
        TeamDetail response = api.teamCreate(accountId, teamCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Delete Team
     *
     * Delete the specified Team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamDeleteTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        api.teamDelete(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Get Team
     *
     * Show the specified Team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamShowTest() throws ApiException {
        String accountId = null;
        String id = null;
        String xPhraseAppOTP = null;
        TeamDetail response = api.teamShow(accountId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Update Team
     *
     * Update the specified Team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamUpdateTest() throws ApiException {
        String accountId = null;
        String id = null;
        TeamUpdateParameters teamUpdateParameters = null;
        String xPhraseAppOTP = null;
        TeamDetail response = api.teamUpdate(accountId, id, teamUpdateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * List Teams
     *
     * List all Teams for the given account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsListTest() throws ApiException {
        String accountId = null;
        String xPhraseAppOTP = null;
        Integer page = null;
        Integer perPage = null;
        List<Team> response = api.teamsList(accountId, xPhraseAppOTP, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Add Project
     *
     * Adds an existing project to the team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsProjectsCreateTest() throws ApiException {
        String accountId = null;
        String teamId = null;
        TeamsProjectsCreateParameters teamsProjectsCreateParameters = null;
        String xPhraseAppOTP = null;
        api.teamsProjectsCreate(accountId, teamId, teamsProjectsCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Remove Project
     *
     * Removes a specified project from the specified team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsProjectsDeleteTest() throws ApiException {
        String accountId = null;
        String teamId = null;
        String id = null;
        String xPhraseAppOTP = null;
        api.teamsProjectsDelete(accountId, teamId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Add Space
     *
     * Adds an existing space to the team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsSpacesCreateTest() throws ApiException {
        String accountId = null;
        String teamId = null;
        TeamsSpacesCreateParameters teamsSpacesCreateParameters = null;
        String xPhraseAppOTP = null;
        api.teamsSpacesCreate(accountId, teamId, teamsSpacesCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Remove Space
     *
     * Removes a specified space from the specified team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsSpacesDeleteTest() throws ApiException {
        String accountId = null;
        String teamId = null;
        String id = null;
        String xPhraseAppOTP = null;
        api.teamsSpacesDelete(accountId, teamId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Add User
     *
     * Adds an existing user to the team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsUsersCreateTest() throws ApiException {
        String accountId = null;
        String teamId = null;
        TeamsUsersCreateParameters teamsUsersCreateParameters = null;
        String xPhraseAppOTP = null;
        api.teamsUsersCreate(accountId, teamId, teamsUsersCreateParameters, xPhraseAppOTP);

        // TODO: test validations
    }
    
    /**
     * Remove User
     *
     * Removes a specified user from the specified team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsUsersDeleteTest() throws ApiException {
        String accountId = null;
        String teamId = null;
        String id = null;
        String xPhraseAppOTP = null;
        api.teamsUsersDelete(accountId, teamId, id, xPhraseAppOTP);

        // TODO: test validations
    }
    
}
