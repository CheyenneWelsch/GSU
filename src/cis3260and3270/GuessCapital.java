package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class GuessCapital {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] statesAndCapitals = getData();
		int count = 0;

		for (int i = 0; i < statesAndCapitals.length; i++) {
			System.out.print("What is the capital of " + statesAndCapitals[i][0] + "? ");
			String capital = input.nextLine();

			if (isEqual(statesAndCapitals[i][1], capital)) {
				System.out.println("Your answer is correct");
				count++;
			} else {
				System.out.println("The correct answer should be " + statesAndCapitals[i][1]);
			}
		}
		System.out.println("\nThe correct count is " + count);
	}

	public static boolean isEqual(String c, String a) {
		if (c.length() != a.length())
			return false;

		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != a.charAt(i))
				return false;
		}

		return true;
	}

	public static String[][] getData() {
		String[][] d = { { "Alabama", "Montgomery" }, { "Alaska", "Juneau" }, { "Arizona", "Phoenix" } };

		return d;
	}
}
