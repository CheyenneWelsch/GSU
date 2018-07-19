package cis3260and3270;//1
import java.util.Scanner;
public class SumElementsColumnbyColumn {

	public static double sumColumn(double[][] m, int columnIndex) {
		double answer = 0;
		for (int i = 0; i < 3; i++) {
			answer += m [i][columnIndex];
		}
		
		
		
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
		for (int i = 0; i < 4; i++) {
			System.out.println("Sum of the elements at " +i + " is " +sumColumn(matrix, i));
			
		}
	}
}
