package My_First_Project.firstAmazonCases;


import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pagesForAmazon.DriverManager;
import pagesForAmazon.FetchDataFromExcel;
import pagesForAmazon.Login_User;

public class Test_Login_User extends DriverManager
{
	@Test(groups= {"smoke,sanity"})
	void existing_Customer_Login() throws Exception {
		get_Driver();
		Login_User login=new Login_User(driver);
		login.clickSignin();
		login.enterEmail();
		login.enterPassword();
	}
	

	@AfterMethod()
	void closeBrowser()
	{
		driver.close();
	}

}
