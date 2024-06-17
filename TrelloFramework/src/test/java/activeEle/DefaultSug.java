package activeEle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultSug {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().click();
		List<WebElement> allDefaultSug = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		System.out.println(allDefaultSug);
		for(WebElement sug : allDefaultSug)
		{
			String sugText = sug.getText();
			System.out.println(sugText);
			if(sugText.equals("ba full form"))
			{
				sug.click();
				break;
			}
		}
		

	}

}
