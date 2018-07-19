package cis3260and3270;

import java.util.Scanner;

public class AsciiCodes {
	

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code between 0 and 127: ");
		
		int code = input.nextInt();
		char character = (char)code;
		System.out.println("The character for ASCII code " +code + " is " +character);
	
		input.close();
	}
}
