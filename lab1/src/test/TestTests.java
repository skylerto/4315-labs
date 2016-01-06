package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTests {

	//
	/*
	 * Assert.assertEquals(String, long, long);
	 * .equals(); 
	 */
	@Test
	public void test() {
		fail("Not yet implemented");
		
		//Assert.assertEquals();
	}
	
	/*
	 * Assert.assertSame(Object, Object);
	 * ==
	 */
	@Test
	public void test1(){
		fail("Not yet implemented");
	}
	
	/*
	 * This test will timeout after 1000ms
	 */
	@Test(timeout=1000)
	public void testTimeout(){
		fail("Not yet implemented");
	}
	
	/*
	 * This test will timeout after 1000ms
	 */
	@Test(expected=NumberFormatException.class)
	public void testException(){
		Integer.parseInt("hi");
	}
}
