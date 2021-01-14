package pagesForAmazon;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_User {
	
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
	
	public Login_User(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
		
	String username = "ANJANA.PAUL@OUTLOOK.COM";
	String password = "tvswego";
	
	
	
	public void clickSignin()
	{
		signIn.click();
	}
	
	public void enterEmail()
	{
		emailTextBox.sendKeys(username);
		continueButton.click();
	}
	
	public void enterPassword() {
		passwordText.sendKeys(password);
		submitButton.click();
	}
	
	
		

}
