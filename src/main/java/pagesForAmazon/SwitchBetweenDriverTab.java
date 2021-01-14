//package pagesForAmazon;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class SwitchBetweenDriverTab {
//	
//	public static WebDriver driver;
//	static String browserType;
//	 
//	 
//	public static WebDriver openBrowser()throws IOException
//		{
//		switch(browserType) {
//		  case"Chrome": 
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\ChromeDriver\\chromedriver.exe");
//			driver= new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.get("https://facebook.com");
//				//return driver;
//				break;
//		case"FireFox":
//				System.setProperty("webdriver.Gecko.driver", "C:\\Users\\AbhiAnj\\Geckodriver.exe");
//			driver= new FirefoxDriver();
//				driver.manage().window().maximize();
//				driver.get("https://amazon.com");
//				break;
//					}
//		return driver;
//		
//		
//		//C:\Users\AbhiAnj\geckodriver.exe
//		
//		
//		}
//
//}
