Feature: Facebook Login feature

Scenario: Login to facebook with correct credentials
Given user is already on Facebook Login page
When user is on Login Page
Then user enter "abc" as email and "1234" as password
Then user successfuly logs into Facebook Home Page 