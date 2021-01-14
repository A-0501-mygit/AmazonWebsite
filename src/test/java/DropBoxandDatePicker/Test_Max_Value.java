package DropBoxandDatePicker;
import java.io.IOException;

import org.testng.annotations.Test;

import bsh.ParseException;
import pagesForAmazon.DriverManager;
import pagesForAmazon.FIndMinValueFromTable;

public class Test_Max_Value extends DriverManager {
	@Test()
	void find_max_value() throws IOException, ParseException {
		get_Driver();

		FIndMinValueFromTable obj = new FIndMinValueFromTable(driver);
		obj.findMaxValue();
		//WebTables21 obj9 =new WebTables21(driver);
		//obj9.findMinValue();
		
		
	}

}
