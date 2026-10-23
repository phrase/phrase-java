

# RepoSyncEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**pullRequestUrl** | **String** | URL of the pull request created on export |  [optional]
**autoImport** | **Boolean** | Whether the import was triggered by the repo push event |  [optional]
**errors** | **List&lt;String&gt;** | List of error messages, in case of failure |  [optional]
**uploads** | [**List&lt;RepoSyncEventUploadsInner&gt;**](RepoSyncEventUploadsInner.md) | The uploads associated with this import event, or &#x60;null&#x60; if no upload batch has been created yet. Each entry identifies a single file upload by its public code (&#x60;id&#x60;) and its current public state (&#x60;state&#x60;). Present on show responses only; absent from list responses. Possible &#x60;state&#x60; values: &#x60;initialized&#x60;, &#x60;waiting_for_preview&#x60;, &#x60;processing&#x60;, &#x60;success&#x60;, &#x60;error&#x60;.  |  [optional]



## Enum: TypeEnum

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



