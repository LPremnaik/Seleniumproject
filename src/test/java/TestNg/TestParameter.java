package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	
	@Parameters({"username","password"})
	@Test
	private void tco1(String s,String s1) {
		System.out.println(s);
		System.out.println(s1);

	}
	

}
