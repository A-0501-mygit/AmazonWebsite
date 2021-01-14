package My_First_Project.firstAmazonCases;

import org.testng.annotations.Test;
import pagesForAmazon.Checkbox_Handling;
import pagesForAmazon.DriverManager;

public class Test_Check_Box_Handler extends DriverManager {
	@Test(description="Checkbox handling")
	
	void check_box_handler() throws Exception
	{ get_Driver();
		Checkbox_Handling obj=new Checkbox_Handling(driver);
		obj.sell_Click();
		//obj.try_Checkbox();
	}

}
