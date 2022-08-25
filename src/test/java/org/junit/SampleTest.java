 package org.junit;

public class SampleTest {
	@Test
	public void tco1() {
		String s="prem";
		System.out.println("test1");
		Assert.assertTrue(true);
		System.out.println("test1: condition true:"+s);
	}
	@Test
	public void tco2() {
		String s="puppy";
		System.out.println("test2");
		Assert.assertFalse(false);
		System.out.println("test2: condition true:"+s);
	}
	@Test
	public void tco3() {
		String s="naik";
		System.out.println("test3");
		Assert.assertEquals("naik", s);
		System.out.println("test3: condition true:"+s);
	}
	@Test
	public void tco4() {
		String s="";
		boolean empty = s.isEmpty();
		System.out.println("test4");
		Assert.assertEquals(true, empty);
		System.out.println("test4: condition true:"+s);
	}
	@Test 
	public void tco5() {
		String s="dad";
		System.out.println("test5");
		Assert.assertNotEquals("Dad", s);
		System.out.println("test5: condition true:"+s);
	}
	
}
