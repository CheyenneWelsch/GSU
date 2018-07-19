package cis3260and3270;
//Create a method that displays an integer in reverse oder using:
//public static void reverse(int number)

import java.util.Scanner;

public class DisplayIntegerReversed {
	
	//void = do not need a return statement  
	public static void reverse(int number){
		
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args){ 
		Scanner input = new Scanner(System.in);
		
	 
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		reverse(number);
	}
	
	
	
}
