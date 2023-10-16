package Sprint_1_Scheme_SubscriptionFinal;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ConstantsUtility;
import GenericUtility.ExcelFileUtility;
import ObjectRepository.BookingAccountPage;
import ObjectRepository.BookingAccountPhNoFramePage;
import ObjectRepository.LandingPage;

public class DataProviderAddingAmountFromDiffBanks extends BaseClass{

    @Test(dataProvider = "excelData")
    public void testWithExcelData(String columnValue) throws InterruptedException
		{
			LandingPage lPage = new LandingPage(driver);
			System.out.println("Before adding amount to booking account");
			lPage.clickOnBookingAccountLnk(driver);
	        
//			lPage.viewBookingAccountBalance(driver);
			
			BookingAccountPage bap = new BookingAccountPage(driver);
			bap.depositMoneyInBookingAccount(driver);
			
			WebElement element = driver.findElement(By.xpath("//iframe[contains(@style,'op')]"));
			driver.switchTo().frame(element);
			
			BookingAccountPhNoFramePage bapnofp = new BookingAccountPhNoFramePage(driver);
			bapnofp.enterPhoneNumberAndClickOnProceed(driver);
			
			WebElement bank = driver.findElement(By.xpath("//div[contains(@id,'bank-item-"+columnValue+"')]"));
			bank.click();
			
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
			Thread.sleep(5000);
			driver.switchTo().window(parentWindow);
			
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	                
	        wait.until(ExpectedConditions.alertIsPresent());
	        
			String AlertMsg = driver.switchTo().alert().getText();
//			System.out.println(AlertMsg+" from "+columnValue+" Bank");
			
			if(AlertMsg.contains("Successfully added Rs"))
			{
				System.out.println(AlertMsg+" from "+columnValue+" Bank");
			}
			else
			{
				System.out.println("Amount Not Added Successfully");
			}
			driver.switchTo().alert().accept();
			

			System.out.println("After adding amount to booking account");
			lPage.clickOnBookingAccountLnk(driver);
		
           
    }
    
    
    
    @DataProvider(name = "excelData")
    public Object[][] testData() {
        String[] columnData = ExcelFileUtility.getSingleColumnData(ConstantsUtility.excelfilepath, "BookingAccount", 0); // Replace '0' with the desired column index.
        Object[][] data = new Object[columnData.length][1];
        for (int i = 0; i < columnData.length; i++) {
            data[i][0] = columnData[i];
        }
        return data;
    }
}


