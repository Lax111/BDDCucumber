

Feature: Login Functionality
@smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be logged in successfully

  @regression @login
  Scenario: user logs in with invalid credentials
    Given the user is on the login page
    When the user enters invalid username and password
    Then the user should see an error message
    
   