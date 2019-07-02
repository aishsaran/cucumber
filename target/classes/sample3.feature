Feature: Signup
Scenario Outline: sign up with different users
Given user opens sign up page
When user enters fn as "<firstname>"
And  user enters ln as "<lastname>"
And  user enters dob as "<dob>"
And  user enters password as "<pass>"
Then click signup button
And verify the login successful
Examples:
|firstname|lastname|dob|pass|
|aishu|saran|15/11/1997|aihsaran|
|aparna|sivarajan|03/03/1997|appusiva|
|diviya|murugesan|29/09/1997|diviyaaaa|
