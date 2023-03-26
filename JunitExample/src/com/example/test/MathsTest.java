package com.example.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.service.Maths;

public class MathsTest {
	
	Maths m;

	@Before
	public void setUp() {//throws Exception {
		m=new Maths();
	}

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	
	@Test
	public void testSum()
	{
		assertEquals(4, m.sum(2, 2));
	}
	
	
	@Test
	public void testSquare()
	{
		//Maths m=new Maths();
		assertEquals(25, m.square(5));
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testForException()
	{
		m.square(-5);
	}

}
