package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingAnnotationsFbLanch {
	
	
	static  WebDriver  driver;
	@BeforeClass
	public static void test1() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	System.out.println("tetst1 passed");
	}
	@Before
	public void test2() {
		driver.get("https://www.facebook.com/");
		System.out.println("test2 passed");
	}
	@Test
	public void test3() {
		driver.findElement(By.id("email")).sendKeys("premnaik@gmail.com");
		System.out.println("test3 passed");

	}
	@After
	public void test4() {
		 driver.findElement(By.id("pass")).sendKeys("2526363");
		 System.out.println("test4 passed");
		 
	}
	@AfterClass
	public static void test5() {
		driver.findElement(By.name("login")).click();
		System.out.println("test5 passed");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
