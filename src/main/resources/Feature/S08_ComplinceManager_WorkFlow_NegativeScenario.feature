Feature: Checking the negative scenarios in the complaince manager pricelist page


  Scenario: Validate that the complaince manager is not allowed to login when email and Password fields are blank
    Given cm launch the url in pricelist negative scenarios
    When  cm click the login button in pricelist negative scenarios
    When  cm successfully lands on sign in pricelist negative scenarios
    Then  cm click sign in button in pricelist negative scenarios
    And   cm check validation message in pricelist negative scenarios

  Scenario: Validate complaince manager is not allowed to login with invalid email and invalid password in the pricelist negative scenarios
    When cm enters invalid email id and invalid password in pricelist negative scenarios
    Then cm click on the login button in the pricelist negative scenarios
    And  cm check the validation msg in the pricelist negative scenarios


  Scenario: Validate that complince manager is not allowed to login with valid email and invalid password in the priselist negative
    When cm enters valid email id and invalid password in pricelist negative scenarios
    Then cm click on the login button after entering valid email id and invalid password in the priselist negative
    And  cm check the validation msg after entering valid email id and invalid password in the pricelist negative

  Scenario: Validate that the complince manager is not allowed to login with invalid email and valid password in the pricelist negative
    When cm enters invalid email id and valid password in the login page of the pricelist negative
    Then cm click on the login button after entering invalid email id and valid password in the pricelist negative
    And cm check the validation msg after entering invalid email id and valid password in the pricelist negative

  Scenario: Validate that cm is not allowed to login with valid email and valid password in the pricelist negative
    When cm enters valid email id and valid password in the login page in the pricelist negative
    Then click on the login button after entering valid email id and valid password in the pricelist negative
        # And check the validation msg is displayed or not after entering valid email id and valid password thirdparty negative

  Scenario: complince manager perfome the search operation in the pricelist using invalid data in the lobs
    When cm click on the price list in the pricelist negative
    Then validate cm navigated to the price list page in the complince manager negative
    When click on the search button in the complince manager pricelist negative scenarios
    Then cm give any invalid data in the field of serching lob

  Scenario: cm giving valid data in the search field of the pricelist negative scenarios
    When clear the search field in thecm pricelist negative scenarios
    Then cm can give valid data for searching the pricelist negative scenarios
    Then click the corresponding pricelist of the cm pricelist negative scenarios
    Then click the any of the prise list file in the cm pricelist negative scenarios
    Then click on the second download button of cm pricelist negative scenarios
    Then go back to the price list dashboard of the cm pricelist negative scenarios

  Scenario: complince manager pricelist negative scenarios user logout
    When cm pricelist negative scenarios signout
    Then cm pricelist negative scenarios logout
