package java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class l1 {

	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		WebElement ddown = driver.findElement(By.xpath("//*[@class=\"selectClass\"]"));
		Select select = new Select(ddown);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Set to 100%");
		Thread.sleep(2000);
		select.selectByValue("50%");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
