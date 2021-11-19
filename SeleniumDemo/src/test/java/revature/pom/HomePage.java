package revature.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(className = "ajax_add_to_cart_button")
	private List<WebElement> cartButtons;
	
	@FindBy(partialLinkText = "Cart")
	private WebElement viewCartButton;
	
	@FindBy(className="icon-chevron-left")
	private WebElement continueShoppingButtonAfterAddToCart;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickViewCart() {
		this.viewCartButton.click();
	}
	
	public void clickContinueShopping() {
		this.continueShoppingButtonAfterAddToCart.click();
		
	}
	
	/**
	 * 
	 * @param itemIdex the index in the  List which corresponds to the 
	 * piece of clothing we'd like to buy
	 */
	public void addItemToCart(int itemIdex) {
		this.cartButtons.get(itemIdex).click();
	}
	
}
