package com.mph.mvnproj;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class CalculateTest {
	
	Calculate calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("@Before Class Called");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("@AfterClass Called");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Add Test");
		assertEquals(100, calc.add(10,20,70));
		assertNotEquals(130, calc.add(10,20,70));
		
	}
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test");
		assertEquals(28, calc.Multiply(2,2,7));
		assertNotEquals(10, calc.Multiply(1,2,7));
	}

}