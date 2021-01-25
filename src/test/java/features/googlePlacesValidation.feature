Feature: validate place API

Scenario: Verify if place is been successfully added using addplaceAPI
	Given add place payload
	When user calls "AddPlaceAPI" with Post http request
	Then the api call is successful with status code 200
	And "status" response body is "OK"
	And "scope" response body is "APP"