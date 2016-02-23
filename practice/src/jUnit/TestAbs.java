package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAbs {

	@Test
	public void test() 
	{
		assertEquals(0,Math.abs(0));
		assertEquals(1,Math.abs(-1));
		assertEquals(1,Math.abs(1));
		assertEquals(Integer.MAX_VALUE,Math.abs(Integer.MAX_VALUE));
		assertEquals(-Integer.MIN_VALUE,Math.abs(Integer.MIN_VALUE));
	}

}
