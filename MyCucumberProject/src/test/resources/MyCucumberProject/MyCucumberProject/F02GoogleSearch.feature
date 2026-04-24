Feature: Google Search

  Scenario: To validate search functionality on Google
    Given Launch Google
    When Enter text to search in search box
    And Hit Enter
    Then A valid search result should display
