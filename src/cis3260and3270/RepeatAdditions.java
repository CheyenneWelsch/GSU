package cis3260and3270;
//ten random addition questions for two integers between 1 and 15
//display correct count(how many right and wrong) 
//and test time(from start to end)

import java.util.Scanner;
public class RepeatAdditions {

	public static void main (String[]args){
		
		
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0; //originally 0 till we find out
		int wrongCount = 0;
		int count = 0; //number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; //initially empty
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
			//Step 1
			int num1 = (int)(1 + Math.random() * 15);
			int num2 = (int)(1 + Math.random() * 15);
			//Step 2
			if (num1 < num2) { //do a switch with temp
				int temp = num1;
				num1 = num2;
				num2 = temp;	
			}
			//Step 3 
			System.out.println("What is " +num1 + "+" +num2 +" ?");
			int answer = input.nextInt();
			//Step 4
			if (num1 + num2 == answer) {
				System.out.println("You go girl!");
				correctCount++; //increasing the correct count with every correct answer
			}
			else if (num1 + num2 != answer) {
				System.out.println("Your answer is incorrect");
				wrongCount++; //increasing the correct count with every correct answer
			}
			
			//else
				//System.out.println("Your answer is incorrect!\n"+num1 +"+"+num2 +" should be " + (num1 + num2));
			 	//wrongCount++; 
			 	
			//Increase the amount of questions asked
			count++;
			
			output += "\n" + num1 + "+" +num2 + "=" + answer + ((num1 + num2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount + " and incorrect count is " +wrongCount +"\nTest time is " +testTime / 1000 + " seconds\n" + output);
		//System.out.println("Correct count is " + correctCount + 
		input.close();
		
	}
}
