Feature: Envoy Restaurant Portal Android Login feature

@Regression @Sanity @Auto @EnvoyLogin 
Scenario Outline: Verify Android Envoy Restaurant Portal login
Given Launch Envoy Restaurant Portal
When Verify envoy text on login page
#Then Click on email field to envoy login
Then Enter email address into email field "<UserID>"
#And Click on password field to envoy login
And Enter password into password field "<Password>"
And Tap on Sign In button 
And Click on Maybe later button on Start walkthrough popup window
#And Click on Got it button on We will remind you walkthrough popup window


Examples:
|UserID|Password|
|nazim@remarkablefoods.com|abcd1234|


@Regression @Sanity @Auto @EnvoyLogin
Scenario Outline: Verify Android Envoy Restaurant Portal login
Given Launch Envoy Restaurant Portal
When Verify envoy text on login page
#Then Click on email field to envoy login
Then Click on password field to envoy login
#Then Verify Welcome Back for phone login
#And Verify LOGIN WITH EMAIL
#And Tap on LOGIN WITH EMAIL
#And Enter email address into email "<UserID>"
#And Enter password into password field "<Password>"
#And Tap on login button 
#And Tap on profile icon visible upper left corner


Examples:
|UserID|Password|
|nazim@remarkablefoods.com|abcd1234|