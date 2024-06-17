package activeEle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSug {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("selenium");
		 List<WebElement> autosug = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		 for (WebElement sug : autosug) 
		 {
			 String sugText=sug.getText();
			 System.out.println(sugText);
			 if(sugText.contains("tutorial"))
			 {
				 sug.click();
				 break;
			 }
			
		 }
		

	}

}
