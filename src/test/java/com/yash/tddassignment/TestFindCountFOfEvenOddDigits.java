package com.yash.tddassignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestFindCountFOfEvenOddDigits {
	
	@Test //given number should not be null
	public void test_Given_Number_Should_Not_Null() {
		TddAsignment tdd = new TddAsignment();
		Long i2 = 12223L;
		tdd.findCountFOfEvenOddDigits(i2);
		assertNotNull(i2);
		
	}
	
	@Test //Variables must be long
	public void test_Count_EvenOdd_Digits_From_Long_Number() {
		TddAsignment tdd = new TddAsignment();	
		Long i1 = 12223L;
		tdd.findCountFOfEvenOddDigits(i1);
		assertEquals("variables must be Long :", "Long", i1.getClass().getSimpleName());
		
	}
	
	@Test ////count even and odd digits from long number
	public void test_Find_count_of_EvenAndOdd_From_LongNumber() {
		TddAsignment tdd = new TddAsignment();
		Integer[] ans = new Integer[2];
		ans[0] = 3;
		ans[1] = 2;
		assertArrayEquals(ans, tdd.findCountFOfEvenOddDigits(12223L));
	}

}
