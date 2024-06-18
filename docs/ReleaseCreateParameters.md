

# ReleaseCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the release |  [optional]
**platforms** | **List&lt;String&gt;** | List of platforms the release should support. |  [optional]
**localeIds** | **List&lt;String&gt;** | List of locale ids that will be included in the release. If empty, distribution locales will be used |  [optional]
**tags** | **List&lt;String&gt;** | Only include tagged keys in the release. For a key to be included it must be tagged with all tags provided |  [optional]
**appMinVersion** | **String** | Minimum version of the app that the release supports in semver format |  [optional]
**appMaxVersion** | **String** | Maximum version of the app that the release supports in semver format |  [optional]
**branch** | **String** | Branch used for release |  [optional]



