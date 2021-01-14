package My_First_Project.firstAmazonCases;
import java.io.IOException;
import org.testng.annotations.Test;
import pagesForAmazon.DriverManager;
import pagesForAmazon.Login_User;
import pagesForAmazon.Returns_Order;

public class Test_Refund_Order extends DriverManager{
	
	@Test(description="Select Refund and Order item")
	
	void select_Refund() throws IOException {
		get_Driver();
		Returns_Order object_Refund=new Returns_Order(driver);
		object_Refund.click_Refund_and_Order();
		Login_User login=new Login_User(driver);
		login.enterEmail();
		login.enterPassword();
		}
	@Test(description="Select on Today's deal")
	
		void select_Todays_Deal() {
		Returns_Order object_Refund=new Returns_Order(driver);
		object_Refund.Click_Todays_Deal();
	}
}
