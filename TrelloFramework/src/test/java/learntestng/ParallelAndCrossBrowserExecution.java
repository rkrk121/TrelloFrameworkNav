package learntestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

class ParallelAndCrossBrowserExecution {
	WebDriver driver;
	
	@BeforeMethod
	public void precondition(String browserName,String url) throws InterruptedException
	{
		if(browserName.equals("chrome"))
				{
			driver=new ChromeDriver();
				}
		else if(browserName.equals("edge"))
		        {
			driver=new EdgeDriver();
				}
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.manage().window().minimize();
		driver.quit();
		
	 	
	}

}
