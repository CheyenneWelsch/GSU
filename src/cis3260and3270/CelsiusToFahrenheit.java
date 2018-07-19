package cis3260and3270;
//Celsius in a double value and converts to fehrenheit.
//F = (9 / 5) * celsius + 32
//Hint: 9 / 5 is 1 but 9.0 / 5 is 1.8

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main (String [] args){
	
		Scanner input = new Scanner(System.in);
		double celsius; 
		double fahrenheit;
		
		System.out.println("Enter a degree in celsius" );
		
		celsius =  (int)input.nextDouble();
		
		fahrenheit =(9 / 5) * celsius + 32;
		
		System.out.println("The temperature in fahrenheit is " +fahrenheit);
		input.close();
	}
}
