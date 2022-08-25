package org.junit;

public class SampleProgram {
	@BeforeClass
	public static void tco1(){
		System.out.println("test1");
	}
	@Before
	public  void tco2() {
		System.out.println("test2");
		
	}
	@Test
	public  void tco3 () {
		System.out.println("test3");
		
	}
	@After
	public  void tco4() {
		System.out.println("tets4");
		
	}
	@AfterClass
	public static void tco5() {
		System.out.println("test5");
	}

}
