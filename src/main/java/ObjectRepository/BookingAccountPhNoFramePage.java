package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingAccountPhNoFramePage {

	String ParentWindow;
	
	@FindBy(xpath="//input[@name='contact']")private WebElement PhoneNumberEdt;
	
	@FindBy(xpath="//div[.='Proceed']")private WebElement ProceedBtn;
	
	@FindBy(xpath="//div[.='Netbanking']")private WebElement NetBankingLnk;
	
	@FindBy(xpath="//div[.='ICICI']")private WebElement IciciBankLnk;
	
	@FindBy(xpath="//button[.='Pay Now']")private WebElement PayNowBtn;

	
	public BookingAccountPhNoFramePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPhoneNumberEdt() {
		return PhoneNumberEdt;
	}

	public WebElement getProceedBtn() {
		return ProceedBtn;
	}

	
	public WebElement getNetBankingLnk() {
		return NetBankingLnk;
	}

	public WebElement getIciciBankLnk() {
		return IciciBankLnk;
	}

	public WebElement getPayNowBtn() {
		return PayNowBtn;
	}

	public void enterPhoneNumberAndClickOnProceed(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PhoneNumberEdt.sendKeys("8686184458");
		ProceedBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(NetBankingLnk)).click();
		IciciBankLnk.click();
	}
}
