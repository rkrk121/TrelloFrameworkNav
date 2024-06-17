package assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions 
{
	WebDriver driver;
	SoftAssert softAssert=new SoftAssert();
	@BeforeMethod
	public void preCondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void postondition()
	{
		driver.manage().window().minimize();
		driver.quit();
		//softAssert.assertAll();
		
	
	}
	@Test
	public void softAssert()
	{
		softAssert.assertEquals(driver.getTitle(), "Facebook log in and sign up", "The facebook title is incorrect");
		String fbLoginUrl = driver.getCurrentUrl();
		System.out.println("fbLoginUrl = " + fbLoginUrl);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).submit();
		
	}
	@Test
	public void hardAssert()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/" , "The actual url of facebook login is incorrect");
		String fbLoginTitle = driver.getTitle();
		System.out.println("fbLoginTitle = " + fbLoginTitle);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).submit();
	}

}
