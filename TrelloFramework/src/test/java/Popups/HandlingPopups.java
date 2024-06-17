package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingPopups 
{                                                     //https://demo.automationtesting.in/Alerts.html
	WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	//@AfterMethod
	public void postcondition()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test
	public void alert() throws InterruptedException
	{
		driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/prompt.html/alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
	@Test
	public void confirmation() throws InterruptedException
	{
		driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/prompt.html/confirmation.html/confirmation.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		String confirmationMsg = driver.switchTo().alert().getText();
		System.out.println("confirmationMsg = " + confirmationMsg);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	@Test
	public void prompt() throws InterruptedException
	{
		driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/prompt.html/prompt.html/prompt.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("100");
		String promptMsg = driver.switchTo().alert().getText();
		System.out.println("promptMsg = " + promptMsg);
		driver.switchTo().alert().accept();
		
	}
	
	public void hdd() throws InterruptedException
	{
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		Thread.sleep(2000);
		
		
		
	}

}
