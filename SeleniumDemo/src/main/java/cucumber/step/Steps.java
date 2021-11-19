package cucumber.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
	WebDriver driver = new ChromeDriver();
	@io.cucumber.java.en.Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
	
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}

	@io.cucumber.java.en.When("^I enter valid username and valid passowrd$")
	public void i_enter_valid_username_and_valid_passowrd() throws Throwable {
		driver.get("https://www.ebay.com/");
		
	}

	@io.cucumber.java.en.Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Guitar");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.quit();
	}


}
