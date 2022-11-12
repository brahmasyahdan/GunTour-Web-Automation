Feature: Booking now button functionality
  Background: login as ari
    Given I already on log in page
    And I input email "aariuser@guntour.com"
    And I input password "P4assword"
    And I click login button
    And I click pop up success message login button

  Scenario: Booking a ticket with all valid value without input product
    Given I click on booked now button on navbar
    When I click on 