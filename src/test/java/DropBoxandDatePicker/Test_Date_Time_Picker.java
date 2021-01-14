package DropBoxandDatePicker;


import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DatePickerandDropDown.DatePicker;



public class Test_Date_Time_Picker extends pagesForAmazon.DriverManager{
	
	
	@Test()
	void date_Entry_Forum() throws Exception
	{ 
		get_Driver();
		DatePicker ele=new DatePicker(driver);
		ele.enter_Date();
				}

}
