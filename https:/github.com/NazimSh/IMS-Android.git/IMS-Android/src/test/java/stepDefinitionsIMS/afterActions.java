package stepDefinitionsIMS;

import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class afterActions {
	@After
	public static void tearDown(Scenario scenario) {
		byte[] screenshotBytes = {};
		final Log log = LogFactory.getLog(afterActions.class.getName());
		AppiumDriver<MobileElement> driver=IMSAppiumAndroidDriverSetup.getDriver();
		log.info(scenario.isFailed());
		

		
		if (scenario.isFailed()) {
			 screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		}
		
		//byte[] fileContent = FileUtils.readFileToByteArray(srcFile);
		String base64File = "data:image/png;base64," + Base64.getEncoder().encodeToString(screenshotBytes);
		try {
			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(base64File);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	IMSAppiumAndroidDriverSetup.tearDown();
	log.info("---------------------");

 }
	}
