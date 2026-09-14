

# MemberUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategy** | **String** | Update strategy, can be any of set, add, remove. If provided, it will set, add or remove given spaces, projects and locale ids from users access list. |  [optional]
**role** | **String** | Member role, can be any of of Admin, ProjectManager, Developer, Designer, Translator |  [optional]
**projectIds** | **String** | List of project ids the user has access to.  |  [optional]
**localeIds** | **String** | List of locale ids the user has access to. This is project-scoped and must be paired with &#x60;project_ids&#x60; (and &#x60;strategy&#x60;) to take effect; it does not grant account-wide language access. |  [optional]
**defaultLocaleCodes** | **List&lt;String&gt;** | List of default locales for the user, applied across all of the user&#39;s projects. This is the account-level field corresponding to \&quot;Language access\&quot; in the translator profile UI. |  [optional]
**spaceIds** | **List&lt;String&gt;** | List of spaces the user is assigned to. |  [optional]
**permissions** | **Map&lt;String, String&gt;** | Additional permissions depending on member role. Available permissions are &#x60;create_upload&#x60; and &#x60;review_translations&#x60; |  [optional]



