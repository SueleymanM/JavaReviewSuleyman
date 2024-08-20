package com.neotech.review01;

public class TypeCasting {
	
	public static void main(String[] args) {
		// byte < short < int < long < float < double
		
		int intNumber = 81;
		
		// widening / implicit casting / automatically
		double doubleNumber = intNumber;
		
		System.out.println("IntNumber -> " + intNumber);
		System.out.println("doubleNumber -> " + doubleNumber);
		
		// narrowing / explicit casting / manually
		byte byteNumber = (byte) intNumber; // it is risky, you MAY lose data
		System.out.println("byteNumber -> " + byteNumber);
		
		// re-assign
		intNumber = 450;
		
		// in this case you WILL lose data
		byte b2 = (byte) intNumber;
		System.out.println("b2 -> " + b2);
		
		// widening / implicit casting / automatically
		byte b3 = 50;
		int i3 = b3;
		System.out.println("i3 -> " + i3);
	
		// narrowing / explicit casting / manually
		double d1 = 7.8;
		int i4 = (int) d1;
		System.out.println("i4 -> " + i4);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
