package pagesForAmazon;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	public static WebDriver driver;
	public static WebDriver get_Driver() throws IOException
	{
		
		String currentProjectPath = System.getProperty("user.dir");
		FileInputStream inputStream = new FileInputStream(new File(currentProjectPath+"\\src\\main\\java\\pagesForAmazon\\config.properties"));
		Properties prop = new Properties();
		prop.load(inputStream);
		System.setProperty("webdriver.chrome.driver", currentProjectPath+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		//driver.get(prop.getProperty("DropTableURL"));
        //driver.get(prop.getProperty("DatePickerUrl"));
		//driver.get(prop.getProperty("WebTableURL"));
		return driver;

	}
	
	
}