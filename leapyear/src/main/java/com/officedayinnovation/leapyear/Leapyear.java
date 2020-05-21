package com.officedayinnovation.leapyear;

public class Leapyear {
	static boolean checkYear(int year) {
		// If a year is multiple of 400,
		// then it is a leap year
		if (year % 400 == 0)
			return true;
		return false;
		
		
	}
}
