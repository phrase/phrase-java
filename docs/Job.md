

# Job

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
**automationId** | **String** | The ID of the automation that created this job, or null if the job was created manually. |  [optional]
**jobTemplateId** | **String** | The ID of the job template this job was created from, or null if no template was used. |  [optional]
**reviewDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The review due date for this job. Returns &#x60;null&#x60; when the project does not have review workflow enabled. |  [optional]



