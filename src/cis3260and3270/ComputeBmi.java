package cis3260and3270;
//COMPLETE

import java.util.Scanner;

public class ComputeBmi {

	/*
	 * NOTES public String name; public double weight; public double height;
	 * 
	 * public ComputeBmi(String n, double w, double h){ name = n; weight = w;
	 * height = h;
	 * 
	 * //BMI b1 //b1.println; }
	 * 
	 * public void printComputeBmi(){ //method implementation }
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double weight;
		double height;
		double bmi;

		System.out.println("Enter your weight in pounds: ");
		weight = input.nextDouble();
		weight = 0.45359237 * weight;

		System.out.println("Enter your height in inches: ");
		height = input.nextDouble();
		height = 0.0254 * height;

		bmi = weight / (height * height);

		bmi = (bmi * 10000) / 10000.0;
		System.out.println("BMI is " + bmi);
		input.close();

	}

}
