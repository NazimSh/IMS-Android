Feature: Envoy Restaurant Portal Android Logout

@Regression @Sanity @Auto @EnvyLogout
Scenario Outline: Verify Android Envoy Restaurant Portal navigation menu details list
Given Launch Envoy Restaurant Portal
When Login to Envoy Restaurant Portal with valid email "<UserID>" and password "<Password>"
And Verify navigation menu icon
Then Verify Account
And Tap on Account
And Verify Logout
And Tap on Logout
And Verify Are your sure you want to logout
And Verify You will not be able to view orders from customers while logged out
And Verify Cancel button to logout
And Verify Confirm to logout
And Tap on Confirm to logout

Examples:
|UserID|Password|
|nazim@remarkablefoods.com|abcd1234|