package cis3260and3270;
//2.14
import java.util.Scanner;

public class BodyMassIndex {

	public static void main (String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		double weight;
		double height;
		double bmi;
		
		
		System.out.println("Enter weight in pounds: ");
		weight = input.nextDouble();
		weight = 0.45359237 * weight;
		
		System.out.println("Enter height in inches: ");
		height = input.nextDouble();
		height = 0.0254 * height;
		
		bmi = weight / (height * height);
				
		
        bmi = (bmi * 10000) / 10000.0;
		System.out.println("BMI is " +bmi);
		input.close();
	}
}
