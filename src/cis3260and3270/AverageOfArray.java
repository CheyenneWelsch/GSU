package cis3260and3270; //8gffff
import java.util.Arrays;
import java.util.Scanner;
public class AverageOfArray {

	public static int average(int[] values) {
		int sum = 0;
		int average = 0;
		for (int i = 0; i < values.length; i++) {
			sum = sum + values.length;
		}
		average = sum / values.length;
		return average;
	}
	
	public static double average(double[] values) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + values[i];
		}
		average = sum / values.length;
		return average;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten double values: ");
		
		double [] values = new double [10];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}
		double avg = average(values);
		
		System.out.println("The average value is: " +avg);
	}
	
}
