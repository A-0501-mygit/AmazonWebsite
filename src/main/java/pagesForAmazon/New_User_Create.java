package pagesForAmazon;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_User_Create {
	
	//Locate HelloBox
	@FindBy(xpath="//*[@id='nav-link-accountList']/div/span")
	WebElement hellobox;
	
	
	//Click Start Here option
		@FindBy(linkText="Start here.")
	WebElement startHere;
	
	//Disable Don't Change options
	@FindBy(xpath="(//span[contains(@class,'a-button-text')])[1]")
	WebElement Dont_Change;
	 WebDriver driver;
	
	//-------------------------------------------------------------------------------------------------------------------------------
//	 @FindBy (id="ap_customer_name")
//	 WebElement name;
//	 
//	 
//	 @FindBy(id="ap_email")
//	 WebElement user_email;
//	 
//	 @FindBy(id="ap_password")
//	 WebElement user_password;
//	 
//	 @FindBy(id="ap_password_check")
//	 WebElement repeat_password;
//	 
//	 @FindBy(id="a-autoid-0")
//	 WebElement create_Amazon_Account;
//
//	 String your_Name="Abc";
//	 String email="abc@gmail.com";
//	 String password="cba@21";
//	 String repeat_pass_word="cba@21";

//---------------------------------------------------------------------------------------------------------------------------------------
   
	
	public New_User_Create(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void click_Start_here()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Dont_Change));
		Actions actions = new Actions(driver);
		if(Dont_Change.isDisplayed()) 
		{
			
		actions.moveToElement(Dont_Change).click().build().perform();
		actions.moveToElement(hellobox).build().perform();
		startHere.click();
    	}
		else {
	    actions.moveToElement(hellobox).click(startHere);
        
	
	}

	}

}
