package cis3260and3270;

import java.util.Scanner;

public class GameRockPSci {

	public static void main (String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Scissors (0) , Rock (1) , Paper (2): ");
	int userGuess = input.nextInt();
	System.out.println(userGuess);
	
	// 1 beats 0
	// 2 beats 1
	// 1 beats 0 
	// 0 beats 2

	
	int randomNum = (int)(Math.random() *3);
	
	System.out.println(randomNum);
	
	switch(userGuess){
		case 0:
	    	if (randomNum == 0)
	    		System.out.println("The computer is scissor. You are scissor. It is a draw.");
	    	else if (randomNum == 1)
	    		System.out.println("The computer is rock. You are scissor. You lose.");
	    	else //remove randomNum == 2 because thats the only option left
	    		System.out.println("The computer is paper. You are scissor. You win.");
	    	break;
	 
	
	case 1:
    	if (randomNum == 0)
    		System.out.println("The computer is scissor. You are rock. You win.");
    	else if (randomNum == 1)
    		System.out.println("The computer is rock. You are rock. It is a draw.");
    	else //remove randomNum == 2 because thats the only option left
    		System.out.println("The computer is paper. You are rock. You lose.");
    	break;

	
	case 2:
    	if (randomNum == 0)
    		System.out.println("The computer is scissor. You are paper. You lose.");
    	else if (randomNum == 1)
    		System.out.println("The computer is rock. You are paper. You win.");
    	else  //remove randomNum == 2 because thats the only option left
    		System.out.println("The computer is paper. You are paper. It is a draw.");
    	break;
	} 
	
	
		input.close();
		
		
		
    }
		

	
}
