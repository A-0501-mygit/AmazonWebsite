package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pagesForAmazon.Delete_Item_fromCart;
import pagesForAmazon.DriverManager;
import pagesForAmazon.LogOut_User;
import pagesForAmazon.Login_User;
import pagesForAmazon.Search_Item;

public class Test_SearchItem extends DriverManager {
	
	@Test(description ="Verify login functionality", priority =1)
	void login_to_application() throws IOException
	{		
		get_Driver();      //driver load
		Login_User obj = new Login_User(driver); //login user 
		obj.clickSignin();
		obj.enterEmail();
		obj.enterPassword();
		
	}
	
	@Test(description = "Verify the product selected in the cart",priority =2)
	void select_product_from_list() throws IOException
	{		//get_Driver();
		Search_Item obj1 =new Search_Item(driver);  //search item
		obj1.getItemDetail();
	  
	}
	@Test(description="clear item from Cart",priority=3)
	void clear_Curt() {
		Delete_Item_fromCart delete=new Delete_Item_fromCart(driver);
		delete.clear_cart();
	}
	
 @Test(description="Signout from Account",priority=4)
  void Select_Signout_from_list() {
  LogOut_User Obj2=new LogOut_User(driver);
   Obj2.Clicksignout();
 }
 
 @AfterTest
 public void closeBrowser() {
	 System.out.println("Close the Browser");
	 driver.quit();
 }
 @AfterSuite
 public void cleanCookies(){
	 System.out.println("Delete Cookies");
	 driver.manage().deleteAllCookies();
	 
 }
 
 
   
 
	  
  }

