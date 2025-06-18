

# InvitationCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email of the invited user. The &#x60;email&#x60; can not be updated once created. Create a new invitation for each unique email. | 
**role** | **String** | Invitiation role, can be any of Manager, Developer, Translator. | 
**projectIds** | **String** | List of project ids the invited user has access to. |  [optional]
**localeIds** | **String** | List of locale ids the invited user has access to. |  [optional]
**spaceIds** | **List&lt;String&gt;** | List of spaces the user is assigned to. |  [optional]
**teamIds** | **List&lt;String&gt;** | List of teams the user is assigned to. |  [optional]
**defaultLocaleCodes** | **List&lt;String&gt;** | List of default locales for the user. |  [optional]
**permissions** | **Map&lt;String, String&gt;** | Additional permissions depending on invitation role. Available permissions are &#x60;create_upload&#x60; and &#x60;review_translations&#x60; |  [optional]



