package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtility.Baseclass;
import GenericUtility.WebDriverUtility;
import ObjectRepository.DashboardPage;
import ObjectRepository.LandingPage;
import ObjectRepository.SchemesPage;
import ObjectRepository.Schemes_GoldplusplanPage;

public class PomExampleScriptScheme extends Baseclass {

	@Test
	public void createScheme() throws Exception  {
	
		
	LandingPage lanp = new LandingPage(driver);
	lanp.clickOnSchemesLnk();
	
	SchemesPage sPage = new SchemesPage(driver);
	sPage.subscribeAScheme();
	
	Schemes_GoldplusplanPage sgPage = new Schemes_GoldplusplanPage(driver);
	sgPage.goldplusPlanSubscription(driver);
	
	DashboardPage dPage = new DashboardPage(driver); //Power button element problem wanted to check 
	dPage.clickOnPowerBtn(driver);  //alert not coming due to browser change and power button not working have to find again in dashboard page
/*	
	driver.findElement(By.xpath("//img[@src='../../../assets/imgs/goldplus.png']")).click();
	WebElement amount = driver.findElement(By.xpath("//select[@formcontrolname='amount']"));
	amount.click();
	Select s = new Select(amount);
	s.selectByValue("9500");
	WebElement months = driver.findElement(By.xpath("//select[@placeholder='Months']"));
	months.click();
	Select s1 = new Select(months);
	s1.selectByVisibleText("12 Months");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	Robot r = new Robot();
	for(;;)
	{
	try 
	{
		driver.findElement(By.xpath("//p[.='Use Booking Account']/../..//div/input[@type='checkbox']")).click();
	    break;
	} 
	catch (Exception e) 
	{
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	}
	
	
	driver.findElement(By.xpath("//input[@formcontrolname='enteredWalletAmount']")).sendKeys("9500");
	
	driver.findElement(By.xpath("//p[.='I Agree to Terms & Conditions']/../..//input[@type='checkbox']")).click();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	
	
	while(true)
	{
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']"))).click();
		    break;
		} 
		catch (Exception e) 
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
	}
*/    
	
	
	
/*	WebElement ele = driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));

	driver.switchTo().frame(ele);

	driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("8686184458");
	
	driver.findElement(By.xpath("//div[@class='cta-container has-tooltip svelte-s8db8t reduce-amount-size no-shadow']")).click();
	
	driver.findElement(By.xpath("//div[.='Netbanking']")).click();
	
	driver.findElement(By.xpath("//label[@for='bank-radio-ICIC']")).click();
	
	String ParentWin = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//div[@class='redesign-v15-cta-wrapper svelte-s8db8t']")).click();
	
	Set<String> ChildWin = driver.getWindowHandles();
	
	for(String Childid : ChildWin)
	{
		if(!Childid.equals(ParentWin))
		{
			driver.switchTo().window(Childid);
			driver.findElement(By.xpath("//button[.='Success']")).click();
		}
	}
	
	driver.switchTo().window(ParentWin);
    
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
    System.out.println(wait1.until(ExpectedConditions.alertIsPresent()).getText());
*/			
			

	
	
	
	}}


