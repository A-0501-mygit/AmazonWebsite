package My_First_Project.firstAmazonCases;
import java.io.IOException;
import java.sql.DriverManager;

import org.testng.annotations.Test;

import pagesForAmazon.BuyAgain;
import pagesForAmazon.Handle_Customer_Service;

public class TestCases_CustomerService_Handling extends pagesForAmazon.DriverManager
{
 @Test()
 void customerService_Handler() throws Exception {
	 get_Driver();
	  Handle_Customer_Service hCS=new Handle_Customer_Service(driver);
	  hCS.click_customer_Service();
 }
 
 @Test(description="Click on Your Order")
 void order_Handler() {
	 Handle_Customer_Service handl_Order=new Handle_Customer_Service(driver);
	 handl_Order.check_yourOrder();
	 handl_Order.enterEmail();
	 handl_Order.enterPassword();
	 BuyAgain again=new BuyAgain(driver);
	 again.click_BuyAgain();
 }
	

 

 
 @Test(description="Select Digital Order")
 void select_Digital_Order() {
	 Handle_Customer_Service digital=new Handle_Customer_Service(driver);
	 digital.select_digital();
 }
  

}
