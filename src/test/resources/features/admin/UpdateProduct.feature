Feature: Update product by Admin Functionality
  Background: Login admin with registered account
    Given already on login page
    And input email "admin@gmail.com"
    And input password "Kunti123"
    And click login button
    Then directed to admin page

  @admineditproduct @positive @admin-w013
  Scenario: Verify close button in edit product modal is enabled
    Given click edit product button
    When click close button edit modal
    Then edit product modal should closed

  @admineditproduct @positive @admin-w021
  Scenario: Admin update product with valid data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang Update"
    And input update rent price "200000"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click save data button modal
    Then the product should be edited

  @admineditproduct @positive @admin-w021
  Scenario: Admin update product with invalid rent price data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang Update"
    And input update rent price "dua ratus update"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @admineditproduct @negative @admin-w022
  Scenario: Admin update product without product photo data
    When click edit product button
    And input update product name "Tenda Big Size 8 orang Update"
    And input update rent price "200000"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click save data button modal
    Then the product should be edited

  @admineditproduct @negative @admin-w023
  Scenario: Admin update product without product name data
    When click edit product button
    And input update product photo data
    And input update rent price "200000"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click save data button modal
    Then the product should be edited

  @admineditproduct @negative @admin-w024
  Scenario: Admin update product without rent price data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang"
    And input update description "2 x 1.5 x 1.2 m"
    And input update warning "Barang mudah robek"
    And click save data button modal
    Then the product should be edited

  @admineditproduct @negative @admin-w025
  Scenario: Admin update product without description data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang"
    And input update rent price "200000"
    And input update warning "Barang mudah robek"
    And click save data button modal
    Then the product should be edited

  @admineditproduct @negative @admin-w026
  Scenario: Admin update product without warning data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang"
    And input update rent price "200000"
    And input update description "2 x 1.5 x 1.2 m"
    And click save data button modal
    Then the product should be edited

  @admindeleteproduct @positive @admin-w020
  Scenario: Admin delete product functionality
    When admin click delete button
    Then the product should be deleted

##  //*[@id="40"]
##  //*[@id="68"]
##  //*[@id="root"]/div/div/div[3]/div/div[2]/table/tbody[1]/tr/td[4]/div/button[1]/div/label
##  //*[@id="root"]/div/div/div[3]/div/div[2]/table/tbody[2]/tr/td[4]/div/button[1]/div/label
##  //*[@id="root"]/div/div/div[3]/div/div[2]/table/tbody[8]/tr/td[4]/div/button[1]