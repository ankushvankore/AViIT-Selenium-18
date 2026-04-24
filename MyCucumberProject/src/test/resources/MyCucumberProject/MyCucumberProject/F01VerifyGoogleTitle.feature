Feature: Google Title

  Scenario: To validate Google Title
    Given Open Google
    When Read the title
    Then Title should be Google
