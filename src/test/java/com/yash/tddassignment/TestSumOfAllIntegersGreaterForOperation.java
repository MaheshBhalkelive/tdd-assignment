package com.yash.tddassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestSumOfAllIntegersGreaterForOperation {
	
	@Test //sum of all the integers greater than 100 and less than 200 that are divisible by 7
	public void sum_Of_All_Integeres_GreaterThan100AndLessThan200_DivisibleBy7() {
		TddAsignment tdd = new TddAsignment();
		Integer a[] = { 112, 223, 163, 126, 133 };
		Integer i = 371; 
		assertEquals(i, tdd.sumOfAllIntegeresGreaterThan100AndLessThan200DivisibleBy7(a));
	}
	
	@Test //given integer array should not null
	public void given_IntegerArray_Should_NotNull() {
		TddAsignment tdd = new TddAsignment();
		Integer a[] = { 112, 223, 163, 126, 133 };
		tdd.sumOfAllIntegeresGreaterThan100AndLessThan200DivisibleBy7(a);
		assertNotNull(a);
	}

}
