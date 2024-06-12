

# ReleaseTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**branch** | **String** |  |  [optional]
**cronSchedule** | **String** | Cron schedule for the scheduler. Read more about the format of this field at https://en.wikipedia.org/wiki/Cron |  [optional]
**timeZone** | **String** | Time zone for the scheduler |  [optional]
**nextRunAt** | [**OffsetDateTime**](OffsetDateTime.md) | The next time a release will be created for this trigger |  [optional]
**appMinVersion** | **String** |  |  [optional]
**appMaxVersion** | **String** |  |  [optional]
**locales** | [**List&lt;LocalePreview&gt;**](LocalePreview.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



