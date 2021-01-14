
package DropBoxandDatePicker;
import org.testng.annotations.Test;
import pagesForAmazon.DriverManager;

public class Test_DropBox_Selection extends DriverManager{
	
@Test(description="Select country from DropBox")
 
void dropbox_Selection() throws Exception {
	get_Driver();
	DatePickerandDropDown.Drop_Down_Box abc=new DatePickerandDropDown.Drop_Down_Box(driver);
	abc.order_Select();
}
}
