package GenericUtility;

import java.io.IOException;import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ObjectRepository.LoginPage;
import ObjectRepository.DashboardPage;
/**
 * This Class consists of all Basic Configuration Annotations
 */
public class BaseClassOld {

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
//    @Parameters("BROWSER")      //This is only for crossbrowser
//	  @BeforeTest                 //This is to launch browser at Test Level. We Can Also launch browser at Test Level        //Only AfterTest For CrossBrowser Exe
	  @BeforeClass //(groups={"SmokeSuite","RegressionSuite"})
		public void bcConfig(/*String BROWSER/*only for cross browser*/) throws IOException
		{  // have to comment Browser in down and give in args it will read browser from xml suite file
			String BROWSER = pUtility.readDataFromPropertyFile("browser");
			String URL = pUtility.readDataFromPropertyFile("url");
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			if(BROWSER.equalsIgnoreCase("Chrome"))
			{
				
				driver=new ChromeDriver(options);
				System.out.println("Chrome Browser Launched Successfully");
			}
			else if(BROWSER.equalsIgnoreCase("Firefox"))
			{
				driver=new FirefoxDriver(); 
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
		
	@BeforeMethod //(groups={"SmokeSuite","RegressionSuite"})
		public void bmConfig() throws IOException
		{
		    String USERNAME = pUtility.readDataFromPropertyFile("username");
			LoginPage lPage=new LoginPage(driver);
			lPage.loginToApplication(USERNAME);
			System.out.println("---Login successfully---");
		}

	@AfterMethod //(groups={"SmokeSuite","RegressionSuite"})
		public void amConfig()
		{
		    DashboardPage dPage=new DashboardPage(driver);
//			dPage.clickOnPowerBtn(driver);
			System.out.println("Logout Successfully");
		}
//	@AfterTest  //View Details at Before Class Annotation
	@AfterClass //(groups={"SmokeSuite","RegressionSuite"})
		public void acConfig()
		{
			driver.quit();
			System.out.println("Browser Closed Successfully");
		}
	
	
	@AfterSuite //(groups={"SmokeSuite","RegressionSuite"})
		public void asConfig()
		{
		System.out.println("---Database Closed Successful---");
		}
	
}
