@SuperAdmin_CRUD_negative_scenario
Feature: Super Admin CRUD operations negative scenarios

Scenario: validate the Welcome page negative scenarios
    Given launches the given welcome page url
    Then lands on welcome page
    And clicks on Login button
    Then lands on users login 

Scenario: validate the super admin not able to signin with invalid credentials
    When super admin left all fields blank
    Then verify validation message
    
    When super admin left any one field blank
    Then verify validation message
    
    When super admin enters invalid email and password
    Then verify validation message
    
    When super admin enters invalid email and valid password
    Then verify validation message
    
    #When super admin enters valid email and invalid password
    #Then verify validation message
    
    When super admin enters valid email and password
    Then login button should not be inactive
    And should only lands on super admin page
    
Scenario: validate super admin not able to create org with duplicate ein and db
    When super admin clicks on setup org
    Then enter org data with duplicate ein and db
    Then save changes
    Then Verify the error msg

Scenario: Validate super admin able to create org usinf diffent db and ein
    When super admin edit the db and ein
    Then click on the save for changes
    And  navigated to org page

Scenario: validate super admin not able perfome edit operation while lefe some fields are blank
    When super admin clicks on edit org button
    Then successfully navigated to the edit org page
    Then edit some fildes and left some fields as blank
    Then click on the save button
    And  verify the validation msgg

Scenario:  validate super admin not able to edit while giving same ein
    When giving ein number which already exist
    Then super admin click on the save button in edit org
    And verify duplicate error msg

    Scenario: Validate super admin able to perfome edit operations while giving valid data
    When super admin give ein data to ein field
    Then click on the save button with valid ein
    And verify edit org successfully done



    #Then enter unique db or ein values
    #Then save changes




    
