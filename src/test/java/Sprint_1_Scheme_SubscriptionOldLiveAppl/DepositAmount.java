package Sprint_1_Scheme_SubscriptionOldLiveAppl;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
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

import com.google.j2objc.annotations.Property;

import GenericUtility.BaseClass;
import GenericUtility.ConstantsUtility;
import ObjectRepository.BookingAccountPage;
import ObjectRepository.BookingAccountPhNoFramePage;
import ObjectRepository.LandingPage;
import freemarker.template.utility.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DepositAmount {

	@Test(priority = 1)
	public void yesBankDeposit() throws InterruptedException, Exception, IOException
	{
		FileInputStream fis=new FileInputStream(ConstantsUtility.propertyfilepath);
		Properties prop=new Properties();
		prop.load(fis);
		String URL=prop.getProperty("liveurl");
		String USERNAME=prop.getProperty("usernamee");
		
		FirefoxOptions options = new FirefoxOptions();

        // Create a FirefoxProfile to manage preferences
        FirefoxProfile profile = new FirefoxProfile();

        // Set a preference to allow or deny location access (false to deny)
        profile.setPreference("geo.prompt.testing", true);
        profile.setPreference("geo.prompt.testing.allow", false);

        // Assign the profile to the FirefoxOptions
        options.setProfile(profile);
		
		WebDriverManager.firefoxdriver().setup();
    	WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email / mobile number']")).sendKeys(USERNAME,Keys.ENTER);
		
		LandingPage lPage = new LandingPage(driver);
		System.out.println("Before adding amount to booking account");
		lPage.clickOnBookingAccountLnk(driver);
        
//		lPage.viewBookingAccountBalance(driver);
		
		BookingAccountPage bap = new BookingAccountPage(driver);
		bap.depositMoneyInBookingAccount(driver);
		
		WebElement element = driver.findElement(By.xpath("//iframe[contains(@style,'op')]"));
		driver.switchTo().frame(element);
		
		BookingAccountPhNoFramePage bapnofp = new BookingAccountPhNoFramePage(driver);
		bapnofp.enterPhoneNumberAndYesBankBtnClickOnProceed(driver);
		
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
			System.out.println("Amount Added Successfully From Yes Bank");
		}
		else
		{
			System.out.println("Amount Not Added Successfully");
		}
		driver.switchTo().alert().accept();
		

		System.out.println("After adding amount to booking account");
		lPage.clickOnBookingAccountLnk(driver);
	}
}
