package pagesForAmazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Item {
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	
	
	@FindBy(xpath="//div/h2/a/span")
	List<WebElement> choose;
	
	@FindBy(xpath="//span[contains(@class,'a-size-base')][1]")
	WebElement fiveTier;
	
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	
	@FindBy(xpath="//input[@type='submit' and @tabindex='0']")
	WebElement searchButton; 
	
	WebDriver driver;
	WebDriverWait wait;

	//*[@id="search"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/h2/a/span
  public Search_Item(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
 public void getItemDetail() {
	  
	/* wait = new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.elementToBeClickable(searchBox));
	 searchBox.sendKeys("bookshelf");
	   searchButton.click();
	   int totalNoOfProducts = choose.size();
	   System.out.println("totalNoOfProducts:" +totalNoOfProducts);
	   choose.get(2).click();
	   addToCart.click();
	  // wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(searchBox));*/
		 
	   
	 if(searchBox.isDisplayed()) {
	   searchBox.sendKeys("bookshelf");
	   searchButton.click();
	   int totalNoOfProducts = choose.size();
	   System.out.println("totalNoOfProducts:" +totalNoOfProducts);
	   choose.get(3).click();
	 // ((WebElement) choose).click();
	   fiveTier.click();
	    addToCart.click();
	 }
	 else {
		 System.out.println("search box not found");
	 }
	  
  }
  
  
}
	
