package pagesForAmazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemDescription {
	
	WebDriver driver;
	
	public ItemDescription(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//Select an item from current page
	 @FindBy(xpath="//div/span/a/div/img")
	List<WebElement> dresses;
	
	 @FindBy(id="native_dropdown_selected_size_name_0")
    WebElement size_Drop_Down;
	
	 
	//Select no of quantity
	 @FindBy(id="a-autoid-35-announce")
	 WebElement quantitySelection;
	 
	//Add to Cart
	// @FindBy(id="add-to-cart-button")
	// add-to-cart-button
	 @FindBy(name="submit.add-to-cart")
	 WebElement add_Cart;
	 
	 
	 //Select BuyNow option
	 @FindBy(id="buy-now-button")
	 WebElement byeNow;
	 
	 //Click on proceedto Check out
//	 @FindBy(xpath="//a[contains(@class,'a-button-text a-text-center')]")
	@FindBy(id="hlb-ptc-btn-native")
	 WebElement proceedtoCheckOut;
	
	 public void select_item() {
		 for(WebElement d:dresses) {
		 	System.out.println(d.getSize());
		 }
	 }
	 
	 
 public void size_Select() throws InterruptedException {
	 WebElement sizeBox = driver.findElement(By.name("dropdown_selected_size_name"));
	// WebDriverWait wait = new WebDriverWait(driver, 20);
	// wait.until(ExpectedConditions.visibilityOf(sizeBox));
	 Thread.sleep(3000);
	 Select selectSize = new Select(sizeBox);
	 selectSize.selectByVisibleText("Medium");

		}
	 

 
	 
 public void quantity_Selection() {
		 Select quantity_Select=new Select(quantitySelection);
		 quantity_Select.selectByVisibleText("1");
	 }
	 
public void addingItemtoCart() {
	try {
		add_Cart.click();
}catch(StaleElementReferenceException e) {
	add_Cart.click();
}
}

	public void proceedforCheckOut() {
		proceedtoCheckOut.click();
	}


       
}




