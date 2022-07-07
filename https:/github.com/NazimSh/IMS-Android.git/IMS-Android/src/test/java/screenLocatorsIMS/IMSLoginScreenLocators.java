package screenLocatorsIMS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;

public class IMSLoginScreenLocators {
	public IMSLoginScreenLocators() {
		PageFactory.initElements(IMSAppiumAndroidDriverSetup.driver, this);
	}
	
	//Envoy text on Login page
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"LOGIN_PAGE\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView")
	public WebElement EnvoyTextOnLoginPage;
	
	//Email Field to envoy login
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"email_input_on_login_page\"]")
	public WebElement EmailFieldToEnvoyLogin;
	
	//Password field to envoy login
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"password_input_on_login_page\"]")
	public WebElement PasswordFieldToEnvoyLogin;
	
	//Sign In Button to login
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"login_button_on_login_page\"]")
	public WebElement SignInButton;
	
	//Maybe later button (Start Walkthrough)
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"later_button_on_step_begin_hopup\"]")
	public WebElement MaybeLaterButton;

	//Got It button (We’ill remind you about this walkthrough at a later time)
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"okay_button_on_step_end_hopup\"]")
	public WebElement GotItButtonOnRemiderPage;


	//Got It button for close restaurant
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"okay_button_on_step_end_hopup\"]")
	public WebElement GotItButtonForCloseRestaurant;
	
	//Closed By Envoy Got It button
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
	public WebElement ClosedByEnvoyGotIt;

	
	//Login button for email Login page
	@FindBy(xpath="//android.widget.TextView[@content-desc=\'login_button_on_email_login_page\']")
	public WebElement LoginButtonForEmailLogin;
	
	
	//IMS..........................
	
	//Wonder logo
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	public WebElement WonderLogoOnPreloginPage;
	
	//Inventory Management System text
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement InventoryManagementSystem;
	
	//Please login to access your Wonder IMS account
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement PleaseLoginToAccessYourWonderIMSAccount;
	
	
	//Login button on pre-login page details
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")
	public WebElement LoginButtonOnPreloginPage;
	
	//Environment Version BundleId
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
	public WebElement EnvironmentVersionBundleID;
	
	
	
	
}
