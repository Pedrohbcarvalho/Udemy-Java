package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int rows = input.nextInt();
		int columns = input.nextInt();
		int[][] matrix = new int[rows][columns];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		int num = input.nextInt();
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				System.out.printf("%d ", matrix[i][j]);				
			}
		}
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == num) {
					System.out.printf("%nPosition: %d, %d:",i , j);
					if (i > 0) {
						System.out.printf("Up: %d", matrix[i-1][j]);
					}
					if (i < matrix.length-1) {
						System.out.printf("%nDown: %d", matrix[i+1][j]);
					}
					if (j > 0) {
						System.out.printf("%nLeft: %d", matrix[i][j-1]);
					}
					if (j < matrix[i].length-1) {
						System.out.printf("%nRight: %d", matrix[i][j+1]);
					}
					
				}
			}
		}
			
		input.close();
	}

}
