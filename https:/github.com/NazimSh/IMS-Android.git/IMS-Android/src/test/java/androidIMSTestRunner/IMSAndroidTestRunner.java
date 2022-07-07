package androidIMSTestRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

//@CucumberOptions(
//		plugin = {"json:target/positive/cucumber1.json", "pretty", "html:target/positive/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter"},
//				features = "src/test/resources/androidFeatureFiles",
//				glue = "androidStepDefinitions",
//				tags = {"@Test"}
//		        ,monochrome = true
//		)


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/IMSFeatureFiles"},
        plugin = {"json:target/cucumber1.json","pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //plugin = {"pretty","json:target/cucumber.json"},
     //   plugin = {"html:target/cucumber-html-report", "jason:target-cucumber-reports/cucumber.json", "junit:target-cucumber-reports.xml", "com.aventstack.extent-reports.cucumber.adapter.ExtentCucumberAdapter:"},
        //tags = {"@Sanity"},
        //tags = {"@Demo"},
       // tags = {"@Test"},     		
       // tags = {"@Regression"},
       tags = {"@IMDPreLoginDetails"},
        // tags = {"@EnvoyNavigationMenu"},
       //tags = {"@EnvoySetStatus"},
       //   tags = {"@EnvoyMyOrders"},
       // tags = {"@EnvoyItemsMenu"},
       // tags = {"@EnvoyMyOrders"},
      //  tags = {"@EnvoyChangePassword"},
      // tags = {"@EnvoyOrderHistory"},
       // tags = {"@EnvoyChangeSupport"},
       // tags = {"@EnvyLogout"},
        		
        glue={"stepDefinitionsIMS"},
        monochrome = true
        // dryRun = true
        
        )
public class IMSAndroidTestRunner {
//
//public class androidMobileTestRunner extends AbstractTestNGCucumberTests{
//	public static String fileNameFinal = "Default";
//	dataProvider.configFileReader configFileReader;
//	
//	@BeforeClass
//	public static void setup() {
//		dataProvider.configFileReader configFileReader;
//		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
//		Date curDate = new Date();
//		String strDate = sdf.format(curDate);
//		
//		configFileReader = new dataProvider.configFileReader();
//		System.out.println(System.getProperty("user.dir"));
//		String fileName = System.getProperty("user.dir")+configFileReader.getReportPath()+ strDate+".html";
//		System.out.println(fileName);
//		
//		fileNameFinal =fileName;
//		
//		File newFile = new File(fileName);
//		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
//		ExtentCucumberFormatter.LoadConfig(new File("src/test/resouces/extent-config.xml"));
//		//User can add the system information as follows
//		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firfox");
//		ExtentCucumberFormatter.addSystemInfo("Broser version", "v31.0");
//		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.o");
//		
//		//Also you can add system information using a hash map
//		Map systemInfo = new HashMap();
//		systemInfo.put("Cucumber Version", "v1.2.3");
//		systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
//		ExtentCucumberFormatter.addSystemInfo(systemInfo);
//		
//	}

}
