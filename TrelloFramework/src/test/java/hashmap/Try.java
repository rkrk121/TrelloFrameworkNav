package hashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Try 
{
	public HashMap<String, String> data()
	{
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Q", "Spider");
		hashMap.put("J", "Spider");
		hashMap.put("Py", "Spider");
		return hashMap;
	}
	
	
	@Test
	public void facebook()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		String value = data().get("Q");
		String arr[] = value.split("@");
		WebElement firstName = driver.findElement(By.name("firstname"));
		
	}
}
