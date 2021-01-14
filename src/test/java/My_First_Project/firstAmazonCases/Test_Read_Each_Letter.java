package My_First_Project.firstAmazonCases;

import org.testng.annotations.Test;

import pagesForAmazon.DriverManager;
import pagesForAmazon.Login_User;
import pagesForAmazon.read_Word_bylettter;

public class Test_Read_Each_Letter extends DriverManager{
	
	@Test(groups= {"smoke,sanity"})
	void read_each_letter() throws Exception {
		get_Driver();
		Login_User login = new Login_User(driver);
		login.clickSignin();
		login.enterEmail();
		login.enterPassword();
		
		read_Word_bylettter read=new read_Word_bylettter(driver);
		read.read_word();
	}

}
