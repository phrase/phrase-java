

# InvitationUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | Invitiation role, can be any of Manager, Developer, Translator |  [optional]
**projectIds** | **String** | List of project ids the invited user has access to |  [optional]
**localeIds** | **String** | List of locale ids the invited user has access to |  [optional]
**spaceIds** | **List&lt;String&gt;** | List of spaces the user is assigned to. |  [optional]
**teamIds** | **List&lt;String&gt;** | List of teams the user is assigned to. |  [optional]
**defaultLocaleCodes** | **List&lt;String&gt;** | List of default locales for the user. |  [optional]
**permissions** | **Map&lt;String, String&gt;** | Additional permissions depending on invitation role. |  [optional]



