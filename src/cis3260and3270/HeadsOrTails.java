package cis3260and3270;
//(Simulation: heads or tails) Write a program that simulates flipping a coin one million times
//and displays the number of heads and tails.
public class HeadsOrTails {

	public static void main (String [] args) {
		
		int heads = 0;
		int tails = 0;
		
		
		
		int count = 0;
		while(count  < 1000000){
		double randNum = Math.random();
			if (randNum > .5)
			heads++;
			else
			 tails++;
			count++;
		}
		System.out.print("Number of heads " +heads + " and " +" number of tails " +tails);
		
	}
	
	
}
