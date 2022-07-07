package appiumIMSDriverSetup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class IMSAppiumAndroidDriverSetup {
	public static AppiumDriver<MobileElement> driver;
	public static void setUpDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 3 XL API R");
		//caps.setCapability("udid", "deviceUdid");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("automationName", "UIAutomator2");
		//caps.setCapability("appPackage", "com.remarkablefoods.vendorUAT");
		//caps.setCapability("appActivity", "com.remarkablefoods.vendor.MainActivity");
		caps.setCapability("app", "/Users/nazimushaik/Downloads/app-releaseQA.apk");
		//caps.setCapability("noReset", "true");
		caps.setCapability("autoAcceptAlerts", true);
		
		try {
			//AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
			driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
			//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			//appiumAndroidDriverSetup.driver=driver;
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
			}
		public static AppiumDriver<MobileElement> getDriver() {
			return driver;
			
		}
		public static void quit() {
			if (((AppiumDriver)driver) != null){
			try {
				((AppiumDriver)driver).closeApp();
				((AppiumDriver)driver).quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver = null;
			}
		}
		public static void tearDown() {
			if (((AppiumDriver)driver) !=null) {
				try {
					((AppiumDriver)driver).closeApp(); //Close the app which was provided in the capabilities at session creation
					((AppiumDriver)driver).quit(); //quits the session created between the client and the server
				} catch (Exception e) {
					e.printStackTrace();
				}
				driver = null;
			}
		}
	}

