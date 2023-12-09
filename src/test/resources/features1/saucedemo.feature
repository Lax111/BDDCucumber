# features1/saucedemo.feature
Feature: Saucedemo Login01 Feature

  Scenario: Successful Login01
    Given I am on the Saucedemo login01 page
    When I enter valid credentials01
    Then I should be logged01 in successfully
