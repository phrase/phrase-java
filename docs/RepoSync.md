

# RepoSync

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** | Optional custom display name for this repo sync. When null or blank, the sync is displayed using the associated project name.  |  [optional]
**project** | [**ProjectShort**](ProjectShort.md) |  |  [optional]
**provider** | **String** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**autoImport** | **Boolean** |  |  [optional]
**repoName** | **String** |  |  [optional]
**prBranch** | **String** | Branch used as the source of exports/PRs. May be &#x60;null&#x60; when the sync is configured to push directly to &#x60;base_branch&#x60;.  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastImportAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastExportAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**owner** | [**UserShort**](UserShort.md) |  |  [optional]
**exportTriggers** | [**List&lt;ExportTriggersEnum&gt;**](#List&lt;ExportTriggersEnum&gt;) | Events that trigger an automatic export. Only present when the automatic export feature is enabled for the account. Possible values: &#x60;schedule&#x60; (runs on the configured schedule), &#x60;branch_merged&#x60; (runs when a branch is merged in the connected repository), &#x60;job_completed&#x60; (runs when a translation job completes in the project).  |  [optional]
**exportSchedule** | [**RepoSyncExportSchedule**](RepoSyncExportSchedule.md) |  |  [optional]



## Enum: List&lt;ExportTriggersEnum&gt;

Name | Value
---- | -----
SCHEDULE | &quot;schedule&quot;
BRANCH_MERGED | &quot;branch_merged&quot;
JOB_COMPLETED | &quot;job_completed&quot;



