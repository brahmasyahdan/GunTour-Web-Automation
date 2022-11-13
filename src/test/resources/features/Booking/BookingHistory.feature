Feature: Payment
  Background:
    Given I already on log in page
    And I input email "aariuser@guntour.com"
    And I input password "P4assword"
    And I click login button
    And I click pop up success message login button

  Scenario: Validate My Booking functionality
    When I click on avatar menu
    And I click on my booking
    Then I redirected to Order History page

  Scenario: Order until purchase the order with BCA klikpay and delete it
    When I click on avatar menu
    And I click on my booking
    Then I redirected to Order History page

  Scenario: Order until purchase the order with BRImo but cancel to delete
    When I click on avatar menu
    And I click on my booking
    Then I redirected to Order History page