package Sprint_1_Scheme_Subscription;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtility.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_GoldSuvidha_BuyGold {

	@Test
	public void buyGold() throws Exception
	{
		PropertyFileUtility pUtil = new PropertyFileUtility();
		String URL = pUtil.readDataFromPropertyFile("url");
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String USERNAME = pUtil.readDataFromPropertyFile("usernamee");
		
		WebDriver driver = null;
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("Firefox")) 
		{
			FirefoxOptions options = new FirefoxOptions();
	        FirefoxProfile profile = new FirefoxProfile();
	        profile.setPreference("geo.prompt.testing", true);
	        profile.setPreference("geo.prompt.testing.allow", false);//div[@class='d-flex mb-4 justify-content-between']//button[.=' X ']
	        options.setProfile(profile);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys(USERNAME,Keys.ENTER);
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Gold Suvidha']"))).click();
		
		driver.findElement(By.xpath("//span[.='Buy Gold']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter  Account amount']")).sendKeys("500");
		driver.findElement(By.xpath("//button[@class='proceed-btn']")).click();
		driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("Excellent Product");
		driver.findElement(By.xpath("//label[.='4 stars']")).click();
		driver.findElement(By.xpath("//button[.=' submit ']")).click();
		
		WebElement cancel = driver.findElement(By.xpath("//h3[.=' Thank for your Feedback']/../following-sibling::div//button[.=' X ']"));
		wait.until(ExpectedConditions.elementToBeClickable(cancel));
		cancel.click();
		
		
		
			
		
		
	}
}
