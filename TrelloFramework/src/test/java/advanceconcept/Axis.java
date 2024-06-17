package advanceconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axis {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/home");
		driver.findElement(By.xpath("//a[text()='Get Trello for free']//preceding-sibling::a[text()='Log in']")).click();
		
		

	}

}
