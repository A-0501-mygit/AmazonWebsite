package pagesForAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_Item_fromCart {
	
	
	@FindBy(id="nav-cart")
	WebElement clear_Cart;
    WebDriver driver;
	public Delete_Item_fromCart(WebDriver driver) 
	{this.driver = driver;
	PageFactory.initElements(driver, this);	}
 public void clear_cart(){
	 clear_Cart.clear();
	 
}
}
