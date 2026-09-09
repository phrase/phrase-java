

# MachineTranslationSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultService** | **String** | The default machine translation engine configured for the account. Returns \&quot;microsoft_translate\&quot; when no service has been explicitly configured. Supported values: language_ai_translate, aita_translate, microsoft_translate, google_translate, amazon_translate, intento_translate, gpt_translate.  |  [optional]
**machineTranslationUnitsUsed** | **Integer** | Number of machine translation characters consumed in the current billing period. |  [optional]
**machineTranslationUnitsTotal** | **Integer** | Total machine translation character quota granted for the current billing period. |  [optional]
**localeProviderMappings** | [**List&lt;MachineTranslationLocaleProviderMapping&gt;**](MachineTranslationLocaleProviderMapping.md) | Per-locale-pair provider overrides. When a matching mapping exists for a source/target locale pair, that provider takes precedence over the account default.  |  [optional]



