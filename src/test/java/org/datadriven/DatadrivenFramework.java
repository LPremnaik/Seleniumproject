package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenFramework {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\FrameWork\\Excel\\Books.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		/*Sheet sheet = book.getSheet("Data");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.print (" "+cell);
			
		}
			
		}
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		Row row = sheet.getRow(0);
		int numberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(numberOfCells);
		Cell cell = row.getCell(8);
		
		System.out.println(cell);*/
		
		/*Sheet createSheet = book.createSheet("Datas");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("java");
		FileOutputStream stream1 =new FileOutputStream(file);
		book.write(stream1);*/
		Sheet sheet = book.getSheet("Data");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String Value = cell.getStringCellValue();
		if (Value.equals("java")) {
			cell.setCellValue("karun");
			
		}FileOutputStream stream2=new FileOutputStream(file);
		book.write(stream2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
