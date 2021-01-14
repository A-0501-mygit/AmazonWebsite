package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pagesForAmazon.DriverManager;
import pagesForAmazon.ItemDescription;

public class Test_Add_Cart extends DriverManager {
	@Test()
	void item_Description_Selection() throws Exception 
	{
		get_Driver();
	ItemDescription obj1=new ItemDescription(driver);
	obj1.select_item();
	obj1.size_Select();
	obj1.quantity_Selection();
			
	}
	
  @Test()
  void addtoCart() {
	  ItemDescription obj2=new ItemDescription(driver);
	  obj2.addingItemtoCart();
	  
}
}
	


