package pagesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_new_Account {
@FindBy(id="ap_customer_name")
WebElement name;

@FindBy(id="ap_email")
WebElement user_email;

@FindBy(id="ap_password")
WebElement user_password;

@FindBy(id="ap_password_check")
WebElement repeat_password;

@FindBy(id="a-autoid-0")
WebElement create_Amazon_Account;

@FindBy(id="cvf-page-content")
WebElement Otp;

String your_Name="Abc";
String email="Te_st_322@gmail.com";
String password="cba@21";
String repeat_pass_word="cba@21";

WebDriver driver;


public void fill_user_form() {
	name.sendKeys(your_Name);
	user_email.sendKeys(email);
	user_password.sendKeys(password);
	 repeat_password.sendKeys(repeat_pass_word);
	create_Amazon_Account.click();
}
 public Create_new_Account(WebDriver driver) 
 {
	 this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 }
 
}
