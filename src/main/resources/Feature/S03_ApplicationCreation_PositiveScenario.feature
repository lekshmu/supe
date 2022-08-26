Feature: Application creaton and approval

  Scenario: Validate the home page of internal developer
    Given launches url for checking the internal developer work flow
    Then  int dev successfully navigated to the welcome page
    When  click on login button for checking int dev workflow
    Then  check that internal developer lands on the login page successfully

  Scenario: Validate internaldeveloper logins with valid credentials
    When  internaldeveloper enters valid email and password
    And   hits login button and lands on internaldeveloper page
    Then  check internaldeveloper in the  landing page or not

  Scenario: Validate create application button is clickable
    When internal developer click on create application button
    Then internaldeveloper sucessfully land on the create application page
    And  checking the dashboard button in menus
    And  checking the sandbox button in menus

  Scenario: Validate internal developer able to create first application
    When int dev enter the all required fields
    And  click on save button
    Then application created successfully
    And  close the window
    And  successfully go back the dashboard page

  Scenario: Validate internal developer able to create second application
    When click on create application button in second time
    And int dev enter the data for second application
    And  click on save button for second application
    Then second application created successfully
    And  close the application created window
    And  go back to the home page

  Scenario: Validate internal developer able to create third application
    When click on create application button in third time
    And int dev enter the data for third application
    And  click on save button for third application
    Then third application created successfully
    And  close the window which are coming after application creation
    And  go back to the home page successfully

  Scenario: Validate the created applications are in the pending list
    When internal developer click on the pending button
    Then successfully go to the pending list

  Scenario: Validate internal developer able to logout after creating the applications
    When internal developer click on the logout dropdown button
    When internal developer click on the signout button
    Then verify internal developer logout successfully

  Scenario: Validate Compliance manager able to login
    When compliance manager click on the login button
    Then compliance manager lands on login page

  Scenario: Validate compliance manger able to login
    When compliance manager enters valid email and password
    And hits login button and lands on compliance manager page

  Scenario: Validate that created applications listed in the pending list of compliance manager
    When compliance manager click on the pending button
    Then able to see the applications in the pending list

  Scenario: Validate cm can approve the pending applications
    When click on the created applications
    Then approve the applications
    And click on the Approve list

  Scenario: cm able to deny the application and view in the deny list
    When click on the pending list
    And  click pending application for denying
    Then deny the application
    And click on the approve button
    And click on the deny button

  Scenario: Validate user can after approving the application
    When cm sign logout
    Then cm log out

  Scenario: Validate internal developer login again
    When int dev able to click on login button again
    Then int dev lands on login page

  Scenario: Login as an internal developer
    When given the valid email and password
    And hits login button and lands on superadmin pagee

  Scenario: int dev check that the applications
    When click on the pending button
    And click on the approve button in int dev
    Then click on the deny button in int dev
    And click on the dashboard of int dev






