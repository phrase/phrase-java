

# IcuSkeletonParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **String** | Source ICU message string to derive skeletons from. Mutually exclusive with &#x60;id&#x60;; exactly one of the two must be provided.  |  [optional]
**id** | **String** | Code of an existing translation to source content from. Mutually exclusive with &#x60;content&#x60;; exactly one of the two must be provided. Returns 404 when the translation does not exist.  |  [optional]
**localeCodes** | **List&lt;String&gt;** | Locale codes for which to generate skeletons. The pluralization rules of each locale determine which plural forms appear in the output.  |  [optional]
**keepContent** | **Boolean** | When true, preserves the existing translation text in each plural form and adds any missing forms for the locale rather than stripping all literal content. |  [optional]
**zeroFormEnabled** | **Boolean** | When true, includes the zero plural form in the generated skeleton for locales that support it. |  [optional]
**cldrVersion** | [**CldrVersionEnum**](#CldrVersionEnum) | Pluralization rule set to apply when constructing skeletons. Accepted values are &#x60;legacy&#x60; and &#x60;cldr_41&#x60;. Defaults to &#x60;legacy&#x60; when omitted. |  [optional]



## Enum: CldrVersionEnum

Name | Value
---- | -----
LEGACY | &quot;legacy&quot;
CLDR_41 | &quot;cldr_41&quot;



