package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesForAmazon.BuyAgain;
import pagesForAmazon.DriverManager;

public class Test_BuyAgain_Order extends DriverManager {
	
	@Test(description="select any order")
	void select_any_order() throws IOException
	{
		get_Driver();
		BuyAgain obj2 = new BuyAgain(driver);
		obj2.selectOrder();
		obj2.select_Feature();
		obj2.select_Buy_again();
	}
	
//	@BeforeClass
//	void buyOrder()
//	{
//		System.out.println("Executingclass annotation from buy order class");
//	}
//	
//	@BeforeMethod
//	void buyOrderMethod()
//	{
//		System.out.println("executing before method from Test_BuyOrder");
//	}
//	@Test
//	void show()
//	{
//		System.out.println("Executing show test method from class Test_BuyOrder ");
//	}
//	
//	@Test()
//	
//	void show1()
//	{
//		System.out.println("executing show1 test method");
//	}
//	
	
}
