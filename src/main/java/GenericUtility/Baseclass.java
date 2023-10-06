package GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.DashboardPage;
import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public JavaUtility jUtility=new JavaUtility();
	public WebDriverUtility wUtility=new WebDriverUtility();
	public ExcelFileUtility eUtility=new ExcelFileUtility();
	public PropertyFileUtility pUtility=new PropertyFileUtility();
	
	public WebDriver driver=null;
	public static WebDriver sDriver;
	
	 @BeforeSuite(alwaysRun = true)
		public void bsConfig()
		{
			System.out.println("---Database Connection Successfully---");
		}
	  @BeforeClass 
		public void bcConfig() throws IOException
		{  
			String BROWSER = pUtility.readDataFromPropertyFile("browser");
			String URL = pUtility.readDataFromPropertyFile("url");
			
			
			
			if(BROWSER.equalsIgnoreCase("Chrome"))
			{
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver(options);
				System.out.println("Chrome Browser Launched Successfully");
			}
			else if(BROWSER.equalsIgnoreCase("Firefox"))
			{
				
				FirefoxOptions optionss = new FirefoxOptions();
				optionss.setProfile(new FirefoxProfile());
				optionss.addPreference("dom.webnotifications.enabled", false);

			    
			    WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver(optionss); 
				System.out.println("Firefox Browser Launched Successfully");
			}
			else 
			{
				System.out.println("Invalid Browser");
			}
			sDriver=driver;   //To Take ScreenShot
			wUtility.maximizeTheWindow(driver);
			wUtility.waitUntilPageLoad(driver);
			driver.get(URL);
		}
		
	@BeforeMethod 
		public void bmConfig() throws IOException, Exception
		{
		    String USERNAME = pUtility.readDataFromPropertyFile("loginnum");
			LoginPage lPage=new LoginPage(driver);
			lPage.loginToApplication(USERNAME);
			System.out.println("---Login successfully---");
		}

	@AfterMethod 
		public void amConfig() throws Exception
		{
		    DashboardPage dPage = new DashboardPage(driver);
		    dPage.logoutOfApplication(driver);
		    System.out.println("Logout Successfully");
		}

	@AfterClass 
		public void acConfig()
		{
//			driver.quit();
			System.out.println("Browser Closed Successfully");
		}
	
	
	@AfterSuite 
		public void asConfig()
		{
		System.out.println("---Database Closed Successful---");
		}

}
