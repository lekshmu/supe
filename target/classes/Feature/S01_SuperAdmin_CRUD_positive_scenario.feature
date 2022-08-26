@SuperAdmin_CRUD_positive_scenario
Feature: Verify CRUD operations of Superadmin

   Scenario: Validate that the user is able to view the Welcome page
      Given launches url
      When verify MPH logo
      Then verify infotext below logo
      Then verify infotext below logo
      Then able to click on login button
      And lands on login page
      
      
   Scenario: Validate that the user able to Login as Super Admin with valid credentials
       When Superadmin enters valid email and password
       And hits login button and lands on superadmin page
       
   Scenario: Validate that the Super Admin able to Set Up new Organization
       #Given Superadmin is in admins welcome page
       When Superadmin clicks on create org button
       Then popup should appear for creating org
       And enters org data
       Then clicks on add another address
       And enters address data
       Then clicks on save button
       And navigates to the org page

  Scenario: Validate superadmin able to edit org data
    When Superadmin clicks on org edit icon
    Then popup should appear for editing org
    And updates data
    When clicks on edits save button
    Then should be edited successfully



  Scenario: Validate superadmin able to add address
    When Superadmin clicks on add address icon
    Then popup should appear for adding address
    Then add address data
    And clicks on address save button
    Then adds the address successfully

  Scenario: Validate superadmin able to update org address
    When superadmin clicks on edit icon to update org address
    Then popup should appear to edit address data
    And updates org address
    And clicks on edit org address save button
    Then updation should be successful

  Scenario: Validate superadmin able to add affiliate
    When superadmin clicks on add affiliate button
    Then popup should appear to add affiliate
    And  adds affiliate data
    Then clicks on affiliate save button

  Scenario: Validate superadmin able to edit affiliate
    When Superadmin clicks on edit affiliate icon
    Then popup should appear to edit affiliate
    And Updates affiliate data
    Then Click save changes for updation
    And affiliate edit should be successfull

  Scenario: Validate that SuperAdmin able to add lob
    When Super Admin clicks on LOB tab
    Then SuperAdmin lands on LOB page
    When Super Admin clicks on Add lob
    Then SuperAdmin lands on Add lob page
    When Super Admin enters lob data
    And Clicks on save lob button by Super Admin
    Then lob should be saved successfully

  Scenario: Validate that SuperAdmin able to edit lob
    When Super Admin clicks on an lob
    Then Super admin should be in that LOB page
    When Super Admin hits lob edit icon
    Then Super Admin should be in edit lob page successfully
    And Super Admin edits lob data
    And Once clicks save changes by Super Admin
    Then lob changes should be saved successfully

  Scenario: Validate that SuperAdmin able to add configurations manual
    When Super Admin enters to an lob
    And Clicks on manual add new config
    Then popup should appear to add manual config
    When Enters frequency for manual
    And Batch start and end date and file type
    And Add sequence of ingesion for manual
    And Tries to delete any one of manual
    Then Clicks on add button for saving
    And config should be added successfully

  Scenario: Validate that Super Admin able to edit manual config
    When Clicks on edit config button
    Then popup page should appear to edit manual config
    When Edit data needed
    And Clicks add button for updation
    Then edit data load configuration should be successfull

  Scenario: Validate that Super Admin able to add file sensed data
    When Super Admin clicks on add new config on file sensed
    Then popup should appear to add file config
    When Add resources on file sensed data
    Then file config should be added successfully

  Scenario: Validate that Super Admin able to edit file sensed data
    When Super Admin clicks on edit config on file sensed data
    Then popup page should appear to edit file config
    When Edit data on file sensed dataa
    And Click add button for updation on file sensed data
    Then edit file data load configuration should be successfull

  Scenario: Validate that Super Admin able to add configurations time based
    When Super Admin clicks on add new config time based
    Then popup should appear to add time config
    When Clicks on add resources time based and add resources time based
    And Clicks on add for time based
    Then time config should be added successfully

  Scenario: Validate that Super Admin able to edit time based
    When Super Admin clicks on edit config of time based
    Then popup page should appear to edit time config
    And Edit data on time based
    When Clicks on add for updation of time based
    Then edit time data load configuration should be successfull

  Scenario: Validate that Super Admin able to logout
    When Super Admin clicks Organization button


