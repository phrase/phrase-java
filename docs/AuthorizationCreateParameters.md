

# AuthorizationCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**note** | **String** | A note to help you remember what the access is used for. | 
**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) | A list of scopes that the access can be used for. |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date for the authorization token. Null means no expiration date (default). |  [optional]



## Enum: List&lt;ScopesEnum&gt;

Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;
ORDERS_CREATE | &quot;orders.create&quot;
TEAM_MANAGE | &quot;team.manage&quot;



