

# Branch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseProjectId** | **String** |  |  [optional]
**branchProjectId** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**base** | **String** | Name of the base branch this branch was created from. Only present for branches created with the newer branching system. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**mergedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**mergedBy** | [**UserPreview**](UserPreview.md) |  |  [optional]
**createdBy** | [**UserPreview**](UserPreview.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**childBranches** | **List&lt;String&gt;** |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
CREATING_BRANCH | &quot;creating_branch&quot;
MERGING_BRANCH | &quot;merging_branch&quot;
SYNCING_BRANCH | &quot;syncing_branch&quot;
MERGED | &quot;merged&quot;
SUCCESS | &quot;success&quot;
BRANCH_ERROR | &quot;branch_error&quot;
MERGE_CONFLICT | &quot;merge_conflict&quot;



