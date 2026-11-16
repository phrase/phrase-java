

# RepoSyncUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Display name for the repo sync. |  [optional]
**ownerId** | **String** | Code of the user to assign as owner. Requires &#x60;manage_github_sync?&#x60; permission on the project; returns &#x60;403&#x60; if not satisfied.  |  [optional]
**exportTriggers** | [**List&lt;ExportTriggersEnum&gt;**](#List&lt;ExportTriggersEnum&gt;) | Replaces the current set of automatic export triggers. Requires &#x60;manage_github_sync?&#x60; permission on the project and the automatic export feature to be enabled for the account. Accepted values: &#x60;schedule&#x60;, &#x60;branch_merged&#x60;, &#x60;job_completed&#x60;.  |  [optional]
**exportSchedule** | [**RepoSyncUpdateParametersExportSchedule**](RepoSyncUpdateParametersExportSchedule.md) |  |  [optional]



## Enum: List&lt;ExportTriggersEnum&gt;

Name | Value
---- | -----
SCHEDULE | &quot;schedule&quot;
BRANCH_MERGED | &quot;branch_merged&quot;
JOB_COMPLETED | &quot;job_completed&quot;



