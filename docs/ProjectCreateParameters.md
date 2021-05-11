

# ProjectCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the project |  [optional]
**mainFormat** | **String** | Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see &lt;a href&#x3D;\&quot;https://help.phrase.com/help/supported-platforms-and-formats\&quot;&gt;Format Guide&lt;/a&gt; or our &lt;a href&#x3D;\&quot;#formats\&quot;&gt;Formats API Endpoint&lt;/a&gt;. |  [optional]
**sharesTranslationMemory** | **Boolean** | Indicates whether the project should share the account&#39;s translation memory |  [optional]
**projectImage** | [**File**](File.md) | Image to identify the project |  [optional]
**removeProjectImage** | **Boolean** | Indicates whether the project image should be deleted. |  [optional]
**accountId** | **String** | Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts. |  [optional]
**sourceProjectId** | **String** | When a source project ID is given, a clone of that project will be created, including all locales, keys and translations as well as the main project settings if they are not defined otherwise through the params. |  [optional]
**workflow** | **String** | (Optional) Review Workflow. \&quot;simple\&quot; / \&quot;review\&quot;. &lt;a href&#x3D;\&quot;https://help.phrase.com/help/advanced-review-workflow\&quot;&gt;Read more&lt;/a&gt; |  [optional]
**machineTranslationEnabled** | **Boolean** | (Optional) Enable machine translation support in the project. Required for Autopilot and Smart Suggest |  [optional]
**enableBranching** | **Boolean** | (Optional) Enable branching in the project |  [optional]
**protectMasterBranch** | **Boolean** | (Optional) Protect the master branch in project where branching is enabled |  [optional]
**enableAllDataTypeTranslationKeysForTranslators** | **Boolean** | (Optional) Otherwise, translators are not allowed to edit translations other than strings |  [optional]
**enableIcuMessageFormat** | **Boolean** | (Optional) We can validate and highlight your ICU messages. &lt;a href&#x3D;\&quot;https://help.phrase.com/help/icu-message-format\&quot;&gt;Read more&lt;/a&gt; |  [optional]
**zeroPluralFormEnabled** | **Boolean** | (Optional) Displays the input fields for the &#39;ZERO&#39; plural form for every key as well although only some languages require the &#39;ZERO&#39; explicitly. |  [optional]
**autotranslateEnabled** | **Boolean** | (Optional) Autopilot, requires machine_translation_enabled. &lt;a href&#x3D;\&quot;https://help.phrase.com/help/autopilot\&quot;&gt;Read more&lt;/a&gt; |  [optional]
**autotranslateCheckNewTranslationKeys** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateCheckNewUploads** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateCheckNewLocales** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateMarkAsUnverified** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateUseMachineTranslation** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateUseTranslationMemory** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**smartSuggestEnabled** | **Boolean** | (Optional) Smart Suggest, requires machine_translation_enabled |  [optional]
**smartSuggestUseGlossary** | **Boolean** | (Optional) Requires smart_suggest_enabled to be true |  [optional]
**smartSuggestUseMachineTranslation** | **Boolean** | (Optional) Requires smart_suggest_enabled to be true |  [optional]



