Feature: Multiple Logins on Saucedemo

Scenario Outline: Login with different user credentials
    Given the user is on the saucedemo login page 
    When the user enter "<username>" and "<password>"
    And the click on the login button
    Then the user should be "<login_status>"

    Examples:
      | username       | password      | login_status  |
      | standard_user  | secret_sauce  | success       |
      | locked_user    | secret_sauce  | account_locked|
      | problem_user   | secret_sauce  | problem_user  |
      | invalid_user   | invalid_pass  | failure       |
      | another_user   | another_pass  | success       |
      | test_user      | test_pass     | success       |
