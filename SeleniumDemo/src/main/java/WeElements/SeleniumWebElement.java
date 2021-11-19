package WeElements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
//		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
//		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Xiaomi")).click();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.quit();
	}

}
