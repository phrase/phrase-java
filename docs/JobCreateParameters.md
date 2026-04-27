

# JobCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**name** | **String** | Job name | 
**sourceLocaleId** | **String** | The API id of the source language |  [optional]
**briefing** | **String** | Briefing for the translators |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the job should be finished |  [optional]
**ticketUrl** | **String** | URL to a ticket for this job (e.g. Jira, Trello) |  [optional]
**tags** | **List&lt;String&gt;** | tags of keys that should be included within the job |  [optional]
**translationKeyIds** | **List&lt;String&gt;** | ids of keys that should be included within the job |  [optional]
**targetLocaleIds** | **List&lt;String&gt;** | List of target locales for the job. Mutually exclusive with &#x60;job_template_id&#x60;. |  [optional]
**jobTemplateId** | **String** | id of a job template you would like to model the created job after. Any manually added parameters will take preference over template attributes. Mutually exclusive with &#x60;target_locale_ids&#x60;. |  [optional]
**autotranslate** | **Boolean** | Automatically translate the job using machine translation. |  [optional]



