package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingThePopups1 
{
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	//@AfterMethod
	public void postConditions()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	@Test
	public void alert() throws InterruptedException
	{
		driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/popup/alert.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	@Test
	public void confirmation() throws InterruptedException
	{
		driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/popup/confirmation/confirmation.html");
		Thread.sleep(2000);
		String confirmationMsg = driver.switchTo().alert().getText();
		System.out.println("confirmationMsg = " + confirmationMsg);
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void prompt() throws InterruptedException
	{
		driver.get("file:///C:/Users/Rahul/OneDrive/Desktop/popup/prompt/prompt.html");
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("100");
		String promptMsg = driver.switchTo().alert().getText();
		System.out.println("promptMsg = " + promptMsg);
		driver.switchTo().alert().accept();
		
	}
	@Test
	public void hdd() throws InterruptedException
	{
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		Thread.sleep(2000);
		//Actions actions = new Actions(driver);
		//actions.click();
		WebElement nameTextField = driver.findElement(By.xpath("//div/input[@type='text']"));
		nameTextField.sendKeys("admin");
	}
	@Test
	public void notification()
	{
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		driver=new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.justdial.com/");
	}
	@Test
	public void fileUpload()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\Rahul\\Downloads");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
	}
	@Test
	public void fileDownload() throws InterruptedException, AWTException
	{
		driver.get("https://www.selenium.dev/downloads/");
		Actions actions = new Actions(driver);
		actions.scrollByAmount(1500, 0);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("4.17.0")));
		driver.findElement(By.linkText("4.17.0")).click();
		
		Thread.sleep(2000);
		driver.get("chrome://downloads/");
		WebElement shadowHost01 = driver.findElement(By.tagName("downloads-manager"));
		SearchContext shadowRoot01 = shadowHost01.getShadowRoot();
		WebElement shadowHost02 = shadowRoot01.findElement(By.id("frb0"));
		SearchContext shadowRoot02 = shadowHost02.getShadowRoot();
		WebElement keepButtonTargetEle = shadowRoot02.findElement(By.cssSelector("cr-button[focus-type='save']"));
		keepButtonTargetEle.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	

}
