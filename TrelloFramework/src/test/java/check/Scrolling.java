package check;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling 
{
	@Test
	public void scrollByUsingJSE() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.wikipedia.org/");
		Actions actions = new Actions(driver);
		actions.sendKeys(driver.switchTo().activeElement()).sendKeys("india").sendKeys(Keys.ENTER).perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//long webpageHeight = (long)jse.executeScript("return document.body.scrollHeight");
		//System.out.println("webpageHeight = " + webpageHeight);
		Thread.sleep(2000);
		//jse.executeScript("window.scrollBy(0,7000)");
		//jse.executeScript("window.scrollBy(0,-5000)");
		//Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,7000)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,-5000)");
		
		
		
				
	}

}
