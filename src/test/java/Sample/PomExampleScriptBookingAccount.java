package Sample;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import GenericUtility.Baseclass;
import ObjectRepository.BookingAccountPage;
import ObjectRepository.BookingAccountPhNoFramePage;
import ObjectRepository.LandingPage;


public class PomExampleScriptBookingAccount extends Baseclass {
		
		@Test
		public void addingAmountIntoBookingAccount() throws Exception
		{
			LandingPage lanp = new LandingPage(driver);
			lanp.clickOnBookingAccountLnk();
	        
			BookingAccountPage bap = new BookingAccountPage(driver);
			bap.depositMoneyInBookingAccount(driver);
			
			WebElement element = driver.findElement(By.xpath("//iframe[contains(@style,'op')]"));
			driver.switchTo().frame(element);
			
			BookingAccountPhNoFramePage bapnofp = new BookingAccountPhNoFramePage(driver);
			bapnofp.enterPhoneNumberAndClickOnProceed(driver);
			
			String parentWindow = driver.getWindowHandle();
			driver.findElement(By.xpath("//div[@class='redesign-v15-cta-wrapper svelte-s8db8t']")).click();
			
			BookingAccountPhNoFramePage b = new BookingAccountPhNoFramePage(driver);
			
			Set<String> childWindow = driver.getWindowHandles();
					
			for(String childids : childWindow)
			{
				if(!childids.equals(parentWindow))
				{
					driver.switchTo().window(childids);
					driver.findElement(By.xpath("//button[.='Success']")).click();
				}
			}
			driver.switchTo().window(parentWindow);
			
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	                
	        wait.until(ExpectedConditions.alertIsPresent());
	        
			String AlertMsg = driver.switchTo().alert().getText();
			System.out.println(AlertMsg);
			
			if(AlertMsg.contains("Successfully added Rs"))
			{
				System.out.println("Amount Added Successfully");
			}
			else
			{
				System.out.println("Amount Not Added Successfully");
			}
			driver.switchTo().alert().accept();

		}
	}	
