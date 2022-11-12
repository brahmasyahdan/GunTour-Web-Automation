Feature: homepage user

  Background: login pendaki
    Given user already login


    Scenario: user wanted to book a products
      When user choose one product to book
      Then should pop up successfully book a product
      And user choose a second product
      Then should pop up successfully book a product
      When user choose a third product
      Then should pop up successfully book a product


    Scenario: user wanted to see product detail
      When user click on product picture
      Then should be directed to product detail page