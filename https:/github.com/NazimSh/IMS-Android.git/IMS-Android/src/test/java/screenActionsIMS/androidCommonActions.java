package screenActionsIMS;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class androidCommonActions {
	
	public class java {
		
	}
	public androidCommonActions() {
		//TODO Auto-generated constructor stub	
	}
	public void scrollAndClick(String visibleText) {
		IMSAppiumAndroidDriverSetup.getDriver().findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector()");
	}
	public void scrollClick(String exactText) {
		IMSAppiumAndroidDriverSetup.getDriver().findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0).scrollIntoView(new UiSelector()");
	}
	public void ScrollingAndroid() {
		TouchActions action = new TouchActions(IMSAppiumAndroidDriverSetup.getDriver());
		action.scroll(30, 100);
		action.perform();
	}
	public TouchActions down(int x, int y) {
		return down(x, y);
	}
	public TouchActions up(int x, int y) {
		return up(x,y);
	}
	public void ScrollAndSearch(WebElement A) throws InterruptedException {
	if (!(ElementPresent(A))) {
		for (int i = 0; i <= 10; i++) {
			if (!(ElementPresent(A))) {
				SwipeDown();
			} else {
				i = 11;
			}
			
		}
	}
	assertTrue(ElementPresent(A));
	}
public boolean ElementPresent(WebElement a) {
	try {
		IMSAppiumAndroidDriverSetup.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		a.getSize();
		IMSAppiumAndroidDriverSetup.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		return true;
	} catch (NoSuchElementException xe) {
		IMSAppiumAndroidDriverSetup.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		return false;
	}
}
public void SwipeDown() throws InterruptedException {
	Dimension size = IMSAppiumAndroidDriverSetup.getDriver().manage().window().getSize();
	int x = (int) (size.width * .5);
	int y = (int) (size.height * .8);
	int y1 = (int) (size.height * .2);
	@SuppressWarnings("rawtypes")
	TouchAction t = new TouchAction(IMSAppiumAndroidDriverSetup.getDriver());
	t.press(PointOption.point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(x, y1)).release().perform();
	Thread.sleep(1000);
}
public void scrollDownToResetPasswordForText() {
	Dimension dimension = IMSAppiumAndroidDriverSetup.getDriver().manage().window().getSize();
	
	Double scrollHeightStart = dimension.height *0.8;
	int scrollStart = scrollHeightStart.intValue();
	
	Double scrollHeightEnd = dimension.height *0.2;
	int scrollEnd = scrollHeightEnd.intValue();
	
	new TouchAction((PerformsTouchActions) IMSAppiumAndroidDriverSetup.getDriver()).longPress(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd)).release().perform();
}
public List<MobileElement> getResetPassword() {
	return IMSAppiumAndroidDriverSetup.getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\\'VERIFY_ACCOUNT_PAGE\\']/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]"));
}

public void scrollTillResetPassword() throws InterruptedException {
	while (getResetPassword().size() ==0) {
		scrollDownToResetPasswordForText();
	}
	if (getResetPassword().size() > 0) {
		getResetPassword().get(0).isDisplayed();
	}
	Thread.sleep(3000);
}
public void scrollDownToResendcodeForText() {
	Dimension dimension = IMSAppiumAndroidDriverSetup.getDriver().manage().window().getSize();
	
	Double scrollHeightStart = dimension.height *0.8;
	int scrollStart = scrollHeightStart.intValue();
	
	Double scrollHeightEnd = dimension.height *0.2;
	int scrollEnd = scrollHeightEnd.intValue();
	
	new TouchAction((PerformsTouchActions) IMSAppiumAndroidDriverSetup.getDriver()).longPress(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd)).release().perform();
}
public List<MobileElement> getResendCode() {
	return IMSAppiumAndroidDriverSetup.getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\\'VERIFY_ACCOUNT_PAGE\\']/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]"));
}

public void scrollTillResendCode() throws InterruptedException {
	while (getResendCode().size() ==0) {
		scrollDownToResendcodeForText();
	}
	if (getResendCode().size() > 0) {
		getResendCode().get(0).isDisplayed();
	}
	Thread.sleep(3000);
}
public void scrollDownToSushiRestaurant() {
	Dimension dimension = IMSAppiumAndroidDriverSetup.getDriver().manage().window().getSize();
	
	Double scrollHeightStart = dimension.height *0.6;
	int scrollStart = scrollHeightStart.intValue();
	
	Double scrollHeightEnd = dimension.height *0.4;
	int scrollEnd = scrollHeightEnd.intValue();
	
	new TouchAction((PerformsTouchActions) IMSAppiumAndroidDriverSetup.getDriver()).longPress(PointOption.point(0, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd)).release().perform();
}
public List<MobileElement> getRecentActivity() {
	return IMSAppiumAndroidDriverSetup.getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\'Sushi Co restaurant\']/android.widget.TextView[1]"));
}

public void scrollTillSushi() throws InterruptedException {
	while (getRecentActivity().size() ==0) {
		scrollDownToResendcodeForText();
	}
	if (getRecentActivity().size() > 0) {
		getRecentActivity().get(0).click();
	}
	Thread.sleep(3000);
}

public List<MobileElement> getSpecialRequest() {
	return IMSAppiumAndroidDriverSetup.getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\\'special_request_on_meal_detail_page\\']/android.widget.ImageView"));
}

public void scrollTillSpecialRequest() throws InterruptedException {
	while (getSpecialRequest().size() ==0) {
		getSpecialRequest();
	}
	if (getSpecialRequest().size() > 0) {
		getSpecialRequest().get(0).isDisplayed();
	}
	Thread.sleep(3000);
}
public void androidScrollDown() {
	//TODO Auto-generated method stub
	JavascriptExecutor js = (JavascriptExecutor) IMSAppiumAndroidDriverSetup.getDriver();
	HashMap<String, String> scrollObject = new HashMap<String, String>();
	scrollObject.put("direction", "up");
	js.executeScript("mobile: swipe", scrollObject);
}
public void androidScrollDownToElem(WebElement e) {
	// TODO Auto-generated method stub
	String tempElem = e.getAttribute("accessible");
	JavascriptExecutor js = (JavascriptExecutor) IMSAppiumAndroidDriverSetup.driver;
	HashMap<String, String> scrollObject = new HashMap<String, String>();
	scrollObject.put("element", tempElem);
	scrollObject.put("direction", "down");
	js.executeScript("mobile: scroll", scrollObject);
}
public void androidPerformClick(final WebElement e) {
	Actions action = new Actions(IMSAppiumAndroidDriverSetup.driver);
	try {
		action.click(e).perform();
	} catch (Exception exc) {
		exc.printStackTrace();
	}
}
public boolean androidElementPresent(final WebElement e) {
	try {
		return e.isDisplayed();
	} catch (Exception exc) {
		exc.printStackTrace();
		return false;
	}
}
}
