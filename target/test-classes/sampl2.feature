Feature: Login Test
Scenario: valid login
Given open newtours app


When user enters un as "mercury" and pass as "mercury"
And submit login form
Then verify pass

Scenario: invalid login
Given open newtours app
When user enters un as "aishu" and pass as "mercury"
And submit login form
Then verify failure
