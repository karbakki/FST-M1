@activity1
Feature: First Test

  @SmokeTest
  Scenario: Opening a web page using Selenium
      Given User is on Google home page
      When User types in cheese and hits ENTER
      Then Show how manu search results were shown
      And Close the browser
