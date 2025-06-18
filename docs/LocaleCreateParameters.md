

# LocaleCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**name** | **String** | Locale name | 
**code** | **String** | Locale ISO code | 
**_default** | **Boolean** | Indicates whether locale is the default locale. If set to true, the previous default locale the project is no longer the default locale. |  [optional]
**main** | **Boolean** | Indicates whether locale is a main locale. Main locales are part of the [Verification System](https://support.phrase.com/hc/en-us/articles/5784094755484) feature. |  [optional]
**rtl** | **Boolean** | Indicates whether locale is a RTL (Right-to-Left) locale. |  [optional]
**sourceLocaleId** | **String** | Source locale. Can be the name or id of the locale. Preferred is id. |  [optional]
**fallbackLocaleId** | **String** | Fallback locale for empty translations. Can be a locale name or id. |  [optional]
**unverifyNewTranslations** | **Boolean** | Indicates that new translations for this locale should be marked as unverified. Part of the [Advanced Workflows](https://support.phrase.com/hc/en-us/articles/5784094755484) feature. |  [optional]
**unverifyUpdatedTranslations** | **Boolean** | Indicates that updated translations for this locale should be marked as unverified. Part of the [Advanced Workflows](https://support.phrase.com/hc/en-us/articles/5784094755484) feature. |  [optional]
**autotranslate** | **Boolean** | If set, translations for this locale will be fetched automatically, right after creation. |  [optional]



