package Sprint_2_GoldSuvidha;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericUtility.ConstantsUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SellGoldTest {

   @Test
   public void sellGold() throws Exception
   {
	   FileInputStream fis = new FileInputStream(ConstantsUtility.propertyfilepath);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("stgurl");
		String USERNAME = prop.getProperty("usernamee");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email/Phone Number']")).sendKeys(USERNAME, Keys.ENTER);
		
		
   }
   
   
}
