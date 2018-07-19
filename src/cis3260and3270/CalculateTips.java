package cis3260and3270;
//Write a program that reads the subtotal and the gratuity rate
//then computes the gratuity and total. 
//Example: 10subt 15%grat
//gratuity is 1.5 and total is 11.5

import java.util.Scanner;

public class CalculateTips {

	public static void main (String [] args) {
		Scanner input =  new Scanner(System.in);
		
		double subTotal = 0;
		double gratuity = 0; 
		double total =0;
		
		System.out.println("Enter the subtotal");
		subTotal = input.nextDouble();
		
		System.out.println("Enter the gratuity");
		gratuity = input.nextDouble();
		
		gratuity = subTotal * (gratuity / 100.0);
		total = subTotal + gratuity;
		
		System.out.println("The total is "+total + " and the gratuity amount is " +gratuity +".");
		input.close();
	}
}
