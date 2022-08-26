Feature: check the working of compliaince manager sandbox positive scenarios

  Scenario: Verify compliance manager able to click on the login button
    Given compliance manager launches the url
    Then  compliance manager successfully navigated to welcome page
    When  compliance manager clicks on login button
    And   compliance manager lands on the login page

  Scenario: Verify compliance manager can successfully login
    When  compliance manager enters the login id and password
    And   compliance manager hits on the login button
    Then  compliance manager navigated to home page successfully

  Scenario: Verify sandbox is working for pending applications
    When  compliance manager click on pending button
    And   click the pending application
    And   copy the api key for pending application
    Then  close the application window

  Scenario: compliance manager authorize the api key
    When  compliance manager click the sandbox
    And   compliance manager click the authorize button
    And   give the api key
    And   compliance manager click authorize button after giving api key
    Then  close the window in compliance manager

  Scenario: compliance manager checking the encounter resource
    When click the encounter resource
    And  click on the try it out button
    And  give the tenant value
    Then click on the execute button
    Then verify the encounter sandbox success msg

  Scenario: compliance manager check the immunization resource
    When compliance manager click the immunization
    And  click on the try it out button for immunization
    And  give the tenant value for immunization
    And  click the execute button for checking immunization
    Then verify for immunization response

  Scenario: Verify sanbox is working in the provider directory
    When compliance manager click the provider directory field
    Then click on the authorize button in provider directory
    And  give the api in provider directory
    And  click the authorize button in provider directory
    And  close the authorize window

  Scenario: Verify compliance manager getting success responce in endpoint resource
    When click on the endpoints resource in provider directory
    Then click on the try it out button in provider directory
    And  give the tenant value for endpoints resource
    And  click on the execute button in provider directory
    And  check the sandbox response

  Scenario: go back to the application approve and then check thesandbox
    When click on the application cmsa
    Then click on the approved application cmsa
    Then click on the first applications cmsa
    Then get the api key cmm second
    Then close the applications cmm scecond

  Scenario: Scenario: get the tha api key for cm scecond
    When click on the sandbox cm scecond
    Then click on the authorize cm scecond
    Then give the value cm scecond
    Then click on the authorize1 cm scecond
    Then click on the into button cm scecond


  Scenario: checking cm scecond
    When click on the encounter cm scecond
    Then click on the try it out cm scecond
    Then give the text cm scecond
    Then click on the execute cm  scecond


  Scenario: checking another patient cm api
    When click on the patient cm api
    Then click on the try it out patient cm
    Then give the text patient cm
    Then click on the execute patient cm

  Scenario: checking the complaince sandbox provider directory for approved applications
    When click on the sandbox cm ap provider directory
    Then click on the authorize cm ap provider directory
    Then give the value cm ap provider directory
    Then click on the authorize1 cm ap provider directory
    Then click on the into button cm ap provider directory

  Scenario: checking cm provider directory with healthcareservice
    When click on the endpoints cm ap provider directory healthcareservice
    Then click on the try it out cm ap provider directory healthcareservice
        #And click on the tenat cm provider directory
    Then give the text provider cm ap directory healthcareservice
    Then click on the execute cm ap provider directory healthcareservice
    Then go back to the dashobard complaince secondd
