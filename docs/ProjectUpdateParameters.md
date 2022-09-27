

# ProjectUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Required if the requesting user is a member of multiple accounts. Account ID to specify the actual account the project should be created in. |  [optional]
**name** | **String** | (Optional) Name of the project |  [optional]
**mainFormat** | **String** | (Optional) Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5784070560412\&quot;&gt;Format Guide&lt;/a&gt; or our &lt;a href&#x3D;\&quot;#formats\&quot;&gt;Formats API Endpoint&lt;/a&gt;. |  [optional]
**sharesTranslationMemory** | **Boolean** | (Optional) Indicates whether the project should share the account&#39;s translation memory |  [optional]
**projectImage** | [**File**](File.md) | (Optional) Image to identify the project |  [optional]
**removeProjectImage** | **Boolean** | (Optional) Indicates whether the project image should be deleted. |  [optional]
**workflow** | **String** | (Optional) Review Workflow. \&quot;simple\&quot; / \&quot;review\&quot;. &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5784094755484\&quot;&gt;Read more&lt;/a&gt; |  [optional]
**machineTranslationEnabled** | **Boolean** | (Optional) Enable machine translation support in the project. Required for Autopilot and Smart Suggest |  [optional]
**enableBranching** | **Boolean** | (Optional) Enable branching in the project |  [optional]
**protectMasterBranch** | **Boolean** | (Optional) Protect the master branch in project where branching is enabled |  [optional]
**enableAllDataTypeTranslationKeysForTranslators** | **Boolean** | (Optional) Otherwise, translators are not allowed to edit translations other than strings |  [optional]
**enableIcuMessageFormat** | **Boolean** | (Optional) We can validate and highlight your ICU messages. &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5822319545116\&quot;&gt;Read more&lt;/a&gt; |  [optional]
**zeroPluralFormEnabled** | **Boolean** | (Optional) Displays the input fields for the &#39;ZERO&#39; plural form for every key as well although only some languages require the &#39;ZERO&#39; explicitly. |  [optional]
**autotranslateEnabled** | **Boolean** | (Optional) Autopilot, requires machine_translation_enabled. &lt;a href&#x3D;\&quot;https://support.phrase.com/hc/en-us/articles/5822187934364\&quot;&gt;Read more&lt;/a&gt; |  [optional]
**autotranslateCheckNewTranslationKeys** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateCheckNewUploads** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateCheckNewLocales** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateMarkAsUnverified** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateUseMachineTranslation** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateUseTranslationMemory** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**smartSuggestEnabled** | **Boolean** | (Optional) Smart Suggest, requires machine_translation_enabled |  [optional]
**smartSuggestUseGlossary** | **Boolean** | (Optional) Requires smart_suggest_enabled to be true |  [optional]
**smartSuggestUseMachineTranslation** | **Boolean** | (Optional) Requires smart_suggest_enabled to be true |  [optional]



