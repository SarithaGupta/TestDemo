#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Attendance
  I want to use this template for my feature file

  #Header Validation
  Scenario: Validating the Attendance Header
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff Clicks on "Attendance" button tab
    Then Admin/User/Staff see header text as "Manage Attendance"

  #Footer Validation
  Scenario: Validating the Attendance Footer
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."

  #Paginator Validation
  Scenario: Validating the Attendance Paginator
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."

  #Paginator Validation
  Scenario: Verify All paginator button on the Attendance page
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled

  #Edit Functionality
  Scenario: Verify the Edit button
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Edit button
    Then Admin see header text as "Attendance Details"

  #Edit Functionality
  Scenario Outline: Edit ProgramName in Attendance Details window
    Given User/Staff Clicks on Edit button
    When User/Staff clicks on Save button after changing program name <ProgramName>
    Then User/Staff see the success message "Updated Successfully"

    Examples: 
      | ProgramName |
      | SDET        |
      | JAVA        |
      | DAML        |
      | SQL         |
      | Angular     |

  #Edit Functionality
  Scenario Outline: Edit User Name Attendance Details window
    Given User/Staff Clicks on Edit button
    When User/Staff clicks on Save button after changing user name <UserName>
    Then User/Staff see the success message "Updated Successfully"

    Examples: 
      | UserName |
      | Meena    |
      | Geetha   |
      | Sita     |
      | Adhira   |
      | Diya     |

  #Edit Functionality
  Scenario: Edit Present in Attendance Details window
    Given User/Staff Clicks on Edit button
    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see the success message "Updated Successfully"

  #Edit Functionality
  Scenario: Edit Absent in Attendance Details window
    Given User/Staff Clicks on Edit button
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff see the success message "Updated Successfully"

  #Edit Functionality
  Scenario: Click on Cancel button in Attendance Details window
    Given User/Staff Clicks on Edit button
    When User/Staff clicks on Cancel button after entering details
    Then User/Staff see a Attendance Details window getting closed

  #Edit Functionality
  Scenario: Admin Verify the Edit button
    Given Admin is on Manage Attendance page
    When Admin Clicks on "Edit" button
    Then Admin see Error Message "Admin Has View Only Permission"

  #Delete Functionality
  Scenario: Verify the Delete Functionality
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Delete button
    Then Admin see header text as "Delete Confirm"

  #Delete Functionality
  Scenario: Click on "Yes" button in Delete Confirm window
    Given User/Staff Clicks on Delete button
    When User/Staff  Clicks on " Yes"  button
    Then User/Staff see the success message "Program Deleted Succesfully"

  #Delete Functionality
  Scenario: Click on "No" button in Delete Confirm window
    Given User/Staff Clicks on Delete button
    When User/Staff  Click on "No" button
    Then User/Staff see the success message "Program Name not deleted"

  #Delete Functionality
  Scenario: Admin Verify the Delete Functionality
    Given Admin is on Manage Attendance page
    When Admin Clicks on "Delete" button
    Then Admin see Error Message "Admin Has View Only Permission"

  #Check Box Functionality
  Scenario: Verifying the Checkbox functionality of a Program Name
    Given Admin/User/Staff is on "Manage Attendance" page
    When Admin/User/Staff Clicks on Checkbox
    Then Admin/User/Staff  see list of Users in that Program

  #Present Functionality
  Scenario: Verifying the Functionality of a Present button
    Given Admin/User/Staff is on "Manage Attendance" page
    When Admin/User/Staff  Clicks on Present
    Then Admin/User/Staff  see the list of "User Name" who are Present

  #Absent Functionality
  Scenario: Verifying the Functionality of a Absent button
    Given Admin/User/Staff is on "Manage Attendance" page
    When Admin/User/Staff  Clicks on Absent
    Then Admin/User/Staff  see the list of "User Name" who are Absent
