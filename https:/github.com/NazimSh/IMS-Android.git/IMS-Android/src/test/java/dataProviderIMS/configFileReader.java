package dataProviderIMS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {
	private Properties properties;
	private final String propertyFilePath= System.getProperty("user.dir")+"//configs//Configuation.properties";
	
	public configFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
public String getDriverPath(String drvnm) {
	
	String tempDrv = drvnm;
	if (tempDrv =="chrome") {
		String driverPath = properties.getProperty("chromedriverpath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	else if (tempDrv == "phantom") {
		String driverPath = properties.getProperty("phantomjsWindowsPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	else if (tempDrv == "chromeUnx") {
		String driverPath = properties.getProperty("chromedriverUnxpath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
	else if (tempDrv == "phantomunx") {
		String driverPath = properties.getProperty("phantomjsUnixPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file");
	}
	else {
		String driverPath = properties.getProperty("chromedriverpath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("drieverPath not specified in the Configuration.properties file");
	}
}
	
public String getAppium() {
	String Appiumtesting = properties.getProperty("AppiumTesting");
	if(Appiumtesting!= null) return Appiumtesting;
	else throw new RuntimeException("driverPath not specified in the Configuration.properties file");
}
public String getPhantomBrowserDriverPath() {
	String PhantomDriverPath = properties.getProperty("PhantomDriverPath");
	if(PhantomDriverPath!= null) return PhantomDriverPath;
	else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
}
public String getReportPath() {
	String getReportPath = properties.getProperty("reportFilePath");
	if(getReportPath!= null) return getReportPath;
	else throw new RuntimeException("Report Path is not specified in the Configuration.properties file");
}
public String getExcelPath() {
	String getExcelPath = properties.getProperty("testDataXLPath");
	if(getExcelPath!= null) return getExcelPath;
	else throw new RuntimeException("Excel data is not specified in the Configuration.properties file.");
}
public String getExcelName() {
	String getExcelName = properties.getProperty("testDataXLName");
	if(getExcelName!= null) return getExcelName;
	else throw new RuntimeException("Excel dat is not specified in the Configuration.properties file.");
}
public long getImplicitlyWait() {
	String implicitlyWait = properties.getProperty("implicitlyWait");
	if(implicitlyWait!= null) return Long.parseLong("implicitlyWait");
	else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
}
public String getApplicationUrl() {
	String url = properties.getProperty("url");
	if(url!= null) return url;
	else throw new RuntimeException ("url not specified in the Configuration.properties file.");
}
}

