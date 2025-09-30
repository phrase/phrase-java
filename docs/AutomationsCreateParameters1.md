

# AutomationsCreateParameters1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name of the automation | 
**trigger** | [**TriggerEnum**](#TriggerEnum) |  | 
**projectIds** | **List&lt;String&gt;** | List of project IDs to associate with the automation. Currently, only the first ID in the array is used. The array format leaves room for future support of multiple projects.  | 
**jobTemplateId** | **String** | id of job template that the automation uses to create jobs from |  [optional]
**statusFilters** | [**List&lt;StatusFiltersEnum&gt;**](#List&lt;StatusFiltersEnum&gt;) | translation key statuses used to filter keys that are added to jobs | 
**tags** | **List&lt;String&gt;** | used to filter which keys are added to jobs |  [optional]
**cronSchedule** | **String** | along with time_zone, specifies when the scheduled automation is supposed to run |  [optional]
**timeZone** | **String** | along with cron_schedule, specifies when the scheduled automation is supposed to run |  [optional]



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



