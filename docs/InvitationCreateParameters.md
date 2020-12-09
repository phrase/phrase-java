

# InvitationCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email of the invited user. The &lt;code&gt;email&lt;/code&gt; can not be updated once created. Create a new invitation for each unique email. |  [optional]
**role** | **String** | Invitiation role, can be any of Manager, Developer, Translator. |  [optional]
**projectIds** | **String** | List of project ids the invited user has access to. |  [optional]
**localeIds** | **String** | List of locale ids the invited user has access to. |  [optional]
**defaultLocaleCodes** | **List&lt;String&gt;** | List of default locales for the user. |  [optional]
**permissions** | **Map&lt;String, String&gt;** | Additional permissions depending on invitation role. Available permissions are &lt;code&gt;create_upload&lt;/code&gt; and &lt;code&gt;review_translations&lt;/code&gt; |  [optional]



