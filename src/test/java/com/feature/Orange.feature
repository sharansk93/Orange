@Test
Feature: Orange app

@web
Scenario: Add an employee
Given Launch the url with valid username and pass
When I select fcm and add employee from the dash
Then enter the details and click on submit
