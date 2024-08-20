package com.neotech.review04;

public class MethodWithReturn {

	public static void main(String[] args) {

		MethodWithReturn m = new MethodWithReturn();

		boolean res = m.isOdd(7);
		System.out.println("The number 7 is odd? " + res);

		boolean res2 = m.isOddAnotherWay(4);
		System.out.println("The number 4 is odd? " + res2);
		
		System.out.println(m.isOddEnhanced(8));

	}

	// If this one is confusing, it's OK, don't worry
	// Divide the number by 2, and if the result is equal to 1 -> return true,
	// otherwise -> return false
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}

	boolean isOddAnotherWay(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
}
