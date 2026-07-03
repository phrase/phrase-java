

# AutomationsCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name of the automation | 
**trigger** | [**TriggerEnum**](#TriggerEnum) |  | 
**projectIds** | **List&lt;String&gt;** | List of project IDs to associate with the automation. Providing more than one project ID requires the &#x60;advanced_job_automation&#x60; plan feature; accounts without this feature receive a 422 response with error field &#x60;project_ids&#x60;.  | 
**jobTemplateId** | **String** | id of job template that the automation uses to create jobs from |  [optional]
**statusFilters** | [**List&lt;StatusFiltersEnum&gt;**](#List&lt;StatusFiltersEnum&gt;) | Translation states used when selecting keys for a job.  States are derived from associated translations, not the keys themselves.  When review workflow is enabled, &#x60;ready_for_review&#x60; is internally treated as &#x60;translated&#x60;.  | 
**tags** | **List&lt;String&gt;** | used to filter which keys are added to jobs |  [optional]
**cronSchedule** | **String** | along with time_zone, specifies when the scheduled automation is supposed to run |  [optional]
**timeZone** | **String** | along with cron_schedule, specifies when the scheduled automation is supposed to run |  [optional]
**jobOwnerId** | **String** | User ID of the job owner that newly created jobs are assigned to.  |  [optional]
**includeOnlyUpdatedLocales** | **Boolean** | When &#x60;true&#x60;, the automation only acts on locales that changed since its last run. Defaults to &#x60;false&#x60;.  |  [optional]



## Enum: TriggerEnum

Name | Value
---- | -----
SCHEDULE | &quot;schedule&quot;
UPLOAD | &quot;upload&quot;



## Enum: List&lt;StatusFiltersEnum&gt;

Name | Value
---- | -----
UNVERIFIED | &quot;unverified&quot;
UNTRANSLATED | &quot;untranslated&quot;
READY_FOR_REVIEW | &quot;ready_for_review&quot;



