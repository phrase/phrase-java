

# PreTranslationCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**translatableType** | [**TranslatableTypeEnum**](#TranslatableTypeEnum) | Resource type to pre-translate. |  [optional]
**translatableId** | **String** | ID of the targeted resource: locale ID for &#x60;locale&#x60;, job ID for &#x60;job&#x60;, key ID for &#x60;translation_key&#x60;, upload ID for &#x60;upload&#x60;.  |  [optional]



## Enum: TranslatableTypeEnum

Name | Value
---- | -----
LOCALE | &quot;locale&quot;
JOB | &quot;job&quot;
TRANSLATION_KEY | &quot;translation_key&quot;
UPLOAD | &quot;upload&quot;



