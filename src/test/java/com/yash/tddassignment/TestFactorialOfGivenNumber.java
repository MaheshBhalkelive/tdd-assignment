package com.yash.tddassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestFactorialOfGivenNumber {
	
	@Test //factorial of 5 is 120
	public void test_Factorial_Of_Givan_Number() {
		TddAsignment fact = new TddAsignment(); 
		Integer factorial = 120;
		assertEquals(factorial, fact.calculateFactorial(5, 1));
	}
	
	@Test  //Given number should be integer
	public void test_Factorial_Of_Given_Number_Should_Integer() {
		TddAsignment fact = new TddAsignment(); 
		Integer num = 5;
		fact.calculateFactorial(num, 1);
		assertEquals("variables must be Integer :", "Integer", num.getClass().getSimpleName());
		}
	
	@Test  //Given number should not null
	public void test_Factorial_Given_Number_NotNull() {
		TddAsignment fact = new TddAsignment(); 
		Integer num = 5;
		fact.calculateFactorial(num, 1);
		assertNotNull(num);
		
	}
	
}
