Feature: homepage anonym


  Scenario: book product without login
    Given user anonym already on home page anonym
    When user anonym click first product Book Now button
    Then should pop up an error
    When user anonym click second product Book Now button
    Then should pop up an error
    When user anonym click third product Book Now button
    Then should pop up an error


  Scenario: join community without login
    Given user anonym already on home page anonym
    When user anonym click Join Community
    Then should be directed to telegram invitation