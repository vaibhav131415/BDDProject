package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.StorePage;

public class BaseClass {
	
	
	

	 public WebDriver driver = null;
    

    @Before
    public void Setup() {
    	
       
            driver = DriverFactory.initializeDriver();
            
            new StorePage(driver).load("/store/");
        }
    

  
    
 

    @After
    public void cleanUp() {
        
        driver.quit();

    }

	

}
