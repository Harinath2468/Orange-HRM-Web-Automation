
@Logincheck
Feature: OrangeHRM Automation Scenarios

Background: 
	Given launch HRM application

  @LoginValidation
  Scenario: Login Validation and opening timesheet
    Given Logged in with username  and password 
    When I click on timesheets and click on the records
    Then displays record and status submitted
    
   


