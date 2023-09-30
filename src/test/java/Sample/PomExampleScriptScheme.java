package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericUtility.Baseclass;
import GenericUtility.WebDriverUtility;
import ObjectRepository.LandingPage;

public class PomExampleScriptScheme extends Baseclass{

	@Test
	public void createScheme() throws Exception
	{
		
	
	LandingPage lanp = new LandingPage(driver);
	lanp.clickOnSchemesLnk();
	
	driver.findElement(By.xpath("//img[@src='../../../assets/imgs/goldplus.png']")).click();
	WebElement amount = driver.findElement(By.xpath("//select[@formcontrolname='amount']"));
	amount.click();
	Select s = new Select(amount);
	s.selectByValue("9500");
	WebElement months = driver.findElement(By.xpath("//select[@placeholder='Months']"));
	months.click();
	Select s1 = new Select(months);
	s1.selectByVisibleText("12 Months");
	
//	driver.findElement(By.xpath("//p[.='Use Booking Account']/../..//div/input[@type='checkbox']")).click();
	
	Robot r = new Robot();
	try 
	{
		driver.findElement(By.xpath("//p[.='Use Booking Account']/../..//div/input[@type='checkbox']")).click();
	} 
	catch (Exception e) 
	{
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	driver.findElement(By.xpath("//input[@formcontrolname='enteredWalletAmount']")).sendKeys("9500");
	
//	wait.until(ExpectedConditions.elementToBeClickable
	driver.findElement(By.xpath("//p[.='I Agree to Terms & Conditions']/../..//input[@type='checkbox']")).click();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	
	try 
	{
//		wait.until(ExpectedConditions.elementToBeClickable
	    driver.findElement(By.xpath("//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']")).click();
	} 
	catch (Exception e) 
	{
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	driver.findElement(By.xpath("//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']")).click();
	
//	wait.until(ExpectedConditions.elementToBeClickable
	WebElement element = driver.findElement(By.xpath("//iframe[@id='ssIFrame_google']"));
	
//	WebDriverUtility wUtil = new WebDriverUtility();
//	wUtil.switchToFrame(driver, element);
	driver.switchTo().frame(element);Pending
	
	driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("8686184458");
	
//	driver.findElement(By.xpath("//input[@class='input-one-click-checkout phone-field-one-click-checkout main svelte-dau4sx']")).sendKeys("8686184458");
//	
////	driver.findElement(By.xpath("//div[@class='cta-container has-tooltip svelte-s8db8t reduce-amount-size no-shadow']")).click();
//	
////	driver.findElement(By.xpath("//div[.='Netbanking']")).click();
	
	
	}
}
