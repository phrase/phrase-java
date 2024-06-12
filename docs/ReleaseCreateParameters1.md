

# ReleaseCreateParameters1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cronSchedule** | **String** | Cron schedule for the scheduler. Read more about the format of this field at https://en.wikipedia.org/wiki/Cron |  [optional]
**timeZone** | **String** | Time zone for the scheduler |  [optional]
**localeIds** | **List&lt;String&gt;** | List of locale ids that will be included in the release. |  [optional]
**tags** | **List&lt;String&gt;** | Only include tagged keys in the release. For a key to be included it must be tagged with all tags provided |  [optional]
**branch** | **String** | Branch used for release |  [optional]
**appMinVersion** | **String** | The created releases will be available only for apps with version greater or equal to this value |  [optional]
**appMaxVersion** | **String** | The created releases will be available only for apps with version less or equal to this value |  [optional]



