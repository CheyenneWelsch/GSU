package cis3260and3270;
//Write a program that reads an integer between 0 and 1000
//and adds all the the digits in the integer.
//int is 932 digits is 14
//Hint: use % to extract digits and use / to remove the extracted digit.
//Example 932 % 10 = 2 and 932 / 10 = 93

import java.util.Scanner;

class Integer {

	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int userAnswer;
		int one;
		int ten;
		int hundreds;
		int digits = 0;
		
	
		
		
		System.out.println("Enter an integer between 0 and 1000");
		userAnswer = input.nextInt();
		
			 one = userAnswer % 10;

		     ten = (userAnswer / 10) % 10 ;

		     hundreds = (userAnswer / 100) % 10;

		    digits = one + ten + hundreds;

		    System.out.print(" The sum of the digits = " + digits);
		
			input.close();
	}
}
