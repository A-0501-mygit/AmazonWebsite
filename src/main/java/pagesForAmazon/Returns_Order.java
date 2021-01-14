package pagesForAmazon;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Returns_Order {
	@FindBy(xpath="//span[contains(text(),'Returns')]")
	WebElement refund_order;
	//@FindBy(xpath="//*[@id='nav-xshop']/a[1]")
	@FindBy(linkText="Today's Deals")
	WebElement todays_Deals;
	//*[@id="nav-xshop"]/a[1]
	WebDriver driver;
	
	@FindBy(linkText="Deal of the Day")
	WebElement deal_of_Day;
	
	@FindBy(linkText="Lightning Deals")
	WebElement lightning_deals;
	
	
	@FindBy(xpath="//*[@id='widgetFilters']/div[1]/div[2]/span[1]/div/label/input")
			WebElement checkbox;
	
   @FindBy(xpath="//span[contains(@class,'a-label a-checkbox-label')]")
   WebElement Art_Craft;
   
	public void click_Refund_and_Order() {
		
		Actions action=new Actions(driver);
		action.moveToElement(refund_order);
		refund_order.click();
	}
	
	public Returns_Order(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void Click_Todays_Deal() {
		Actions action=new Actions(driver);
		action.moveToElement(refund_order);
		todays_Deals.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(deal_of_Day));
		//deal_of_Day.click();
		wait.until(ExpectedConditions.elementToBeClickable(lightning_deals));
		lightning_deals.click();
		//checkbox.click();
	}
	}

