package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPopupByUrl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		String username="admin";
		String password="admin";
		//"https://"+username+""+password+"@"+"the-internet.herokuapp.com/basic_auth";
		String url="https://" +username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		Thread.sleep(2000);
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle = " + pageTitle);
		String textAfterHandlingTheAuth = driver.findElement(By.tagName("p")).getText();
		System.out.println("textAfterHandlingTheAuth = " + textAfterHandlingTheAuth);
		
		
	}

}
