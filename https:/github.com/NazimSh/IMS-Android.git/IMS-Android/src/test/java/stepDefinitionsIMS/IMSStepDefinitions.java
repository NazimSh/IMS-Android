package stepDefinitionsIMS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenActionsIMS.IMSAndroidActions;
import screenActionsIMS.IMSLoginScreenActions;
import screenActionsIMS.IMSLogoutScreenActions;
import screenActionsIMS.androidCommonActions;

public class IMSStepDefinitions {
	IMSAndroidActions envoyRPAndroidAction = new IMSAndroidActions();
	androidCommonActions mobileAndroidCommonActions = new androidCommonActions();
	IMSLoginScreenActions mobileLoginScreenActions = new IMSLoginScreenActions();
	IMSLogoutScreenActions mobileLogoutScreenActions = new IMSLogoutScreenActions();
	
	@Given("^Launch IMS App$")
	public void Launch_Envoy_Restaurant_Portal() {
		System.out.println(">>> Launching Android Inventory Management System App");
	}
	@Then("^Click on email field to envoy login$")
	public void Click_on_email_field_to_envoy_login()  {
		mobileLoginScreenActions.TappingOnEmailFieldToEnvoyLogin();
	}
	@Then("^Click on password field to envoy login$")
	public void Click_on_password_field_to_envoy_login() {
		mobileLoginScreenActions.TappingOnPasswordFieldToEnvoyLogin();
	}
	@Then("^Verify envoy text on login page$")
	public void Verify_envoy_text_on_login_page() {
		mobileLoginScreenActions.VerifyEnvoyTextOnLo0ginPage();
	}
	@Then("^Enter email address into email field \"([^\"]*)\"$")
	public void Enter_email_address_into_email(String email)  {
		mobileLoginScreenActions.EnterEmailAddress(email);
	}	
	@Then("^Enter password into password field \"([^\"]*)\"$")
	public void Enter_password_into_password_field(String password) {
		mobileLoginScreenActions.EnterPassword(password);
	}
	@Then("^Tap on Sign In button$")
	public void Tap_on_Sign_In_button() {
		mobileLoginScreenActions.TappingOnSignInButtton();
	}
	@Then("^Click on Maybe later button on Start walkthrough popup window$")
	public void Click_on_Maybe_later_button_on_Start_walkthrough_popup_window() {
		mobileLoginScreenActions.TappingOnMaybeLaterButton();
	}
	@Then("^Click on Got it button on We will remind you walkthrough popup window$")
	public void Click_on_Got_it_button_on_We_will_remind_you_walkthrough_popup_window() {
		mobileLoginScreenActions.TappingOnGotItButtonOnRemiderPage();
	}
	
	@Given("^Login to Envoy Restaurant Portal with valid email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void Login_to_Envoy_Restaurant_Portal_with_valid_email_and_password(String email, String password) throws InterruptedException {
		mobileLoginScreenActions.EnvoyRestaurantPortalLogin(email, password);
	}
	@When("^Verify Wonder logo W$")
	public void Verify_Wonder_logo_W() {
		mobileLoginScreenActions.VerifyWonderLogo();
	}
	@Then("^Verify Inventory Management System$")
	public void Verify_Inventory_Management_System() {
		mobileLoginScreenActions.VerifyInventoryManagementSystem();
	}
	@Then("^Verify Please log in to access your Wonder IMS account$")
	public void Verify_Please_log_in_to_access_your_Wonder_IMS_account() {
		mobileLoginScreenActions.VerifyPleaseLoginToAccessYourWonderIMSAccount();
	}
	@Then("^Verify Log In Button$")
	public void Verify_Log_In_Button() {
		mobileLoginScreenActions.VerifyLoginButtonOnPreloginPage();
	}
	@Then("^Verify App Environemnt$")
	public void Verify_App_Environemnt() {
		mobileLoginScreenActions.VerifyEnvironmentVersionBundleID();
	}
	@Then("^Verify App version$")
	public void Verify_App_version() {
		mobileLoginScreenActions.VerifyEnvironmentVersionBundleID();
	}	@Then("^Verify App Bundle Id$")
	public void Verify_App_Bundle_Id() {
		mobileLoginScreenActions.VerifyEnvironmentVersionBundleID();
	}


	
}
