package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrametersUsingFacebook {
	@Parameters({"username","password"})
	@Test
	private void tco1(String s,String s1) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys(s);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(s1);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
        
	}

}
