Feature: ranger re apply

  Background:
    Given ranger already login

  Scenario Outline: user wanted to apply as ranger with valid data
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field with valid data "<fullname>" "<phone>" "<placebirth>" "<gender>" "<address>"
    And user upload document
    Then user submit the data
    And user should see error pop up
    Examples:
      |fullname        |phone       |placebirth               |gender   |address               |
      |Bambang Gentoled|081122312322|Surabaya, 17 Agustus 1945|Laki-Laki|Jl. Ir. Asep Syaepuloh|


  Scenario Outline: user wanted to apply as ranger without fullname
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field without fullname "<phone>" "<placebirth>" "<gender>" "<address>"
    And user upload document
    Then user submit the data
    And user should see error pop up
    Examples:
      |phone       |placebirth               |gender   |address               |
      |081122312322|Surabaya, 17 Agustus 1945|Laki-Laki|Jl. Ir. Asep Syaepuloh|


  Scenario Outline: user wanted to apply as ranger without phone
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field without phone "<fullname>" "<placebirth>" "<gender>" "<address>"
    And user upload document
    Then user submit the data
    And user should see error pop up
    Examples:
      |fullname        |placebirth               |gender   |address               |
      |Bambang Gentoled|Surabaya, 17 Agustus 1945|Laki-Laki|Jl. Ir. Asep Syaepuloh|


  Scenario Outline: user wanted to apply as ranger without place birth
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field without place birth "<fullname>" "<phone>" "<gender>" "<address>"
    And user upload document
    Then user submit the data
    And user should see error pop up
    Examples:
      |fullname        |phone       |gender   |address               |
      |Bambang Gentoled|081122312322|Laki-Laki|Jl. Ir. Asep Syaepuloh|


  Scenario Outline: user wanted to apply as ranger without gender
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field without gender "<fullname>" "<phone>" "<placebirth>" "<address>"
    And user upload document
    Then user submit the data
    And user should see error pop up
    Examples:
      |fullname        |phone       |placebirth               |address               |
      |Bambang Gentoled|081122312322|Surabaya, 17 Agustus 1945|Jl. Ir. Asep Syaepuloh|


  Scenario Outline: user wanted to apply as ranger without address
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field with without address "<fullname>" "<phone>" "<placebirth>" "<gender>"
    And user upload document
    Then user submit the data
    And user should see error pop up
    Examples:
      |fullname        |phone       |placebirth               |gender   |
      |Bambang Gentoled|081122312322|Surabaya, 17 Agustus 1945|Laki-Laki|


  Scenario Outline: user wanted to apply as ranger without upload document
    When user choose become ranger dropdown
    Then user should be directed to apply form ranger page
    And user fill the field with valid data "<fullname>" "<phone>" "<placebirth>" "<gender>" "<address>"
    Then user submit the data
    And user should see error pop up
    Examples:
      |fullname        |phone       |placebirth               |gender   |address               |
      |Bambang Gentoled|081122312322|Surabaya, 17 Agustus 1945|Laki-Laki|Jl. Ir. Asep Syaepuloh|