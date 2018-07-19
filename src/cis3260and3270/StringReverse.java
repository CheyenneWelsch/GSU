package cis3260and3270;

import java.util.Scanner;

public class StringReverse {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		String userInput; 
		
		
		
		//Fixed length for array. 
		//for loop (assign; boolean; count up) 
		//index always starts at 0
		
		//userInput.substring(i, i+1) grabs each individual character
		//listOfChar[i] = userInput.substring(i, i+1) assigns each individual character to the array 
		//For a length array, you do not use ( ). 
		
		System.out.print("Enter a string: ");
		userInput = input.nextLine();
		//String[] listOfChar = new String[userInput.length()];
		
		String reverseChar = "";
		
		for (int i = userInput.length()-1; i >= 0; i--) {
			reverseChar += userInput.charAt(i);	
		}
		/*//>= 0 because you want the first char
		for (int i = listOfChar.length - 1; i >= 0; i--)	 {
			
		}*/
		
		
		
		
		System.out.println("The reverse string is: " + reverseChar );
		
		input.close();

	}
}
