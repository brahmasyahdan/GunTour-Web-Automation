Feature: Update product by Admin Functionality
  Background: Login admin with registered account
    Given I already on log in page
    And I input email "admin@gmail.com"
    And I input password "Kunti123"
    And I click login button
    Then directed to admin page
#    When click product menu
#    And products table appear

  @admin @positive
  Scenario: Verify close button in edit product modal is enabled
    Given click edit product button
    When click close button edit modal
    Then edit product modal should closed

  @admin @admineditproduct @positive
  Scenario: Admin update product with valid data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang Update"
    And input update rent price "200000"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click edit product button modal
    Then the product should be edited

  @admin @negative
  Scenario: Admin update product with invalid rent price data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang Update"
    And input update rent price "dua ratus update"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click edit product button modal
    Then alert message should appear "There is an error please check again"

  @admin @negative
  Scenario: Admin update product without product photo data
    When click edit product button
    And input update product name "Tenda Big Size 8 orang Update"
    And input update rent price "200000"
    And input update description "2 x 1.5 x 1.2 m Update"
    And input update warning "Barang mudah robek Update"
    And click edit product button modal
    Then the product should be edited

  @admin @positive
  Scenario Outline: Admin update product with incomplete data
    When click edit product button
    And input update product photo data
    And input update product name "<product_name>"
    And input update rent price "<rent_price>"
    And input update description "<description>"
    And input update warning "<warning>"
    And click edit product button modal
    Then the product should be edited
    Examples:
      |product_name|rent_price|description|warning|
      |            |200000    |2x1.5x1m   |Dikembalikan dalam keadaan bersih|
      |Tenda Besar |          |2x1.5x1m   |Dikembalikan dalam keadaan bersih|
      |Tenda Besar |200000    |           |Dikembalikan dalam keadaan bersih|
      |Tenda Besar |200000    |2x1.5x1m   |                                 |

  @admin @positive
  Scenario: Admin logout
    When click logout button in admin page
    Then should return to login page

#  @admineditproduct @negative @admin-w024
#  Scenario: Admin update product without rent price data
#    When click edit product button
#    And input update product photo data
#    And input update product name "Tenda Big Size 8 orang"
#    And input update description "2 x 1.5 x 1.2 m"
#    And input update warning "Barang mudah robek"
#    And click edit product button modal
#    Then the product should be edited
#
#  @admineditproduct @negative @admin-w025
#  Scenario: Admin update product without description data
#    When click edit product button
#    And input update product photo data
#    And input update product name "Tenda Big Size 8 orang"
#    And input update rent price "200000"
#    And input update warning "Barang mudah robek"
#    And click edit product button modal
#    Then the product should be edited
#
#  @admineditproduct @negative @admin-w026
#  Scenario: Admin update product without warning data
#    When click edit product button
#    And input update product photo data
#    And input update product name "Tenda Big Size 8 orang"
#    And input update rent price "200000"
#    And input update description "2 x 1.5 x 1.2 m"
#    And click edit product button modal
#    Then the product should be edited

  #  @admin @admindeleteproduct @positive
#  Scenario: Admin delete product functionality
#    When admin click delete button
#    Then the product should be deleted
