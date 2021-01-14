
package Table_Handling;
import java.io.IOException;

import org.testng.annotations.Test;
import pagesForAmazon.DriverManager;


public class Test_WebTable extends DriverManager 
{
	@Test(description="Webtable Elements")	
	void web_Table() throws Exception {
		 get_Driver();
	WebTable table=new WebTable(driver);
	 table.total_Rows();	
	 table.total_Column_Size();
     table.particular_row_data();
	 table.sixth_fifth_data();
	}
	@Test(description="Print Whole table Structure")
	 void table_static_full_Structure() throws IOException {
	get_Driver();
		WebTable struct_table=new WebTable(driver);
		
	struct_table.get_Whole_Table_Data();
//		
		
}
	
	@Test(description = "get first column data")
	void first_column_data() throws IOException
	{
		get_Driver();
		WebTable obj = new WebTable(driver);
		obj.getFirstColumnData();
	}
}