package cis3260and3270;

import java.util.Scanner;

public class CalculateEnergy {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		double kilograms;
		double initialCelsius;
		double finalCelsius;
		double joules;
		
		System.out.print("Enter total water in kilograms: ");
		kilograms = input.nextDouble();
		
		System.out.print("Enter the initial temperature in celsius: ");
		initialCelsius = input.nextDouble();
		
		System.out.print("Enter the final temperature in celsius: ");
		finalCelsius = input.nextDouble();
		
		joules = kilograms * (finalCelsius - initialCelsius) *4184;
		
		System.out.print("The energy needed is " +joules);
		
		input.close();
	}
}
