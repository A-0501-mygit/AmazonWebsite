
package Table_Handling;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebTables21 {
	
	@FindBy(xpath="//table/tbody/tr/td[3]")
	List<WebElement>  currentPriceColumns;
	
	
	Double max=0.0;	
	WebDriver driver;
	public WebTables21(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void findMinValue()
	{
		Double min=0.0;
		for(int z=0;z<currentPriceColumns.size();z++)
		{ Scanner s=new Scanner(System.in);
		  int a=s.nextInt();
		  Double value = Double.parseDouble(currentPriceColumns.get(z).getText());
		  
			 		if(value>=min )
			{
				min(currentPriceColumns);
				System.out.println("min value till" +z+"is: " +min);
				
			}
	
			else
			{
				System.out.println("min value till" +z+"is: " +min);			
			}

		
		}
		
		System.out.println("The highest value is:" +min);
	}


	private void min(List<WebElement> currentPriceColumns2) {
		// TODO Auto-generated method stub
		
	}


	
	
}


