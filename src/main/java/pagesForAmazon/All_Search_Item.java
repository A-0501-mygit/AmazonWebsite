package pagesForAmazon;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_Search_Item {
// Amazon Link on firstPage
@FindBy(linkText=("Click here to go to amazon.co.uk"))
WebElement Click_text;

@FindBy(linkText=("£30 - £100"))
WebElement price_option;

// AllElement Object 
@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
  WebElement AllElement;

//AcceptCookies on page
@FindBy(id="sp-cc-accept")
WebElement Accept_Cookies;

//Use for Close button
@FindBy(xpath="//div[contains(@class,'nav-sprite hmenu-close-icon')]")
WebElement cross_button;



//Art& Craft Selection
@FindBy(xpath="//*[@id='hmenu-content']/ul[1]/li[10]/a/div")
WebElement Art_Craft;


 WebDriver driver;
 Actions act;

 public All_Search_Item(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


public void Click_All_Item()  {
	Click_text.click();
	String parentWindow = driver.getWindowHandle();
	System.out.println("parentWindow:" +parentWindow);
	Set<String> set = driver.getWindowHandles();
	System.out.println("set of winsows:" +set.size());
	
	Iterator<String> itr = set.iterator();
	while(itr.hasNext())
	{
		String childWindow = itr.next();
		System.out.println("childWindow:" +childWindow);
		if(!parentWindow.equals(childWindow))
		{
			
		driver.switchTo().window(childWindow);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(Accept_Cookies));
		Accept_Cookies.click();	 
		AllElement.click();
		cross_button.click();
		//wait.until(ExpectedConditions.elementToBeClickable(price_option));
		//price_option.click();
		

			}
	}
}




}
	
		

	
	



