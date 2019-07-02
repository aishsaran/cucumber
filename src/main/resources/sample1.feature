Feature: Login Test
Description: login with valid username and password
Scenario: Login with valid combination
Given user opens login page in newtours application
When user enters username as "mercury" and password as "mercury"
And click on Submit button
Then verify login success

