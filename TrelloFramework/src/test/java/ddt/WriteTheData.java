package ddt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteTheData {

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheetName = workbook.createSheet("data");
		XSSFRow row = sheetName.createRow(2);
		XSSFCell cell = row.createCell(4);
		cell.setCellValue(1234);
		File filePath = new File("./src\\test\\resources1\\write_data_excel.xlsx");
		FileOutputStream file=new FileOutputStream(filePath);
		workbook.write(file);
		workbook.close();
		

	}

}
