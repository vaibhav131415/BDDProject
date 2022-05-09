package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "billing_first_name") private WebElement FirstName;
	@FindBy(id = "billing_last_name") private WebElement LastName;
	@FindBy(id = "billing_address_1") private WebElement Address;
	@FindBy(id = "billing_city") private WebElement City;
	@FindBy(id = "select2-billing_state-container") private WebElement StateField;
	@FindBy(xpath = "//input[@role='combobox']") private WebElement StateFieldSearchBox;
	@FindBy(id = "billing_postcode") private WebElement PostCode;
	@FindBy(id = "billing_email") private WebElement Email;
	@FindBy(id = "place_order") private WebElement PlaceOrder;
	@FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']") private WebElement SuccessActualText;
	
	public void getFirstName(String billingFirstName) {
		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(FirstName));
		e.clear();
		e.sendKeys(billingFirstName);
	}
	
	public void getLastName(String billingLastName) {
		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(LastName));
		e.clear();
		e.sendKeys(billingLastName);
	}
	
	public void getAddress(String billingAddress) {
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(Address));
		e.clear();
		e.sendKeys(billingAddress);
		
	}
	
	public void getCity(String billingCity) {
		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(City));
		e.clear();
		e.sendKeys(billingCity);
		
	}
	
	public void getState(String billingState) {
		wait.until(ExpectedConditions.elementToBeClickable(StateField)).click();
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(StateFieldSearchBox));
		e.sendKeys(billingState);
		e.sendKeys(Keys.ENTER);
		
	}
	
	public void getPostCode(String billingPostCode) {
		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(PostCode));
		e.clear();
		e.sendKeys(billingPostCode);
		
	}
	
	public void getEmail(String billingEmail) {
		
		WebElement e = wait.until(ExpectedConditions.elementToBeClickable(Email));
		e.clear();
		e.sendKeys(billingEmail);
	}
	
	public void PlaceOrderBtn() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(PlaceOrder)).click();
	}
	
	public String getSuccessActualText() {
		return wait.until(ExpectedConditions.visibilityOf(SuccessActualText)).getText();
		
		
	}
	
	
	
	

	
	
	
	
	
	
}
