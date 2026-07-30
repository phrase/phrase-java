

# AutomationEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the automation event. |  [optional]
**automationId** | **String** | Identifier of the automation that produced this event. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Outcome of the automation run. |  [optional]
**triggeredBy** | [**TriggeredByEnum**](#TriggeredByEnum) | What caused the automation to run. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the event was created. |  [optional]
**jobsCreated** | **Integer** | Number of jobs created during this automation run. |  [optional]
**jobIds** | **List&lt;String&gt;** | Identifiers of the jobs created during this automation run. |  [optional]
**project** | [**AutomationEventProject**](AutomationEventProject.md) |  |  [optional]
**details** | **String** | Error message describing the failure when state is &#x60;failure&#x60;; null otherwise. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;
IN_PROGRESS | &quot;in_progress&quot;



## Enum: TriggeredByEnum

Name | Value
---- | -----
MANUAL | &quot;manual&quot;
SCHEDULE | &quot;schedule&quot;
UPLOAD | &quot;upload&quot;
UPLOAD_BATCH | &quot;upload_batch&quot;



