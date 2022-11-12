Feature: Booking now button functionality
  Background: login as ari
    Given I already on log in page
    And I input email "aariuser@guntour.com"
    And I input password "P4assword"
    And I click login button
    And I click pop up success message login button

  Scenario: Book a product
    When I click on book now button on selected product
    Then Product added to booking now with message "Added to Booking Now"
    When I click on avatar menu
    And I click on my booking
    Then I redirected to booking history page