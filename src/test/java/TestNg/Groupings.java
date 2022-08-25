package TestNg;

import org.testng.annotations.Test;

public class Groupings {
	@Test(groups="sanity")
	private void tco1() {
		System.out.println("sanity:Test1");

	}
	@Test(groups="regg")
	private void tco2() {
		System.out.println("regg:Test2");

	}
	@Test(groups="smoke")
	private void tco3() {
		System.out.println("smoke:Test3");

	}
	@Test(groups="sanity")
	private void tco4() {
		System.out.println("sanity:Test4");

	}
	@Test(groups="smoke")
	private void tco5() {
		System.out.println("smoke:Test5");

	}
	@Test(groups="regg")
	private void tco6() {
		System.out.println("regg:Test6");

	}
	

}
