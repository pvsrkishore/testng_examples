package com.bhge.testng_examples;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestSuiteB {

	@Test
	public void testMethA1(){
		System.out.println("Test Method A1");
		assertEquals(false, true);
	}
	
	@Test
	public void testMethB1(){
		System.out.println("Test Method B1");
		assertEquals(true, true);
	}
	
	@Test
	public void testMethC1(){
		System.out.println("Test Method C1");
		assertEquals(false, true);
	}
	
	@Test
	public void testMethD1(){
		System.out.println("Test Method D1");
		assertEquals(true, true);
	}
}
