

# RepoSyncCreateParametersExportSchedule

Schedule settings for automatic exports. Required when `export_triggers` includes `schedule`. Requires the automatic export feature to be enabled. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  |  [optional]
**time** | **String** | Time of day for the export (HH:MM format). Used with &#x60;day&#x60;, &#x60;week&#x60;, and &#x60;month&#x60; frequencies. |  [optional]
**timeZone** | **String** | IANA time zone name. |  [optional]
**daysOfWeek** | **String** | Comma-separated day numbers (0&#x3D;Sunday … 6&#x3D;Saturday). Used with &#x60;week&#x60; frequency. |  [optional]
**dayOfMonth** | **Integer** | Day of the month (1–31). Used with &#x60;month&#x60; frequency. |  [optional]
**cronSchedule** | **String** | Raw cron expression. Used when &#x60;frequency&#x60; is &#x60;cron&#x60;. |  [optional]



## Enum: FrequencyEnum

Name | Value
---- | -----
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
CRON | &quot;cron&quot;



