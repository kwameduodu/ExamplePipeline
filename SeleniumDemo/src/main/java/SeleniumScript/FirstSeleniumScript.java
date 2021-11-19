package SeleniumScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args)throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//xpath locator
			driver.get("https://www.ebay.com/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Guitar");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
					
				


	}

}
