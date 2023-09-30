package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommerceCartPage {

    @FindBy(xpath="//img[@src='../../../assets/imgs/power (2) 1.png']")private WebElement PowerBtn;
	
	@FindBy(xpath="//img[@src='../../../assets/imgs/Heart.png']")private WebElement WishlistBtn;
	
	@FindBy(xpath="//img[@src='../../../assets/imgs/Buy.png']")private WebElement CartBtn;
	
	@FindBy(xpath="//img[@src='../../../assets/imgs/Notification.png']")private WebElement NotificationBtn;
	
	@FindBy(xpath="//button[.='Checkout']")private WebElement CheckoutBtn;
	
	@FindBy(xpath="//button[.='Remove']")private WebElement RemoveBtn;
	
	@FindBy(xpath="//button[.='Add to Wishlist']")private WebElement AddToWishlistBtn;
	  
	public EcommerceCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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

	public WebElement getCheckoutBtn() {
		return CheckoutBtn;
	}

	public WebElement getRemoveBtn() {
		return RemoveBtn;
	}

	public WebElement getAddToWishlistBtn() {
		return AddToWishlistBtn;
	}
	
	
	
}
