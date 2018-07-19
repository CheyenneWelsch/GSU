package cis3260and3270; //4
import java.util.Scanner;
import java.util.stream.IntStream;

public class avgScored {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		

	final int MAX_NUM_OF_SCORES = 100;
		//create an array
	int [] score = new int[MAX_NUM_OF_SCORES];
	
	
	System.out.print("Enter scores, use a negative score to end: ");
		//fill the array
		for(int i = 0; i < MAX_NUM_OF_SCORES; i++) {
			score[i] = input.nextInt();
			//test array
			//Need to make it stop inputing once there is a negative score
			System.out.print(score[i]+" ");
		}
		
		//get the sum, average, and number of scores above/below the avg
		int sum = IntStream.of(score).sum();
		
		int avg = sum / score.length;
		
		int aboveEqual = 0;
		int belowEqual = 0;
		
		for (int i =0; i < score.length; i++) {
			if (i >= avg) {
				aboveEqual++;
			}
			else {
				belowEqual++;
			}	
		}
		
		System.out.print("The number of scores above or equal to the average score is: "+aboveEqual);
		System.out.print("The number of scores above or equal to the average score is: "+belowEqual);
		
		
		
		
		
	}
		
}

