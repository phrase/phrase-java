

# LocaleDownload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the download request. Possible values are &#x60;processing&#x60;, &#x60;completed&#x60;, and &#x60;error&#x60;.  |  [optional]
**result** | [**LocaleDownloadResult**](LocaleDownloadResult.md) |  |  [optional]
**params** | [**LocaleDownloadParams**](LocaleDownloadParams.md) |  |  [optional]
**error** | **String** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PROCESSING | &quot;processing&quot;
COMPLETED | &quot;completed&quot;
ERROR | &quot;error&quot;



