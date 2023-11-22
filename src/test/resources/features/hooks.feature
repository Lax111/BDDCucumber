
Feature: Login to SauceDemo

  @smoke
  Scenario: User logs in valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be logged in successfully
    
    @regression
  Scenario: User logs in valid credentials
    Given the user is on the login page
    When the user enters invalid username and password
    Then the user should see an error message