Feature: Admin add product by functionality
  Background: Login admin with registered account
    Given I already on log in page
    And I input email "admin@gmail.com"
    And I input password "Kunti123"
    And I click login button
    Then directed to admin page
    When click product menu
    And products table appear

  @admin @positive
  Scenario: Verify close button in add product modal is enabled
    Given click add product button
    When click close button add modal
    Then add product modal should closed
    Given click load more button

  @admin @adminaddproduct @positive
  Scenario Outline: Admin add product with valid data
    When click add product button
    And input product photo data
    And input product name "<product_name>"
    And input rent price "<rent_price>"
    And input description "<description>"
    And input warning "<warning>"
    And click save data button modal
    Then the product should be added to table
#    And send productID to dynamic variable
    Examples:
      |product_name|rent_price|description|warning|
      |Hammock     |130000    |Untuk tidur dimalam hari|Dikembalikan dalam keadaan bersih|
      |Tenda Besar |200000    |Ukuran besar 2x1.5x1m|Dikembalikan dalam keadaan bersih|
      |Ransel Besar|100000    |Bisa memuat banyak barang|Dikembalikan dalam keadaan bersih|

#  @admin @adminaddproduct @positive
#  Scenario: Admin add product with valid data
#    When click add product button
#    And input product photo data
#    And input product name "Tenda Big Size"
#    And input rent price "100000"
#    And input description "2 x 1.5 x 1 m"
#    And input warning "Harap dikembalikan dalam keadaan bersih"
#    And click save data button modal
#    Then the product should be added to table
#    And send productID to dynamic variable

  @admin @negative
  Scenario: Admin add product with invalid rent price data
    When click add product button
    And input product photo data
    And input product name "Tenda Big Size"
    And input rent price "@!!!"
    And input description "2 x 1.5 x 1 m"
    And input warning "Dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @admin @negative
  Scenario: Admin add product without product photo data
    When click add product button
    And input product name "Hammock"
    And input rent price "130000"
    And input description "Untuk tidur"
    And input warning "Hati2"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @admin @negative
  Scenario Outline: Admin add product with incomplete field data
    When click add product button
    And input product photo data
    And input product name "<product_name>"
    And input rent price "<rent_price>"
    And input description "<description>"
    And input warning "<warning>"
    And click save data button modal
    Then alert message should appear "There is an error please check again"
    Examples:
      |product_name|rent_price|description|warning|
      |            |130000    |Untuk tidur|Hati2  |
      |Hammock     |          |Untuk tidur|Hati2  |
      |Hammock     |130000    |           |Hati2  |
      |Hammock     |130000    |Untuk tidur|       |

#  @admin @negative
#  Scenario: Admin add product without rent price data
#    When click add product button
#    And input product photo data
#    And input product name "Tenda Big Size"
#    And input description "2 x 1.5 x 1 m"
#    And input warning "Dikembalikan dalam keadaan bersih"
#    And click save data button modal
#    Then alert message should appear "There is an error please check again"
#
#  @admin @negative
#  Scenario: Admin add product without description data
#    When click add product button
#    And input product photo data
#    And input product name "Tenda Big Size"
#    And input rent price "100000"
#    And input warning "Dikembalikan dalam keadaan bersih"
#    And click save data button modal
#    Then alert message should appear "There is an error please check again"
#
#  @admin @negative
#  Scenario: Admin add product without note data
#    When click add product button
#    And input product photo data
#    And input product name "Tenda Big Size"
#    And input rent price "100000"
#    And input description "2 x 1.5 x 1 m"
#    And click save data button modal
#    Then alert message should appear "There is an error please check again"