Feature: Test Twitter smoke scenario

  Scenario: Test login with valid credentials
    Given Open Chrome and start application
    When I enter valid username and valid passowrd
    Then user should be able to login successfully

