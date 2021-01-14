package DropBoxandDatePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod {
	
	
	
	@FindBy(id="pp-TQDusN-101-announce")
	WebElement add_Credit_Debit_Card;
	
	@FindBy(id="pp-V5mD6O-14")
	WebElement cardNumber;
	
	@FindBy(id="pp-V5mD6O-16")
	WebElement nameOnCard;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement addyourCard;
	
	
	WebDriver driver;
	
  public PaymentMethod(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  }
  
 
  public void enter_Card_Detail() throws InterruptedException {
	  driver.switchTo().frame("ApxSecureIframe");
	  Thread.sleep(2000);
	  cardNumber.sendKeys("1122334455667788");
	  nameOnCard.sendKeys("AsdaBank");
	 // Select select=new Select()
	  
  }
}

//html/body/div[5]/div[2]/div[1]/div/div/p/a

//  //*[@id="addres-select"]/div/p/a