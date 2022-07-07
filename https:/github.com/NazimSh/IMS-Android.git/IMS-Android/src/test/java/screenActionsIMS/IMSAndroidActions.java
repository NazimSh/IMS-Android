package screenActionsIMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;
import screenLocatorsIMS.IMSAndroidScreenLocators;

//public class androidActions extends androidScreenLocators {
	//public void test() {
	//	test.click();
	//}
	
	public class IMSAndroidActions {
		WebDriver driver;
		IMSAndroidScreenLocators envoyLocators = new IMSAndroidScreenLocators();
		androidCommonActions commonActions = new androidCommonActions();

		String tempStr;

		public IMSAndroidActions() {
			this.envoyLocators = new IMSAndroidScreenLocators();
			PageFactory.initElements(new AjaxElementLocatorFactory(IMSAppiumAndroidDriverSetup.driver,  45), envoyLocators);
		}
	
	
	public void TappingOnProfileIcon() throws InterruptedException {
		//Thread.sleep(15000);
		envoyLocators.ProfileIcon.click();
	}
	
	
	public void VerifyProfileIconVisibleUpperleftCorner() {
		envoyLocators.ProfileIcon.isDisplayed();
	}
	
}
