Feature: Amazon Search

Scenario: Search a Product
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and price 200
Then Product with name "Apple MacBook Pro" should be displayed
Then Order id is 12345 and username is "Laxmi"