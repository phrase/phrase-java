

# DistributionCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the distribution | 
**projectId** | **String** | Project id the distribution should be assigned to. | 
**platforms** | **List&lt;String&gt;** | List of platforms the distribution should support. Valid values are: * &#x60;android&#x60; * &#x60;ios&#x60; * &#x60;flutter&#x60; * &#x60;i18next&#x60; * &#x60;rails&#x60; |  [optional]
**localeIds** | **List&lt;String&gt;** | List of locale ids that will be part of distribution releases |  [optional]
**formatOptions** | **Map&lt;String, String&gt;** | Additional formatting and render options. Only &#x60;enclose_in_cdata&#x60; is available for platform &#x60;android&#x60;.  |  [optional]
**fallbackLocalesEnabled** | **Boolean** | Use fallback locale if there is no translation in the current locale. |  [optional]
**fallbackToNonRegionalLocale** | **Boolean** | Indicates whether to fallback to non regional locale when locale can not be found |  [optional]
**fallbackToDefaultLocale** | **Boolean** | Indicates whether to fallback to projects default locale when locale can not be found |  [optional]
**useLastReviewedVersion** | **Boolean** | Use last reviewed instead of latest translation in a project |  [optional]



