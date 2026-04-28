@AllLinks
Feature: Test Links on Google home page

  Background: 
    Given Launch Google in Chrome

  @AboutLink
  Scenario: To validate About link
    When Click on About Link
    Then About page should display

  @StoreLink
  Scenario: To validate Store link
    When Click on Store Link
    Then Store page should display

  @GmailLink
  Scenario: To validate Gmail link
    When Click on Gmail Link
    Then Gmail page should display

  @ImagesLink
  Scenario: To validate Images link
    When Click on Images Link
    Then Images page should display
