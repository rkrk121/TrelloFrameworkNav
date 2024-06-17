package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fis = new FileInputStream("./src\\test\\resources1\\New Microsoft Excel Worksheet.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("data");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(sheet.getRow(1).getCell(2).getStringCellValue());

	long ab = (long)sheet.getRow(1).getCell(1).getNumericCellValue();
	String str = Long.toString(ab);

	driver.findElement(By.id("pass")).sendKeys(sheet.getRow(3).getCell(1).getNumericCellValue()+"");
	//driver.findElement(By.id("pass")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
	 
	
	
	
	
	
		
	}

}
