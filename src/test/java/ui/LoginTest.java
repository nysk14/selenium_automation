package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_item_img']"));
		System.out.println(webelements);
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a")).click();
		Set<String> handle2 = driver.getWindowHandles();
		System.out.println(handle2);
//		driver.navigate().to("https://www.sugarcrm.com/");
//		String handle = driver.getWindowHandle();
//		System.out.println(handle);
//		driver.findElement(By.xpath("//button[@class='CybotCookiebotDialogBodyButton'][contains(text(),'Accept All Cookies')]")).click();
//		driver.findElement(By.xpath("//*[@class='btn btn-outline-light'][contains(text(), 'Get A Demo')]")).click();
//		Set<String> handleTwo = driver.getWindowHandles();
//		System.out.println(handleTwo);
		driver.close();
		driver.quit();
	}

}
