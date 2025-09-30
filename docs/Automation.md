

# Automation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) |  |  [optional]
**statusFilters** | [**List&lt;StatusFiltersEnum&gt;**](#List&lt;StatusFiltersEnum&gt;) | translation key statuses used to filter keys that are added to jobs |  [optional]
**projectId** | **String** |  |  [optional]
**jobTemplateId** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**cronSchedule** | **String** |  |  [optional]
**timeZone** | **String** |  |  [optional]
**account** | [**Account**](Account.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
INACTIVE | &quot;inactive&quot;
ACTIVE | &quot;active&quot;
ERROR | &quot;error&quot;



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



