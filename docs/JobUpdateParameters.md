

# JobUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Job name |  [optional]
**briefing** | **String** | Briefing for the translators |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the job should be finished |  [optional]
**reviewDueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the review of the job should be finished. Must not be before &#x60;due_date&#x60;. |  [optional]
**ticketUrl** | **String** | URL to a ticket for this job (e.g. Jira, Trello) |  [optional]
**targetLocaleIds** | **List&lt;String&gt;** | List of target locales for the job. |  [optional]
**autotranslate** | **Boolean** | Automatically translate the job using machine translation |  [optional]



