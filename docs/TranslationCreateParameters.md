

# TranslationCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**localeId** | **String** | Locale. Can be the name or id of the locale. Preferred is id |  [optional]
**keyId** | **String** | Key |  [optional]
**content** | **String** | Translation content |  [optional]
**pluralSuffix** | **String** | Plural suffix. Can be one of: zero, one, two, few, many, other. Must be specified if the key associated to the translation is pluralized. |  [optional]
**unverified** | **Boolean** | Indicates whether translation is unverified. Part of the [Advanced Workflows](https://support.phrase.com/hc/en-us/articles/5784094755484) feature. |  [optional]
**excluded** | **Boolean** | Indicates whether translation is excluded. |  [optional]
**autotranslate** | **Boolean** | Indicates whether the translation should be auto-translated. Responses with status 422 if provided for translation within a non-default locale or the project does not have the Autopilot feature enabled. |  [optional]



