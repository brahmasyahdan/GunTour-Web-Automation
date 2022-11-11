Feature: homepage anonym


  Scenario: book product without login
    Given user anonym already on home page anonym
    When user anonym click Book Now button
    Then should pop up an error