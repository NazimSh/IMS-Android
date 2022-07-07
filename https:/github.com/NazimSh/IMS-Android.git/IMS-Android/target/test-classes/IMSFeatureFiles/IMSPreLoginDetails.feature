Feature: IMS Pre-login page details

@Regression @Sanity @Auto @IMDPreLoginDetails
Scenario Outline: Verify Android IMS Pre-login page details
Given Launch IMS App
When Verify Wonder logo W
Then Verify Inventory Management System
And Verify Please log in to access your Wonder IMS account
And Verify Log In Button
And Verify App Environemnt
And Verify App version
And Verify App Bundle Id

Examples:
|UserID|Password|
|nazim@wonder.com|abcd1234|