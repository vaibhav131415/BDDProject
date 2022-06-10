package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

	public StorePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (css = "a[title='View cart']") private WebElement addToCartLink;
	
	
	
	public void addToCart(String ProductName) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a[aria-label='Add “"+ ProductName +"” to your cart']")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(addToCartLink)).click();
	}
	

}


