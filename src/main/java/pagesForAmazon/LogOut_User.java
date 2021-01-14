package pagesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_User {
	//@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
	@FindBy(xpath="//span[contains(text(),'Hello') and @class='nav-line-1']")
	WebElement Hello;
	@FindBy(xpath="//span[contains(text(),'Sign Out')and @class='nav-text']")
	WebElement Signout;
	WebDriver driver;
	
public LogOut_User(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
 public void Clicksignout() {
	Actions action=new Actions(driver);
	action.moveToElement(Hello).click(Signout);
	 driver.close();
 }
}

