package StepDefination;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.internal.util.Durations;


public class LogIn {	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement firstName= driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement phone = driver.findElement(By.id("phone"));
		firstName.sendKeys("Nisa");
		email.sendKeys("nysk14@gmail.com");
		phone.sendKeys("8373874836");
		driver.quit();

		
	}

}
