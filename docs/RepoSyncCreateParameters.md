

# RepoSyncCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **String** | ID of the project to connect the Repo Sync to. | 
**gitProvider** | [**GitProviderEnum**](#GitProviderEnum) | The Git provider to use. |  [optional]
**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) | The authentication method used to connect to the Git provider. Defaults to &#x60;token&#x60; if not specified.  Valid values: - &#x60;token&#x60; — Personal access token stored on the Repo Sync. Supported by all providers. - &#x60;github_app&#x60; — Authenticate via the Phrase GitHub App installation on your account. GitHub only. The account must already have the GitHub App installed; if not, the response will include a &#x60;github_app_installation_url&#x60;. - &#x60;self_hosted&#x60; — Token-based auth for self-hosted Git instances. Requires &#x60;custom_api_endpoint&#x60;. | 
**repoName** | **String** | Full repository name including the owner, e.g. &#x60;my-org/my-repo&#x60;. | 
**baseBranch** | **String** | The default branch to use for imports and exports. |  [optional]
**prBranch** | **String** | Branch that translations are exported to before opening a pull request. If omitted, exports go directly to &#x60;base_branch&#x60;. |  [optional]
**autoImport** | **Boolean** | Enable automatic import of translations triggered by pushes to the repository. |  [optional]
**accessToken** | **String** | Personal access token for the Git provider. Required when &#x60;connection_type&#x60; is &#x60;token&#x60; or &#x60;self_hosted&#x60;. Not used for &#x60;github_app&#x60;. |  [optional]
**customApiEndpoint** | **String** | Custom API endpoint URL for self-hosted Git instances. Required when &#x60;connection_type&#x60; is &#x60;self_hosted&#x60;. |  [optional]



## Enum: GitProviderEnum

Name | Value
---- | -----
GITHUB | &quot;github&quot;
GITLAB | &quot;gitlab&quot;
BITBUCKET | &quot;bitbucket&quot;



## Enum: ConnectionTypeEnum

Name | Value
---- | -----
TOKEN | &quot;token&quot;
GITHUB_APP | &quot;github_app&quot;
SELF_HOSTED | &quot;self_hosted&quot;



