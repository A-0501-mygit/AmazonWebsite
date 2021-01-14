package Table_Handling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTable {
	
//Print total no of rows in the table
	@FindBy(xpath  = "//table//tbody/tr")
	List<WebElement> totalRows;
	
	
// Total no of Columns in the table
	@FindBy(xpath = "//table//thead/tr/th")
	List<WebElement> totalColumn;
	
	
//print 6th row and 5th column data	
	@FindBy(xpath = "//table//tbody/tr[6]//td[5]")
	WebElement sixth_Row_data;
	
//Fetch particular rows data	
	@FindBy(xpath="//div[@id='leftcontainer']/table/tbody/tr[4]")  
	WebElement table_row;
	
	//Locate whole table 
	@FindBy(xpath="//div[@id='leftcontainer']/table/tbody")
	WebElement table_structure;
		
	
	//Fetch single column data from table
	@FindBy(xpath = "//table//tbody/tr/td[1]")
	List<WebElement> firstColumnData;
	
	WebDriver driver;
	public WebTable (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	public void total_Rows() {
		
	System.out.println("TotalNo of rows in the table:   " + totalRows.size());
	}
	
	 public void total_Column_Size() {
		 System.out.println("Total number of columns are:    " +totalColumn.size());
	 }

	public void particular_row_data() {
			System.out.println(table_row.getText());
		
	}
	
	public void sixth_fifth_data() {
		System.out.println("Sixth Row Fifth Column data are:   "+sixth_Row_data.getText());
	}
	
	
	
    public void get_Whole_Table_Data() {
	
		System.out.println("The value of all Rows and column:  "+table_structure.getText());
	}
    
    public void getFirstColumnData()
    {
    	for(int i=0;i<firstColumnData.size();i++)
    	{
    	  	System.out.println(firstColumnData.get(i).getText());
    	  	
    	}
    }
	
}


////*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
//table[@class='dataTable'] /thead/tr/th