

# LocaleDownloadCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileFormat** | **String** | File format name. See the [format guide](https://support.phrase.com/hc/en-us/sections/6111343326364) for all supported file formats. | 
**branch** | **String** | specify the branch to use |  [optional]
**tags** | **String** | Limit results to keys tagged with a list of comma separated tag names. |  [optional]
**includeEmptyTranslations** | **Boolean** | Indicates whether keys without translations should be included in the output as well. |  [optional]
**excludeEmptyZeroForms** | **Boolean** | Indicates whether zero forms should be included when empty in pluralized keys. |  [optional]
**includeTranslatedKeys** | **Boolean** | Include translated keys in the locale file. Use in combination with include_empty_translations to obtain only untranslated keys. |  [optional]
**keepNotranslateTags** | **Boolean** | Indicates whether [NOTRANSLATE] tags should be kept. |  [optional]
**formatOptions** | **Object** | Additional formatting and render options. See the [format guide](https://support.phrase.com/hc/en-us/sections/6111343326364) for a list of options available for each format. Specify format options like this: &#x60;...&amp;format_options[foo]&#x3D;bar&#x60; |  [optional]
**encoding** | **String** | Enforces a specific encoding on the file contents. Valid options are \&quot;UTF-8\&quot;, \&quot;UTF-16\&quot; and \&quot;ISO-8859-1\&quot;. |  [optional]
**includeUnverifiedTranslations** | **Boolean** | if set to false unverified translations are excluded |  [optional]
**useLastReviewedVersion** | **Boolean** | If set to true the last reviewed version of a translation is used. This is only available if the review workflow is enabled for the project. |  [optional]
**localeIds** | **List&lt;String&gt;** | Locale IDs or locale names |  [optional]
**fallbackLocaleId** | **String** | If a key has no translation in the locale being downloaded the translation in the fallback locale will be used. Provide the ID of the locale that should be used as the fallback. Requires include_empty_translations to be set to &#x60;true&#x60;. |  [optional]
**sourceLocaleId** | **String** | Provides the source language of a corresponding job as the source language of the generated locale file. This parameter will be ignored unless used in combination with a &#x60;tag&#x60; parameter indicating a specific job. |  [optional]
**customMetadataFilters** | **Object** | Custom metadata filters. Provide the name of the metadata field and the value to filter by. Only keys with matching metadata will be included in the download.  |  [optional]
**updatedSince** | **String** | Only include translations and keys that have been updated since the given date. The date must be in ISO 8601 format (e.g., &#x60;2023-01-01T00:00:00Z&#x60;).  |  [optional]



