package pagesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Customer_Service  
{
	@FindBy(linkText ="Buy Again")
	WebElement buy_Again;		
	
	//Selection of Customer Service
 	@FindBy(linkText="Customer Service")
	WebElement customer_Service;
 	
 	@FindBy(id="orderFilter")
	WebElement selectOrderTime;
 	
 	//Click on Your Order
 	@FindBy(xpath="//div[contains(@class,'a-column a-span9 a-span-last')][1]")
 	WebElement your_Order;
 	
 	//Enter email
 	@FindBy(id="ap_email")
	WebElement emailTextBox;
 	
 	//Enter password
 	@FindBy(name="password")
	WebElement passwordText;
 	
 	//Click on Signin
 	@FindBy(id="signInSubmit")
	WebElement submitButton;
 	
 	//Clicking Continue
 	@FindBy(id="continue")
	WebElement continueButton;
 	
 	//Disable Don't Change options
 		@FindBy(xpath="(//span[contains(@class,'a-button-text')])[1]")
 		WebElement Dont_Change;
 		
 //Select on Digital_Order
 		@FindBy(linkText="Digital Orders")
 		WebElement digital_Order;
 			
 	WebDriver driver;
 	
 	public Handle_Customer_Service(WebDriver driver) 
 	{
      this.driver=driver;
      PageFactory.initElements(driver, this);
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      
 	}
 	public void click_customer_Service() 
 	{
 		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Dont_Change));
		Actions actions = new Actions(driver);
		if(Dont_Change.isDisplayed()) 
		{
			
		actions.moveToElement(Dont_Change).click().build().perform();
		actions.moveToElement(customer_Service).build().perform();
		customer_Service.click();
    	}
		else {
	    actions.moveToElement(customer_Service);
        
 		
 	}
}
 	public void check_yourOrder() {
 		your_Order.click();
 		
 	}
 	
 	String username = "ANJANA.PAUL@OUTLOOK.COM";
	String password = "tvswego";
	
	public void enterEmail()
	{
		emailTextBox.sendKeys(username);
		continueButton.click();
	}
	
		
	public void enterPassword()
	{
		passwordText.sendKeys(password);
		submitButton.click();
	}
	public void select_digital() {
     digital_Order.click();	
      
		Select select = new Select(selectOrderTime);
		select.selectByVisibleText("2020");
	}
}
