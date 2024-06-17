package ddt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		String pgs=driver.getPageSource();
	    System.out.println("pg =" +pgs);
	    Thread.sleep(2000);
	    driver.manage().window().minimize();
	    driver.quit();
	}

}
