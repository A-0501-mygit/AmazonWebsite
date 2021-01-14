//package pagesForAmazon;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class ShippingDetails {
//	
//	//Click on New Shipping
//	@FindBy(linkText="enter a new shipping address")
//	WebElement newShippingAddress;
//	
//	//Select Country
//	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId")
//	WebElement countrySelection;
//	
//	//Enter Full  Name
//	@FindBy(id="address-ui-widgets-enterAddressFullName")
//	WebElement fullname;
//	
//	//Enter mobileno
//	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
//	WebElement mobileNo;
//	
//	 WebDriver driver;
//	
//	 public ShippingDetails(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	}
//
//	public void new_Shhipping_Address() {
//		  newShippingAddress.click();
//		 
//	  }
//	
//	public void full_Name() {
//		fullname.sendKeys("Sas Peter");
//		mobileNo.sendKeys("12345879");
//	}
//	 //Remove Existing Address
//	@FindBy(xpath="//span[contains(@class,'a-button-inner')]")
//	WebElement remove1;
//	
//	@FindBy(linkText=("Remove"))
//	WebElement remove2;
//	
//	public void removeExistingAddress() {
//		remove1.click();
//		remove2.click();
//	}
//	
//	
//	 public void selectCountryfromDropDown() {
////		 WebDriverWait wait = new WebDriverWait(driver, 20);
////		 wait.until(ExpectedConditions.visibilityOf(newShippingAddress));
//		 Select country=new Select(countrySelection);
//		 country.deselectByVisibleText("Belize");
//		 
//	 }
//
//}
