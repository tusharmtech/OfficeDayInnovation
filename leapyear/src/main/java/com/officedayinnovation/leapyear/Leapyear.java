package com.officedayinnovation.leapyear;

public class Leapyear {
	static boolean checkYear(int year) {
		// All years divisible by 100 but not by 400
		// are NOT leap years
		if (year % 400 == 0)
			return true;
		// Else If a year is muliplt of 100,
		// then it is not a leap year
		if (year % 100 == 0)
			return false;
		return false;
	}
}
