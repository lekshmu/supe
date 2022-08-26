Feature: checking the internal developer pricelist page

  Scenario: Validate that Internal can login with the given credentials
    Given Internal Developer launches url for checking the price list
    When  Internal Developer successfully navigated to the welcome page
    Then  Internal Developer clicks on login button
    And   Internal Developer lands on the login page

  Scenario: Validate internal developer enters the email id and password
    When Internal Developer enters valid email and password for checking the price list
    Then Internal Developer clicks the sigh in button
    And  successfully lands the users page

  Scenario: Check the price list page
    When click on the price list
    Then validate navigated to the price list page
    Then click on the search button
    Then give any data for searching
    And successfully navigated to the lob page

  Scenario: search the any one of the lobss
    Given click the corresponding pricelist
    When click the any of the prise list file
    Then click on the next download button
    And click the dashboard button in the menu


