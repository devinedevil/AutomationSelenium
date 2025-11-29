
Feature: Check product details
Background: user in the laptop page

Scenario: check available products details  
When he check product details available
Then display it is available


Scenario Outline: check unavailable products details
When he check product details are not available
Then display it is unavailable