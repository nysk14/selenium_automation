package ui;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	public static void main(String Args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//*[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"][1]"));
		WebElement drop = driver.findElement(By.className("ui-widget-content ui-state-default ui-droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
	}

}
