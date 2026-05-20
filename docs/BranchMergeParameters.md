

# BranchMergeParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategy** | [**StrategyEnum**](#StrategyEnum) | Conflict resolution strategy applied when the branch and its base have diverged. &#x60;use_main&#x60; keeps the values from the base branch; &#x60;use_branch&#x60; keeps the values from the branch being merged.  |  [optional]



## Enum: StrategyEnum

Name | Value
---- | -----
MAIN | &quot;use_main&quot;
BRANCH | &quot;use_branch&quot;



