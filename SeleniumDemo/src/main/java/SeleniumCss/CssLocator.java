package SeleniumCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//link text locator 
//		driver.get("https://www.ebay.com/");
//		driver.findElement(By.linkText("Motors")).click();
//		
		
		//Css Locator
		driver.get("https://www.ebay.com/");
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Guitar");
		driver.findElement(By.cssSelector("#gh-btn.btn")).click();
	}
	
}
