package StepDefinitions;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.StorePage;


public class AddToCart{
	private WebDriver driver;

	
	
	
	
	
	@Given("user is on the store page")
	public void user_is_on_the_store_page() {
		driver = DriverFactory.getDriver();
	    String actual = driver.getTitle();
	    String expected = "Products – AskOmDch";
	    Assert.assertEquals(actual, expected);
	    
	    
	}
	
	@When("user adds {string} to the cart")
	public void user_adds_to_the_cart(String ProductName) {
		
		
		new StorePage(driver).addToCart(ProductName);
	   
	}

	@Then("user should see {int} {string} in the cart")
	public void user_should_see_in_the_cart(int Quantity, String ProductName) {
		
		CartPage cartpage = new CartPage(driver);
		Assert.assertEquals(cartpage.getProductName(), ProductName);
		
		Assert.assertEquals(Quantity, cartpage.getQuantity());
		
	   
	}
	
	



	

}
