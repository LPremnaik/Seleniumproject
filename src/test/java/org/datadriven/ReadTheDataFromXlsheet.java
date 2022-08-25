 package org.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheDataFromXlsheet {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\91833\\OneDrive\\Documents\\Premnaik\\naik1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
	//proving sheet name 
		XSSFSheet sheet = workbook.getSheet("sheet2");
		
		int rowcount = sheet.getLastRowNum();//returns the row count
		
		short colcount = sheet.getRow(0).getLastCellNum();//return column/cell count
		
		for (int i = 0; i <rowcount ; i++) {
			
			XSSFRow currentrow = sheet.getRow(i);  //focouced on current rows 
			System.out.println();
			
			for (int j = 0; j < colcount; j++) {
				
				String value = currentrow.getCell(j).toString(); //read the value from a cell
				System.out.print("  "  +value);
		
			}
			System.out.println();
		}
		  
		
		
		
		
		
		
		
		
	}

}
