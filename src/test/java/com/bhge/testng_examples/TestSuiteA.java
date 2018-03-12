package com.bhge.testng_examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestSuiteA {

	@Test
	public void testMethA(){
		System.out.println("Test Method A");
		assertEquals(true, true);
	}
	
	@Test
	public void testMethB(){
		System.out.println("Test Method B");
		assertEquals(false, true);
	}
	
	@Test
	public void testMethC(){
		System.out.println("Test Method C");
		assertEquals(true, true);
	}
	
	@Test
	public void testMethD(){
		System.out.println("Test Method D");
		assertEquals(false, true);
	}
}
