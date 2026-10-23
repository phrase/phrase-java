

# JobUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Job name |  [optional]
**briefing** | **String** | Briefing for the translators. Send an empty string or &#x60;null&#x60; to clear the value; omit the field to leave it unchanged. The Phrase CLI drops &#x60;null&#x60; values before sending, so use an empty string there. |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the job should be finished |  [optional]
**reviewDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the review of the job should be finished. Must not be before &#x60;due_date&#x60;. |  [optional]
**ticketUrl** | **String** | URL to a ticket for this job (e.g. Jira, Trello) Send an empty string or &#x60;null&#x60; to clear the value; omit the field to leave it unchanged. The Phrase CLI drops &#x60;null&#x60; values before sending, so use an empty string there. |  [optional]
**targetLocaleIds** | **List&lt;String&gt;** | List of target locales for the job. |  [optional]
**autotranslate** | **Boolean** | Automatically translate the job using machine translation |  [optional]



