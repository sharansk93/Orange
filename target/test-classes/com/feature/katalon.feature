@Test
Feature: Katalon

Background: Launch and Login
Given launch the URL
When I Login using Username and Password
And Click the Login Button 

Scenario: Book an appoinment
When I Select Hongkong Health centre from the facility
And I select Medicare from Healthcare program
And I select the Visit date and enter the des
And click the book appoinment button
Then capture the message
 
