package pagesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyAgain {
	
	@FindBy(linkText ="Buy Again")
	WebElement buy_Again;		
	
	//Click on Next page Element
	@FindBy(xpath="//span[contains(@class,'a-button-inner')][1]")
	WebElement next_Page_Element;
	
	//click on Today's deal
	@FindBy(linkText = "Today's Deals")
	WebElement todayDealsLink;
	
	//Move to SortBy Feature option
	@FindBy(xpath="//span[contains(@class,'a-dropdown-prompt')]")
	WebElement feature;
	
	//Select Discount Low to high
	@FindBy(xpath="//ul/li[4]/a[contains(@class,'a-dropdown-link')]")
	WebElement low_to_High;
	
	//Click on Prime Early Access	
	@FindBy(linkText="Prime Early Access Deals")
	WebElement prime_Early_Access;
	
	@FindBy(xpath="//span[8]/div/label/span")
	WebElement Camera;
	
	
	WebDriverWait wait;
	WebDriver driver;
	
	public BuyAgain(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	public void select_Feature() {
	feature.click();
	wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(Camera));
	Camera.click();
	wait.until(ExpectedConditions.elementToBeClickable(prime_Early_Access));
	prime_Early_Access.click();
	}
	
	
	public void selectOrder()
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(todayDealsLink));
		todayDealsLink.click();
		
	}
	
	public void click_BuyAgain() {
		buy_Again.click();
	}
	
	@FindBy(id="dropdown-2209362731647715")
	WebElement type_Sorting;
	
 public void typeofSorting() {
// Select selectFeature = new Select(type_Sorting);
// wait = new WebDriverWait(driver, 20);
//	 selectFeature.selectByVisibleText("Price - High to Low");
//	
//	 Actions action=new Actions(driver);
//     action.moveToElement(driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']" ))).click().build ().perform ();
//     driver.findElement ( By.cssSelector ( "#dropdown-48447526967746346_4" ) ).click();
//	

}

public void select_Buy_again() {
	// TODO Auto-generated method stub
	
}
}