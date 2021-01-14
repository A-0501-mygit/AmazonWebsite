package pagesForAmazon;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_item {
	@FindBy(xpath="//a[text()='Best Sellers']")
	WebElement best_Seller;
	WebDriver driver;
	 
	 public Select_item(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}

	public void Click_Seller() {
			best_Seller.click();
	 }

public void click_Do_Change() {
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
	    wait.until(ExpectedConditions.elementToBeClickable(best_Seller));
		
}
}
}
}

