Feature: Payment
  Background:
    Given I already on log in page
    And I input email "aariuser@guntour.com"
    And I input password "P4assword"
    And I click login button
    And I click pop up success message login button

  @positive @bookingHistory
  Scenario: Validate My Booking functionality
    When I click on avatar menu
    And I click on my booking
    Then I redirected to booking history page

  @positive @bookingHistory
  Scenario: Validate delete button functionality
    When I click on avatar menu
    And I click on my booking
    Then I redirected to booking history page
    When I click on delete button
    Then I see pop up confirmation "Do you want to Delete ?"
    When I click yes delete it on alert pop up
    Then I see pop up message "Delete Success!"

  @positive @bookingHistory
  Scenario: Validate Pay Now button functionality with BCA KlikPay
    And I already create a booking plan
    And I see status booking is "unpaid"
    When I click on Pay Now button
    Then I redirected to midtrans
    When I select BCA Payment Method
    And I click pay now button with BCA Klik Pay
    And I click Bayar button with BCA Klik Pay
    Then I see transaction is success
    When I click back to merchant website button
    Then I redirected to booking history with status booking is "settlement"

  @negative @bookingHistory
  Scenario: Validate Pay Now Button functionality by Transfer PermataBank
    When I already create a booking plan
    And I see status booking is "unpaid"
    When I click on Pay Now button
    Then I redirected to midtrans
    When I do scroll down
    And I select payment method with bank transfer
    And I select permata bank
    Then I see virtual account Permata
    When I click back to merchant
    Then I redirected to booking history with status booking is "pending"

  @positive @bookingHistory
  Scenario: Validate Pay Now Button functionality using BRImo and delete it
    When I already create a booking plan
    And I see status booking is "unpaid"
    When I click on Pay Now button
    Then I redirected to midtrans
    And I select payment method with BRImo
    And I click pay now button with BRImo
    And I input user BRImo as "testuser00"
    And I click Bayar button with BRImo
    Then I see transaction with brimo is success
    When I click back to website merchant
    Then I redirected to booking history with status booking is "settlement"
    When I click on delete button
    Then I see pop up confirmation "Do you want to Delete ?"
    When I click yes delete it on alert pop up
    Then I see pop up message "Delete Success!"

  @positive @bookingHistory
  Scenario: Verify cancel to delete booking functionality
    When I already create a booking plan
    And I see status booking is "unpaid"
    When I click on Pay Now button
    Then I redirected to midtrans
    And I select payment method with BRImo
    And I click pay now button with BRImo
    And I input user BRImo as "testuser00"
    And I click Bayar button with BRImo
    Then I see transaction with brimo is success
    When I click back to website merchant
    Then I redirected to booking history with status booking is "settlement"
    When I click on delete button
    Then I see pop up confirmation "Do you want to Delete ?"
    When I click cancel on alert pop up
    Then I redirected to booking history with status booking is "settlement"