package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigLoader;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);
	}
	
	public void load(String endpoint) {
		
		driver.get(ConfigLoader.getInstance().getBaseURL() + endpoint);
	}
	
	protected WebDriver driver;
	protected WebDriverWait wait;

}
