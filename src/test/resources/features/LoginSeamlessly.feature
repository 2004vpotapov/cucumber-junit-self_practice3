Feature: Login functionality

  @validLogin
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enter valid username
    And user enter valid password
    And user click log in button
    Then user should be able to log in

  @validLoginWithParams
  Scenario: Login with valid credentials
    Given user is on the log in page
    When user enter valid username "Employee61"
    And user enter valid password "Employee123"
    And user click log in button
    Then user should be able to log in

  @InvalidLoginWithOutLine
  Scenario Outline: Login with valid credentials
    Given user is on the log in page
    When user enter valid username "<username>"
    And user enter valid password "<password>"
    And user click log in button
    Then user should be able to log in
    Examples:
      | username      | password      |
      | WrongUsername | Employee123    |
      | Employee61     | WrongPassword |