package com.yash.tddassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestSumOfAllDigits {

	@Test //sum of all digits from a given number
	public void test_SumOfAllDigits() {
		TddAsignment tdd = new TddAsignment();
		Integer i1 = 7;
		assertEquals(i1, tdd.sumOfDigits(1222));
	}
	
	@Test  //given number should not null
	public void test_SumOfAllDigits_GivenNumber_NotNull() {
		TddAsignment tdd = new TddAsignment();
		Integer i1 = 1222;
		tdd.sumOfDigits(i1);
		assertNotNull(i1);
	}
	
	@Test //given number Can only Integer
	public void test_sumOfAllDigits_GivenNumber_Only_Integer() {
		TddAsignment tdd = new TddAsignment();
		Integer i1 = 1222;
		tdd.sumOfDigits(i1);
		assertEquals("variables must be Integer :", "Integer", i1.getClass().getSimpleName());
	}
	
}
