package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;

public class OrderPlacement {
	
	private WebDriver driver;
	

	
	@Given("user is a guest customer")
	public void user_is_a_guest_customer() {
	    driver = DriverFactory.getDriver();
	}

	@And("user have a product in the cart")
	public void user_have_a_product_in_the_cart() {
		
		StorePage storepage = new StorePage(driver);
	     storepage.addToCart("Blue Shoes");
	    
	}

	@And("user is on the checkout page")
	public void user_is_on_the_checkout_page() {
		new CartPage(driver).proceedToCartButton();
	    
	}

	@When("user provide the billing details")
	public void user_provide_the_billing_details(List<Map<String, String>> billingDetails) {
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		checkoutpage.getFirstName(billingDetails.get(0).get("firstname"));
		checkoutpage.getLastName(billingDetails.get(0).get("lastname"));
		checkoutpage.getAddress(billingDetails.get(0).get("address_line1"));
		checkoutpage.getCity(billingDetails.get(0).get("city"));
		checkoutpage.getState(billingDetails.get(0).get("state"));
		checkoutpage.getPostCode(billingDetails.get(0).get("zip"));
		checkoutpage.getEmail(billingDetails.get(0).get("email"));
		
		
	 
	}

	@And("user places an order")
	public void user_places_an_order() throws InterruptedException {
		Thread.sleep(3000);
		new CheckoutPage(driver).PlaceOrderBtn();
	   
	}

	@Then("user should be able to place an order successfully")
	public void user_should_be_able_to_place_an_order_successfully() {
		
		String Expected1 = "Thank you. Your order has been received.";
		Assert.assertEquals(new CheckoutPage(driver).getSuccessActualText(), Expected1);
	    
	}

}
