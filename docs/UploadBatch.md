

# UploadBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) | Processing state of the upload batch |  [optional]
**deleteUnmentionedKeys** | **Boolean** | Indicates whether unmentioned keys will be deleted after processing all uploads in the batch |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**project** | [**ProjectShort**](.md) |  |  [optional]
**user** | [**UserPreview**](.md) |  |  [optional]
**uploads** | [**List&lt;Upload&gt;**](Upload.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
STARTED | &quot;started&quot;
DONE | &quot;done&quot;



