import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleRowsAndColoms {

	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\91833\\OneDrive\\Documents\\Premnaik\\naik.xlsx");
	Workbook book=new XSSFWorkbook();
	Sheet createSheet = book.createSheet("sheet2");
	Row createRow = createSheet.createRow(0);
	Row createRow2 = createSheet.createRow(1);
	Row createRow3 = createSheet.createRow(2);
	
	Cell createCell = createRow.createCell(0);
	Cell createCell2 = createRow2.createCell(0);
	Cell createCell3= createRow3.createCell(0);
	
	createCell.setCellValue("prem");
	createCell2.setCellValue("ravi");
	createCell3.setCellValue("jay");
	
	FileOutputStream out=new FileOutputStream(f);
	book.write(out);
	
	
	
	
	

	}

}
