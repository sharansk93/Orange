@Test
Feature: sauce app
Scenario: place an order
Given Launch the url using valid username "standard_user" and password "secret_sauce"
When I add a product to the cart and click on cart button
And Check out button is clicked
And customer details are filled and click on continue button
Then place the order and validate the message
