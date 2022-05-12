package utils;

import java.util.Properties;

public class ConfigLoader {
	
	private final Properties properties;
	private static ConfigLoader configloader;
	
	
	private ConfigLoader() {
		
		properties = PropertyUtils.propertyLoader("src/test/resources/Config.properties");
	}
	
	public static ConfigLoader getInstance() {
		if(configloader == null) {
			configloader = new ConfigLoader();
		}
		
		return configloader;
		
	}
	
	public String getBaseURL() {
		//variable
		String prop = properties.getProperty("baseUrl");
		if (prop != null) {
			return prop;
		}
		else  throw new RuntimeException("property baseURL not found");
	
	}
	
	public String getChromeDriverPath() {
		
		String Chromedriverpath = properties.getProperty("ChromedriverPath");
		if(Chromedriverpath != null) {
			return Chromedriverpath;
		}
		else throw new RuntimeException("Chromedriverpath not found");
		
		
		
	}
	
	public String getFireFoxDriverPath() {
		
		String FirefoxDriverpath = properties.getProperty("FireFoxdriverPath");
		if(FirefoxDriverpath != null) {
			return FirefoxDriverpath;
		}
		else throw new RuntimeException("Chromedriverpath not found");
		
		
		
	}
	

}
