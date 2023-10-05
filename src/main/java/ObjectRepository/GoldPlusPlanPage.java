package ObjectRepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericUtility.WebDriverUtility;

public class GoldPlusPlanPage {

	@FindBy(xpath="//select[@formcontrolname='amount']")private WebElement AmountDrpDwn;
    
    @FindBy(xpath="//select[@placeholder='Months']")private WebElement MonthsDrpDwn;
    
    @FindBy(xpath="//p[.='Use Booking Account']/../..//div/input[@type='checkbox']")private WebElement UseBookingAccountCheckBox;
    
    @FindBy(xpath="//input[@placeholder='Enter amount']")private WebElement EnterAmountEdt;
    
    @FindBy(xpath="//input[@formcontrolname='agree']")private WebElement TermsAndConditionsCheckBox;
    
    @FindBy(xpath="//input[@placeholder='Enter coupon code']")private WebElement CouponCodeEdt;
    
    @FindBy(xpath="//span[.=' Coupon List ']")private WebElement CouponCodeListButton;
    
    @FindBy(xpath="//button[.='Apply']")private WebElement ApplyBtn;
    
    @FindBy(xpath="//input[@placeholder='Enter Referral Code']")private WebElement ReferralCodeEdt;
    
    @FindBy(xpath="//div[@class='coupon-text2']/following-sibling::div/button[@type='submit']")private WebElement StartSubscriptionBtn;
    
    @FindBy(xpath="//iframe[@class='razorpay-checkout-frame']")private WebElement AfterClickOnStartSubscriptionBtnFrame;
    
    @FindBy(xpath="//input[@id='contact']")private WebElement MobileNumberEdt;
    
    @FindBy(xpath="//div[@class='cta-container has-tooltip svelte-s8db8t reduce-amount-size no-shadow']")private WebElement ProceedBtn;
    
    @FindBy(xpath="//div[.='Netbanking']")private WebElement NetBankingLnk;
    
    @FindBy(xpath="//label[@for='bank-radio-ICIC']")private WebElement IciciBankLnk;
    
    @FindBy(xpath="//div[.='Axis']")private WebElement AxisBankLnk;
    
    @FindBy(xpath="//div[.='HDFC']")private WebElement HdfcBankLnk;
    
    @FindBy(xpath="//div[.='Kotak']")private WebElement KotakBankLnk;
    
    @FindBy(xpath="//div[.='Yes Bank']")private WebElement YesBankLnk;
    
    @FindBy(xpath="//div[.='BOB']")private WebElement BOBBankLnk;
  
    @FindBy(xpath="//div[@class='svelte-3qevvl']")private WebElement BankServerIssueLnk;
    
    @FindBy(xpath="//button[@class='cta-btn svelte-n4r70l']")private WebElement BankServerIssueContinueBtn;
    
   	@FindBy(xpath="//div[@class='redesign-v15-cta-wrapper svelte-s8db8t']")private WebElement PayNowBtn;
   	
   	@FindBy(xpath="//button[.='Success']")private WebElement WindowSuccessBtn;
    
	public GoldPlusPlanPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getAmountDrpDwn() {
		return AmountDrpDwn;
	}



	public WebElement getMonthsDrpDwn() {
		return MonthsDrpDwn;
	}



	public WebElement getUseBookingAccountCheckBox() {
		return UseBookingAccountCheckBox;
	}



	public WebElement getEnterAmountEdt() {
		return EnterAmountEdt;
	}



	public WebElement getTermsAndConditionsCheckBox() {
		return TermsAndConditionsCheckBox;
	}



	public WebElement getCouponCodeEdt() {
		return CouponCodeEdt;
	}



	public WebElement getCouponCodeListButton() {
		return CouponCodeListButton;
	}



	public WebElement getApplyBtn() {
		return ApplyBtn;
	}



	public WebElement getReferralCodeEdt() {
		return ReferralCodeEdt;
	}



	public WebElement getStartSubscriptionBtn() {
		return StartSubscriptionBtn;
	}
	
	
    
	public WebElement getAfterClickOnStartSubscriptionBtnFrame() {
		return AfterClickOnStartSubscriptionBtnFrame;
	}



	public WebElement getMobileNumberEdt() {
		return MobileNumberEdt;
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



	public WebElement getAxisBankLnk() {
		return AxisBankLnk;
	}



	public WebElement getHdfcBankLnk() {
		return HdfcBankLnk;
	}



	public WebElement getKotakBankLnk() {
		return KotakBankLnk;
	}



	public WebElement getYesBankLnk() {
		return YesBankLnk;
	}



	public WebElement getBOBBankLnk() {
		return BOBBankLnk;
	}



	public WebElement getBankServerIssueLnk() {
		return BankServerIssueLnk;
	}



	public WebElement getBankServerIssueContinueBtn() {
		return BankServerIssueContinueBtn;
	}



	public WebElement getPayNowBtn() {
		return PayNowBtn;
	}



	public WebElement getWindowSuccessBtn() {
		return WindowSuccessBtn;
	}



	public void goldPlusPlanPage(WebDriver driver) throws AWTException
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
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		wait.until(ExpectedConditions.elementToBeClickable(NetBankingLnk));
		NetBankingLnk.click();
		
		KotakBankLnk.click();
			
		String ParentWin = driver.getWindowHandle();
		PayNowBtn.click();
		Set<String> ChildWin = driver.getWindowHandles();
		
		for(String Childid : ChildWin)
		{
			if(!Childid.equals(ParentWin))
			{
				driver.switchTo().window(Childid);
				WindowSuccessBtn.click();
			}
		}
		driver.switchTo().window(ParentWin);
		

	}
	
}