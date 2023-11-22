@E2E
Feature: Bookcart Application test

  @Success
  Scenario: Login should be success
    And User clicks on the login button
    And User enter the username as "Nishanthi"
    And User enter the password ad "Nishanthi@1"
    When User clicks on the login button after entered the credentials
    Then Login should be success

  @Failure
  Scenario: Login should not be success
    And User clicks on the login button
    And User enter the username as "Invalid"
    And User enter the password ad "Invalid"
    When User clicks on the login button after entered the credentials
    But Login should fail

  Scenario Outline: Login should be done using scenario outline
    And User clicks on the login button
    And User enter username "<username>"
    And User enter password "<password>"
    When User clicks on the login button after entered the credentials
    Then Login should be success
    Examples:
      | username  | password    |
      | Nishanthi | Nishanthi@1 |
      | Invalid   | Invalid@1   |
