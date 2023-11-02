Feature: Login feature
  @smoke
  Scenario: As a user, I want to login into app
    Given the user is on app
    When enters the credentials
    And the user clicks on the login button
    Then the user should be able to navigate to home page