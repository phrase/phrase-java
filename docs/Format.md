

# Format

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Human-readable display name of the format. | 
**apiName** | **String** | Identifier used to reference this format in API requests, such as the file_format parameter on the uploads and downloads endpoints. | 
**description** | **String** | Human-readable summary of the format and its typical use case. | 
**extension** | **String** | Default file extension associated with this format. | 
**defaultEncoding** | **String** | Default character encoding used when reading or writing files in this format. | 
**importable** | **Boolean** | Whether locale files can be imported using this format. | 
**exportable** | **Boolean** | Whether locale files can be exported using this format. | 
**defaultFile** | **String** | Conventional file path pattern for this format. Contains locale_name as a placeholder for the locale identifier. | 
**rendersDefaultLocale** | **Boolean** | When true, exported files contain the default locale&#39;s content for any key that has no translation in the target locale. | 
**includesLocaleInformation** | **Boolean** | When true, files in this format embed locale information so Phrase can detect the locale automatically on import. | 



