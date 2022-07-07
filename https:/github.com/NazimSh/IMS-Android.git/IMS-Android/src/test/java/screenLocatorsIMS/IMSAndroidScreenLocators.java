package screenLocatorsIMS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;

public class IMSAndroidScreenLocators {
	public IMSAndroidScreenLocators() {
		PageFactory.initElements(IMSAppiumAndroidDriverSetup.driver, this);
	}
	
	//NEW Orders tab
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"PAID\"]")
	public WebElement NewOrders;
		
	//Profile Icon
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\'profile button\']")
	public WebElement ProfileIcon;
	
	
	

	
}
