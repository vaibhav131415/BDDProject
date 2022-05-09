package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigLoader;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public static WebDriver initializeDriver() {
		
		System.setProperty("webdriver.chrome.driver", ConfigLoader.getInstance().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}

}
