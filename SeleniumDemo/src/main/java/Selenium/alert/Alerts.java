package Selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/kwameduodu/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		/*handle alerts
		 */
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		String alertM = driver.switchTo().alert().getText();
		alert.accept();
		
		
		/*Handle Pop up
		 */
		
		driver.findElement(By.id("popUp")).click();
		Actions action = new Actions(driver);
			
		action.click(driver.findElement(By.id("helo")));
			
			action.perform();
			}
}
