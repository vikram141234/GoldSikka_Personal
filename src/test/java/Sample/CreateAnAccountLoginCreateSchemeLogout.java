package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAnAccountLoginCreateSchemeLogout {

	@Test
	public void createAnAccountLoginCreateSchemeLogout() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stg-new-wallet.goldsikka.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys("9100345025",Keys.ENTER);
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Schemes']"))).click();
		
//		driver.findElement(By.xpath("//span[.='Schemes']")).click();
		
		driver.findElement(By.xpath("//img[@src='../../../assets/imgs/goldplus.png']")).click();
		WebElement amount = driver.findElement(By.xpath("//select[@formcontrolname='amount']"));
		amount.click();
		Select s = new Select(amount);
		s.selectByValue("9500");
		WebElement months = driver.findElement(By.xpath("//select[@placeholder='Months']"));
		months.click();
		Select s1 = new Select(months);
		s1.selectByVisibleText("12 Months");
		
//		driver.findElement(By.xpath("//p[.='Use Booking Account']/../..//div/input[@type='checkbox']")).click();
		
		Robot r = new Robot();
		try 
		{
			driver.findElement(By.xpath("//p[.='Use Booking Account']/../..//div/input[@type='checkbox']")).click();
		} 
		catch (Exception e) 
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
		
		driver.findElement(By.xpath("//input[@formcontrolname='enteredWalletAmount']")).sendKeys("5000");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[.='I Agree to Terms & Conditions']/../..//input[@type='checkbox']"))).click();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']"))).click();
		} 
		catch (Exception e) 
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
		
		driver.findElement(By.xpath("//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']")).click();
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input-one-click-checkout phone-field-one-click-checkout main svelte-dau4sx']"))).sendKeys("8686184458");
		
		driver.findElement(By.xpath("//input[@class='input-one-click-checkout phone-field-one-click-checkout main svelte-dau4sx']")).sendKeys("8686184458");
		
//		driver.findElement(By.xpath("//div[@class='cta-container has-tooltip svelte-s8db8t reduce-amount-size no-shadow']")).click();
		
//		driver.findElement(By.xpath("//div[.='Netbanking']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']")).click();
		
//		driver.switchTo().alert();	
//		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("8686184458");
		
//		driver.findElement(By.xpath("//div[@class='cta-container has-tooltip svelte-s8db8t reduce-amount-size no-shadow']")).click();
		
//		driver.findElement(By.xpath("//div[.='Netbanking']")).click();
	//	driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("");
		
		
//     All elements are related to this script			
		
//		driver.findElement(By.xpath("//span[.=' Coupon List ']")).click();
//		WebElement page = driver.findElement(By.xpath("//div[@class='ant-modal-body ng-tns-c69-3']"));//pending
		
		
//		driver.switchTo();
//		driver.findElement(By.xpath("//span[.='Schemes']")).click();
//		driver.findElement(By.xpath("//span[.='Schemes']")).click();
//		driver.findElement(By.xpath("//span[.='Schemes']")).click();
//		driver.findElement(By.xpath("//span[.='Schemes']")).click();
	}
}
