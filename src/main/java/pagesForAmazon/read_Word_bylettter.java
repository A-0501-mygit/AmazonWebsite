package pagesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class read_Word_bylettter {
	@FindBy(xpath="//span[text()='Hello, A']")
	WebElement extract_Word;
	
	WebDriver driver;
	

	public read_Word_bylettter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void read_word() {
	//String typedText = driver.findElements(extract_Word).getAttribute("value");
	//typedText.getAttribute(Str);
	String words[]=extract_Word.getText().split(",");	
	for(int i=0;i<words.length;i++) 
	{//String s=words[i];
	System.out.println("string is:" +words[i]);
		
	}
	}
	
			
	}

	
	

