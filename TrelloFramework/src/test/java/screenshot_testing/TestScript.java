package screenshot_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Screenshot.class)


public class TestScript extends BaseClass {
	
	@Test
	public void testcase01() throws InterruptedException {
		//Assert.assertEquals(false, true);
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userTextfield = driver.findElement(By.id("username"));
		userTextfield.clear();
		Thread.sleep(2000);
		userTextfield.sendKeys("admin");
		Thread.sleep(2000);
	}
	
	@Test
	public void testcase02() throws InterruptedException 
	{
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement firstName= driver.findElement(By.name("irstname"));
		firstName.sendKeys("qsp");
		Thread.sleep(2000);
		}
	
	@Test
	public void testcase03() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void testcase04() {
		Assert.assertEquals(false, true);
	}
}


