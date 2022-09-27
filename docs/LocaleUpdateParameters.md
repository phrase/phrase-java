

# LocaleUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**name** | **String** | Locale name |  [optional]
**code** | **String** | Locale ISO code |  [optional]
**_default** | **Boolean** | Indicates whether locale is the default locale. If set to true, the previous default locale the project is no longer the default locale. |  [optional]
**main** | **Boolean** | Indicates whether locale is a main locale. Main locales are part of the &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5784094755484\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Verification System&lt;/a&gt; feature. |  [optional]
**rtl** | **Boolean** | Indicates whether locale is a RTL (Right-to-Left) locale. |  [optional]
**sourceLocaleId** | **String** | Source locale. Can be the name or public id of the locale. Preferred is the public id. |  [optional]
**fallbackLocaleId** | **String** | Fallback locale for empty translations. Can be a locale name or id. |  [optional]
**unverifyNewTranslations** | **Boolean** | Indicates that new translations for this locale should be marked as unverified. Part of the &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5784094755484\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Advanced Workflows&lt;/a&gt; feature. |  [optional]
**unverifyUpdatedTranslations** | **Boolean** | Indicates that updated translations for this locale should be marked as unverified. Part of the &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5784094755484\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Advanced Workflows&lt;/a&gt; feature. |  [optional]
**autotranslate** | **Boolean** | If set, translations for this locale will be fetched automatically, right after creation. |  [optional]



