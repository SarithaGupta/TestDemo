Feature: restful-booker API
Scenario Outline: create new Auth token
Given User creates post req for the restbooker API
When User sends HTTPS Request and  "<username>" "<password>" to get the token
Then user receives 200 status with response body 
Examples:
|username|password|
|admin|password123|

Scenario Outline: Get req to fetch all ID's
Given User creates get req for the restbooker API
When User sends HTTPS Request with "<endpoints>" to get all ID'S and code 200
Then user receives 200 status with response body 
Examples:
|endpoints|
|/booking|

#Returns a specific booking based upon the booking id provided
Scenario Outline: Get req to fetch all targeted Id
Given User creates get req for the restbooker API
When User sends HTTPS Request with "<endpoints>" to get targeted ID and code 200
Then user receives 200 status with response body 
Examples:
|endpoints|
|/543|
