Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on the Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on the Login link
    And User enters valid email and wrong password
      | email   | password  |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message is displayed
    And User quites browser
    Examples:
      | email          | password   |
      | talia98@gmx.de | Qwert12345 |
      | talia98@gmx.de | qwert12345 |
      | talia98@gmx.de | QWERT12345 |
      | talia98@gmx.de | Qwertttttt |
      | talia98@gmx.de | 123456789! |


















