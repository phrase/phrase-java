

# RepoSync

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**project** | [**ProjectShort**](ProjectShort.md) |  |  [optional]
**provider** | **String** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**autoImport** | **Boolean** |  |  [optional]
**repoName** | **String** |  |  [optional]
**prBranch** | **String** | Branch used as the source of exports/PRs. May be &#x60;null&#x60; when the sync is configured to push directly to &#x60;base_branch&#x60;.  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastImportAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastExportAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



