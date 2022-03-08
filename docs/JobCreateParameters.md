

# JobCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**name** | **String** | Job name |  [optional]
**sourceLocaleId** | **String** | The API id of the source language |  [optional]
**briefing** | **String** | Briefing for the translators |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the job should be finished |  [optional]
**ticketUrl** | **String** | URL to a ticket for this job (e.g. Jira, Trello) |  [optional]
**tags** | **List&lt;String&gt;** | tags of keys that should be included within the job |  [optional]
**translationKeyIds** | **List&lt;String&gt;** | ids of keys that should be included within the job |  [optional]
**jobTemplateId** | **String** | id of a job template you would like to model the created job after. Any manually added parameters will take preference over template attributes. |  [optional]



