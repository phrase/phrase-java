

# RepoSyncEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**pullRequestUrl** | **String** | URL of the pull request created on export |  [optional]
**autoImport** | **Boolean** | Whether the import was triggered by the repo push event |  [optional]
**errors** | [**List&lt;RepoSyncEventErrorsInner&gt;**](RepoSyncEventErrorsInner.md) | List of error messages, in case of failure |  [optional]



## Enum: EventTypeEnum

Name | Value
---- | -----
IMPORT | &quot;import&quot;
EXPORT | &quot;export&quot;



## Enum: StatusEnum

Name | Value
---- | -----
RUNNING | &quot;running&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;



