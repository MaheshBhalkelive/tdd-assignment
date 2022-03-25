package com.yash.tddassignment;

import java.lang.reflect.Array;
import java.util.LinkedList;

import com.fathzer.soft.javaluator.*;

public class TddAsignment {

	// 1. Addition of 10 consecutive numbers
	public Integer additionOfTenConsecutiveNumbers(Integer i1, Integer i2) {
		Integer addition = 0;
		for (int i = i1; i <= i2; i++) {
			addition = addition + i;
		}
		return addition;
	}

	// 2. factorial of given number
	public Integer calculateFactorial(int num, Integer factorial) {
		for (int i = 1; i <= num; ++i) {
			factorial = factorial * i;
			// factorial *= i;
		}
		System.out.printf("Factorial of %d = %d", num, factorial);
		return factorial;
	}

	// 3. find out the total even digits and total of odd digits in a long given
	public Integer[] findCountFOfEvenOddDigits(Long number) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		int evenCount = 0;
		int oddCount = 0;
		while (number > 0) {
			stack.push((int) (number % 10));
			number = number / 10;
		}
		while ((!stack.isEmpty())) {
			Integer i = stack.pop();
			System.out.println(i);
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		// return two object at a time
		Integer[] ans = new Integer[2];
		ans[0] = evenCount;
		ans[1] = oddCount;

		System.out.println("even numbers = " + ans[0]);
		System.out.println("odd numbers = " + ans[1]);
		return ans;
	}

	// 4. find out the sum of digits in that expression.
	public Integer sumOfDigits(Integer number) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		Integer sum = 0;
		while (number > 0) {
			stack.push((int) (number % 10));
			number = number / 10;
		}
		while ((!stack.isEmpty())) {
			Integer i = stack.pop();
			System.out.println(i);
			sum = sum + i;
			System.out.println(sum);

		}
		return sum;
	}

	// 5. calculate operation on a given number
	public Double calculateOperationOnGivenNumber(String expression) {

		DoubleEvaluator eval = new DoubleEvaluator();
		Double result = eval.evaluate(expression);
		return result;
		/*
		 * <dependency> <groupId>net.objecthunter</groupId>
		 * <artifactId>exp4j</artifactId> <version>0.4.8</version> </dependency>
		 *
		 * Expression expression = new ExpressionBuilder("3+2").build(); double result =
		 * expression.evaluate();
		 */
	}

	// 6. find the sum of all the integers greater than 100 and less than 200 that are divisible by 7.
	public Integer sumOfAllIntegeresGreaterThan100AndLessThan200DivisibleBy7(Integer[] numbers) {
		Integer sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			Integer x = (Integer) Array.get(numbers, i);
			if (x > 100 && x < 200 && x % 7 == 0) {
				sum = sum + x;
			}
		}
		System.out.println(sum);
		return sum;
	}

	// 7. find binary equivalent of any number
	public String integerToBinaryEquivalent(Integer number) {
		String s = Integer.toBinaryString(number);
		System.out.println(s);
		return s;
	}

}
