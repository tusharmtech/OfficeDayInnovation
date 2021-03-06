package com.officedayinnovation.leapyear;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapyearTest {

	@Test
	public void  isMultipleof400() {
		String msg = "Year 2000  should be a leap year.";
		boolean result = Leapyear.checkYear(2000);
		assertEquals(msg, true, result);
	}
	
	@Test
	public void  isMultipleof400andNot100() {
		String msg = "Year 1700  should not be a leap year.";
		boolean result = Leapyear.checkYear(1700);
		assertEquals(msg, false, result);
	}
	
	@Test
	public void  isMultipleof4andNot100() {
		String msg = "Year 2008  should be a leap year.";
		boolean result = Leapyear.checkYear(2008);
		assertEquals(msg, true, result);
	}
	
	@Test
	public void  isMultipleofNot4() {
		String msg = "Year 2017  should not be a leap year.";
		boolean result = Leapyear.checkYear(2017);
		assertEquals(msg, false, result);
	}
}
