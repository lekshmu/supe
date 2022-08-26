Feature: Checking the internal developer pricelist negative scenarios


  Scenario:Internal Developer is not able to sigh in when email and Password fields are blank
    Given internal developer launch url in pricelist neagive scenario
    When  internal developer clicks login button in pricelist neagive scenario
    Then  internal developer lands on the login page in pricelist neagive scenario
    Then  internal developer clicks sigh in button in pricelist neagive scenario
    And   validation message is displayed in pricelist neagive scenario

  Scenario:Internal Developer is not allowed to sign in with invalid email and invalid password
    When int dev enters invalid email id and invalid password in pricelist neagive scenario
    Then internal developer clicks signin button in pricelist neagive scenario
    And  check the validation msg in pricelist neagive scenario

  Scenario:Internal Developer is not allowed to sighin with valid email and invalid password
    When internal developer enters valid email id and invalid password in pricelist neagive scenario
    Then internal developer clicks sighin button after entering valid email id and invalid password
    And  int dev check the validation msg in pricelist neagive scenario

  Scenario: Validate that the internal developer is not allowed to login with invalid email and valid password
    When internal developer enters invalid email in pricelist neagive scenario
    Then internal developer click on the login button after entering invalid email
    And  check the validation msg after entering invalid email in pricelist neagive scenario

  Scenario: Validate that internal developer login with the valid credentials
    When internal developer valid credentials in pricelist neagive scenario
    Then internal developer clicks sign in button in pricelist neagive scenario
    And  successfully navigated to users page in pricelist neagive scenario

  Scenario: Perfome invalid serch operation in Lobs
    When clicks the price list button in pricelist neagive scenario
    Then navigated to price list in pricelist neagive scenario
    Then click on the search button in pricelist neagive scenario
    And give any invalidata in pricelist neagive scenarios

  Scenario: giving valid data for searching in pricelist neagive scenario
    When clear the search field in pricelist neagive scenario
    Then give valid data for searching in pricelist neagive scenario
    Then clicks the serach button using valid data in pricelist neagive scenario
    And  successfully navigated lobs page in pricelist neagive scenario

  Scenario: downloading the file
    When click the any of the prise list file in pricelist neagive scenario
    Then clicks the second download button in pricelist neagive scenario
    And clicks the dashboard pricelist neagive scenario
