package ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericUtility.WebDriverUtility;

public class Schemes_GoldplusplanPage {
   
    //Business Libraries

	public void goldplusPlanSubscription(WebDriver driver) throws Exception
	{
				
		Select s = new Select(AmountDrpDwn);
		s.selectByValue("1000");
		Select ss = new Select(MonthsDrpDwn);
		ss.selectByVisibleText("12 Months");
		UseBookingAccountCheckBox.click();
		EnterAmountEdt.sendKeys("1000");
		TermsAndConditionsCheckBox.click();
		
		while(true)
		{
			try 
			{
				WebDriverUtility wUtil = new WebDriverUtility();
				wUtil.waitForElementToBeVisible(driver, StartSubscriptionBtn);
				StartSubscriptionBtn.click();
			    break;
			} 
			catch (Exception e) 
			{
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_PAGE_DOWN);
			}
		}
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(AfterClickOnStartSubscriptionBtnFrame));
		
		driver.switchTo().frame(AfterClickOnStartSubscriptionBtnFrame);
		
		MobileNumberEdt.sendKeys("8686184458");
		ProceedBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(NetBankingLnk));
		NetBankingLnk.click();
		
		KotakBankLnk.click();
		
		//If bank server issue will arise uncomment below code
//		try 
//		{
//			if(BankServerIssueLnk.isDisplayed())
//			{
//				String ServerIssue = BankServerIssueLnk.getText();
//				System.out.println(ServerIssue);
//				BankServerIssueContinueBtn.click();	
//			}
//		} 
//		catch (Exception e) 
//		{
//			driver.navigate().forward();
//		}
		
		
		String ParentWin = driver.getWindowHandle();
		PayNowBtn.click();
		Set<String> ChildWin = driver.getWindowHandles();
		
		for(String Childid : ChildWin)
		{
			if(!Childid.equals(ParentWin))
			{
				driver.switchTo().window(Childid);
//				WindowSuccessBtn.click();
			}
		}
		driver.switchTo().window(ParentWin);
		
		
		
		//If success alert arise then uncomment below code
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
