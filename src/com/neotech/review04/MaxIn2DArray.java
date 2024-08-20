package com.neotech.review04;

public class MaxIn2DArray {

	public static void main(String[] args) {

		// Find the biggest number in a 2D Array

				int[][] b = { 
						{ -2, 3, 5 }, 
						{ 2, 4, 7 }, 
						{ 8, 1, -9 }, 
						{ 3, 15, 1 } 
				};
				
				
				int biggest = b[0][0]; // We don't start with zero, numbers might be negative
				
				for (int row = 0; row<b.length; row++)
				{
					for (int col = 0; col<b[row].length; col++)
					{
						int element = b[row][col];
						
						if (element > biggest)
						{//i founnd a bogger element
							//i have update the biggest
							biggest = element;
						}
					}
				}
				
				System.out.println("The biggest number is -> " + biggest);
				System.out.println("-----------------------------");
				
				
				
				int max = b[0][0];
				
				for (int[] row : b)
				{
					for (int element : row)
					{
						if (element > max)
						{
							max = element;
						}
					}
				}
				
				System.out.println("The biggest number is -> " + max);
				
				
				
				
				
				
				
				
				
	}

}
