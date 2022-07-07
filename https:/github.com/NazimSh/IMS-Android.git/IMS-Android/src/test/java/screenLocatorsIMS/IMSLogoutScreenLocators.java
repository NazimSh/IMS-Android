package screenLocatorsIMS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;

public class IMSLogoutScreenLocators {
	public IMSLogoutScreenLocators() {
		PageFactory.initElements(IMSAppiumAndroidDriverSetup.driver, this);
	}
	@FindBy(id="test2")
	public WebElement test2;

}
