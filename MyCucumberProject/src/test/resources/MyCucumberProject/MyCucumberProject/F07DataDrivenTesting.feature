Feature: Data Driven Testing

  Scenario Outline: To validate login functionality on OHRM
    Given Launch Orange HRM Application
    When Enter username as "<UserName>"
    When Enter password as "<Password>"
    And Click on Submit button
    Then Dashboard page should display

    #Examples works like @DataProvider in TestNG
    Examples: 
      | UserName  | Password  |
      | admin     | admin123  |
      | dhanashri | dhanashri |
      | admin     | admin123  |
