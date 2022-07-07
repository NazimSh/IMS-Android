package stepDefinitionsIMS;

import appiumIMSDriverSetup.IMSAppiumAndroidDriverSetup;
import cucumber.api.java.Before;

public class beforeActions {
	@Before
	public static void seUp() {
		IMSAppiumAndroidDriverSetup.setUpDriver();
	}

}
