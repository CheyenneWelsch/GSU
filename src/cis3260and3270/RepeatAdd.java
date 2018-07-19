package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class RepeatAdd {
	public static void main(String[] args) {
		final int NUM_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);

		while (count < NUM_QUESTIONS) {
			int num1 = 1 + (int) (Math.random() * 15);
			int num2 = 1 + (int) (Math.random() * 15);

			System.out.print("What is " + num1 + " + " + num2 + "? ");
			int answer = input.nextInt();

			if (num1 + num2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else
				System.out.println("Your answer is wrong." + num1 + " + " + num2 + " should be " + (num1 + num2));
			count++;

		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount + "Test time is " + testTime / 1000 + " seconds");

	}

}
