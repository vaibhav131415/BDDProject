package StepDefinitions;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
        features = {"src/resource/java/Features/"},  
        glue = {"StepDefinitions"},
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
       
        publish = true
        
        
)
public class RunnerTest extends AbstractTestNGCucumberTests  {
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
	

}
