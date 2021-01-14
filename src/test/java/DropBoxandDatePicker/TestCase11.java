package DropBoxandDatePicker;


import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import pagesForAmazon.DriverManager;
import pagesForAmazon.FetchDataFromExcel;
import pagesForAmazon.Login1;
import pagesForAmazon.Login_User;

public class TestCase11 extends DriverManager
{
	@Test()
	void test_Login() throws IOException {
	String testcaseName = "Test1";
	String userName = null,password = null;
	List<String> list = FetchDataFromExcel.getData(testcaseName);
	userName = list.get(1);
	password = list.get(2);
	System.out.println(userName +","+ password);
	get_Driver();
	Login1 login=new Login1(driver);
	login.clickSignin();
	login.enterEmail(userName);
	login.enterPassword(password);
	

}
}
