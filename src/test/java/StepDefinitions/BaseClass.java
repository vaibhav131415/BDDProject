package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constants.UrlEndpoints;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.StorePage;

public class BaseClass {
	
	
	

	 private WebDriver driver;
    

    @Before
    public void Setup(Scenario scenario) {
    	System.out.println("Before : Thread ID : "+ Thread.currentThread().getId() +
    			" Scenario Name : "+ scenario.getName());
       
            driver = DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
            
            new StorePage(driver).load(UrlEndpoints.STORE);
        }
    

  
    
 

    @After
    public void cleanUp(Scenario scenario) {
    	System.out.println("After : Thread ID : "+ Thread.currentThread().getId() +
    			" Scenario Name : "+ scenario.getName());
        
        driver.quit();

    }

	

}
