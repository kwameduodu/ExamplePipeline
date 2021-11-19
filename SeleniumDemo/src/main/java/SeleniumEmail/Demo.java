package SeleniumEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("kwameduodu48@gmail.com");
		driver.findElement(By.className("VfPpkd-LgbsSe")).click();
		String at = driver.getTitle();
		String et = "gmail";
		
		Thread.sleep(4000);
		driver.close();		
		if(at.equalsIgnoreCase(et)){
			System.out.println("test successful");
		} else 
			System.out.println("test failure");
		
		
		
	}

}
