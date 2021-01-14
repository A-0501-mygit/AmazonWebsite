package pagesForAmazon;

import java.awt.Checkbox;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox_Handling {
	
//Click on Sell Options	on First Pasge after Loading
@FindBy(linkText="Gift Cards")
WebElement gift_Card;

//select checkbox
@FindBy(xpath="//span[contains(@class,'a-list-item')]")
List<WebElement> check_box;


// Highlight for Format option
@FindBy(xpath="//span[contains(text(),'Format')]")
WebElement format;

//Disable Don't Change options
	@FindBy(xpath="//span[contains(@class,'a-button-text')])[1]")
	WebElement Dont_Change;
	
	@FindBy(id="a-page")
	WebElement page;

 WebDriver driver;

public Checkbox_Handling(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

 public  void sell_Click() {
	 Actions actions=new Actions(driver);
	 if(Dont_Change.isDisplayed()) 
		{
		actions.moveToElement(Dont_Change).click().build().perform();
		actions.moveToElement(gift_Card).build().perform();
		gift_Card.click();
 	}
		else {
	    actions.moveToElement(gift_Card).click();
     
	
	}
 }
	
	public void try_Checkbox() {

        format.getLocation();
	    check_box.get(5);
	if(check_box.listIterator() != null) {
       
			System.out.println("checkbox is toggled on");
			
		}
	else {
			System.out.println("checkbox is toggled off");
		}
	
	page.click();
//	if(!check_box.isSelected()) {
//		System.out.println("check box is now toggled off");		
//		}
	}
}

