package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	private void tco1() {
		System.out.println("test1");

	}
	@BeforeMethod
	private void tco2() {
        System.out.println("test2");
	}
	@Test
	private void tco3() {
        System.out.println("test3");
	}
	@AfterMethod
	 private void tco4() {
        System.out.println("test4");
	}
	@AfterClass
	private void tco5() {
        System.out.println("test5");
	}
	
}
