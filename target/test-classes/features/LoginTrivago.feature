Feature: location Functionality

Scenario: Validate location textfield functionality

Given Open the trivago app
When user enter location
Then location should be accepted


Scenario: Validate dates calender

When user click on dates textfield
Then Calender should be displayed
When user select one date
Then Selected date should displayed