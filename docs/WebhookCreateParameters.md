

# WebhookCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callbackUrl** | **String** | Callback URL to send requests to | 
**secret** | **String** | Webhook secret used to calculate signature. If empty, the default project secret will be used. |  [optional]
**description** | **String** | Webhook description |  [optional]
**events** | **String** | List of event names to trigger the webhook (separated by comma) |  [optional]
**active** | **Boolean** | Whether webhook is active or inactive |  [optional]
**includeBranches** | **Boolean** | If enabled, webhook will also be triggered for events from branches of the project specified. |  [optional]



