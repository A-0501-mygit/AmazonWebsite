package pagesForAmazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot 
{
	public static WebDriver driver;
	public static WebDriver amazon() throws IOException
	{
		FileInputStream inputStream = new FileInputStream(new File("C:\\Eclipse\\Eclipse-Projects\\AmazonCasesPractice\\src\\main\\java\\pagesForAmazon\\config.properties"));
		Properties prop = new Properties();
		prop.load(inputStream);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("www.amazon.com"));
		 return driver;}
	public void demo_screenshots() throws IOException {
      TakesScreenshot ts=(TakesScreenshot)driver;
      File source=ts.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(source, new File("./screenshot/shopping.png"));
	}
     
	}



