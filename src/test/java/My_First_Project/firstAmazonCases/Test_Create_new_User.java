package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pagesForAmazon.Create_new_Account;
import pagesForAmazon.DriverManager;
import pagesForAmazon.New_User_Create;

public class Test_Create_new_User extends DriverManager{
	@Test
	void Create_new_User_login() throws IOException {
		get_Driver();
		New_User_Create newobj=new New_User_Create(driver);
		newobj.click_Start_here();
		Create_new_Account acctobj= new Create_new_Account(driver);
		acctobj.fill_user_form();
	}

}
