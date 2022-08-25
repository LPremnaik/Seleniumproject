package TestNg;

import org.testng.annotations.Test;

public class CountAndPriorty {
	@Test(priority=-9)
	private void tco1() {
		System.out.println("test1");
	}
	@Test(priority=-7,invocationCount=10)
	private void tco2() {
		System.out.println("test2");
	}
	@Test(priority=5,enabled=false)
	private void tco3() {
		System.out.println("test3");
	}
	@Test(priority=9)
	private void tco4() {
		System.out.println("test4");
	}
	@Test(priority=10)
	private void tco5() {
		System.out.println("test5");
	}
}
