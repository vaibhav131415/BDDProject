package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.appium.java_client.gecko.GeckoDriver;
import utils.ConfigLoader;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver initializeDriver(String browser) {
		WebDriver driver;
		switch (browser) {
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", ConfigLoader.getInstance().getChromeDriverPath());
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        break;
		
			
		 case "firefox" :
			System.setProperty("webdriver.gecko.driver", ConfigLoader.getInstance().getFireFoxDriverPath());
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        break;
	        
	     default:
	    	 throw new IllegalStateException("Invalid Browser" + browser);
		}
		
		DriverFactory.driver.set(driver);
		return driver;
		
        
	}
	
	public static WebDriver getDriver() {
		
		return driver.get();
	}

}
