package revature.gluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import revature.pom.HomePage;


public class ShoppingSpree {
	
	private WebDriver driver;
	private HomePage homePage;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		homePage = new HomePage(driver);
	}
	
	@Given("the user is on the home page of the QA automation site.")
	public void the_user_is_on_the_home_page_of_the_qa_automation_site() {
	   Assert.assertEquals("My Store", driver.getTitle());
	}

	@When("the Add to cart button is clicked for several items.")
	public void the_add_to_cart_button_is_clicked_for_several_items() {
	    homePage.addItemToCart(0);
	    homePage.clickContinueShopping();
	    homePage.addItemToCart(2);
	    homePage.clickContinueShopping();
	}

	@When("the Cart link is clicked.")
	public void the_cart_link_is_clicked() {
	   homePage.clickViewCart();
	}

	@Then("the user ends up on the cart summary page with the appropriate number of items in the cart.")
	public void the_user_ends_up_on_the_cart_summary_page_with_the_appropriate_number_of_items_in_the_cart() {
	    Assert.assertEquals("Order - My Store", driver.getTitle());
	}
	
	@After
	public void teardown() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.quit();
	}
}
