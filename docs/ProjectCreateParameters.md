

# ProjectCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the project | 
**mainFormat** | **String** | Main file format specified by its API Extension name. Used for locale downloads if no format is specified. For API Extension names of available file formats see [Format Guide](https://support.phrase.com/hc/en-us/sections/6111343326364) or our [Formats API Endpoint](/en/api/strings/formats/list-formats). |  [optional]
**media** | **String** | (Optional) Main technology stack used in the project. It affects for example the suggested placeholder style. Predefined values include: &#x60;Ruby&#x60;, &#x60;JavaScript&#x60;, &#x60;AngularJS&#x60;, &#x60;React&#x60;, &#x60;iOS&#x60;, &#x60;Android&#x60;, &#x60;Python&#x60;, &#x60;PHP&#x60;, &#x60;Java&#x60;, &#x60;Go&#x60;, &#x60;Windows Phone&#x60;, &#x60;Rails&#x60;, &#x60;Node.js&#x60;, &#x60;.NET&#x60;, &#x60;Django&#x60;, &#x60;Symfony&#x60;, &#x60;Yii Framework&#x60;, &#x60;Zend Framework&#x60;, &#x60;Apple App Store Description&#x60;, &#x60;Google Play Description&#x60;, but it can also take any other value. |  [optional]
**sharesTranslationMemory** | **Boolean** | Indicates whether the project should share the account&#39;s translation memory |  [optional]
**projectImage** | [**File**](File.md) | Image to identify the project |  [optional]
**removeProjectImage** | **Boolean** | Indicates whether the project image should be deleted. |  [optional]
**accountId** | **String** | Account ID to specify the actual account the project should be created in. Required if the requesting user is a member of multiple accounts. |  [optional]
**pointOfContact** | **String** | (Optional) User ID of the point of contact for the project. |  [optional]
**sourceProjectId** | **String** | When a source project ID is given, a clone of that project will be created, including all locales, keys and translations as well as the main project settings if they are not defined otherwise through the params. |  [optional]
**workflow** | **String** | (Optional) Review Workflow. \&quot;simple\&quot; / \&quot;review\&quot;. [Read more](https://support.phrase.com/hc/en-us/articles/5784094755484) |  [optional]
**machineTranslationEnabled** | **Boolean** | (Optional) Enable machine translation support in the project. Required for Pre-Translation |  [optional]
**enableBranching** | **Boolean** | (Optional) Enable branching in the project |  [optional]
**protectMasterBranch** | **Boolean** | (Optional) Protect the master branch in project where branching is enabled |  [optional]
**enableAllDataTypeTranslationKeysForTranslators** | **Boolean** | (Optional) Otherwise, translators are not allowed to edit translations other than strings |  [optional]
**enableIcuMessageFormat** | **Boolean** | (Optional) We can validate and highlight your ICU messages. [Read more](https://support.phrase.com/hc/en-us/articles/5822319545116) |  [optional]
**zeroPluralFormEnabled** | **Boolean** | (Optional) Displays the input fields for the &#39;ZERO&#39; plural form for every key as well although only some languages require the &#39;ZERO&#39; explicitly. |  [optional]
**autotranslateEnabled** | **Boolean** | (Optional) Autopilot, requires machine_translation_enabled. [Read more](https://support.phrase.com/hc/en-us/articles/5822187934364) |  [optional]
**autotranslateCheckNewTranslationKeys** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateCheckNewUploads** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateCheckNewLocales** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateMarkAsUnverified** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateUseMachineTranslation** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]
**autotranslateUseTranslationMemory** | **Boolean** | (Optional) Requires autotranslate_enabled to be true |  [optional]



