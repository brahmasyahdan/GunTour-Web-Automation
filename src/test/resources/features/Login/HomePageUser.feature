Feature: homepage user

  Background: login pendaki
    Given user already login


    Scenario: user wanted to open mount gede map
      When user click on google map
      Then user should be directed to mount gede google map