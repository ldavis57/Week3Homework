package testing;

import java.util.Scanner;

public class MultiDimensionalArray {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		
		
		static void multidimensional(int a, int b) {
		    /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
		    
			    // Check for error -- invalid parameters with an if/else
			if (a <= 2 || b <= 2) {
				System.out.println("Both numbers need to be greater than 2.");
				return;
			}

			int[][] arr = new int[a][b];
			
			for (int i = 0; i < a; i++) { // Outer loop for rows
	            for (int j = 0; j < b; j++) { // Inner loop for columns
	                arr[i][j] = j; // Store the index of the inner loop
	            }
	        }

	        // Print the last element of the first array (row 0, last column)
	        System.out.println(arr[0][b - 1]);               
			
		}
			
				
		    /****** DO NOT CHANGE THE CODE BElOW THIS LINE ******/
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int input1, input2;
				input1 = 10;
				input2 = 15;
				multidimensional(input1, input2);
			}
		
		
	}


