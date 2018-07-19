package cis3260and3270;

import java.util.Arrays;
//
import java.util.Scanner;

public class GuessBday {

	public static void main(String[] args) {

		int[][] set1 = { { 1, 3, 5, 7, }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 }, { 25, 27, 29, 31 } };

		int[][] set2 = { { 2, 3, 6, 7, }, { 10, 11, 14, 15 }, { 18, 19, 22, 23 }, { 26, 27, 30, 31 } };

		int[][] set3 = { { 4, 5, 6, 7, }, { 12, 13, 14, 15 }, { 20, 21, 22, 23 }, { 28, 29, 30, 31 } };

		int[][] set4 = { { 8, 9, 10, 11, }, { 12, 13, 14, 15 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } };

		int[][] set5 = { { 16, 17, 18, 19, }, { 20, 21, 22, 23 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } };

		Scanner input = new Scanner(System.in);

		// Birthday in set1?

		System.out.println("Is your birthday in set1? ");
		System.out.println(Arrays.toString(set1));
		System.out.println("Enter N for No and Y for Yes: ");
		String s = input.nextLine();
		char answer = s.charAt(0);
		int day = 0;

		if (answer == 'Y')
			day += 1;

		// Birthday in set 2?
		System.out.println("Is your birthday in set2? ");
		System.out.println(Arrays.toString(set2));
		System.out.println("Enter N for No and Y for Yes: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (answer == 'Y')
			day += 2;

		// Birthday in set 3?
		System.out.println("Is your birthday in set3? ");
		System.out.println(Arrays.toString(set3));
		System.out.println("Enter N for No and Y for Yes: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (answer == 'Y')
			day += 4;

		// Birthday in set 4?
		System.out.println("Is your birthday in set4? ");
		System.out.println(Arrays.toString(set4));
		System.out.println("Enter N for No and Y for Yes: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (answer == 'Y')
			day += 8;

		// Birthday in set 5?
		System.out.println("Is your birthday in set5? ");
		System.out.println(Arrays.toString(set5));
		System.out.println("Enter N for No and Y for Yes: ");
		s = input.nextLine();
		answer = s.charAt(0);

		if (answer == 'Y')
			day += 16;

		System.out.println("Your birthday is " + day + "!");

	}
}
