# phrase-java

Phrase Strings API Reference
- API version: 2.0.0
  - Build date: 2022-10-25T09:45:06.206939Z[Etc/UTC]

Phrase Strings is a translation management platform for software projects. You can collaborate on language file translation with your team or order translations through our platform. The API allows you to import locale files, download locale files, tag keys or interact in other ways with the localization data stored in Phrase Strings for your account.

## API Endpoints

### EU data center
```
https://api.phrase.com/v2/
```

### US data center

```
https://api.us.app.phrase.com/v2
```

The API is only accessible via HTTPS and the current version is <code>v2</code>, which results in a base URL like: <code>https://api.phrase.com/v2/</code> depending on the datacenter.


## Usage

[curl](http://curl.haxx.se/) is used primarily to send requests to Phrase Strings in the examples. On most you'll find a second variant using the [Phrase Strings API v2 client](https://phrase.com/cli/) that might be more convenient to handle. For further information check its [documentation](https://support.phrase.com/hc/en-us/articles/5808300599068).

## Use of HTTP Verbs

Phrase Strings API v2 tries to use the appropriate HTTP verb for accessing each endpoint according to REST specification where possible:

<div class=\"table-responsive\">
  <table class=\"basic-table\">
    <thead>
      <tr class=\"basic-table__row basic-table__row--header\">
        <th class=\"basic-table__cell basic-table__cell--header\">Verb</th>
        <th class=\"basic-table__cell basic-table__cell--header\">Description</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td class=\"basic-table__cell\">GET</td>
        <td class=\"basic-table__cell\">Retrieve one or multiple resources</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">POST</td>
        <td class=\"basic-table__cell\">Create a resource</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">PUT</td>
        <td class=\"basic-table__cell\">Update a resource</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">PATCH</td>
        <td class=\"basic-table__cell\">Update a resource (partially)</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">DELETE</td>
        <td class=\"basic-table__cell\">Delete a resource</td>
      </tr>
    </tbody>
  </table>
</div>


## Identification via User-Agent

You must include the User-Agent header with the name of your application or project. It might be a good idea to include some sort of contact information  as well, so that we can get in touch if necessary (e.g. to warn you about Rate-Limiting or badly formed requests). Examples of excellent User-Agent headers:

```
User-Agent: Example Mobile App (example@phrase.com)
User-Agent: ACME Inc Python Client (http://example.com/contact)
```

If you don't send this header, you will receive a response with 400 Bad Request.


## Lists

When you request a list of resources, the API will typically only return an array of resources including their most important attributes. For a detailed representation of the resource you should request its detailed representation.

Lists are usually [paginated](#pagination).


## Parameters

Many endpoints support additional parameters, e.g. for pagination. When passing them in a GET request you can send them as HTTP query string parameters:

```
$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\"
```

When performing a POST, PUT, PATCH or DELETE request, we recommend sending parameters that are not already included in the URL, as JSON body:

```
$ curl -H 'Content-Type: application/json' -d '{\"name\":\"My new project\"}' -u EMAIL_OR_ACCESS_TOKEN https://api.phrase.com/v2/projects
```

Encoding parameters as JSON means better support for types (boolean, integer) and usually better readability. Don't forget to set the correct Content-Type for your request.

*The Content-Type header is omitted in some of the following examples for better readbility.*


## Errors


### Request Errors

If a request contains invalid JSON or is missing a required parameter (besides resource attributes), the status `400 Bad Request` is returned:

```
{
  \"message\": \"JSON could not be parsed\"
}
```


### Validation Errors

When the validation for a resource fails, the status `422 Unprocessable Entity` is returned, along with information on the affected fields:

```
{
  \"message\": \"Validation Failed\",
  \"errors\": [
    {
      \"resource\": \"Project\",
      \"field\": \"name\",
      \"message\": \"can't be blank\"
    }
  ]
}
```


## Date Format

Times and dates are returned and expected in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) date format:

```
YYYY-MM-DDTHH:MM:SSZ
```

Instead of 'Z' for UTC time zone you can specify your time zone's locale offset using the following notation:

```
YYYY-MM-DDTHH:MM:SS¬±hh:mm
```

Example for CET (1 hour behind UTC):

```
2015-03-31T13:00+01:00
```

Please note that in HTTP headers, we will use the appropriate recommended date formats instead of ISO 8601.


## Authentication

There are two different ways to authenticate when performing API requests:

* E-Mail and password
* Oauth Access Token


### E-Mail and password

To get started easily, you can use HTTP Basic authentication with your email and password:

```
$ curl -u username:password \"https://api.phrase.com/v2/projects\"
```


### OAuth via Access Tokens

You can create and manage access tokens in your [profile settings](https://app.phrase.com/settings/oauth_access_tokens) in Translation Center or via the [Authorizations API](#tag--Authorizations).

Simply pass the access token as the username of your request:

```
$ curl -u ACCESS_TOKEN: \"https://api.phrase.com/v2/projects\"
```

or send the access token via the `Authorization` header field:

```
$ curl -H \"Authorization: token ACCESS_TOKEN\" https://api.phrase.com/v2/projects
```

#### Send via parameter

As JSONP (and other) requests cannot send HTTP Basic Auth credentials, a special query parameter `access_token` can be used:

```
curl \"https://api.phrase.com/v2/projects?access_token=ACCESS_TOKEN\"
```

You should only use this transport method if sending the authentication via header or Basic authentication is not possible.

### Two-Factor-Authentication

Users with Two-Factor-Authentication enabled have to send a valid token along their request with certain authentication methods (such as Basic authentication). The necessity of a Two-Factor-Authentication token is indicated by the `X-PhraseApp-OTP: required; :MFA-type` header in the response. The `:MFA-type`field indicates the source of the token, e.g. `app` (refers to your Authenticator application):

```
X-PhraseApp-OTP: required; app
```

To provide a Two-Factor-Authentication token you can simply send it in the header of the request:

```
curl -H \"X-PhraseApp-OTP: MFA-TOKEN\" -u EMAIL https://api.phrase.com/v2/projects
```

Since Two-Factor-Authentication tokens usually expire quickly, we recommend using an alternative authentication method such as OAuth access tokens.

### Multiple Accounts

Some endpoints require the account ID to be specified if the authenticated user is a member of multiple accounts. You can find the eight-digit account ID inside <a href=\"https://app.phrase.com/\" target=\"_blank\">Translation Center</a> by switching to the desired account and then visiting the account details page. If required, you can specify the account just like a normal parameter within the request.

## Pagination

Endpoints that return a list or resources will usually return paginated results and include 25 items by default. To access further pages, use the `page` parameter:

```
$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2\"
```

Some endpoints also allow a custom page size by using the `per_page` parameter:

```
$ curl -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects?page=2&per_page=50\"
```

Unless specified otherwise in the description of the respective endpoint, `per_page` allows you to specify a page size up to 100 items.


## Link-Headers

We provide you with pagination URLs in the [Link Header field](http://tools.ietf.org/html/rfc5988). Make use of this information to avoid building pagination URLs yourself.

```
Link: <https://api.phrase.com/v2/projects?page=1>; rel=\"first\", <https://api.phrase.com/v2/projects?page=3>; rel=\"prev\", <https://api.phrase.com/v2/projects?page=5>; rel=\"next\", <https://api.phrase.com/v2/projects?page=9>; rel=\"last\"
```

Possible `rel` values are:

<div class=\"table-responsive\">
  <table class=\"basic-table\">
    <thead>
      <tr class=\"basic-table__row basic-table__row--header\">
        <th class=\"basic-table__cell basic-table__cell--header\">Value</th>
        <th class=\"basic-table__cell basic-table__cell--header\">Description</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td class=\"basic-table__cell\">next</td>
        <td class=\"basic-table__cell\">URL of the next page of results</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">last</td>
        <td class=\"basic-table__cell\">URL of the last page of results</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">first</td>
        <td class=\"basic-table__cell\">URL of the first page of results</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\">prev</td>
        <td class=\"basic-table__cell\">URL of the previous page of results</td>
      </tr>
    </tbody>
  </table>
</div>

## Rate Limiting

All API endpoints are subject to rate limiting to ensure good performance for all customers. The rate limit is calculated per user:

* 1000 requests per 5 minutes
* 4 concurrent (parallel) requests

For your convenience we send information on the current rate limit within the response headers:

<div class=\"table-responsive\">
  <table class=\"basic-table\">
    <thead>
      <tr class=\"basic-table__row basic-table__row--header\">
        <th class=\"basic-table__cell basic-table__cell--header\">Header</th>
        <th class=\"basic-table__cell basic-table__cell--header\">Description</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Limit</code></td>
        <td class=\"basic-table__cell\">Number of max requests allowed in the current time period</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Remaining</code></td>
        <td class=\"basic-table__cell\">Number of remaining requests in the current time period</td>
      </tr>
      <tr>
        <td class=\"basic-table__cell\" style=\"white-space: nowrap;\"><code>X-Rate-Limit-Reset</code></td>
        <td class=\"basic-table__cell\">Timestamp of end of current time period as UNIX timestamp</td>
      </tr>
    </tbody>
  </table>
</div>

If you should run into the rate limit, you will receive the HTTP status code `429: Too many requests`.

If you should need higher rate limits, [contact us](https://phrase.com/contact).


## Conditional GET requests / HTTP Caching

<div class=\"alert alert-info\"><p><strong>Note:</strong> Conditional GET requests are currently only supported for <a href=\"#locales_download\">locales#download</a> and <a href=\"#translations_index\">translations#index</a></p></div>

We will return an ETag or Last-Modified header with most GET requests. When you request a resource we recommend to store this value and submit them on subsequent requests as `If-Modified-Since` and `If-None-Match` headers. If the resource has not changed in the meantime, we will return the status `304 Not Modified` instead of rendering and returning the resource again. In most cases this is less time-consuming and makes your application/integration faster.

Please note that all conditional requests that return a response with status 304 don't count against your rate limits.

```
$ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\"
HTTP/1.1 200 OK
ETag: \"abcd1234abcdefefabcd1234efab1234\"
Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC
Status: 200 OK

$ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H 'If-None-Match: \"abcd1234abcdefefabcd1234efab1234\"'
HTTP/1.1 304 Not Modified
ETag: \"abcd1234abcdefefabcd1234efab1234\"
Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC
Status: 304 Not Modified

$ curl -i -u EMAIL_OR_ACCESS_TOKEN \"https://api.phrase.com/v2/projects/1234abcd1234abcdefefabcd1234efab/locales/en/download\" -H \"If-Modified-Since: Wed, 28 Jan 2015 15:31:30 UTC\"
HTTP/1.1 304 Not Modified
Last-Modified: Wed, 28 Jan 2015 15:31:30 UTC
Status: 304 Not Modified
```


## JSONP

The Phrase Strings API supports [JSONP](http://en.wikipedia.org/wiki/JSONP) for all GET requests in order to deal with cross-domain request issues. Just send a `?callback` parameter along with the request to specify the Javascript function name to be called with the response content:

```
$ curl \"https://api.phrase.com/v2/projects?callback=myFunction\"
```

The response will include the normal output for that endpoint, along with a `meta` section including header data:

```
myFunction({
  {
    \"meta\": {
      \"status\": 200,
      ...
    },
    \"data\": [
      {
        \"id\": \"1234abcd1234abc1234abcd1234abc\"
        ...
      }
    ]
  }
});
```

To authenticate a JSONP request, you can send a valid [access token](#overview--oauth-via-access-tokens) as the `?access_token` parameter along the request:

```
$ curl \"https://api.phrase.com/v2/projects?callback=myFunction&access_token=ACCESS-TOKEN\"
```

<div class=\"section resource\">

<div id=\"examples\" class=\"resource__section resource__section--head\" data-target=\"page.section\">

<div class=\"resource__copy\">

## Usage examples

Learn how to work more efficiently with Phrase Strings API v2 with these
workflow-oriented examples.

</div>

</div>

<div id=\"examples_excluded_translations\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find excluded translations with a certain content

    GET /v2/projects/:project_id/translations

List excluded translations for the given project which start with the
term `PhraseApp`.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>sort</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Sort criteria. Can be one of: key_name, created_at, updated_at.<br />
Default: key_name</td>
</tr>
<tr class=\"even\">
<td><code>order</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Order direction. Can be one of: asc, desc.<br />
Default: asc</td>
</tr>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to find translations by content (including wildcards).<br />
<br />
The following qualifiers are supported in the query:<br />

<ul>
<li><code>id:translation_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>tags:XYZ</code> for tags on the translation</li>
<li><code>unverified:{true|false}</code> for verification status</li>
<li><code>reviewed:{true|false}</code> for reviewed status</li>
<li><code>excluded:{true|false}</code> for exclusion status</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/translations?sort=updated_at&order=desc&q=PhraseApp*%20excluded:true\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase translations list \\
--project_id <project_id> \\
--sort updated_at \\
--order desc \\
--query 'PhraseApp* excluded:true' \\
--access_token <token>
```

</div>


</div>

</div>

<div id=\"examples_unverified_translations\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find unverified translations with a certain content

    GET /v2/projects/:project_id/translations

List unverified translations for the given project which start with the
term `PhraseApp` and are not verified.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>sort</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Sort criteria. Can be one of: key_name, created_at, updated_at.<br />
Default: key_name</td>
</tr>
<tr class=\"even\">
<td><code>order</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Order direction. Can be one of: asc, desc.<br />
Default: asc</td>
</tr>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to find translations by content (including wildcards).<br />
<br />
The following qualifiers are supported in the query:<br />

<ul>
<li><code>id:translation_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>tags:XYZ</code> for tags on the translation</li>
<li><code>unverified:{true|false}</code> for verification status</li>
<li><code>reviewed:{true|false}</code> for reviewed status</li>
<li><code>excluded:{true|false}</code> for exclusion status</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/translations?sort=updated_at&order=desc&q=PhraseApp*%20unverified:true\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase translations list \\
--project_id <project_id> \\
--sort updated_at \\
--order desc \\
--query 'PhraseApp* unverified:true' \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_verify_translations\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Verify translations selected by query

    PATCH /v2/projects/:project_id/translations/verify

Verify all translations that are matching the query `my dog`.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to find translations by content (including wildcards).<br />
<br />
The following qualifiers are supported in the query:<br />

<ul>
<li><code>id:translation_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>tags:XYZ</code> for tags on the translation</li>
<li><code>unverified:{true|false}</code> for verification status</li>
<li><code>reviewed:{true|false}</code> for reviewed status</li>
<li><code>excluded:{true|false}</code> for exclusion status</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
<tr class=\"even\">
<td><code>sort</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Sort criteria. Can be one of: key_name, created_at, updated_at.<br />
Default: key_name</td>
</tr>
<tr class=\"odd\">
<td><code>order</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Order direction. Can be one of: asc, desc.<br />
Default: asc</td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/translations/verify\" \\
  -u USERNAME_OR_ACCESS_TOKEN \\
  -X PATCH \\
  -d '{\"q\":\"my dog unverified:true\",\"sort\":\"updated_at\",\"order\":\"desc\"}' \\
  -H 'Content-Type: application/json'
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase translations verify \\
--project_id <project_id> \\
--data '{\"query\":\"\"my dog unverified:true\"\", \"sort\":\"updated_at\", \"order\":\"desc\"}' \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_updated_keys\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find recently updated keys

    GET /v2/projects/:project_id/keys

Find updated keys with with the `updated_at` qualifier like
`updated_at:>=2013-02-21T00:00:00Z`. This example returns keys that have
been updated on or after 2013-02-21.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>sort</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Sort by field. Can be one of: name, created_at, updated_at.<br />
Default: name</td>
</tr>
<tr class=\"even\">
<td><code>order</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Order direction. Can be one of: asc, desc.<br />
Default: asc</td>
</tr>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - spaces, commas, and colons need to be escaped with double backslashes</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
<tr class=\"even\">
<td><code>locale_id</code></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys?sort=updated_at&order=desc&q=updated_at:%3E=2013-02-21T00:00:00Z&locale_id=abcd1234abcd1234abcd1234abcd1234\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys list \\
--project_id <project_id> \\
--sort updated_at \\
--order desc \\
--query \"updated_at:>=2013-02-21T00:00:00Z\" \\
--locale_id abcd1234abcd1234abcd1234abcd1234 \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_tagged_keys\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find keys with a certain tag

    GET /v2/projects/:project_id/keys

Keys with certain tags can be filtered with the qualifier `tags:`.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - spaces, commas, and colons need to be escaped with double backslashes</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys?q=tags:admin\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys list \\
--project_id <project_id> \\
--query \"tags:admin\" \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_tag\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Add tags to collection of keys

    PATCH /v2/projects/:project_id/keys/tag

Add the tags `landing-page` and `release-1.2` to all keys that start
with `dog` and are translated in the locale
`abcd1234abcd1234abcd1234abcd1234`.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - whitespaces need to be prefixed with a backspace (\"\\\")</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
<tr class=\"even\">
<td><code>tags</code></td>
<td><code>string</code></td>
<td>Tag or comma-separated list of tags to add to the matching collection of keys</td>
</tr>
<tr class=\"odd\">
<td><code>locale_id</code><br />
<span class=\"small\">optional</span></td>
<td><code>id</code></td>
<td>Locale used to determine the translation state of a key when filtering for untranslated or translated keys.</td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys/tag\" \\
  -u USERNAME_OR_ACCESS_TOKEN \\
  -X PATCH \\
  -d '{\"q\":\"dog* translated:true\",\"tags\":\"landing-page,release-1.2\",\"locale_id\":\"abcd1234abcd1234abcd1234abcd1234\"}' \\
  -H 'Content-Type: application/json'
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys tag \\
--project_id <project_id> \\
--data '{\"query\":\"'dog* translated:true'\", \"tags\":\"landing-page,release-1.2\", \"locale_id\":\"abcd1234abcd1234abcd1234abcd1234\"}' \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_untag\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Remove tags from collection of keys

    PATCH /v2/projects/:project_id/keys/untag

Remove the tags `landing-page` and `release-1.2` from all keys that
start with `dog` and are translated in the locale
`abcd1234abcd1234abcd1234abcd1234`.

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - whitespaces need to be prefixed with a backspace (\"\\\")</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
<tr class=\"even\">
<td><code>tags</code></td>
<td><code>string</code></td>
<td>Tag or comma-separated list of tags to remove from the matching collection of keys</td>
</tr>
<tr class=\"odd\">
<td><code>locale_id</code><br />
<span class=\"small\">optional</span></td>
<td><code>id</code></td>
<td>Locale used to determine the translation state of a key when filtering for untranslated or translated keys.</td>
</tr>
</tbody>
</table>

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys/untag\" \\
  -u USERNAME_OR_ACCESS_TOKEN \\
  -X PATCH \\
  -d '{\"q\":\"dog* translated:true\",\"tags\":\"landing-page,release-1.2\",\"locale_id\":\"abcd1234abcd1234abcd1234abcd1234\"}' \\
  -H 'Content-Type: application/json'
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys untag \\
--project_id <project_id> \\
--data '{\"query\":\"'dog* translated:true'\", \"tags\":\"landing-page,release-1.2\", \"locale_id\":\"abcd1234abcd1234abcd1234abcd1234\"}' \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_broad_match\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find keys with broad text match

    GET /v2/projects/:project_id/keys

Example query `my dog`

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - whitespaces need to be prefixed with a backspace (\"\\\")</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
</tbody>
</table>

</div>

#### Matches

<span class=\"result-match\">**My dog** is lazy
</span> <span class=\"result-match\">**my dog** is lazy
</span> <span class=\"result-match\">angry **dog** in **my** house</span>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys?q=my%20dog\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys list \\
--project_id <project_id> \\
--query \"my dog\" \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_exact_match\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find keys with exact text match

    GET /v2/projects/:project_id/keys

Example query `\"my dog is lazy\"` (note backslashes before any whitespace
character in the example query)

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - whitespaces need to be prefixed with a backspace (\"\\\")</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
</tbody>
</table>

</div>

#### Matches

~~My dog is lazy~~
<span class=\"result-match\">**my dog is lazy**
</span> ~~angry dog in my house~~

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys?q=name:my%5C%20dog%5C%20is%5C%20lazy\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys list \\
--project_id <project_id> \\
--query \"name:my\\ dog\\ is\\ lazy\" \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_wildcard_match\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Find keys with wildcard character matching

    GET /v2/projects/:project_id/keys

Example query `*dog is*`

#### Parameters

<div class=\"table-responsive\">

<table>
<colgroup>
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
<col style=\"width: 33%\" />
</colgroup>
<thead>
<tr class=\"header\">
<th>Name</th>
<th>Type</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr class=\"odd\">
<td><code>q</code><br />
<span class=\"small\">optional</span></td>
<td><code>string</code></td>
<td>Specify a query to do broad search for keys by name (including wildcards).<br />
<br />
The following qualifiers are also supported in the search term:<br />

<ul>
<li><code>ids:key_id,...</code> for queries on a comma-separated list of ids</li>
<li><code>name:key_name</code> for text queries on exact key names - whitespaces need to be prefixed with a backspace (\"\\\")</li>
<li><code>tags:tag_name</code> to filter for keys with certain tags</li>
<li><code>translated:{true|false}</code> for translation status (also requires <code>locale_id</code> to be specified)</li>
<li><code>updated_at:{&gt;=|&lt;=}2013-02-21T00:00:00Z</code> for date range queries</li>
<li><code>unmentioned_in_upload:upload_id</code> to filter keys unmentioned within upload</li>
</ul>
Find more examples <a href=\"#overview--usage-examples\">here</a>.</td>
</tr>
</tbody>
</table>

</div>

#### Matches

<span class=\"result-match\">My **dog is** lazy
</span> <span class=\"result-match\">my **dog is** lazy
</span> ~~angry dog in my house~~

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/keys?q=*dog%20is*\" \\
  -u USERNAME_OR_ACCESS_TOKEN
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase keys list \\
--project_id <project_id> \\
--query '*dog is*' \\
--access_token <token>
```

</div>

</div>

</div>

<div id=\"examples_xlsx_upload\" class=\"resource__section\" data-target=\"page.section\">

<div class=\"resource__copy\">

### Upload an Excel file with several translations

    POST /v2/projects/:project_id/uploads

Suppose you have an excel file where the 'A' column contains the key
names, the 'B' column contains English translations, the 'C' column
contains German translations and the 'D' column contains comments.
Furthermore, the actual content starts in the second row, since the
first row is reserved for a header. You can upload this file and import
all translations at once\\!

#### Parameters

<div class=\"table-responsive\">

| Name                                | Type     | Description                                                 |
| ----------------------------------- | -------- | ----------------------------------------------------------- |
| `file`                              | `file`   | File to be imported                                         |
| `file_format`                       | `string` | File format. Auto-detected when possible and not specified. |
| `locale_mapping[en]`                | `string` | Name of the column containing translations for locale en.   |
| `locale_mapping[de]`                | `string` | Name of the column containing translations for locale de.   |
| `format_options[comment_column]`    | `string` | Name of the column containing descriptions for keys.        |
| `format_options[tag_column]`        | `string` | Name of the column containing tags for keys.                |
| `format_options[key_name_column]`   | `string` | Name of the column containing the names of the keys.        |
| `format_options[first_content_row]` | `string` | Name of the first row containing actual translations.       |

</div>

</div>

<div class=\"resource__code\">

#### Example Request

<div class=\"code-section\" data-target=\"technology-switch.example\" data-technology=\"curl\">

``` language-bash
curl \"https://api.phrase.com/v2/projects/:project_id/uploads\" \\
  -u USERNAME_OR_ACCESS_TOKEN \\
  -X POST \\
  -F file=@/path/to/my/file.xlsx \\
  -F file_format=xlsx \\
  -F locale_mapping[en]=B \\
  -F locale_mapping[de]=C \\
  -F format_options[comment_column]=D \\
  -F format_options[tag_column]=E \\
  -F format_options[key_name_column]=A \\
  -F format_options[first_content_row]=2
```

</div>

<div class=\"code-section hidden\" data-target=\"technology-switch.example\" data-technology=\"cli v2\">

``` language-bash
phrase uploads create \\
--project_id <project_id> \\
--file /path/to/my/file.xlsx \\
--file_format xlsx \\
--locale_id abcd1234cdef1234abcd1234cdef1234 \\
--tags awesome-feature,needs-proofreading \\
--locale_mapping '{\"en\": \"B\", \"de\": \"C\"}' \\
--format_options '{\"comment_column\": \"D\", \"tag_column\": \"E\", \"key_name_column\": \"A\", \"first_content_row\": \"2\"}' \\
--access_token <token>
```

</div>

</div>

</div>

</div>


  For more information, please visit [https://developers.phrase.com/api/](https://developers.phrase.com/api/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.phrase</groupId>
  <artifactId>phrase-java</artifactId>
  <version>1.5.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.phrase:phrase-java:1.5.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/phrase-java-1.5.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.phrase.client.ApiClient;
import com.phrase.client.ApiException;
import com.phrase.client.Configuration;
import com.phrase.client.auth.*;
import com.phrase.client.models.*;
import com.phrase.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.phrase.com/v2");
    
    // Configure HTTP basic authorization: Basic
    HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
    Basic.setUsername("YOUR USERNAME");
    Basic.setPassword("YOUR PASSWORD");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String id = "id_example"; // String | ID
    String xPhraseAppOTP = "xPhraseAppOTP_example"; // String | Two-Factor-Authentication token (optional)
    try {
      AccountDetails result = apiInstance.accountShow(id, xPhraseAppOTP);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#accountShow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Datacenters

The API is only accessible via HTTPS and the current version is <code>v2</code>, which results in a base URL like: <code>https://api.phrase.com/v2</code> depending on the datacenter.

### EU Datacenter
```
https://api.phrase.com/v2
```

This is the default datacenter.

### US Datacenter
```
https://us.api.phrase.com/v2/
```

### Specifying US Datacenter
You can use the US datacenter by setting the following:
```
defaultClient.setBasePath("https://api.us.app.phrase.com/v2/");
```

## Documentation for API Endpoints

All URIs are relative to *https://api.phrase.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**accountShow**](docs/AccountsApi.md#accountShow) | **GET** /accounts/{id} | Get a single account
*AccountsApi* | [**accountsList**](docs/AccountsApi.md#accountsList) | **GET** /accounts | List accounts
*AuthorizationsApi* | [**authorizationCreate**](docs/AuthorizationsApi.md#authorizationCreate) | **POST** /authorizations | Create an authorization
*AuthorizationsApi* | [**authorizationDelete**](docs/AuthorizationsApi.md#authorizationDelete) | **DELETE** /authorizations/{id} | Delete an authorization
*AuthorizationsApi* | [**authorizationShow**](docs/AuthorizationsApi.md#authorizationShow) | **GET** /authorizations/{id} | Get a single authorization
*AuthorizationsApi* | [**authorizationUpdate**](docs/AuthorizationsApi.md#authorizationUpdate) | **PATCH** /authorizations/{id} | Update an authorization
*AuthorizationsApi* | [**authorizationsList**](docs/AuthorizationsApi.md#authorizationsList) | **GET** /authorizations | List authorizations
*BitbucketSyncApi* | [**bitbucketSyncExport**](docs/BitbucketSyncApi.md#bitbucketSyncExport) | **POST** /bitbucket_syncs/{id}/export | Export from Phrase Strings to Bitbucket
*BitbucketSyncApi* | [**bitbucketSyncImport**](docs/BitbucketSyncApi.md#bitbucketSyncImport) | **POST** /bitbucket_syncs/{id}/import | Import to Phrase Strings from Bitbucket
*BitbucketSyncApi* | [**bitbucketSyncsList**](docs/BitbucketSyncApi.md#bitbucketSyncsList) | **GET** /bitbucket_syncs | List Bitbucket syncs
*BlacklistedKeysApi* | [**blacklistedKeyCreate**](docs/BlacklistedKeysApi.md#blacklistedKeyCreate) | **POST** /projects/{project_id}/blacklisted_keys | Create a blocked key
*BlacklistedKeysApi* | [**blacklistedKeyDelete**](docs/BlacklistedKeysApi.md#blacklistedKeyDelete) | **DELETE** /projects/{project_id}/blacklisted_keys/{id} | Delete a blocked key
*BlacklistedKeysApi* | [**blacklistedKeyShow**](docs/BlacklistedKeysApi.md#blacklistedKeyShow) | **GET** /projects/{project_id}/blacklisted_keys/{id} | Get a single blocked key
*BlacklistedKeysApi* | [**blacklistedKeyUpdate**](docs/BlacklistedKeysApi.md#blacklistedKeyUpdate) | **PATCH** /projects/{project_id}/blacklisted_keys/{id} | Update a blocked key
*BlacklistedKeysApi* | [**blacklistedKeysList**](docs/BlacklistedKeysApi.md#blacklistedKeysList) | **GET** /projects/{project_id}/blacklisted_keys | List blocked keys
*BranchesApi* | [**branchCompare**](docs/BranchesApi.md#branchCompare) | **GET** /projects/{project_id}/branches/{name}/compare | Compare branches
*BranchesApi* | [**branchCreate**](docs/BranchesApi.md#branchCreate) | **POST** /projects/{project_id}/branches | Create a branch
*BranchesApi* | [**branchDelete**](docs/BranchesApi.md#branchDelete) | **DELETE** /projects/{project_id}/branches/{name} | Delete a branch
*BranchesApi* | [**branchMerge**](docs/BranchesApi.md#branchMerge) | **PATCH** /projects/{project_id}/branches/{name}/merge | Merge a branch
*BranchesApi* | [**branchShow**](docs/BranchesApi.md#branchShow) | **GET** /projects/{project_id}/branches/{name} | Get a single branch
*BranchesApi* | [**branchUpdate**](docs/BranchesApi.md#branchUpdate) | **PATCH** /projects/{project_id}/branches/{name} | Update a branch
*BranchesApi* | [**branchesList**](docs/BranchesApi.md#branchesList) | **GET** /projects/{project_id}/branches | List branches
*CommentsApi* | [**commentCreate**](docs/CommentsApi.md#commentCreate) | **POST** /projects/{project_id}/keys/{key_id}/comments | Create a comment
*CommentsApi* | [**commentDelete**](docs/CommentsApi.md#commentDelete) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id} | Delete a comment
*CommentsApi* | [**commentMarkCheck**](docs/CommentsApi.md#commentMarkCheck) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Check if comment is read
*CommentsApi* | [**commentMarkRead**](docs/CommentsApi.md#commentMarkRead) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as read
*CommentsApi* | [**commentMarkUnread**](docs/CommentsApi.md#commentMarkUnread) | **DELETE** /projects/{project_id}/keys/{key_id}/comments/{id}/read | Mark a comment as unread
*CommentsApi* | [**commentShow**](docs/CommentsApi.md#commentShow) | **GET** /projects/{project_id}/keys/{key_id}/comments/{id} | Get a single comment
*CommentsApi* | [**commentUpdate**](docs/CommentsApi.md#commentUpdate) | **PATCH** /projects/{project_id}/keys/{key_id}/comments/{id} | Update a comment
*CommentsApi* | [**commentsList**](docs/CommentsApi.md#commentsList) | **GET** /projects/{project_id}/keys/{key_id}/comments | List comments
*DistributionsApi* | [**distributionCreate**](docs/DistributionsApi.md#distributionCreate) | **POST** /accounts/{account_id}/distributions | Create a distribution
*DistributionsApi* | [**distributionDelete**](docs/DistributionsApi.md#distributionDelete) | **DELETE** /accounts/{account_id}/distributions/{id} | Delete a distribution
*DistributionsApi* | [**distributionShow**](docs/DistributionsApi.md#distributionShow) | **GET** /accounts/{account_id}/distributions/{id} | Get a single distribution
*DistributionsApi* | [**distributionUpdate**](docs/DistributionsApi.md#distributionUpdate) | **PATCH** /accounts/{account_id}/distributions/{id} | Update a distribution
*DistributionsApi* | [**distributionsList**](docs/DistributionsApi.md#distributionsList) | **GET** /accounts/{account_id}/distributions | List distributions
*DocumentsApi* | [**documentDelete**](docs/DocumentsApi.md#documentDelete) | **DELETE** /projects/{project_id}/documents/{id} | Delete document
*DocumentsApi* | [**documentsList**](docs/DocumentsApi.md#documentsList) | **GET** /projects/{project_id}/documents | List documents
*FormatsApi* | [**formatsList**](docs/FormatsApi.md#formatsList) | **GET** /formats | List formats
*GitHubSyncApi* | [**githubSyncExport**](docs/GitHubSyncApi.md#githubSyncExport) | **POST** /github_syncs/export | Export from Phrase Strings to GitHub
*GitHubSyncApi* | [**githubSyncImport**](docs/GitHubSyncApi.md#githubSyncImport) | **POST** /github_syncs/import | Import to Phrase Strings from GitHub
*GitLabSyncApi* | [**gitlabSyncDelete**](docs/GitLabSyncApi.md#gitlabSyncDelete) | **DELETE** /gitlab_syncs/{id} | Delete single Sync Setting
*GitLabSyncApi* | [**gitlabSyncExport**](docs/GitLabSyncApi.md#gitlabSyncExport) | **POST** /gitlab_syncs/{gitlab_sync_id}/export | Export from Phrase Strings to GitLab
*GitLabSyncApi* | [**gitlabSyncHistory**](docs/GitLabSyncApi.md#gitlabSyncHistory) | **GET** /gitlab_syncs/{gitlab_sync_id}/history | History of single Sync Setting
*GitLabSyncApi* | [**gitlabSyncImport**](docs/GitLabSyncApi.md#gitlabSyncImport) | **POST** /gitlab_syncs/{gitlab_sync_id}/import | Import from GitLab to Phrase
*GitLabSyncApi* | [**gitlabSyncList**](docs/GitLabSyncApi.md#gitlabSyncList) | **GET** /gitlab_syncs | List GitLab syncs
*GitLabSyncApi* | [**gitlabSyncShow**](docs/GitLabSyncApi.md#gitlabSyncShow) | **GET** /gitlab_syncs/{id} | Get single Sync Setting
*GitLabSyncApi* | [**gitlabSyncUpdate**](docs/GitLabSyncApi.md#gitlabSyncUpdate) | **PUT** /gitlab_syncs/{id} | Update single Sync Setting
*GlossariesApi* | [**glossariesList**](docs/GlossariesApi.md#glossariesList) | **GET** /accounts/{account_id}/glossaries | List term bases
*GlossariesApi* | [**glossaryCreate**](docs/GlossariesApi.md#glossaryCreate) | **POST** /accounts/{account_id}/glossaries | Create a term base
*GlossariesApi* | [**glossaryDelete**](docs/GlossariesApi.md#glossaryDelete) | **DELETE** /accounts/{account_id}/glossaries/{id} | Delete a term base
*GlossariesApi* | [**glossaryShow**](docs/GlossariesApi.md#glossaryShow) | **GET** /accounts/{account_id}/glossaries/{id} | Get a single term base
*GlossariesApi* | [**glossaryUpdate**](docs/GlossariesApi.md#glossaryUpdate) | **PATCH** /accounts/{account_id}/glossaries/{id} | Update a term base
*GlossaryTermTranslationsApi* | [**glossaryTermTranslationCreate**](docs/GlossaryTermTranslationsApi.md#glossaryTermTranslationCreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations | Create a translation for a term
*GlossaryTermTranslationsApi* | [**glossaryTermTranslationDelete**](docs/GlossaryTermTranslationsApi.md#glossaryTermTranslationDelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Delete a translation for a term
*GlossaryTermTranslationsApi* | [**glossaryTermTranslationUpdate**](docs/GlossaryTermTranslationsApi.md#glossaryTermTranslationUpdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{term_id}/translations/{id} | Update a translation for a term
*GlossaryTermsApi* | [**glossaryTermCreate**](docs/GlossaryTermsApi.md#glossaryTermCreate) | **POST** /accounts/{account_id}/glossaries/{glossary_id}/terms | Create a term
*GlossaryTermsApi* | [**glossaryTermDelete**](docs/GlossaryTermsApi.md#glossaryTermDelete) | **DELETE** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Delete a term
*GlossaryTermsApi* | [**glossaryTermShow**](docs/GlossaryTermsApi.md#glossaryTermShow) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Get a single term
*GlossaryTermsApi* | [**glossaryTermUpdate**](docs/GlossaryTermsApi.md#glossaryTermUpdate) | **PATCH** /accounts/{account_id}/glossaries/{glossary_id}/terms/{id} | Update a term
*GlossaryTermsApi* | [**glossaryTermsList**](docs/GlossaryTermsApi.md#glossaryTermsList) | **GET** /accounts/{account_id}/glossaries/{glossary_id}/terms | List terms
*IcuApi* | [**icuSkeleton**](docs/IcuApi.md#icuSkeleton) | **POST** /icu/skeleton | Build icu skeletons
*InvitationsApi* | [**invitationCreate**](docs/InvitationsApi.md#invitationCreate) | **POST** /accounts/{account_id}/invitations | Create a new invitation
*InvitationsApi* | [**invitationDelete**](docs/InvitationsApi.md#invitationDelete) | **DELETE** /accounts/{account_id}/invitations/{id} | Delete an invitation
*InvitationsApi* | [**invitationResend**](docs/InvitationsApi.md#invitationResend) | **POST** /accounts/{account_id}/invitations/{id}/resend | Resend an invitation
*InvitationsApi* | [**invitationShow**](docs/InvitationsApi.md#invitationShow) | **GET** /accounts/{account_id}/invitations/{id} | Get a single invitation
*InvitationsApi* | [**invitationUpdate**](docs/InvitationsApi.md#invitationUpdate) | **PATCH** /accounts/{account_id}/invitations/{id} | Update an invitation
*InvitationsApi* | [**invitationUpdateSettings**](docs/InvitationsApi.md#invitationUpdateSettings) | **PATCH** /projects/{project_id}/invitations/{id} | Update a member&#39;s invitation access
*InvitationsApi* | [**invitationsList**](docs/InvitationsApi.md#invitationsList) | **GET** /accounts/{account_id}/invitations | List invitations
*JobCommentsApi* | [**jobCommentCreate**](docs/JobCommentsApi.md#jobCommentCreate) | **POST** /projects/{project_id}/jobs/{job_id}/comments | Create a job comment
*JobCommentsApi* | [**jobCommentDelete**](docs/JobCommentsApi.md#jobCommentDelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/comments/{id} | Delete a job comment
*JobCommentsApi* | [**jobCommentShow**](docs/JobCommentsApi.md#jobCommentShow) | **GET** /projects/{project_id}/jobs/{job_id}/comments/{id} | Get a single job comment
*JobCommentsApi* | [**jobCommentUpdate**](docs/JobCommentsApi.md#jobCommentUpdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/comments/{id} | Update a job comment
*JobCommentsApi* | [**jobCommentsList**](docs/JobCommentsApi.md#jobCommentsList) | **GET** /projects/{project_id}/jobs/{job_id}/comments | List job comments
*JobLocalesApi* | [**jobLocaleComplete**](docs/JobLocalesApi.md#jobLocaleComplete) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/complete | Complete a job locale
*JobLocalesApi* | [**jobLocaleCompleteReview**](docs/JobLocalesApi.md#jobLocaleCompleteReview) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/complete_review | Review a job locale
*JobLocalesApi* | [**jobLocaleDelete**](docs/JobLocalesApi.md#jobLocaleDelete) | **DELETE** /projects/{project_id}/jobs/{job_id}/locales/{id} | Delete a job locale
*JobLocalesApi* | [**jobLocaleReopen**](docs/JobLocalesApi.md#jobLocaleReopen) | **POST** /projects/{project_id}/jobs/{job_id}/locales/{id}/reopen | Reopen a job locale
*JobLocalesApi* | [**jobLocaleShow**](docs/JobLocalesApi.md#jobLocaleShow) | **GET** /projects/{project_id}/jobs/{job_id}/locale/{id} | Get a single job locale
*JobLocalesApi* | [**jobLocaleUpdate**](docs/JobLocalesApi.md#jobLocaleUpdate) | **PATCH** /projects/{project_id}/jobs/{job_id}/locales/{id} | Update a job locale
*JobLocalesApi* | [**jobLocalesCreate**](docs/JobLocalesApi.md#jobLocalesCreate) | **POST** /projects/{project_id}/jobs/{job_id}/locales | Create a job locale
*JobLocalesApi* | [**jobLocalesList**](docs/JobLocalesApi.md#jobLocalesList) | **GET** /projects/{project_id}/jobs/{job_id}/locales | List job locales
*JobTemplateLocalesApi* | [**jobTemplateLocaleDelete**](docs/JobTemplateLocalesApi.md#jobTemplateLocaleDelete) | **DELETE** /projects/{project_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Delete a job template locale
*JobTemplateLocalesApi* | [**jobTemplateLocaleShow**](docs/JobTemplateLocalesApi.md#jobTemplateLocaleShow) | **GET** /projects/{project_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Get a single job template locale
*JobTemplateLocalesApi* | [**jobTemplateLocaleUpdate**](docs/JobTemplateLocalesApi.md#jobTemplateLocaleUpdate) | **PATCH** /projects/{project_id}/job_templates/{job_template_id}/locales/{job_template_locale_id} | Update a job template locale
*JobTemplateLocalesApi* | [**jobTemplateLocalesCreate**](docs/JobTemplateLocalesApi.md#jobTemplateLocalesCreate) | **POST** /projects/{project_id}/job_templates/{job_template_id}/locales | Create a job template locale
*JobTemplateLocalesApi* | [**jobTemplateLocalesList**](docs/JobTemplateLocalesApi.md#jobTemplateLocalesList) | **GET** /projects/{project_id}/job_templates/{job_template_id}/locales | List job template locales
*JobTemplatesApi* | [**jobTemplateCreate**](docs/JobTemplatesApi.md#jobTemplateCreate) | **POST** /projects/{project_id}/job_templates | Create a job template
*JobTemplatesApi* | [**jobTemplateDelete**](docs/JobTemplatesApi.md#jobTemplateDelete) | **DELETE** /projects/{project_id}/job_templates/{id} | Delete a job template
*JobTemplatesApi* | [**jobTemplateShow**](docs/JobTemplatesApi.md#jobTemplateShow) | **GET** /projects/{project_id}/job_templates/{id} | Get a single job template
*JobTemplatesApi* | [**jobTemplateUpdate**](docs/JobTemplatesApi.md#jobTemplateUpdate) | **PATCH** /projects/{project_id}/job_templates/{id} | Update a job template
*JobTemplatesApi* | [**jobTemplatesList**](docs/JobTemplatesApi.md#jobTemplatesList) | **GET** /projects/{project_id}/job_templates | List job templates
*JobsApi* | [**jobComplete**](docs/JobsApi.md#jobComplete) | **POST** /projects/{project_id}/jobs/{id}/complete | Complete a job
*JobsApi* | [**jobCreate**](docs/JobsApi.md#jobCreate) | **POST** /projects/{project_id}/jobs | Create a job
*JobsApi* | [**jobDelete**](docs/JobsApi.md#jobDelete) | **DELETE** /projects/{project_id}/jobs/{id} | Delete a job
*JobsApi* | [**jobKeysCreate**](docs/JobsApi.md#jobKeysCreate) | **POST** /projects/{project_id}/jobs/{id}/keys | Add keys to job
*JobsApi* | [**jobKeysDelete**](docs/JobsApi.md#jobKeysDelete) | **DELETE** /projects/{project_id}/jobs/{id}/keys | Remove keys from job
*JobsApi* | [**jobLock**](docs/JobsApi.md#jobLock) | **POST** /projects/{project_id}/jobs/{id}/lock | Lock a job
*JobsApi* | [**jobReopen**](docs/JobsApi.md#jobReopen) | **POST** /projects/{project_id}/jobs/{id}/reopen | Reopen a job
*JobsApi* | [**jobShow**](docs/JobsApi.md#jobShow) | **GET** /projects/{project_id}/jobs/{id} | Get a single job
*JobsApi* | [**jobStart**](docs/JobsApi.md#jobStart) | **POST** /projects/{project_id}/jobs/{id}/start | Start a job
*JobsApi* | [**jobUnlock**](docs/JobsApi.md#jobUnlock) | **POST** /projects/{project_id}/jobs/{id}/unlock | Unlock a job
*JobsApi* | [**jobUpdate**](docs/JobsApi.md#jobUpdate) | **PATCH** /projects/{project_id}/jobs/{id} | Update a job
*JobsApi* | [**jobsByAccount**](docs/JobsApi.md#jobsByAccount) | **GET** /accounts/{account_id}/jobs | List account jobs
*JobsApi* | [**jobsList**](docs/JobsApi.md#jobsList) | **GET** /projects/{project_id}/jobs | List jobs
*KeysApi* | [**keyCreate**](docs/KeysApi.md#keyCreate) | **POST** /projects/{project_id}/keys | Create a key
*KeysApi* | [**keyDelete**](docs/KeysApi.md#keyDelete) | **DELETE** /projects/{project_id}/keys/{id} | Delete a key
*KeysApi* | [**keyShow**](docs/KeysApi.md#keyShow) | **GET** /projects/{project_id}/keys/{id} | Get a single key
*KeysApi* | [**keyUpdate**](docs/KeysApi.md#keyUpdate) | **PATCH** /projects/{project_id}/keys/{id} | Update a key
*KeysApi* | [**keysDeleteCollection**](docs/KeysApi.md#keysDeleteCollection) | **DELETE** /projects/{project_id}/keys | Delete collection of keys
*KeysApi* | [**keysExclude**](docs/KeysApi.md#keysExclude) | **PATCH** /projects/{project_id}/keys/exclude | Exclude a locale on a collection of keys
*KeysApi* | [**keysInclude**](docs/KeysApi.md#keysInclude) | **PATCH** /projects/{project_id}/keys/include | Include a locale on a collection of keys
*KeysApi* | [**keysList**](docs/KeysApi.md#keysList) | **GET** /projects/{project_id}/keys | List keys
*KeysApi* | [**keysSearch**](docs/KeysApi.md#keysSearch) | **POST** /projects/{project_id}/keys/search | Search keys
*KeysApi* | [**keysTag**](docs/KeysApi.md#keysTag) | **PATCH** /projects/{project_id}/keys/tag | Add tags to collection of keys
*KeysApi* | [**keysUntag**](docs/KeysApi.md#keysUntag) | **PATCH** /projects/{project_id}/keys/untag | Remove tags from collection of keys
*LocalesApi* | [**accountLocales**](docs/LocalesApi.md#accountLocales) | **GET** /accounts/{account_id}/locales | List locales used in account
*LocalesApi* | [**localeCreate**](docs/LocalesApi.md#localeCreate) | **POST** /projects/{project_id}/locales | Create a locale
*LocalesApi* | [**localeDelete**](docs/LocalesApi.md#localeDelete) | **DELETE** /projects/{project_id}/locales/{id} | Delete a locale
*LocalesApi* | [**localeDownload**](docs/LocalesApi.md#localeDownload) | **GET** /projects/{project_id}/locales/{id}/download | Download a locale
*LocalesApi* | [**localeShow**](docs/LocalesApi.md#localeShow) | **GET** /projects/{project_id}/locales/{id} | Get a single locale
*LocalesApi* | [**localeUpdate**](docs/LocalesApi.md#localeUpdate) | **PATCH** /projects/{project_id}/locales/{id} | Update a locale
*LocalesApi* | [**localesList**](docs/LocalesApi.md#localesList) | **GET** /projects/{project_id}/locales | List locales
*MembersApi* | [**memberDelete**](docs/MembersApi.md#memberDelete) | **DELETE** /accounts/{account_id}/members/{id} | Remove a user from the account
*MembersApi* | [**memberShow**](docs/MembersApi.md#memberShow) | **GET** /accounts/{account_id}/members/{id} | Get single member
*MembersApi* | [**memberUpdate**](docs/MembersApi.md#memberUpdate) | **PATCH** /accounts/{account_id}/members/{id} | Update a member
*MembersApi* | [**memberUpdateSettings**](docs/MembersApi.md#memberUpdateSettings) | **PATCH** /projects/{project_id}/members/{id} | Update a member&#39;s project settings
*MembersApi* | [**membersList**](docs/MembersApi.md#membersList) | **GET** /accounts/{account_id}/members | List members
*NotificationGroupsApi* | [**notificationGroupsList**](docs/NotificationGroupsApi.md#notificationGroupsList) | **GET** /notification_groups | List notification groups
*NotificationGroupsApi* | [**notificationGroupsMarkAllAsRead**](docs/NotificationGroupsApi.md#notificationGroupsMarkAllAsRead) | **PATCH** /notification_groups/mark_all_as_read | Mark all notification groups as read
*NotificationGroupsApi* | [**notificationGroupsMarkAsRead**](docs/NotificationGroupsApi.md#notificationGroupsMarkAsRead) | **PATCH** /notification_groups/{id}/mark_as_read | Mark a notification group as read
*NotificationsApi* | [**notificationsList**](docs/NotificationsApi.md#notificationsList) | **GET** /notifications | List notifications
*NotificationsApi* | [**notificationsMarkAllAsRead**](docs/NotificationsApi.md#notificationsMarkAllAsRead) | **POST** /notifications/mark_all_as_read | Mark all notifications as read
*NotificationsApi* | [**notificationsShow**](docs/NotificationsApi.md#notificationsShow) | **GET** /notifications/{id} | Get a single notification
*OrdersApi* | [**orderConfirm**](docs/OrdersApi.md#orderConfirm) | **PATCH** /projects/{project_id}/orders/{id}/confirm | Confirm an order
*OrdersApi* | [**orderCreate**](docs/OrdersApi.md#orderCreate) | **POST** /projects/{project_id}/orders | Create a new order
*OrdersApi* | [**orderDelete**](docs/OrdersApi.md#orderDelete) | **DELETE** /projects/{project_id}/orders/{id} | Cancel an order
*OrdersApi* | [**orderShow**](docs/OrdersApi.md#orderShow) | **GET** /projects/{project_id}/orders/{id} | Get a single order
*OrdersApi* | [**ordersList**](docs/OrdersApi.md#ordersList) | **GET** /projects/{project_id}/orders | List orders
*ProjectsApi* | [**projectCreate**](docs/ProjectsApi.md#projectCreate) | **POST** /projects | Create a project
*ProjectsApi* | [**projectDelete**](docs/ProjectsApi.md#projectDelete) | **DELETE** /projects/{id} | Delete a project
*ProjectsApi* | [**projectShow**](docs/ProjectsApi.md#projectShow) | **GET** /projects/{id} | Get a single project
*ProjectsApi* | [**projectUpdate**](docs/ProjectsApi.md#projectUpdate) | **PATCH** /projects/{id} | Update a project
*ProjectsApi* | [**projectsList**](docs/ProjectsApi.md#projectsList) | **GET** /projects | List projects
*ReleasesApi* | [**releaseCreate**](docs/ReleasesApi.md#releaseCreate) | **POST** /accounts/{account_id}/distributions/{distribution_id}/releases | Create a release
*ReleasesApi* | [**releaseDelete**](docs/ReleasesApi.md#releaseDelete) | **DELETE** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Delete a release
*ReleasesApi* | [**releasePublish**](docs/ReleasesApi.md#releasePublish) | **POST** /accounts/{account_id}/distributions/{distribution_id}/releases/{id}/publish | Publish a release
*ReleasesApi* | [**releaseShow**](docs/ReleasesApi.md#releaseShow) | **GET** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Get a single release
*ReleasesApi* | [**releaseUpdate**](docs/ReleasesApi.md#releaseUpdate) | **PATCH** /accounts/{account_id}/distributions/{distribution_id}/releases/{id} | Update a release
*ReleasesApi* | [**releasesList**](docs/ReleasesApi.md#releasesList) | **GET** /accounts/{account_id}/distributions/{distribution_id}/releases | List releases
*ScreenshotMarkersApi* | [**screenshotMarkerCreate**](docs/ScreenshotMarkersApi.md#screenshotMarkerCreate) | **POST** /projects/{project_id}/screenshots/{screenshot_id}/markers | Create a screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkerDelete**](docs/ScreenshotMarkersApi.md#screenshotMarkerDelete) | **DELETE** /projects/{project_id}/screenshots/{screenshot_id}/markers | Delete a screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkerShow**](docs/ScreenshotMarkersApi.md#screenshotMarkerShow) | **GET** /projects/{project_id}/screenshots/{screenshot_id}/markers/{id} | Get a single screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkerUpdate**](docs/ScreenshotMarkersApi.md#screenshotMarkerUpdate) | **PATCH** /projects/{project_id}/screenshots/{screenshot_id}/markers | Update a screenshot marker
*ScreenshotMarkersApi* | [**screenshotMarkersList**](docs/ScreenshotMarkersApi.md#screenshotMarkersList) | **GET** /projects/{project_id}/screenshots/{id}/markers | List screenshot markers
*ScreenshotsApi* | [**screenshotCreate**](docs/ScreenshotsApi.md#screenshotCreate) | **POST** /projects/{project_id}/screenshots | Create a screenshot
*ScreenshotsApi* | [**screenshotDelete**](docs/ScreenshotsApi.md#screenshotDelete) | **DELETE** /projects/{project_id}/screenshots/{id} | Delete a screenshot
*ScreenshotsApi* | [**screenshotShow**](docs/ScreenshotsApi.md#screenshotShow) | **GET** /projects/{project_id}/screenshots/{id} | Get a single screenshot
*ScreenshotsApi* | [**screenshotUpdate**](docs/ScreenshotsApi.md#screenshotUpdate) | **PATCH** /projects/{project_id}/screenshots/{id} | Update a screenshot
*ScreenshotsApi* | [**screenshotsList**](docs/ScreenshotsApi.md#screenshotsList) | **GET** /projects/{project_id}/screenshots | List screenshots
*SearchApi* | [**searchInAccount**](docs/SearchApi.md#searchInAccount) | **POST** /accounts/{account_id}/search | Search across projects
*SpacesApi* | [**spaceCreate**](docs/SpacesApi.md#spaceCreate) | **POST** /accounts/{account_id}/spaces | Create a Space
*SpacesApi* | [**spaceDelete**](docs/SpacesApi.md#spaceDelete) | **DELETE** /accounts/{account_id}/spaces/{id} | Delete Space
*SpacesApi* | [**spaceShow**](docs/SpacesApi.md#spaceShow) | **GET** /accounts/{account_id}/spaces/{id} | Get Space
*SpacesApi* | [**spaceUpdate**](docs/SpacesApi.md#spaceUpdate) | **PATCH** /accounts/{account_id}/spaces/{id} | Update Space
*SpacesApi* | [**spacesList**](docs/SpacesApi.md#spacesList) | **GET** /accounts/{account_id}/spaces | List Spaces
*SpacesApi* | [**spacesProjectsCreate**](docs/SpacesApi.md#spacesProjectsCreate) | **POST** /accounts/{account_id}/spaces/{space_id}/projects | Add Project
*SpacesApi* | [**spacesProjectsDelete**](docs/SpacesApi.md#spacesProjectsDelete) | **DELETE** /accounts/{account_id}/spaces/{space_id}/projects/{id} | Remove Project
*SpacesApi* | [**spacesProjectsList**](docs/SpacesApi.md#spacesProjectsList) | **GET** /accounts/{account_id}/spaces/{space_id}/projects | List Projects
*StyleGuidesApi* | [**styleguideCreate**](docs/StyleGuidesApi.md#styleguideCreate) | **POST** /projects/{project_id}/styleguides | Create a style guide
*StyleGuidesApi* | [**styleguideDelete**](docs/StyleGuidesApi.md#styleguideDelete) | **DELETE** /projects/{project_id}/styleguides/{id} | Delete a style guide
*StyleGuidesApi* | [**styleguideShow**](docs/StyleGuidesApi.md#styleguideShow) | **GET** /projects/{project_id}/styleguides/{id} | Get a single style guide
*StyleGuidesApi* | [**styleguideUpdate**](docs/StyleGuidesApi.md#styleguideUpdate) | **PATCH** /projects/{project_id}/styleguides/{id} | Update a style guide
*StyleGuidesApi* | [**styleguidesList**](docs/StyleGuidesApi.md#styleguidesList) | **GET** /projects/{project_id}/styleguides | List style guides
*TagsApi* | [**tagCreate**](docs/TagsApi.md#tagCreate) | **POST** /projects/{project_id}/tags | Create a tag
*TagsApi* | [**tagDelete**](docs/TagsApi.md#tagDelete) | **DELETE** /projects/{project_id}/tags/{name} | Delete a tag
*TagsApi* | [**tagShow**](docs/TagsApi.md#tagShow) | **GET** /projects/{project_id}/tags/{name} | Get a single tag
*TagsApi* | [**tagsList**](docs/TagsApi.md#tagsList) | **GET** /projects/{project_id}/tags | List tags
*TeamsApi* | [**teamCreate**](docs/TeamsApi.md#teamCreate) | **POST** /accounts/{account_id}/teams | Create a Team
*TeamsApi* | [**teamDelete**](docs/TeamsApi.md#teamDelete) | **DELETE** /accounts/{account_id}/teams/{id} | Delete Team
*TeamsApi* | [**teamShow**](docs/TeamsApi.md#teamShow) | **GET** /accounts/{account_id}/teams/{id} | Get Team
*TeamsApi* | [**teamUpdate**](docs/TeamsApi.md#teamUpdate) | **PATCH** /accounts/{account_id}/teams/{id} | Update Team
*TeamsApi* | [**teamsList**](docs/TeamsApi.md#teamsList) | **GET** /accounts/{account_id}/teams | List Teams
*TeamsApi* | [**teamsProjectsCreate**](docs/TeamsApi.md#teamsProjectsCreate) | **POST** /accounts/{account_id}/teams/{team_id}/projects | Add Project
*TeamsApi* | [**teamsProjectsDelete**](docs/TeamsApi.md#teamsProjectsDelete) | **DELETE** /accounts/{account_id}/teams/{team_id}/projects/{id} | Remove Project
*TeamsApi* | [**teamsSpacesCreate**](docs/TeamsApi.md#teamsSpacesCreate) | **POST** /accounts/{account_id}/teams/{team_id}/spaces | Add Space
*TeamsApi* | [**teamsSpacesDelete**](docs/TeamsApi.md#teamsSpacesDelete) | **DELETE** /accounts/{account_id}/teams/{team_id}/spaces/{id} | Remove Space
*TeamsApi* | [**teamsUsersCreate**](docs/TeamsApi.md#teamsUsersCreate) | **POST** /accounts/{account_id}/teams/{team_id}/users | Add User
*TeamsApi* | [**teamsUsersDelete**](docs/TeamsApi.md#teamsUsersDelete) | **DELETE** /accounts/{account_id}/teams/{team_id}/users/{id} | Remove User
*TranslationsApi* | [**translationCreate**](docs/TranslationsApi.md#translationCreate) | **POST** /projects/{project_id}/translations | Create a translation
*TranslationsApi* | [**translationExclude**](docs/TranslationsApi.md#translationExclude) | **PATCH** /projects/{project_id}/translations/{id}/exclude | Exclude a translation from export
*TranslationsApi* | [**translationInclude**](docs/TranslationsApi.md#translationInclude) | **PATCH** /projects/{project_id}/translations/{id}/include | Revoke exclusion of a translation in export
*TranslationsApi* | [**translationReview**](docs/TranslationsApi.md#translationReview) | **PATCH** /projects/{project_id}/translations/{id}/review | Review a translation
*TranslationsApi* | [**translationShow**](docs/TranslationsApi.md#translationShow) | **GET** /projects/{project_id}/translations/{id} | Get a single translation
*TranslationsApi* | [**translationUnverify**](docs/TranslationsApi.md#translationUnverify) | **PATCH** /projects/{project_id}/translations/{id}/unverify | Mark a translation as unverified
*TranslationsApi* | [**translationUpdate**](docs/TranslationsApi.md#translationUpdate) | **PATCH** /projects/{project_id}/translations/{id} | Update a translation
*TranslationsApi* | [**translationVerify**](docs/TranslationsApi.md#translationVerify) | **PATCH** /projects/{project_id}/translations/{id}/verify | Verify a translation
*TranslationsApi* | [**translationsByKey**](docs/TranslationsApi.md#translationsByKey) | **GET** /projects/{project_id}/keys/{key_id}/translations | List translations by key
*TranslationsApi* | [**translationsByLocale**](docs/TranslationsApi.md#translationsByLocale) | **GET** /projects/{project_id}/locales/{locale_id}/translations | List translations by locale
*TranslationsApi* | [**translationsExcludeCollection**](docs/TranslationsApi.md#translationsExcludeCollection) | **PATCH** /projects/{project_id}/translations/exclude | Set exclude from export flag on translations selected by query
*TranslationsApi* | [**translationsIncludeCollection**](docs/TranslationsApi.md#translationsIncludeCollection) | **PATCH** /projects/{project_id}/translations/include | Remove exlude from import flag from translations selected by query
*TranslationsApi* | [**translationsList**](docs/TranslationsApi.md#translationsList) | **GET** /projects/{project_id}/translations | List all translations
*TranslationsApi* | [**translationsReviewCollection**](docs/TranslationsApi.md#translationsReviewCollection) | **PATCH** /projects/{project_id}/translations/review | Review translations selected by query
*TranslationsApi* | [**translationsSearch**](docs/TranslationsApi.md#translationsSearch) | **POST** /projects/{project_id}/translations/search | Search translations
*TranslationsApi* | [**translationsUnverifyCollection**](docs/TranslationsApi.md#translationsUnverifyCollection) | **PATCH** /projects/{project_id}/translations/unverify | Mark translations selected by query as unverified
*TranslationsApi* | [**translationsVerifyCollection**](docs/TranslationsApi.md#translationsVerifyCollection) | **PATCH** /projects/{project_id}/translations/verify | Verify translations selected by query
*UploadsApi* | [**uploadCreate**](docs/UploadsApi.md#uploadCreate) | **POST** /projects/{project_id}/uploads | Upload a new file
*UploadsApi* | [**uploadShow**](docs/UploadsApi.md#uploadShow) | **GET** /projects/{project_id}/uploads/{id} | View upload details
*UploadsApi* | [**uploadsList**](docs/UploadsApi.md#uploadsList) | **GET** /projects/{project_id}/uploads | List uploads
*UsersApi* | [**showUser**](docs/UsersApi.md#showUser) | **GET** /user | Show current User
*VariablesApi* | [**variableCreate**](docs/VariablesApi.md#variableCreate) | **POST** /projects/{project_id}/variables | Create a variable
*VariablesApi* | [**variableDelete**](docs/VariablesApi.md#variableDelete) | **DELETE** /projects/{project_id}/variables/{name} | Delete a variable
*VariablesApi* | [**variableShow**](docs/VariablesApi.md#variableShow) | **GET** /projects/{project_id}/variables/{name} | Get a single variable
*VariablesApi* | [**variableUpdate**](docs/VariablesApi.md#variableUpdate) | **PATCH** /projects/{project_id}/variables/{name} | Update a variable
*VariablesApi* | [**variablesList**](docs/VariablesApi.md#variablesList) | **GET** /projects/{project_id}/variables | List variables
*VersionsHistoryApi* | [**versionShow**](docs/VersionsHistoryApi.md#versionShow) | **GET** /projects/{project_id}/translations/{translation_id}/versions/{id} | Get a single version
*VersionsHistoryApi* | [**versionsList**](docs/VersionsHistoryApi.md#versionsList) | **GET** /projects/{project_id}/translations/{translation_id}/versions | List all versions
*WebhookDeliveriesApi* | [**webhookDeliveriesList**](docs/WebhookDeliveriesApi.md#webhookDeliveriesList) | **GET** /projects/{project_id}/webhooks/{webhook_id}/deliveries | List webhook deliveries
*WebhookDeliveriesApi* | [**webhookDeliveriesRedeliver**](docs/WebhookDeliveriesApi.md#webhookDeliveriesRedeliver) | **POST** /projects/{project_id}/webhooks/{webhook_id}/deliveries/{id}/redeliver | Redeliver a single webhook delivery
*WebhookDeliveriesApi* | [**webhookDeliveriesShow**](docs/WebhookDeliveriesApi.md#webhookDeliveriesShow) | **GET** /projects/{project_id}/webhooks/{webhook_id}/deliveries/{id} | Get a single webhook delivery
*WebhooksApi* | [**webhookCreate**](docs/WebhooksApi.md#webhookCreate) | **POST** /projects/{project_id}/webhooks | Create a webhook
*WebhooksApi* | [**webhookDelete**](docs/WebhooksApi.md#webhookDelete) | **DELETE** /projects/{project_id}/webhooks/{id} | Delete a webhook
*WebhooksApi* | [**webhookShow**](docs/WebhooksApi.md#webhookShow) | **GET** /projects/{project_id}/webhooks/{id} | Get a single webhook
*WebhooksApi* | [**webhookTest**](docs/WebhooksApi.md#webhookTest) | **POST** /projects/{project_id}/webhooks/{id}/test | Test a webhook
*WebhooksApi* | [**webhookUpdate**](docs/WebhooksApi.md#webhookUpdate) | **PATCH** /projects/{project_id}/webhooks/{id} | Update a webhook
*WebhooksApi* | [**webhooksList**](docs/WebhooksApi.md#webhooksList) | **GET** /projects/{project_id}/webhooks | List webhooks


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountDetails](docs/AccountDetails.md)
 - [AccountDetails1](docs/AccountDetails1.md)
 - [AccountSearchResult](docs/AccountSearchResult.md)
 - [AffectedCount](docs/AffectedCount.md)
 - [AffectedResources](docs/AffectedResources.md)
 - [Authorization](docs/Authorization.md)
 - [AuthorizationCreateParameters](docs/AuthorizationCreateParameters.md)
 - [AuthorizationUpdateParameters](docs/AuthorizationUpdateParameters.md)
 - [AuthorizationWithToken](docs/AuthorizationWithToken.md)
 - [AuthorizationWithToken1](docs/AuthorizationWithToken1.md)
 - [BitbucketSync](docs/BitbucketSync.md)
 - [BitbucketSyncExportParameters](docs/BitbucketSyncExportParameters.md)
 - [BitbucketSyncExportResponse](docs/BitbucketSyncExportResponse.md)
 - [BitbucketSyncImportParameters](docs/BitbucketSyncImportParameters.md)
 - [BlacklistedKey](docs/BlacklistedKey.md)
 - [BlacklistedKeyCreateParameters](docs/BlacklistedKeyCreateParameters.md)
 - [BlacklistedKeyUpdateParameters](docs/BlacklistedKeyUpdateParameters.md)
 - [Branch](docs/Branch.md)
 - [BranchCreateParameters](docs/BranchCreateParameters.md)
 - [BranchMergeParameters](docs/BranchMergeParameters.md)
 - [BranchName](docs/BranchName.md)
 - [BranchUpdateParameters](docs/BranchUpdateParameters.md)
 - [Comment](docs/Comment.md)
 - [CommentCreateParameters](docs/CommentCreateParameters.md)
 - [CommentMarkReadParameters](docs/CommentMarkReadParameters.md)
 - [CommentUpdateParameters](docs/CommentUpdateParameters.md)
 - [CurrentUser](docs/CurrentUser.md)
 - [Distribution](docs/Distribution.md)
 - [DistributionCreateParameters](docs/DistributionCreateParameters.md)
 - [DistributionPreview](docs/DistributionPreview.md)
 - [DistributionUpdateParameters](docs/DistributionUpdateParameters.md)
 - [Document](docs/Document.md)
 - [Format](docs/Format.md)
 - [GithubSyncExportParameters](docs/GithubSyncExportParameters.md)
 - [GithubSyncImportParameters](docs/GithubSyncImportParameters.md)
 - [GitlabSync](docs/GitlabSync.md)
 - [GitlabSyncExport](docs/GitlabSyncExport.md)
 - [GitlabSyncExportParameters](docs/GitlabSyncExportParameters.md)
 - [GitlabSyncHistory](docs/GitlabSyncHistory.md)
 - [GitlabSyncImportParameters](docs/GitlabSyncImportParameters.md)
 - [Glossary](docs/Glossary.md)
 - [GlossaryCreateParameters](docs/GlossaryCreateParameters.md)
 - [GlossaryTerm](docs/GlossaryTerm.md)
 - [GlossaryTermCreateParameters](docs/GlossaryTermCreateParameters.md)
 - [GlossaryTermTranslation](docs/GlossaryTermTranslation.md)
 - [GlossaryTermTranslationCreateParameters](docs/GlossaryTermTranslationCreateParameters.md)
 - [GlossaryTermTranslationUpdateParameters](docs/GlossaryTermTranslationUpdateParameters.md)
 - [GlossaryTermUpdateParameters](docs/GlossaryTermUpdateParameters.md)
 - [GlossaryUpdateParameters](docs/GlossaryUpdateParameters.md)
 - [Icu](docs/Icu.md)
 - [IcuSkeletonParameters](docs/IcuSkeletonParameters.md)
 - [InlineResponse422](docs/InlineResponse422.md)
 - [InlineResponse422Errors](docs/InlineResponse422Errors.md)
 - [Invitation](docs/Invitation.md)
 - [InvitationCreateParameters](docs/InvitationCreateParameters.md)
 - [InvitationUpdateParameters](docs/InvitationUpdateParameters.md)
 - [InvitationUpdateSettingsParameters](docs/InvitationUpdateSettingsParameters.md)
 - [Job](docs/Job.md)
 - [JobComment](docs/JobComment.md)
 - [JobCommentCreateParameters](docs/JobCommentCreateParameters.md)
 - [JobCommentUpdateParameters](docs/JobCommentUpdateParameters.md)
 - [JobCompleteParameters](docs/JobCompleteParameters.md)
 - [JobCreateParameters](docs/JobCreateParameters.md)
 - [JobDetails](docs/JobDetails.md)
 - [JobDetails1](docs/JobDetails1.md)
 - [JobKeysCreateParameters](docs/JobKeysCreateParameters.md)
 - [JobLocale](docs/JobLocale.md)
 - [JobLocaleCompleteParameters](docs/JobLocaleCompleteParameters.md)
 - [JobLocaleCompleteReviewParameters](docs/JobLocaleCompleteReviewParameters.md)
 - [JobLocaleReopenParameters](docs/JobLocaleReopenParameters.md)
 - [JobLocaleUpdateParameters](docs/JobLocaleUpdateParameters.md)
 - [JobLocalesCreateParameters](docs/JobLocalesCreateParameters.md)
 - [JobPreview](docs/JobPreview.md)
 - [JobReopenParameters](docs/JobReopenParameters.md)
 - [JobStartParameters](docs/JobStartParameters.md)
 - [JobTemplate](docs/JobTemplate.md)
 - [JobTemplateCreateParameters](docs/JobTemplateCreateParameters.md)
 - [JobTemplateLocale](docs/JobTemplateLocale.md)
 - [JobTemplateLocaleUpdateParameters](docs/JobTemplateLocaleUpdateParameters.md)
 - [JobTemplateLocalesCreateParameters](docs/JobTemplateLocalesCreateParameters.md)
 - [JobTemplatePreview](docs/JobTemplatePreview.md)
 - [JobTemplateUpdateParameters](docs/JobTemplateUpdateParameters.md)
 - [JobTemplateUserPreview](docs/JobTemplateUserPreview.md)
 - [JobUpdateParameters](docs/JobUpdateParameters.md)
 - [KeyCreateParameters](docs/KeyCreateParameters.md)
 - [KeyPreview](docs/KeyPreview.md)
 - [KeyUpdateParameters](docs/KeyUpdateParameters.md)
 - [KeysExcludeParameters](docs/KeysExcludeParameters.md)
 - [KeysIncludeParameters](docs/KeysIncludeParameters.md)
 - [KeysSearchParameters](docs/KeysSearchParameters.md)
 - [KeysTagParameters](docs/KeysTagParameters.md)
 - [KeysUntagParameters](docs/KeysUntagParameters.md)
 - [Locale](docs/Locale.md)
 - [LocaleCreateParameters](docs/LocaleCreateParameters.md)
 - [LocaleDetails](docs/LocaleDetails.md)
 - [LocaleDetails1](docs/LocaleDetails1.md)
 - [LocalePreview](docs/LocalePreview.md)
 - [LocalePreview1](docs/LocalePreview1.md)
 - [LocaleStatistics](docs/LocaleStatistics.md)
 - [LocaleUpdateParameters](docs/LocaleUpdateParameters.md)
 - [Member](docs/Member.md)
 - [MemberProjectDetail](docs/MemberProjectDetail.md)
 - [MemberProjectDetailProjectRoles](docs/MemberProjectDetailProjectRoles.md)
 - [MemberSpaces](docs/MemberSpaces.md)
 - [MemberUpdateParameters](docs/MemberUpdateParameters.md)
 - [MemberUpdateSettingsParameters](docs/MemberUpdateSettingsParameters.md)
 - [Notification](docs/Notification.md)
 - [NotificationGroup](docs/NotificationGroup.md)
 - [NotificationGroupDetail](docs/NotificationGroupDetail.md)
 - [OrderConfirmParameters](docs/OrderConfirmParameters.md)
 - [OrderCreateParameters](docs/OrderCreateParameters.md)
 - [Project](docs/Project.md)
 - [ProjectCreateParameters](docs/ProjectCreateParameters.md)
 - [ProjectDetails](docs/ProjectDetails.md)
 - [ProjectDetails1](docs/ProjectDetails1.md)
 - [ProjectLocales](docs/ProjectLocales.md)
 - [ProjectLocales1](docs/ProjectLocales1.md)
 - [ProjectMemberSpecific](docs/ProjectMemberSpecific.md)
 - [ProjectShort](docs/ProjectShort.md)
 - [ProjectUpdateParameters](docs/ProjectUpdateParameters.md)
 - [Release](docs/Release.md)
 - [ReleaseCreateParameters](docs/ReleaseCreateParameters.md)
 - [ReleasePreview](docs/ReleasePreview.md)
 - [ReleaseUpdateParameters](docs/ReleaseUpdateParameters.md)
 - [Screenshot](docs/Screenshot.md)
 - [ScreenshotCreateParameters](docs/ScreenshotCreateParameters.md)
 - [ScreenshotMarker](docs/ScreenshotMarker.md)
 - [ScreenshotMarkerCreateParameters](docs/ScreenshotMarkerCreateParameters.md)
 - [ScreenshotMarkerUpdateParameters](docs/ScreenshotMarkerUpdateParameters.md)
 - [ScreenshotUpdateParameters](docs/ScreenshotUpdateParameters.md)
 - [SearchInAccountParameters](docs/SearchInAccountParameters.md)
 - [Space](docs/Space.md)
 - [Space1](docs/Space1.md)
 - [SpaceCreateParameters](docs/SpaceCreateParameters.md)
 - [SpaceUpdateParameters](docs/SpaceUpdateParameters.md)
 - [SpacesProjectsCreateParameters](docs/SpacesProjectsCreateParameters.md)
 - [Styleguide](docs/Styleguide.md)
 - [StyleguideCreateParameters](docs/StyleguideCreateParameters.md)
 - [StyleguideDetails](docs/StyleguideDetails.md)
 - [StyleguideDetails1](docs/StyleguideDetails1.md)
 - [StyleguidePreview](docs/StyleguidePreview.md)
 - [StyleguideUpdateParameters](docs/StyleguideUpdateParameters.md)
 - [Subscription](docs/Subscription.md)
 - [Tag](docs/Tag.md)
 - [TagCreateParameters](docs/TagCreateParameters.md)
 - [TagWithStats](docs/TagWithStats.md)
 - [TagWithStats1](docs/TagWithStats1.md)
 - [TagWithStats1Statistics](docs/TagWithStats1Statistics.md)
 - [TagWithStats1Statistics1](docs/TagWithStats1Statistics1.md)
 - [Team](docs/Team.md)
 - [TeamCreateParameters](docs/TeamCreateParameters.md)
 - [TeamDetail](docs/TeamDetail.md)
 - [TeamShort](docs/TeamShort.md)
 - [TeamUpdateParameters](docs/TeamUpdateParameters.md)
 - [TeamsProjectsCreateParameters](docs/TeamsProjectsCreateParameters.md)
 - [TeamsSpacesCreateParameters](docs/TeamsSpacesCreateParameters.md)
 - [TeamsUsersCreateParameters](docs/TeamsUsersCreateParameters.md)
 - [Translation](docs/Translation.md)
 - [TranslationCreateParameters](docs/TranslationCreateParameters.md)
 - [TranslationDetails](docs/TranslationDetails.md)
 - [TranslationDetails1](docs/TranslationDetails1.md)
 - [TranslationExcludeParameters](docs/TranslationExcludeParameters.md)
 - [TranslationIncludeParameters](docs/TranslationIncludeParameters.md)
 - [TranslationKey](docs/TranslationKey.md)
 - [TranslationKeyDetails](docs/TranslationKeyDetails.md)
 - [TranslationKeyDetails1](docs/TranslationKeyDetails1.md)
 - [TranslationOrder](docs/TranslationOrder.md)
 - [TranslationReviewParameters](docs/TranslationReviewParameters.md)
 - [TranslationUnverifyParameters](docs/TranslationUnverifyParameters.md)
 - [TranslationUpdateParameters](docs/TranslationUpdateParameters.md)
 - [TranslationVerifyParameters](docs/TranslationVerifyParameters.md)
 - [TranslationVersion](docs/TranslationVersion.md)
 - [TranslationVersionWithUser](docs/TranslationVersionWithUser.md)
 - [TranslationVersionWithUser1](docs/TranslationVersionWithUser1.md)
 - [TranslationsExcludeParameters](docs/TranslationsExcludeParameters.md)
 - [TranslationsIncludeParameters](docs/TranslationsIncludeParameters.md)
 - [TranslationsReviewParameters](docs/TranslationsReviewParameters.md)
 - [TranslationsSearchParameters](docs/TranslationsSearchParameters.md)
 - [TranslationsUnverifyParameters](docs/TranslationsUnverifyParameters.md)
 - [TranslationsVerifyParameters](docs/TranslationsVerifyParameters.md)
 - [Upload](docs/Upload.md)
 - [UploadCreateParameters](docs/UploadCreateParameters.md)
 - [UploadSummary](docs/UploadSummary.md)
 - [User](docs/User.md)
 - [UserPreview](docs/UserPreview.md)
 - [Variable](docs/Variable.md)
 - [VariableCreateParameters](docs/VariableCreateParameters.md)
 - [VariableUpdateParameters](docs/VariableUpdateParameters.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCreateParameters](docs/WebhookCreateParameters.md)
 - [WebhookDelivery](docs/WebhookDelivery.md)
 - [WebhookUpdateParameters](docs/WebhookUpdateParameters.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Basic

- **Type**: HTTP basic authentication

### Token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@phrase.com

