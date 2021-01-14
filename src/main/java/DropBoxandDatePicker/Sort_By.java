package DropBoxandDatePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sort_By {
	//Select Sort By feature from dropdown
	@FindBy(id="a-autoid-3-announce")
	  WebElement sort_by_feature;
	
	WebDriver wait;
	WebDriver driver;
	public void sort_ing() {
		//WebElement sort_by_feature=driver.findElement ( By.id ( "a-autoid-3-announce" ) );
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']" ) )).click().build ().perform ();
        driver.findElement ( By.cssSelector ( "#s-result-sort-select_3" ) ).click();
		
	
	}
public Sort_By(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}


//Actions action=new Actions(driver);
//action.moveToElement(sort_by_feature).click();
////	WebDriverWait wait=new WebDriverWait(driver, 20);
//action.moveToElement(sort_by_feature).click();
//Select dropdown=new Select(sort_by_feature);
//dropdown.selectByIndex(3);
//System.out.println(sort_by_feature.getSize());

}
