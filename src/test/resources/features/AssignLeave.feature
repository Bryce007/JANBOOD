#Author: bryce@syntax.com

Feature: AssignLeave 

Background: 
Given I am already logged in 

Scenario: 
When I click on leave and Assignleave 
And I enter "Robert Craig" 
And I select "FMLA US" 
Then Balance of "50" should be present for employee
And I select calendar "From Date"  
And I select calendar "To Date" that doesn’t exceed "50" days 
Then I should see that the leave balance has changed based on how many days that was taken