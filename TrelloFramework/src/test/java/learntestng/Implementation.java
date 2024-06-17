package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Implementation 
{
	WebDriver driver;
	@BeforeMethod
	public void  preCondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void postCondition()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test(priority = 2)
	public void loginToVtiger() throws InterruptedException
	{
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.clear();
		userNameTextField.sendKeys("username");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		
		
	}
	public void loginToFacebook()
	{
		
	}

}
