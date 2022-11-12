Feature: guide page

  Background: login pendaki
    Given user already login

  Scenario: user wanted to download important file from Guide Page
    When user click Guide navigation bar
    And  shoud be directed to Guide Page
    Then user click Download File button for Climber Declaration Letter
    And user click Download File button for Parent's Statement Letter
    And user click Download File button for Health Declaration Letter
    And user click Download File button for Garbage Form