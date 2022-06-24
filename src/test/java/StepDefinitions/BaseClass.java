package StepDefinitions;



import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;


import Constants.UrlEndpoints;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.StorePage;

public class BaseClass {
	
	
	

	 private WebDriver driver;
	 
	 //for using picocontainer create a Testcontext class and add public Webdrriver driver in it and call below
	 //method in hooks and other step def class
	 //public final TestContext context;
		

	//	public BeforeAndAfterhook(TestContext context) {
	//		this.context = context;
	//	}
    

    @Before
    public void Setup(Scenario scenario) {
    	System.out.println("Before : Thread ID : "+ Thread.currentThread().getId() +
    			" Scenario Name : "+ scenario.getName());
       
            driver = DriverFactory.initializeDriver("firefox");	
            
            new StorePage(driver).load(UrlEndpoints.STORE);
        }
    
    
    //To Print the browser in Extent reports
//    base.setDriver();
//    base.setScenario(scenario);
//     Capabilities cap = ((RemoteWebDriver) base.getDriver()).getCapabilities();
//     String browserName = cap.getBrowserName().toLowerCase();
//    scenario.log("browser name: "+browserName);
    

 
    
 

    @After
    public void cleanUp(Scenario scenario) {
    	System.out.println("After : Thread ID : "+ Thread.currentThread().getId() +
    			" Scenario Name : "+ scenario.getName());
        
        driver.quit();

    }

	

}
