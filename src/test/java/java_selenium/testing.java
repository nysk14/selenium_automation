package java_selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {
	
	public static void main(String args[]) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://seleniumbase.io/demo_page");
	String first_wind = driver.getWindowHandle();
	System.out.println(first_wind);
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='myTextInput']")).sendKeys("Nisa Yasmin");
	driver.findElement(By.xpath("//*[@id='myTextarea']")).sendKeys("My Name is Chikki");
	WebElement element = driver.findElement(By.xpath("//*[@name=\"preText2\"]"));
	String Prefilled = element.getAttribute("value");
	System.out.println(Prefilled);
	
	driver.navigate().to("https://www.saucedemo.com/");
	String window_handle = driver.getWindowHandle();
	System.out.println(window_handle);
	
	
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	Thread.sleep(4000);
	
	List<WebElement> all_iteams = driver.findElements(By.xpath("//*[@class=\"inventory_item\"]"));
	System.out.println(all_iteams);
	
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
	driver.findElement(By.xpath("//*[@name=\"checkout\"]")).click();
	
	WebElement element_two = driver.findElement(By.xpath("//*[@data-test=\"title\"]"));
	String title = element_two.getAttribute("Value2");
	System.out.println(title);
	
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Nisa");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Yasmin");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("721458");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	WebElement element_three = driver.findElement(By.xpath("//*[@class='title']"));
	String prnt_tile = element_three.getAttribute("Value3");
	System.out.println(prnt_tile);
	driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
	
	
	WebElement element_four = driver.findElement(By.xpath("//h2[@class=\"complete-header\"]"));
	String prnt_checkout = element_four.getAttribute("Value4");
	System.out.println(prnt_checkout);
	
	WebElement element_five = driver.findElement(By.xpath("//div[@class=\"complete-text\"]"));
	String prnt_success = element_five.getAttribute("Value5");
	System.out.println(prnt_success);
	
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	WebElement ddp = driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]"));
	Select select = new Select(ddp);
	select.selectByValue("za");
	select.selectByIndex(2);
	select.selectByVisibleText("Price (high to low)");
	
	driver.findElement(By.xpath("//*[@href=\"https://twitter.com/saucelabs\"]")).click();
	Set<String> all_window = driver.getWindowHandles();
	System.out.println(all_window);
	
	
	
	
	driver.close();
	
	}
	
}
