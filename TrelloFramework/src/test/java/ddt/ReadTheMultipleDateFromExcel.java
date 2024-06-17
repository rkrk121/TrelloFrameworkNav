package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheMultipleDateFromExcel 

{
	public static String eID="E04105";
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources1/employee.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Data");
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= rowCount; i++) 
		{
			for (int j = 0; j < cellCount; j++) 
			{
				if (sheet.getRow(i).getCell(0).getStringCellValue().contains(eID)) 
				{
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					String value1 = sheet.getRow(0).getCell(j).getStringCellValue();
					System.out.print(value1+"->");
					System.out.print(value + ", ");
					

				}
				

			}

		}
		
	}

}
