package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pagesForAmazon.ItemDescription;
import pagesForAmazon.Login_User;
import pagesForAmazon.screenshot;
import pagesForAmazon.Customer_Shoping;
import pagesForAmazon.DriverManager;

public class Test_Customer_Shoping extends DriverManager{
	
	@Test(description="Search Jean in search box")
	 	void searchby_Customer() throws Exception {
		get_Driver();
		
		Customer_Shoping obj=new Customer_Shoping(driver);
		obj.brand_Detail();
		obj.select_Our_Brand();  
		
	}
@ Test()
void sub_Brand_Selection() throws InterruptedException, IOException  {
	Customer_Shoping obj2=new Customer_Shoping(driver);
    obj2.sub_Brand_Option_Selection();
    obj2.min_Max();
    obj2.feature_find();
	obj2.sort_ing();
  	obj2.selectJeansfromList();
  	
  	ItemDescription obj_Select_Item=new ItemDescription(driver);
  	obj_Select_Item.size_Select();
  	obj_Select_Item.addingItemtoCart();
  	obj_Select_Item.proceedforCheckOut();
  	
  	
	Login_User login=new Login_User(driver);
	login.enterEmail();
    login.enterPassword();
    
    //screenshot shot=new screenshot();
   // shot.demo_screenshots();
}

}


//@Test()
//void payment_process()
//{
//	Login_User login=new Login_User(driver);
//	login.enterEmail();
//	login.enterPassword();
//	
//
//}
//}

