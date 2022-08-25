package TestNg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelApp {
	public static WebDriver driver;
	@Test(priority=0)
	public void tc01() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	}
	@Test(priority=1)
	private void tc02() {
	driver.findElement(By.id("username")).sendKeys("Greens8767");
	driver.findElement(By.id("password")).sendKeys("QN8V3A");
	driver.findElement(By.id("login")).click();
	}
	@Test(priority=2)
	private void tc03() throws InterruptedException {
	Thread.sleep(2000);
	WebElement location = driver.findElement(By.id("location"));
	Select select = new Select(location);
	select.selectByIndex(4);
	}
	@Test(priority=3)
	private void tc04() {
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select select1 = new Select(hotel);
	select1.selectByValue("Hotel Sunshine");
	}
	@Test(priority=4)
	private void tc05() {
	WebElement room = driver.findElement(By.id("room_type"));
	Select select2 = new Select(room);
	select2.selectByVisibleText("Deluxe");
	}
	@Test(priority=5)
	private void tc06() {
	WebElement rooms = driver.findElement(By.id("room_nos"));
	Select slect3 = new Select(rooms);
	slect3.selectByIndex(8);
	}
	@Test(priority=6)
	public void tc07() {
	driver.findElement(By.id("datepick_in")).sendKeys("08/07/2022");
	driver.findElement(By.id("datepick_out")).sendKeys("10/07/2022");
	}
	@Test(priority=7)
	public void tc08() {
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select select4 = new Select(adult);
	select4.selectByValue("3");
	}
	@Test(priority=8)
	public void tc09() {
	WebElement child = driver.findElement(By.id("child_room"));
	Select select5 = new Select(child);
	select5.selectByIndex(4);
	}
	@Test(priority=9)
	public void tc10() {
	driver.findElement(By.id("Submit")).click();
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("first_name")).sendKeys("teja");
	driver.findElement(By.id("last_name")).sendKeys("Valluri");
	driver.findElement(By.id("address")).sendKeys("dgewydjgdewjh");
	driver.findElement(By.id("cc_num")).sendKeys("3293890303809830");
	}
	@Test(priority=10)
	private void tc11() {
	WebElement cctype = driver.findElement(By.id("cc_type"));
	Select select6 = new Select(cctype);
	select6.selectByVisibleText("Master Card");
	}
	@Test(priority=11)
	private void tc12() {
	WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
	Select select7 = new Select(ccexp);
	select7.selectByIndex(6);
	}
	@Test(priority=12)
	public void tc13() {
	WebElement ccexp2 = driver.findElement(By.id("cc_exp_year"));
	Select select8 = new Select(ccexp2);
	select8.selectByValue("2022");
	}
	@Test(priority=13)
	public void tc14() throws InterruptedException {
	driver.findElement(By.id("cc_cvv")).sendKeys("2837249894");
	driver.findElement(By.id("book_now")).click();
	Thread.sleep(5000);
	}
	@Test(priority=14)
	private void tc15() throws IOException {
	WebElement element = driver.findElement(By.id("order_no"));
	String attribute = element.getAttribute("value");
	System.out.println(attribute);
	driver.quit();
	File f=new File("C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\FrameWork\\Excel\\Books.xlsx");
	FileInputStream s= new FileInputStream(f);
	Workbook book = new XSSFWorkbook();
	Sheet sheet = book.createSheet("Sheet2");
	
	Row createRow = sheet.createRow(1);
	Cell cell = createRow.createCell(1);
	cell.setCellValue("Booking ID");
	
	Row createRow1 = sheet.createRow(2);
	Cell createCell = createRow1.createCell(1);
	createCell.setCellValue(attribute);
	FileOutputStream fileOutputStream = new FileOutputStream(f);
	book.write(fileOutputStream);

	
	

	
	}
}

	
