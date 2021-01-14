package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pagesForAmazon.DriverManager;
import pagesForAmazon.Select_item;

public class Test_Best_Seller extends DriverManager{
	
	
	@Test(description="verify the item sold")
	void select_BestSeller() throws IOException {
		
	get_Driver();
	Select_item obj = new Select_item(driver);
	obj.Click_Seller();
	 
 }

	
		
	}

