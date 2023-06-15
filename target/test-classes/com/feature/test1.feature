@Test
Feature: Req resource
Scenario: List of resource
Given Hit the URI
And Get request to get list of resouces 
Then get a single resource name and validate the status code