Feature: Add car

  @addCars
  Scenario: Let the car work
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on the Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on the Let the car work
    And User enters Location
    And User enters valid data
    And User enters About
    And User enters Photos car
    And User clicks on Submit button
    Then User verifies Success message is displayed
    And User quites browser
























