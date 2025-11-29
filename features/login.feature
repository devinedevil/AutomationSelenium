@login
Feature: Login to the application
Scenario: Login with valid value
Given The user in the login page to login with valid details
When he enters the valid credentials of "lovisfortuner" and "Sudhan@78"
Then he should be able to login to the Home page



Scenario: login with invalid value
Given The user in the login page to login with invalid details
When he enters the invalid credentials "nandhagopal" and "Sudhan@78"
Then he should be not able to login to the Home page
