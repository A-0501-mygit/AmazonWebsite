
package DatePickerandDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker  {
	//Locate date and Time
	@FindBy(xpath="//input[contains(@type,'datetime-local')]")
	WebElement date_Box;
	//Locate Submit
	@FindBy(xpath="//input[contains(@type,'submit')]")
	WebElement submit;
	
	@FindBy(xpath="//form[contains(@action,'birthdate.php')]")
	WebElement bday;
	
	WebDriver driver;
	public DatePicker(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
    
	public void enter_Date() 
	{    date_Box.sendKeys("29122020");
	  date_Box.sendKeys(Keys.TAB);
	  date_Box.sendKeys("0345");
       date_Box.sendKeys(Keys.TAB);
	  submit.click();
		
	 
}
}
