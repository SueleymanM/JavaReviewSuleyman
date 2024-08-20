package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {

		
		//Funny way
		int s1 = 95;
		int s2 = 90;
		int s3 = 85;
		int s4 = 100;
		
		int sum = s1 + s2 + s3 + s4;
		System.out.println("The sum is -> " + sum);
		
		
		//1st serious way
		int[] grades = new int[4];
		grades[2] = 85;
		grades[0] = 95;
		grades[3] = 100;
		grades[1] = 90;
		
		//int size = grades.length;
		//The size of the array is 4
		//The index of the last element is 3
		
		int total = 0;
		for (int i=0; i<grades.length; i++) {
			total = total + grades[i];		//OR total += grades[i]
			
		}
		
		System.out.println("The total of the array is -> " + total);
		
		
		//2nd serious way
		int[] numbers = {10, 20, 15, 25};
		
		
		int total2 = 0;
		
		
		//get the elements from the array one by one, from the first to the last
		for (int num : numbers) {
			total2 += num;
		}
		System.out.println("The total of the array2 is -> " + total2);
		
		
	}

}
