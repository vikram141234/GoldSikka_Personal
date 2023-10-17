package ExtraTasks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtility.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MoneyWithdrawlTest {

	@Test
	public void withdrawl() throws IOException
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
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
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
		
		try 
		{
			String SuccessAlertMsg = driver.findElement(By.xpath("//div[@class='alert alert-success mb-4 pl-5 pt-5 pb-5']")).getText();
			System.out.println(SuccessAlertMsg);
		} 
		catch (Exception e) 
		{
			String DangerAlertMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
			System.out.println("Transfer already done as per rules"+DangerAlertMsg);
		}
		
		
		
		
	}
}
