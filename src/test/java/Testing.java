import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testing {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\91833\\OneDrive\\Documents\\Premnaik\\naik.xlsx");

	Workbook book=new XSSFWorkbook();
	Sheet createSheet = book.createSheet();
	Row createRow = createSheet.createRow(5);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("msd");
	FileOutputStream out=new FileOutputStream(f);
	book.write(out);
	

	
}
}
