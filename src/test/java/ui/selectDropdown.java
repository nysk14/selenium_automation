package ui;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropdown {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
		//driver.findElement(By.xpath("//*[@class='question top_question']"));
		WebElement dd = driver.findElement(By.id("mySelect"));
		Select select = new Select(dd);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("50%");
		Thread.sleep(2000);
		select.selectByVisibleText("Set to 75%");
		Thread.sleep(2000);
		
		driver.navigate().to("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		

	    
		//driver.quit();
//		File File=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(File, new File("Image Location"+ FileNmae + ".jpeg"));
//		

		
		String FileName;
		File File=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(File, new File("image location" + FileName + ".jpeg"));
	}

}
