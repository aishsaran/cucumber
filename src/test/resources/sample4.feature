Feature: Testing backgroung keyword
Background:display welcome
Given application displays welcome message

@aishu
Scenario: Sign in

Given username and password
And click signin
@appu
Scenario: Search
When user searches for iphone
@appu @aishu
Scenario: add to cart
When user adds the product to the cart
@aishu
Scenario: payment process
When user proceeds to pay
@aishu
Scenario: Signout
When user singsout from the shopping