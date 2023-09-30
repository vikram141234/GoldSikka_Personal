package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessPage {

    @FindBy(xpath="//img[@src='../../../assets/imgs/power (2) 1.png']")private WebElement PowerBtn;
	
	@FindBy(xpath="//img[@src='../../../assets/imgs/Heart.png']")private WebElement WishlistBtn;
	
	@FindBy(xpath="//img[@src='../../../assets/imgs/Buy.png']")private WebElement CartBtn;
	
	@FindBy(xpath="//img[@src='../../../assets/imgs/Notification.png']")private WebElement NotificationBtn;
	
	@FindBy(xpath="//td[.='hello']/following-sibling::td/a[@href='/user-organizations/186/donate']")private WebElement DonateBtn;
	
	@FindBy(xpath="//li[@class='pagination-previous disabled ng-star-inserted']")private WebElement PreviousPageBtn;
	
	@FindBy(xpath="//a[@aria-label='Next page']")private WebElement NextPageBtn;
	
	public BusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDonateBtn() {
		return DonateBtn;
	}

	public WebElement getPreviousPageBtn() {
		return PreviousPageBtn;
	}

	public WebElement getNextPageBtn() {
		return NextPageBtn;
	}

	public WebElement getPowerBtn() {
		return PowerBtn;
	}

	public WebElement getWishlistBtn() {
		return WishlistBtn;
	}

	public WebElement getCartBtn() {
		return CartBtn;
	}

	public WebElement getNotificationBtn() {
		return NotificationBtn;
	}
	
	
}
