Feature: search multiple items
Scenario: search for products
When user searches for products
|iphone|
|travel kit|
|summer wear|
And verify the product displayed
Then close the application
