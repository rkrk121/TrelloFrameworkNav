package com.qsp.trello.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String readTheString(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources1\\New Microsoft Excel Worksheet.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("data");
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		String value = cell.getStringCellValue();
		return value;
	}
	public double readThedoubleNumericData(String sheetName, int rowIndex, int cellIndex ) throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		double value = cell.getNumericCellValue();
		return value;
		
	}
	public long readTheLongNumericData(String sheetName, int rowIndex, int cellIndex) throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		 long value = (long)cell.getNumericCellValue();
		return value;
		
	}

}
