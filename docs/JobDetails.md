

# JobDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**briefing** | **String** |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**state** | **String** |  |  [optional]
**ticketUrl** | **String** |  |  [optional]
**project** | [**ProjectShort**](ProjectShort.md) |  |  [optional]
**branch** | [**BranchName**](BranchName.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**owner** | [**UserPreview**](UserPreview.md) |  |  [optional]
**jobTagName** | **String** |  |  [optional]
**sourceTranslationsUpdatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sourceLocale** | [**LocalePreview**](LocalePreview.md) |  |  [optional]
**locales** | [**List&lt;LocalePreview&gt;**](LocalePreview.md) |  |  [optional]
**keys** | [**List&lt;KeyPreview&gt;**](KeyPreview.md) |  |  [optional]
**annotations** | [**List&lt;JobAnnotationShort&gt;**](JobAnnotationShort.md) | Returned only when &#x60;include_annotations&#x3D;true&#x60; is supplied on the request. |  [optional]
**locked** | **Boolean** | &#x60;true&#x60; if the job has been locked by the project&#39;s job-locking workflow (translations attached to the job are read-only until the job advances).  |  [optional]



