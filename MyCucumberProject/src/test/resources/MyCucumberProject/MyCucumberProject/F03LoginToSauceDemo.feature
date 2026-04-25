Feature: Login functionality on Sauce Demo application

  Background: 
    Given Launch Sauce Demo

  Scenario: To validate login functionality with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login functionality with invalid data
    When Enter invalid user name
    When Enter invalid password
    And User Click on login button
    Then Error message should display
