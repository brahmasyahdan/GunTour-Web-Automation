Feature: about page

  Background: login pendaki
    Given user already login

  Scenario: user wanted to know more info about Mount Gede
    When user click About Navigation Bar
    And should be directed to About Page
    Then user click Selengkapnya Button
    And user should be directed to history page about Mount Gede