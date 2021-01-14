package pagesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signIn;
	
	@FindBy(id="ap_email")
	WebElement emailTextBox;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement passwordText;
	
	@FindBy(id="signInSubmit")
	WebElement submitButton;
	
	@FindBy(id="attach-close_sideSheet-link")
	WebElement Close;
	
	WebDriver driver;
	
	public Login1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickSignin()
	{
		signIn.click();
	}
	
	public void enterEmail(String userName)
	{
		emailTextBox.sendKeys(userName);
		continueButton.click();
	}
	
	public void enterPassword(String password) {
		passwordText.sendKeys(password);
		submitButton.click();
	}
	
	
		

	

}
