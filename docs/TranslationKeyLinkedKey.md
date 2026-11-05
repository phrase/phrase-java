

# TranslationKeyLinkedKey

Describes a key's role in a parent–child link relationship.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | Whether this key is the parent or the child in the link relationship. |  [optional]
**parent** | [**TranslationKeyLinkedKeyParent**](TranslationKeyLinkedKeyParent.md) |  |  [optional]
**childrenCount** | **Integer** | The number of linked child keys. Set for parent keys. |  [optional]



## Enum: RoleEnum

Name | Value
---- | -----
PARENT | &quot;parent&quot;
CHILD | &quot;child&quot;



