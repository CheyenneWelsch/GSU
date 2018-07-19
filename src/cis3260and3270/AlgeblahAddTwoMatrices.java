package cis3260and3270;//5
import java.util.Scanner;
public class AlgeblahAddTwoMatrices {

	public static double [][] addMatrix(double[][]a, double[][]b) {
		double [][] answer = new double [3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				double sum = a[i][j] + b[i][j];
				answer [i][j] = sum;
					
			}
		}
		
		return answer; 
	}
	public static void main (String[] args) {
		System.out.println("Enter a 3 by 3 matrix1, row by row: ");
		double [][] matrix = new double [3][3];
		
		Scanner input1 = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			matrix [i][0] = input1.nextDouble();
			matrix [i][1] = input1.nextDouble();
			matrix [i][2] = input1.nextDouble();
		}
		
		System.out.println("Enter a 3 by 3 matrix2, row by row: ");
		double [][] matrix2 = new double [3][3];
		
		Scanner input2 = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			matrix2 [i][0] = input2.nextDouble();
			matrix2 [i][1] = input2.nextDouble();
			matrix2 [i][2] = input2.nextDouble();
		}
		
		double [][] answer = addMatrix(matrix, matrix2); //"calling" method
		
		for(int i = 0; i < 3; i++)  {
			
			for (int j = 0; j < 3; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
}
