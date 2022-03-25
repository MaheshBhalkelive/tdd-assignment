package com.yash.tddassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestNumberToBinaryEquivalent {
	
	@Test //integer to binary equivalent
	public void test_IntegerToBinary_Equivalent() {
		TddAsignment tdd = new TddAsignment();
		String s = "101000100";
		assertEquals(s, tdd.integerToBinaryEquivalent(324));
	}
	
	@Test //number should be integer
	public void test_IntegerToBinary_Equivalent_Should_Only_Integer() {
		TddAsignment tdd = new TddAsignment();
		Integer i = 324;
		tdd.integerToBinaryEquivalent(i);
		assertEquals("number should be integer", "Integer", i.getClass().getSimpleName());
	}
	
	@Test //number should no null
	public void test_IntegerToBinary_Equivalent_number_Should_NotNull() {
		TddAsignment tdd = new TddAsignment();
		Integer i = 324;
		tdd.integerToBinaryEquivalent(i);
		assertNotNull(i);
	}

}
