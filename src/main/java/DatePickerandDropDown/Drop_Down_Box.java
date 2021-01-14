
package DatePickerandDropDown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drop_Down_Box {
	
	@FindBy(id="orderFilter")
	WebElement selectOrderTime;
	
	//Select country;
	@FindBy(xpath="//div[@id='closeBtn']")
	WebElement close_Btn;
		
	WebDriver driver;

	public Drop_Down_Box(WebDriver driver) {
	 	this.driver=driver;
	 	PageFactory.initElements(driver, this);
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	 	
	 	}
	
	
	public void order_Select() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 	js1.executeScript("window.scrollBy(0,1000)");
	 	//Actions action=new Actions(driver);
		//action.moveToElement(close_Btn);
       // close_Btn.click();
	 	
//	 //	@FindBy(id="orderFilter")
//		WebElement selectOrderTime;
//		Select select = new Select(selectOrderTime);
//		select.selectByVisibleText("2020");
//		
	}
	 		
}
