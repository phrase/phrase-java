

# KeysExcludeParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | specify the branch to use |  [optional]
**q** | **String** | Specify a query to do broad search for keys by name (including wildcards).&lt;br&gt;&lt;br&gt; The following qualifiers are also supported in the search term:&lt;br&gt; &lt;ul&gt;   &lt;li&gt;&lt;code&gt;ids:key_id,...&lt;/code&gt; for queries on a comma-separated list of ids&lt;/li&gt;   &lt;li&gt;&lt;code&gt;name:key_name&lt;/code&gt; for text queries on exact key names - whitespaces need to be prefixed with a backspace (\\\&quot;\\\\\\\&quot;)&lt;/li&gt;   &lt;li&gt;&lt;code&gt;tags:tag_name&lt;/code&gt; to filter for keys with certain tags&lt;/li&gt;   &lt;li&gt;&lt;code&gt;translated:{true|false}&lt;/code&gt; for translation status (also requires &lt;code&gt;locale_id&lt;/code&gt; to be specified)&lt;/li&gt;   &lt;li&gt;&lt;code&gt;updated_at:{&gt;&#x3D;|&lt;&#x3D;}2013-02-21T00:00:00Z&lt;/code&gt; for date range queries&lt;/li&gt;   &lt;li&gt;&lt;code&gt;unmentioned_in_upload:upload_id&lt;/code&gt; to filter keys unmentioned within upload&lt;/li&gt; &lt;/ul&gt; Find more examples &lt;a href&#x3D;\&quot;#overview--usage-examples\&quot;&gt;here&lt;/a&gt;.  |  [optional]
**targetLocaleId** | **String** | Locale used to exlcude or include keys. |  [optional]
**tags** | **String** | Tag or comma-separated list of tags to add to the matching collection of keys |  [optional]



