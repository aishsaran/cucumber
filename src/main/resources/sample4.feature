Feature: Testing backgroung keyword



Scenario: Sign in

Given username and password
And click signin

Scenario: Search
When user searches for iphone

Scenario: add to cart
When user adds the product to the cart

Scenario: payment process
When user proceeds to pay

Scenario: Signout
When user singsout from the shopping