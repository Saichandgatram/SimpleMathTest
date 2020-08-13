package com.simpletest.mathtest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FirstClassTest {

	@Test
	public void test_add()
	{
		final int expected = 3;
		final int actual = FirstClass.add(1, 2);
		assertEquals(actual, expected);
	}
	@Test
	public void test_sub()
	{
		final int expected = 2;
		final int actual = FirstClass.sub(4, 2);
		assertEquals(actual, expected);
	}
	@Test
	public void test_mult()
	{
		final int expected = 6;
		final int actual = FirstClass.mult(2, 3);
		assertEquals(actual, expected);
	}
	@Test
	public void test_div()
	{
		final int expected = 3;
		final int actual = FirstClass.div(9, 3);
		assertEquals(actual, expected);
	}
}
