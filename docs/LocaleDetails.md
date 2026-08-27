

# LocaleDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**_default** | **Boolean** |  |  [optional]
**main** | **Boolean** |  |  [optional]
**rtl** | **Boolean** |  |  [optional]
**pluralForms** | **List&lt;String&gt;** |  |  [optional]
**ordinalPluralForms** | **List&lt;String&gt;** |  |  [optional]
**sourceLocale** | [**LocalePreview**](LocalePreview.md) |  |  [optional]
**fallbackLocale** | [**LocalePreview**](LocalePreview.md) |  |  [optional]
**languageAiProfile** | **String** |  |  [optional]
**unverifyNewTranslations** | **Boolean** | Indicates that new translations for this locale are marked as unverified. Only applies to locales using the basic verification workflow. Part of the [Advanced Workflows](https://support.phrase.com/hc/en-us/articles/5784094755484) feature. |  [optional]
**unverifyUpdatedTranslations** | **Boolean** | Indicates that updated translations for this locale are marked as unverified. Only applies to locales using the basic verification workflow. Part of the [Advanced Workflows](https://support.phrase.com/hc/en-us/articles/5784094755484) feature. |  [optional]
**unverifyOnSourceChanges** | **Boolean** | Indicates that translations for this locale are marked as unverified when the source language has been changed. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**statistics** | [**LocaleStatistics**](LocaleStatistics.md) |  |  [optional]



