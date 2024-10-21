package StepDefination;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement email = driver.findElement(By.xpath("//*[@class= 'email']"));
		WebElement passWord = driver.findElement(By.xpath("//*[@class='password']"));
		email.sendKeys("Nisa");
		passWord.sendKeys("XYZ098");
		driver.close();
		List <WebElement> webElementList = driver.findElements(By.xpath("contains(text(),'Nisa')"));
		
		WebElement logIn = driver.findElement(By.xpath("//*[@class='Login']"));
		logIn.click();
		
		String getTextValue = driver.findElement(By.xpath("//*[contins(text(),'Welcome to Salesforce')]")).getText();
		
		boolean present = driver.findElement(By.id("Present")).isDisplayed();
		
	}

}
