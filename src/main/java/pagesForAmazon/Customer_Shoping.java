package pagesForAmazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Customer_Shoping {
	
	WebDriver driver;
	
	
	//Select Particular Jeans
	@FindBy(xpath="//div/div[2]/h2/a/span")
	List<WebElement> typesofJeans;
 
	//Locate SearchBox
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	//Locate searchButton and click
	@FindBy(xpath="//input[@type='submit' and @tabindex='0']")
	WebElement searchButton; 
	
	
	//Choose 4 star item
	@FindBy(xpath="//span[contains(@class,'a-icon-alt')]")
	WebElement four_Star;
	
	//Select Brand
	@FindBy(xpath="//span[contains(text(),'Our Brands')]")
	WebElement ourBrand;
	
	//For Popular Brand
	@FindBy(xpath="//span[contains(text(),'Popular Brands')]")
	WebElement popular_Brand;
	
	//Select Sort By feature from dropdown
	@FindBy(id="a-autoid-3-announce")
	  WebElement sort_by_feature;
	
	//Multiple Brand Selection
	@FindBy(xpath="//span[contains(text(),'NSQTBA')]")
	WebElement first_Brand_Name;
	@FindBy(xpath="//span[contains(text(),'Moyabo')]")
	WebElement second_Brand_Name;
	
	//Enter MinPrice
	@FindBy(id="low-price")
	WebElement min_Price;
	
	//Enter MaxPrice
	@FindBy(id="high-price")
	WebElement max_Value;
	
	//Choose premium Brand
	@FindBy(xpath="//ul[2]/li[4]/span/a/span")
	WebElement premiumBrand;
	
	
	//Move to Go option
	@FindBy(xpath="//span[3]/span/input)]")
	WebElement go;
	
	
//	//Select Sort By feature from dropdown
//	//@FindBy(id="a-autoid-2-announce")
//	@FindBy(xpath="//*[@id=\"a-autoid-3-announce\"]/select[1]")
//    WebElement sort_by_feature;
	
	
	@FindBy(linkText=("Avg. Customer Review"))
	 WebElement selectionFromDropBox;
	
	
	WebDriverWait wait;
	public Customer_Shoping(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void brand_Detail() {
		if(searchBox.isDisplayed()) {
			   searchBox.sendKeys("womens jeans");
			   searchButton.click();
			   ClickforFourStar();
			   
			   }
	}
	 public void ClickforFourStar() {
			Actions action=new Actions(driver);
			action.moveToElement(four_Star).click(four_Star);
			 
		 }
	public void select_Our_Brand() {	
        ourBrand.click();
		
	}
	public void select_Popular_Brans() {
		popular_Brand.click();
	}
	
	public void sub_Brand_Option_Selection() {
		first_Brand_Name.click();
		second_Brand_Name.click();
	}
	

		public void sort_ing() {
			Actions action=new Actions(driver);
	        action.moveToElement(driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']" ))).click().build ().perform ();
	        driver.findElement ( By.cssSelector ( "#s-result-sort-select_3" ) ).click();
			
	       
		}

	

     public void min_Max() {
    	 min_Price.sendKeys("05");
    	 max_Value.sendKeys("20");
    	// go.sendKeys(Keys.TAB);
    	// go.click();
    	
		
	}
     
     //Method for jeans selection from list
     public void selectJeansfromList()  {
    	
		for(int i=0;i<typesofJeans.size();i++)
    	{
    	//  	System.out.println(typesofJeans.get(i).getText());
    	  	typesofJeans.get(3).click();    	  	
    	}
	
  		
    	}
    	
     
     public void feature_find() {
    	 Actions action=new Actions(driver);
			action.moveToElement(sort_by_feature).click();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			action.moveToElement(sort_by_feature).click();
     }
     
     
	
}
