

# CheckIssue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**checkName** | [**CheckNameEnum**](#CheckNameEnum) | Identifier of the check that reported this issue. One of: &#x60;translation_content_length&#x60;, &#x60;translation_placeholder_usage&#x60;, &#x60;translation_glossary_usage&#x60;. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current state of the check issue. One of: &#x60;active&#x60;, &#x60;solved&#x60;, &#x60;dismissed&#x60;. |  [optional]
**description** | **String** | Human-readable description of the reported issue, always in English. This message is intended for display only. Its wording may change at any time and it should not be parsed or relied upon programmatically. |  [optional]
**dismissedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**solvedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**translation** | [**Translation**](Translation.md) |  |  [optional]



## Enum: CheckNameEnum

Name | Value
---- | -----
CONTENT_LENGTH | &quot;translation_content_length&quot;
PLACEHOLDER_USAGE | &quot;translation_placeholder_usage&quot;
GLOSSARY_USAGE | &quot;translation_glossary_usage&quot;



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
SOLVED | &quot;solved&quot;
DISMISSED | &quot;dismissed&quot;



