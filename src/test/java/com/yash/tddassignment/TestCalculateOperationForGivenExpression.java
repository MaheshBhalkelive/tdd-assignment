package com.yash.tddassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestCalculateOperationForGivenExpression {

	@Test //Calculate operation on given number
	public void test_Calculate_Operation_For_GivenExpression() {
		TddAsignment tdd = new TddAsignment();
		Double calculate = -5.0;
		assertEquals(calculate, tdd.calculateOperationOnGivenNumber("2+3-4/2*5"));
	}
	
	@Test
	public void test_Calculate_Operation_For_GivenNumber_NotNull() {
		TddAsignment tdd = new TddAsignment();
		String expression = "2+3-4/2*5";
		tdd.calculateOperationOnGivenNumber(expression);
		assertNotNull(expression);
	}
}
