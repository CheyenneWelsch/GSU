package cis3260and3270;
//COMPLETE

import java.util.Scanner;

public class ColumnByColumn {

	public static void main(String[] args) {

		double[][] matrix = getMatrix();

		for (int col = 0; col < matrix[0].length; col++) {
			System.out.println("The sum of the elements at column " + col + " is: " + sumColumn(matrix, col));
		}
	}

	public static double[][] getMatrix() {

		Scanner input = new Scanner(System.in);
		final int ROWS = 3;
		final int COLUMNS = 4;
		double[][] matrix = new double[ROWS][COLUMNS];

		System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row:");
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++)
				matrix[row][col] = input.nextDouble();
		return matrix;
	}

	public static double sumColumn(double[][] matrix, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[row][columnIndex];
		}
		return sum;
	}

}
