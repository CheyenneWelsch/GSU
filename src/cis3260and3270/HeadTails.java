package cis3260and3270;

import java.util.Scanner;

public class HeadTails {
 public static void main (String [] args){
	 
	 Scanner input = new Scanner(System.in);
	 System.out.print("Guess 0 or 1. 0 = heads and 1 = tails: ");
	 int guess = input.nextInt();
	 
	 double randomNum = Math.random();
	 
	 if (randomNum > .5)
		 randomNum = (int)1;
	 else 
		 randomNum = (int)0;
	 
	 if (randomNum == guess)
		 System.out.println("Correct" );
	 else 
		 System.out.println("Incorrect" );
	
	 input.close();
 }
}
