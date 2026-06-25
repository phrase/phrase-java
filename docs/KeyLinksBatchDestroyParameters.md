

# KeyLinksBatchDestroyParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childKeyIds** | **List&lt;String&gt;** | Codes of the child keys to unlink. Required when unlink_parent is false or omitted. Ignored when unlink_parent is true. | 
**unlinkParent** | **Boolean** | When true, dissolves the entire linked-key group by unlinking all children and removing the group. The child_key_ids field is ignored when this is set to true. |  [optional]
**strategy** | [**StrategyEnum**](#StrategyEnum) | Controls what happens to child key translation content after unlinking. keep_content (default) copies the parent translation into each child; remove_content clears each child translation. |  [optional]



## Enum: StrategyEnum

Name | Value
---- | -----
KEEP_CONTENT | &quot;keep_content&quot;
REMOVE_CONTENT | &quot;remove_content&quot;



