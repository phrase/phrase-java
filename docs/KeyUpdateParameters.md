

# KeyUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**name** | **String** | Key name |  [optional]
**description** | **String** | Key description (usually includes contextual information for translators) |  [optional]
**plural** | **Boolean** | Indicates whether key supports pluralization |  [optional]
**useOrdinalRules** | **Boolean** | Indicates whether key uses ordinal rules for pluralization |  [optional]
**namePlural** | **String** | Plural name for the key (used in some file formats, e.g. Gettext) |  [optional]
**dataType** | **String** | Type of the key. Can be one of the following: string, number, boolean, array, markdown. |  [optional]
**tags** | **String** | List of tags separated by comma to be associated with the key. |  [optional]
**maxCharactersAllowed** | **Integer** | Max. number of characters translations for this key can have. |  [optional]
**screenshot** | [**File**](File.md) | Screenshot/image for the key. This parameter is deprecated. Please use the Screenshots endpoint instead. |  [optional]
**removeScreenshot** | **Boolean** | Indicates whether the screenshot will be deleted. This parameter is deprecated. Please use the Screenshots endpoint instead. |  [optional]
**unformatted** | **Boolean** | Indicates whether the key should be exported as \&quot;unformatted\&quot;. Supported by Android XML and other formats. |  [optional]
**xmlSpacePreserve** | **Boolean** | Indicates whether the key should be exported with \&quot;xml:space&#x3D;preserve\&quot;. Supported by several XML-based formats. |  [optional]
**originalFile** | **String** | Original file attribute. Used in some formats, e.g. XLIFF. |  [optional]
**localizedFormatString** | **String** | NSStringLocalizedFormatKey attribute. Used in .stringsdict format. |  [optional]
**localizedFormatKey** | **String** | NSStringLocalizedFormatKey attribute. Used in .stringsdict format. |  [optional]
**customMetadata** | **Object** | Updates/Creates custom metadata property name and value pairs to be associated with key. If you want to delete a custom metadata property, you can set its value to null. If you want to update a custom metadata property, you can set its value to the new value. |  [optional]



