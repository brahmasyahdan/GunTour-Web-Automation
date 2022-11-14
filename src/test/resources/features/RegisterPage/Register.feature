Feature: register

  #ganti examples sesudah run
  Scenario Outline: Register with all valid data
    Given I already register page
    And I input full name "<fullname>" on register page
    And I input email "<email>" on register page
    And I input password "<password>" on register page
    Then I click Register Account button
    And I see alert register success & click OK
    And  I Should be directed to login page
    Examples:
    |         fullname          |          email          |      password      |
    |        mbuhlah           |   mbuhlah@mail.com   |     Wekeren123     |


  Scenario: Register with using full name using 1 characters
    Given I already register page
    And I input full name "S" on register page
    And I input email "mbuhyo@mail.com" on register page
    And I input password "Wekeren123" on register page
    Then I click Register Account button
    And  Should be pop up please Please enter full name


  Scenario: Register with using full name using 2 or more
    Given I already register page
    And I input full name "Sol" on register page
    And I input email "mbuhyo@mail.com" on register page
    And I input password "Wekeren123" on register page
    Then I click Register Account button
    And  Should be pop up please Please enter full name


  Scenario: Register with using email not valid
    Given I already register page
    And I input full name "Sololoh" on register page
    And I input email "mbuhyo@.com" on register page
    And I input password "Wekeren123" on register page
    Then I click Register Account button
#    And  Should be pop up please Please enter full name

  Scenario: Register with using email not valid
    Given I already register page
    And I input full name "Sololoh" on register page
    And I input email "mbuhyo@.com" on register page
    And I input password "Wekeren123" on register page
    Then I click Register Account button
#    And  Should be pop up please Please enter full name


  Scenario Outline: Register not filled in either full name email or password
    Given I already register page
    And I input full name "<fullname>" on register page
    And I input email "<email>" on register page
    And I input password "<password>" on register page
    Then I click Register Account button
    And Should be pop up data cannot be empty
    Examples:
      |    fullname    |          email          |      password      |
      |                |   mbuhlah@mail.com      |     Wekeren123     |
      |   Haidar       |                         |      Wekeren123    |
      |   Haidar       |   mbuhlah@mail.com      |                    |
      |                |                         |                    |

  Scenario: User want to register account
    Given I already register page
    And I click on login text link
    Then I Should be directed to login page