package Sprint_1_Adding_Amount_In_Booking_Account__HardCoding;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.command.PullImageCmd;

import GenericUtility.PropertyFileUtility;
import ObjectRepository.DashboardPage;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class Demo_LoginBookingAccountDepositMoney {
        
//		@Test
//		public void addingAmountToWallet() throws InterruptedException, Exception {
		
		public static void main(String[] args) throws Exception {
			
			PropertyFileUtility pUtil = new PropertyFileUtility();
			String BROWSER = pUtil.readDataFromPropertyFile("browser");
			String USERNAME = pUtil.readDataFromPropertyFile("usernamee");
			
			WebDriver driver = null;
			
			if(BROWSER.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(BROWSER.equalsIgnoreCase("Firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else 
			{
				System.out.println("");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://stg-new-wallet.goldsikka.com/");
			driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys(USERNAME,Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Booking Account']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("5000",Keys.ENTER);
			WebElement element = driver.findElement(By.xpath("//iframe[contains(@style,'op')]"));
			driver.switchTo().frame(element);
			driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("8686184458");
			driver.findElement(By.xpath("//div[@class='redesign-v15-cta-wrapper svelte-s8db8t']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Netbanking']")).click();
			driver.findElement(By.xpath("//div[.='ICICI']")).click();
			String parentWindow = driver.getWindowHandle();
			driver.findElement(By.className("svelte-s8db8t")).click();
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
			
			DashboardPage dPage = new DashboardPage(driver);
			dPage.logoutOfApplication(driver);
			
		}
		
	}