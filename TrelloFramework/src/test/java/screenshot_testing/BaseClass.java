package screenshot_testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public static WebDriver driver;
@BeforeMethod
    public void precondition() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("https://demo.vtiger.com/vtigercrm/");
}
	
	@AfterMethod
	public void postcondition() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	public void failed(String testMethod) throws IOException 
	{
		TakesScreenshot tss = (TakesScreenshot)driver;
		 File tempfile = tss.getScreenshotAs(OutputType.FILE);
		 File permfile = new File("./errorshot/"+testMethod+"screenshot.png");
		 FileUtils.copyFile(tempfile, permfile);
		 
	}
}
