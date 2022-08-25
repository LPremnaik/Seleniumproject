package org.junit;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLaunching {
	@Test
	public void name() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("premnaik@gmail.com");
	    Date d=new Date();
	    System.out.println(d);
	    driver.findElement(By.id("pass")).sendKeys("preme");
	    System.out.println(new Date());
	    driver.findElement(By.name("login")).click();
	   
	    
	} 

}
