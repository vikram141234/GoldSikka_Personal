package ExtraTasks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import GenericUtility.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneyWithdrawlTest {

	@Test
	public void TransferToBankAccountFromWallet() throws IOException
	{
		PropertyFileUtility pUtil = new PropertyFileUtility();
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String USERNAME = pUtil.readDataFromPropertyFile("usernamee");
		String URL = pUtil.readDataFromPropertyFile("stgurl");
		
		WebDriver driver = null;
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			
			FirefoxOptions options = new FirefoxOptions();

	        // Create a FirefoxProfile to manage preferences
	        FirefoxProfile profile = new FirefoxProfile();

	        // Set a preference to allow or deny location access (false to deny)
	        profile.setPreference("geo.prompt.testing", true);
	        profile.setPreference("geo.prompt.testing.allow", false);

	        // Assign the profile to the FirefoxOptions
	        options.setProfile(profile);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
		}
		else 
		{
			System.out.println("Invalid");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys(USERNAME,Keys.ENTER);
		driver.findElement(By.xpath("//button[.='Withdraw']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("10000");
		WebElement bankDrpDwnElement = driver.findElement(By.xpath("//select[@formcontrolname='bank_id']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(bankDrpDwnElement));
		bankDrpDwnElement.click();
		
		String Value = driver.findElement(By.xpath("//option[contains(text(),'7015')]")).getText();
		
		
		Select s = new Select(bankDrpDwnElement);
		s.selectByVisibleText(Value);
				
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		
//		try 
//		{
//			String SuccessAlertMsg = driver.findElement(By.xpath("//div[@class='alert alert-success mb-4 pl-5 pt-5 pb-5']")).getText();
//			System.out.println(SuccessAlertMsg);
//		} 
//		catch (Exception e) 
//		{
//			String DangerAlertMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
//			System.out.println("Transfer already done as per rules"+DangerAlertMsg);
//		}
		
		
		try 
		{
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='alert alert-success mb-4 pl-5 pt-5 pb-5']")));
			String SuccessAlertMsg = driver.findElement(By.xpath("//div[@class='alert alert-success mb-4 pl-5 pt-5 pb-5']")).getText();
			System.out.println(SuccessAlertMsg);
		} 
		catch (Exception e) 
		{
			String DangerAlertMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
			System.out.println(DangerAlertMsg);
		    if(DangerAlertMsg.contains("invalid"))
		    {
		    	Assertion a = new Assertion();
				a.fail();
		    }
						
		}
		
		
		
	}
}
