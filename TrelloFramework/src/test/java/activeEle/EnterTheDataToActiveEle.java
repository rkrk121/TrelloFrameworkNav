package activeEle;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterTheDataToActiveEle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		//driver.switchTo().activeElement().sendKeys("qsp@gmail.com");
		//driver.switchTo().activeElement().sendKeys(Keys.TAB);
		//driver.switchTo().activeElement().sendKeys("12345");
		Actions actions = new Actions(driver);
		actions.sendKeys(driver.switchTo().activeElement()).sendKeys("qsp@gmail.com").sendKeys(Keys.TAB).sendKeys("12345").perform();
		
		

	}
}
