

# ReleaseUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the release. Send an empty string or &#x60;null&#x60; to clear the value; omit the field to leave it unchanged. The Phrase CLI drops &#x60;null&#x60; values before sending, so use an empty string there. |  [optional]
**platforms** | **List&lt;String&gt;** | List of platforms the release should support. |  [optional]
**appMinVersion** | **String** | Minimum version of the app that the release supports in semver format. Send an empty string or &#x60;null&#x60; to clear the value; omit the field to leave it unchanged. The Phrase CLI drops &#x60;null&#x60; values before sending, so use an empty string there. |  [optional]
**appMaxVersion** | **String** | Maximum version of the app that the release supports in semver format. Send an empty string or &#x60;null&#x60; to clear the value; omit the field to leave it unchanged. The Phrase CLI drops &#x60;null&#x60; values before sending, so use an empty string there. |  [optional]
**branch** | **String** | Branch used for release |  [optional]



