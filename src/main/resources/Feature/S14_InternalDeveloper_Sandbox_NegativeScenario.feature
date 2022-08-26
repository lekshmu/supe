Feature: internal developer sandbox working negative scenarios

  Scenario: internal developer tries to login without entering the email and password
    Given internal developer launch the url for checking the sandbox negative scenarios
    When  internal developer click on the login button without entering the email and password
    When  internal developer check that the user lands on the login page for checking the sandbox negative scenarios
    Then  click on the first login part in internal developer the sandbox negative scenarios
    Then  validation message is displiayed for the internal developer sandbox negative login

  Scenario: Validate internal developer is not allowed to login with invalid email and invalid password in sandbox negative scenarios
    When internal developer enters invalid email id and invalid password in the login page in sandbox negative scenarios
    Then internal developer click on the login button after entering invalid email id and invalid password in sandbox negative scenarios
    And  internal developer negative login check the validation msg is displayed or not in sandbox negative scenarios

  Scenario: Validate that the internal developer is not allowed to login with valid email and invalid password in sandbox negative scenarios
    When internal developer sandbox negative scenarios enters valid email id and invalid password in the login page
    Then internal developer sandbox negative scenarios click on the login button after entering valid email id and invalid password
    And internal developer sandbox negative scenarios check the validation msg is displayed or not after entering valid email id and invalid password

  Scenario: Validate that the internal developer is not allowed to login with invalid email and valid password in sandbox negative scenarios
    When internal developer enters invalid email id and valid password in sandbox negative scenarios login page
    Then internal developer click on the login button after entering invalid email id and valid password in sandbox negative scenarios
    And  internal developer check the validation msg is displayed or not after entering invalid email id and valid password in sandbox negative scenarios

  Scenario: Validate that internal developer is not allowed to login with valid email and valid password in sandbox negative scenarios
    When internal developer enters valid email id and valid password in sandbox negative scenarios login page
    Then internal developer click on the login button after entering valid email id and valid password in sandbox negative scenarios
  # And check the validation msg is displayed or not after entering valid email id and valid password thirdparty negative

  Scenario: Validate that internal developer is not able to create applications without filling all nessessary fields in sandbox negative scenarios
    When click on the create application button in internal developer sandbox negative scenarios
    Then lands on the create application page in  internal developer sandbox negative scenarios
    And able to fill the fiels and left some fields are blank in internal developer sandbox negative scenarios
    Then click on the create application button in the third party negative  internal developer sandbox negative scenarios

  Scenario: After the failure of app creation internal developer  tried to fill all the mandatory fields
    When internal developer fill all mandatory fields in sandbox negative scenarios
    Then click on application ceation in the sandbox negative scenarios
        #Then tries to create application with invalid email format
    Then close the window presented in the application creation in sandbox negative scenarios

  Scenario: validate internaldeveloper not able to create application while giving the invalid email in sandbox negative scenarios
    When click on the create application button to check that with an invalid email id application is created or not in sandbox negative scenarios
    Then lands on the create application page in  sandbox negative scenarios
    Then tries to create application with invalid email format in sandbox negative scenarios
    Then internal developer click on the save button with an invalid email id in sandbox negative scenarios

  Scenario: internal developer tries to create application with valid email id in sandbox negative scenarios
    When internal developer giving valid email id in sandbox negative scenarios
    Then internal developer click on save button after giving the valid email id in sandbox negative scenarios
    Then internal developer click on the cancel button after the application is created

  Scenario: internal developer tried to acess the sandbox while giving an invalid api key
    When internal developer click on the sanbox in the dasboard'
    Then check that internal developer is sucessfully navigated to thee sandboxpage
    Then click on the authorize button in the sandbox dasboard
    Then give the invalid api key in the available authorizations page
    Then click the authorize button in the available authorizations page
    And click on the cross button in internal available authorizations page


  Scenario: checking allergyintolerance with invalid api key
    When click on the allergyintolerance
    Then click on the try it out button inside the allergyintolerance
    Then give any text inside the tenat field
    Then click on the execute button inside the allergyintolerance

  Scenario: checking allergyintolerance with valid pending application api key and left the tenant field as blank
    When click on the applications in the dasbord
         #Then click on the pending applications
    Then click on the any one of the pending application
    Then get the valid api key
    And after getting the valid api key close that application


  Scenario: give the valid api key and left the tenant field  blank
    When click on the sandbox in the dashbord for giving the valid api key
    Then click on the authorize for giving the valid api key
    Then give the valid api key
    Then click on the authorize1 after giving the valid api key
    Then click on the into button after giving the valid api key

  Scenario: checking the allergyintolerance with valid api key and also left the tenant field as blank
    When click on the allergyintolerance after giving the valid api key
    Then click on the try it out button inside the allergyintolerance after giving the valid api key
    Then click on the execute button and check it with out giving the tenant value



  Scenario: checking that sandbox is working correctly after giving the valid api key and tenant value
    When click on the tenant field for giving the tenant value
    Then click the execute button after giving the valid tenant value

  Scenario: checking the internal sandbox provider directory with invalid api key
    When click the provider directory presented in the internaldeveloper sandbox
    Then click on the authorize field in the internaldeveloper sandbox negative scenario
    Then give the valid api key in that field in the internal developer negative
    Then click on the authorize button after giving the valid api key for checking the sandbox negative scenario
    And  click on the into button after giving the invalid api key

  Scenario: checking internal provider directory with insuranceplan
    When click on the insurance internal provider directory for checking the sandbox negative scenario
    Then click on the try it out internal provider directory for checking the sandbox negative scenario
  #Then give the tenant value for hitting sandbox APIs for checking the sandbox negative scenario
    And click on the executebute button in the internal provider directory for checking the sandbox negative scenario



  Scenario: internal developer checking resource with valid approved application api key and left the tenant field as blank
    When internal developer click the applications in dashboard for copying the valid api key
    Then internal developer click approve
    Then internal developer click on the any one of the approved application  application
    Then internal developer copy the valid api key of the approved application
    And  after that internal developer close that application

  Scenario: check thatinternal developer able to give the valid api key of a approved application and left the tenant field  blank
    When internal developer click on the sandbox in the dashbord for giving the valid api key of the approved application
    Then internal developer click on the authorize for giving the valid api key
    Then internal developer give the valid approved application api key
    Then internal developer click on the authorize1 after giving the valid api key of the approved application
    And  internal developer click on the into button after giving the valid api key of the approved application

  Scenario: internal developer checking the device with valid api key and also left the tenant field as blank
    When internal developer click on the device after giving the valid api key
    Then internal developer click on the try it out button inside the device after giving the valid api key
    Then internal developer click on the execute button of the device resorce and check it with out giving the tenant value

  Scenario: internal developer able to check that sandbox is working correctly for the approved application after giving the valid api key and tenant value
    When internal developer click on the tenant field for giving the tenant value and checking the sandbox working
    Then internal developer click the execute button of the device resouce



  Scenario: internaldeveloper tried to logout
    When internal developer click on the signout field
    Then internal developer click the logout field
