package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources1\\New Microsoft Excel Worksheet.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("data");
		//Row row = sheet.getRow(4);
		//Cell cell = row.getCell(1);
		//long cellValue = (long)cell.getNumericCellValue();
		//System.out.println("celValue = " +cellValue);
		
		//Row row = sheet.getRow(3);
		//Cell cell = row.getCell(2);
		//String cellValue = cell.getStringCellValue();
		//System.out.println("cellValue = " + cellValue);
		
		String cellValue = sheet.getRow(3).getCell(2).getStringCellValue();
		System.out.println("cellValue =" + cellValue);
		
		
		
		
		

}
}
