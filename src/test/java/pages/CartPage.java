package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {


	
	public CartPage(WebDriver driver) {
		super(driver);
		
	}



	@FindBy(css  = "td[class='product-name'] a") private WebElement ActualProductName;
	@FindBy(css =" input[type =\"number\"]") private WebElement ActualQuantity;
	@FindBy(xpath = "//a[normalize-space()='Proceed to checkout']") private WebElement ProceedToCheckout;

	
	
	
	public String getProductName() {
		
		return wait.until(ExpectedConditions.visibilityOf(ActualProductName)).getText();
	}
	
	public int getQuantity() {
		return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(ActualQuantity)).getAttribute("value"));
		
	}
	
	
	
	public void proceedToCartButton() {
		wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckout)).click();
	}
	
	

}
