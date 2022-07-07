package screenActionsIMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;
import screenLocatorsIMS.IMSAndroidScreenLocators;
import screenLocatorsIMS.IMSLoginScreenLocators;

//public class loginScreenActions extends loginScreenLocators {
	
	public class IMSLoginScreenActions {
		WebDriver driver;
		IMSLoginScreenLocators loginLocators = new IMSLoginScreenLocators();
		androidCommonActions commonActions = new androidCommonActions();

		String tempStr;

		public IMSLoginScreenActions() {
			this.loginLocators = new IMSLoginScreenLocators();
			PageFactory.initElements(new AjaxElementLocatorFactory(IMSAppiumAndroidDriverSetup.driver,  30), loginLocators);
		}
		
	public void VerifyEnvoyTextOnLo0ginPage()  {
			loginLocators.EnvoyTextOnLoginPage.isDisplayed();
			//Thread.sleep(20000);
	}
	public void TappingOnEmailFieldToEnvoyLogin()  {
		loginLocators.EmailFieldToEnvoyLogin.click();
		//Thread.sleep(5000);
	}
	public void EnterEmailAddress(String email) {
		//loginLocators.EmailFieldToEnvoyLogin.click();
		//Thread.sleep(5000);
		loginLocators.EmailFieldToEnvoyLogin.sendKeys(email);
	}
	public void TappingOnPasswordFieldToEnvoyLogin()  {
		loginLocators.PasswordFieldToEnvoyLogin.click();
		//Thread.sleep(5000);
	}
	public void EnterPassword(String password) {
		loginLocators.PasswordFieldToEnvoyLogin.sendKeys(password);
	}
	public void TappingOnSignInButtton() {
		loginLocators.SignInButton.click();
	}
	public void TappingOnMaybeLaterButton() {
		loginLocators.MaybeLaterButton.click();
	}
	public void TappingOnGotItButtonOnRemiderPage() {
		loginLocators.GotItButtonOnRemiderPage.click();
		loginLocators.GotItButtonForCloseRestaurant.click();
		//loginLocators.GotItButtonForCloseRestaurant.click();
		loginLocators.ClosedByEnvoyGotIt.click();
	}

	
	public void TappingOnLoginButton() {
		loginLocators.LoginButtonForEmailLogin.click();
	}

	public void EnvoyRestaurantPortalLogin(String email, String password) throws InterruptedException {
		loginLocators.EmailFieldToEnvoyLogin.sendKeys(email);
		loginLocators.PasswordFieldToEnvoyLogin.sendKeys(password);
		Thread.sleep(5000);
		loginLocators.SignInButton.click();
		Thread.sleep(5000);
		loginLocators.MaybeLaterButton.click();
		Thread.sleep(5000);
		loginLocators.GotItButtonOnRemiderPage.click();
	}
	public void VerifyWonderLogo() {
		loginLocators.WonderLogoOnPreloginPage.isDisplayed();
	}
	public void VerifyInventoryManagementSystem() {
		loginLocators.InventoryManagementSystem.isDisplayed();
	}
	public void VerifyPleaseLoginToAccessYourWonderIMSAccount() {
		loginLocators.PleaseLoginToAccessYourWonderIMSAccount.isDisplayed();
	}
	public void VerifyLoginButtonOnPreloginPage() {
		loginLocators.LoginButtonOnPreloginPage.isDisplayed();
	}
	public void VerifyEnvironmentVersionBundleID() {
		loginLocators.EnvironmentVersionBundleID.isDisplayed();
	}

	
}
