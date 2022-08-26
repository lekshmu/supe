Feature: Thirdparty Negative Workflow


  Scenario: Validate that the user is not allowed to login when email and Password fields are blank
    Given launch the url for checking the thirdparty logins
    When click on the login button for checking third party loginn
    When  check that the user lands on the login page successfully for checking third party loginn
    Then  click on the first login part
    Then validation message is displiayedd

  Scenario: Validate third party user is allowed to login with invalid email and invalid password
    When third party enters invalid email id and invalid password in the login page
    Then click on the login button after entering invalid email id and invalid password
    And check the validation msg is displayed or not

  Scenario: Validate that the user is not allowed to login with valid email and invalid password
    When third party enters valid email id and invalid password in the login page
    Then click on the login button after entering valid email id and invalid password
    And check the validation msg is displayed or not after entering valid email id and invalid password

  Scenario: Validate that the user is not allowed to login with invalid email and valid password
    When third party enters invalid email id and valid password in the login page
    Then click on the login button after entering invalid email id and valid password
    And check the validation msg is displayed or not after entering invalid email id and valid password

  Scenario: Validate that the user is not allowed to login with valid email and valid password thirdparty negative
    When third party enters valid email id and valid password in the login page thirdparty negative
    Then click on the login button after entering valid email id and valid password thirdparty negative
     # And check the validation msg is displayed or not after entering valid email id and valid password thirdparty negative

  Scenario: check that third party not able to create application while not filling the mandatory fields
    When click on the create application button in third party negative page
    Then lands on the create application page in third party negative
    And able to fill the fiels and left some fields are blank
    Then click on the create application button in the third party negative

  Scenario: After the failure of app creationthird party tried to fill all fields
    When thirdparty user fill all mandatory fields
    Then click on application ceation in the thirdparty negative
        #Then tries to create application with invalid email format
    Then close the window presented in the application creation

  Scenario: validate third party not able to create application while giving the invalid email
    When click on the create application button to check that with an invalid email id application is created or not
    Then lands on the create application page in third party negative scenarios
    Then tries to create application with invalid email format
    Then thirdparty click on the save button with an invalid email id

  Scenario: third party tries to create application with valid email id
    When third party giving valid email id
    Then click on save button after giving the valid email id
    Then click on the cancel button after the application is created

  Scenario: Thirdparty tries to edit  any one one of the applications
    When thirdparty click one pending list of applicatons
    Then click the edit button of the last created applications
    Then tried to remove any one of the field
    Then click on the update button and check that the application is created or not

  Scenario: Thirdparty click on the update button after entering all fields
    When thirdparty give the valid data
    Then click the updated buttion in the thirdparty negative

  Scenario: check the priselist negative scenarios
    When click on the thirdparty negative scenario dashboard
    Then sucessfully navigated to the thirdparty negative scenario dashboard
    Then click on the thirdparty negative scenario pricelist
    And sucessfully navigated to the third party negative scenario pricelist

  Scenario: giving invalid data in the search button of the thirdparty negative scenario
    When click on the search button in the third party negative scenario
    Then thirdparty can give invalid data for searching negative scenario

  Scenario: giving valid data in the search button of the thirdparty negative scenario
    When clear the search field in the third party negative scenario
    Then thirdparty can give valid data for searching negative scenario
    Then click the corresponding pricelist of the thirdparty negative scenario
    Then click the any of the prise list file in the thirdparty negative scenario
    Then click on the second download button of pricelist negative scenario
    Then go back to the price list dashboard of the third party negative scenario

  Scenario: thirdparty negative scenario user logout
    When third party negative scenario signout
    Then thirdparty negative scenario logout




