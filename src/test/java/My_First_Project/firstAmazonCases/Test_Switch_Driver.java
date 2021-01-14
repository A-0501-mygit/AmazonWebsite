//package My_First_Project.firstAmazonCases;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//import pagesForAmazon.SwitchBetweenDriverTab;
//public class Test_Switch_Driver extends SwitchBetweenDriverTab{
//	public static WebDriver driver;
//	static String browserType;
//	@Test(description ="Select_Driver")
//	public static WebDriver openBrowser()
//		{
//		
//		switch(browserType) {
//		  case"Chrome": 
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\ChromeDriver\\chromedriver.exe");
//			driver= new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.get("https://facebook.com");
//				
//		case"FireFox":
//				System.setProperty("webdriver.Gecko.driver", "C:\\Users\\AbhiAnj\\\\Geckodriver.exe");
//			driver= new FirefoxDriver();
//				driver.manage().window().maximize();
//				driver.get("https://amazon.com");
//				
//					}
//		return driver;
//		//C:\Users\AbhiAnj
//		
//		}
//
//
//}
