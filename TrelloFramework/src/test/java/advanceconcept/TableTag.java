package advanceconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.findElement(By.xpath("//table[@class='dataTable']"))
				.findElement(By.xpath("//a[contains(text(),'Parnax Lab L')]")).click();

	}

}
