Feature: login

  #pendaki
  Scenario: Successfully logged in as pendaki
    Given I already on log in page
    When I input email "nyusdjaja30@gmail.com"
    And I input password "Araa1989"
    And I click login button
    Then Should be directed to Home Page


    #ranger
  Scenario: Successfully logged in as ranger
    Given I already on log in page
    When I input email "nyusdjaja@gmail.com"
    And I input password "Araa1989"
    And I click login button
    Then Should be directed to Home Page


    #admin
  Scenario: Successfully logged in as admin
    Given I already on log in page
    When I input email "admin@gmail.com"
    And I input password "Kunti123"
    And I click login button
    Then directed to admin page

  Scenario: login with registered valid email & invalid password
    Given I already on log in page
    When I input email "nyusdjaja30@gmail.com"
    And I input password "oraloginlogpp007"
    And I click login button
    Then Should be pop-up Please fill in the data correctly display


  Scenario: login with registered valid email & without password
    Given I already on log in page
    When I input email "nyusdjaja30@gmail.com"
    And I input password ""
    And I click login button
    Then Should be pop-up Data cannot be empty display


  Scenario: login with registered valid without email &  password
    Given I already on log in page
    When I input email ""
    And I input password "Araa1989"
    And I click login button
    Then Should be pop-up Data cannot be empty display


  Scenario: login with registered without email &  password
    Given I already on log in page
    When I input email ""
    And I input password ""
    And I click login button
    Then Should be pop-up Data cannot be empty display

  Scenario: User want to register account
    Given I already on log in page
    And I click on Register text link
    Then I go to register page