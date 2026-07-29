

# PreTranslation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current execution state of the pre-translation job. Jobs start as &#x60;pending&#x60; while queued, transition to &#x60;running&#x60; while executing, and settle to &#x60;success&#x60; or &#x60;error&#x60;.  |  [optional]
**translatableType** | [**TranslatableTypeEnum**](#TranslatableTypeEnum) | Resource type that was pre-translated. |  [optional]
**translatableId** | **String** | ID of the targeted resource (locale ID, job ID, key ID, or upload ID). |  [optional]
**error** | **String** | Error message. &#x60;null&#x60; unless the job&#39;s status is &#x60;error&#x60;. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
RUNNING | &quot;running&quot;
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;



## Enum: TranslatableTypeEnum

Name | Value
---- | -----
LOCALE | &quot;locale&quot;
JOB | &quot;job&quot;
TRANSLATION_KEY | &quot;translation_key&quot;
UPLOAD | &quot;upload&quot;



