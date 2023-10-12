package Sprint_1_Scheme_Subscription;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndividualScriptsLoginBookingAccountDeposit {		
		
		@Test
		public void login()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://stg-new-wallet.goldsikka.com/");
			driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys("9100345025",Keys.ENTER);
		}
	    
		@Test
		public void depositAmountToBookingAccount()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://stg-new-wallet.goldsikka.com/");
			driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys("9100345025",Keys.ENTER);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Booking Account']"))).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("5000");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			WebElement frame = driver.findElement(By.xpath("//div[@class='logo-title-container svelte-mrdos2']"));
			
			driver.switchTo().frame(frame);
			
			driver.findElement(By.xpath("//input[contains(@class,'input-one-click-checkout ph')]")).sendKeys("8686184458");
			
			
			
		}
		
		

}
