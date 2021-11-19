package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement best = driver.findElement(By.className("blockbestsellers"));
		Select select = new Select(best);
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
		Select month1 = new Select(month);
		Thread.sleep(3000);
		month1.selectByVisibleText("Jul");
		WebElement year_y = driver.findElement(By.id("year"));
		Select year1 = new Select(year_y);
		Thread.sleep(3000);
		year1.selectByValue("2000");
		
	}
}
