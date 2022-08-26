Feature: check the working of compliance manager pricelist positive scenarios

  Scenario: Validate complaine manager can login
    Given cm launches url in price list
    When cm successfully navigated to the welcome page
    Then cm clicks on login button
    And cm lands on the login page


  Scenario: Validate complaine manager enters the email id and password
    When complaince manager enters valid credentials
    Then hits login button and lands on complaince manager page for price list
    And compliance manager successfully navigated to the page


  Scenario: Check the price list in the cm page
    When click on the price list in the cm page
    Then validate navigated to the price list page of the cm
    And click on the search button present in the complaince manager page

  Scenario: search the any one of the lobs in the complaince
    When give any data for searching in the cm
    Then click the corresponding complaince pricelist
    Then click the any of the prise list file of the complaince manager
    Then click on the second download button
    And go back to the price list of the cm dashboard