

# OrderCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**name** | **String** | the name of the order, default name is: Translation order from &#39;current datetime&#39; |  [optional]
**lsp** | **String** | Name of the LSP that should process this order. Can be one of gengo, textmaster. |  [optional]
**sourceLocaleId** | **String** | Source locale for the order. Can be the name or public id of the source locale. Preferred is the public id. |  [optional]
**targetLocaleIds** | **List&lt;String&gt;** | List of target locales you want the source content translate to. Can be the name or public id of the target locales. Preferred is the public id. |  [optional]
**translationType** | **String** | Name of the quality level, availability depends on the LSP. Can be one of:  standard, pro (for orders processed by Gengo) and one of regular, premium, enterprise (for orders processed by TextMaster) |  [optional]
**tag** | **String** | Tag you want to order translations for. |  [optional]
**message** | **String** | Message that is displayed to the translators for description. |  [optional]
**styleguideId** | **String** | Style guide for translators to be sent with the order. |  [optional]
**unverifyTranslationsUponDelivery** | **Boolean** | Unverify translations upon delivery. |  [optional]
**includeUntranslatedKeys** | **Boolean** | Order translations for keys with untranslated content in the selected target locales. |  [optional]
**includeUnverifiedTranslations** | **Boolean** | Order translations for keys with unverified content in the selected target locales. |  [optional]
**category** | **String** | Category to use (required for orders processed by TextMaster). |  [optional]
**quality** | **Boolean** | Extra proofreading option to ensure consistency in vocabulary and style. Only available for orders processed by TextMaster. |  [optional]
**priority** | **Boolean** | Indicates whether the priority option should be ordered which decreases turnaround time by 30%. Available only for orders processed by TextMaster. |  [optional]



