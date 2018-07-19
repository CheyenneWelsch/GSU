package cis3260and3270;//2

import java.util.Scanner;

public class SumMajorDiagonalMatrix {

	public static double sumMajorDiagonal(double[][] m) {
		double answer = m[0][0] + m[1][1] + m[2][2] + m[3][3];
		return answer;
	}
	
	
	public static void main (String[] args) { 
		System.out.println("Enter a 3 by 4 matrix, row by row: ");
		double [][] matrix = new double [3][4];
		
		Scanner input1 = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			matrix [0][i] = input1.nextDouble();
			
		}
		Scanner input2 = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			matrix [1][i] = input2.nextDouble();
			
		}
		Scanner input3 = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			matrix [2][i] = input3.nextDouble();
			
		}
		Scanner input4 = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			matrix [3][i] = input4.nextDouble();
			
		}
		sumMajorDiagonal(matrix);
	}
}
