package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class TopTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numStudents;

		System.out.println("How many students are in the class?: ");
		numStudents = input.nextInt();

		int score = 0;
		int highest = 0, secondHighest = 0;
		String name = "";
		String student1 = "", student2 = "";

		System.out.println("Enter each students name and score: ");
		for (int i = 0; i < numStudents; i++) {
			System.out.print("Student:" + (i + 1) + "-Name:  ");
			name = input.next();
			System.out.println("Score: ");
			score = input.nextInt();

			if (i == 0) {
				highest = score;
				student1 = name;
			} else if (i == 1 && score > highest) {
				secondHighest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			} else if (i == 1) {
				secondHighest = score;
				student2 = name;
			} else if (i > 1 && score > highest && score > secondHighest) {
				secondHighest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			} else if (i > 1 && score > secondHighest) {
				student2 = name;
				secondHighest = score;
			}
		}

		System.out.println("The highest scoring student is " + student1 + " and the second highest scoring student is "
				+ student2);

		input.close();
	}
}
