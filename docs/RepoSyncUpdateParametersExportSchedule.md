

# RepoSyncUpdateParametersExportSchedule

Updates the schedule for automatic exports. Only applied when `export_triggers` includes `schedule`. Requires `manage_github_sync?` permission and the automatic export feature to be enabled. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  |  [optional]
**time** | **String** |  |  [optional]
**timeZone** | **String** |  |  [optional]
**daysOfWeek** | **String** |  |  [optional]
**dayOfMonth** | **Integer** |  |  [optional]
**cronSchedule** | **String** |  |  [optional]



## Enum: FrequencyEnum

Name | Value
---- | -----
HOUR | &quot;hour&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
CRON | &quot;cron&quot;



