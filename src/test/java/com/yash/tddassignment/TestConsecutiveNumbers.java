package com.yash.tddassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestConsecutiveNumbers {

	@BeforeClass 
	  public static void setUpBeforeClass() throws Exception {
	  System.out.println("Test cases start execution"); }
	 
	@Test //Two variables must be given (any variable should not be null)
	public void test_Consecutive_Numbers_NotNull() {
		TddAsignment tdd = new TddAsignment();
		Integer i1 = 1;
		Integer i2 = 10;
		tdd.additionOfTenConsecutiveNumbers(i1, i2);
		assertNotNull(i1);
		assertNotNull(i2);
		
	}
	
	@Test //Variables must be Integer
	public void test_Consecutive_Number_Should_Only_Interger() {
		TddAsignment tdd = new TddAsignment();	
		Integer i1 = 1;
		Integer i2 = 10;
		tdd.additionOfTenConsecutiveNumbers(i1, i2);
		assertEquals("variables must be Integer :", "Integer", i1.getClass().getSimpleName());
		assertEquals("variables must be Integer :", "Integer", i2.getClass().getSimpleName());
		
	}
	
	@Test //Addition of 10 consecutive number 
	public void test_Consecutive_Numbers() {
		TddAsignment tdd = new TddAsignment();
		Integer i1 = 55;
		assertEquals(i1, tdd.additionOfTenConsecutiveNumbers(1, 10));
	}
		
	
	
}
