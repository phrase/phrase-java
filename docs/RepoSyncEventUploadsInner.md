

# RepoSyncEventUploadsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The upload&#39;s public identifier (code). |  [optional]
**state** | [**StateEnum**](#StateEnum) | The upload&#39;s current public state. Multiple internal processing states are collapsed to &#x60;processing&#x60;; both internal error states are collapsed to &#x60;error&#x60;.  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
INITIALIZED | &quot;initialized&quot;
WAITING_FOR_PREVIEW | &quot;waiting_for_preview&quot;
PROCESSING | &quot;processing&quot;
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;



