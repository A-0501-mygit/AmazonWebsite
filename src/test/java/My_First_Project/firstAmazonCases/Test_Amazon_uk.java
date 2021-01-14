package My_First_Project.firstAmazonCases;
import java.io.IOException;

import org.testng.annotations.Test;

import pagesForAmazon.All_Search_Item;
import pagesForAmazon.BuyAgain;
import pagesForAmazon.DriverManager;

public class Test_Amazon_uk extends DriverManager {
	@Test(groups={"smoke"})
	
	void Select_Amazon_ukoption() throws IOException  {
		get_Driver();
		All_Search_Item search=new All_Search_Item(driver);
		search.Click_All_Item();
	}

	@Test(groups= {"smoke,sanity"})
	void select_any_order() throws IOException
	{
	
		BuyAgain obj2 = new BuyAgain(driver);
		obj2.selectOrder();
		//obj2.typeofSorting();
		obj2.select_Feature();
		//obj2.click_BuyAgain();
		
		
}
	}
//	@BeforeSuite
//	void beforeSuite()
//	{
//		System.out.println("Before suite Annotation");
//	}
//	
//	@BeforeTest
//	void beforeTest() {
//		System.out.println("Before test annotation");
//	}
//	
//	@BeforeClass
//	void beforeClass()
//	{
//		System.out.println("Before class annotation");
//	}
//	
//	@BeforeMethod
//	void beforeMethod()
//	{
//		System.out.println("Before method annotation ");
//	}
//	
//	
	
	
//	@Test
//	void display()
//	{
//		System.out.println("Executing test method from class Test_Amazon_uk");
//	}
	
//	@Test
//	void test()
//	{
//		System.out.println("Executing test method from amazon_uk class");
//	}
	
	
	
//	@AfterMethod
//	void takeScreenshot() throws IOException
//	{
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");  
//	    String formatDateTime = now.format(format);  
//	    TakesScreenshot screenshot = (TakesScreenshot)driver;
//		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(sourceFile,new File("C:\\Eclipse\\Eclipse-Projects\\firstAmazonCases\\screenshot_"+formatDateTime+".png"));
//		
//	//	System.out.println("After method annotation");
//	}
	
//	@AfterClass
//	void afterClass()
//	{
//		System.out.println("After class annotation");
//	}
//	
//	@AfterTest
//	void afterTest()
//	{
//		System.out.println("After test annotation");
//	}
//	
//	@AfterSuite
//	void afterSuite()
//	
//	{
//		System.out.println("After suite annotation");
//	}

	
	


