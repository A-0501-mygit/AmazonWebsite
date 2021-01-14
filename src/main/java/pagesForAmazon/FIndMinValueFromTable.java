package pagesForAmazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FIndMinValueFromTable {
	
	@FindBy(xpath="//table/tbody/tr/td[3]")
	List<WebElement>currentPriceColumns;
	
	Double max=0.0;
	WebDriver driver;
	
	public FIndMinValueFromTable(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void findMaxValue()
	{
		for(int i=0;i<currentPriceColumns.size();i++)
		{
			Double value = Double.parseDouble(currentPriceColumns.get(i).getText());
			if(value > max)
			{
				max=value;
				System.out.println("max value till" +i+"is: " +max);
				
			}
			
			else
			{
				System.out.println("max value till" +i+"is: " +max);			
			}
		}
		
		System.out.println("The highest value is:" +max);
	}
	
	

}
