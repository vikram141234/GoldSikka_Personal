package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoForLogout {

	@Test
	public void loginLogout() throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stg-new-wallet.goldsikka.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys("9100345025",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-tns-c50-1'])[5]")).click();
		driver.switchTo().alert().accept();
		
	}
}
