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
		
		String prop = properties.getProperty("baseUrl");
		if (prop != null) {
			return prop;
		}
		else  throw new RuntimeException("property baseURL not found");
	
	}
	
	public String getDriverPath() {
		
		String driverpath = properties.getProperty("driverPath");
		if(driverpath != null) {
			return driverpath;
		}
		else throw new RuntimeException("driverpath not found");
		
		
		
	}
	

}
