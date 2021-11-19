package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
		/*Implicit Wait */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kwameduodu48@yahoo.com");
		Thread.sleep(3000);
		WebElement login  = driver.findElement(By.xpath("//input[@id='login-signin']"));
		
		/*Explicit Wait*/
//		WebDriverWait wait = new WebDriverWait(login.isDisplayed(), 30);
		
		
	}

}
