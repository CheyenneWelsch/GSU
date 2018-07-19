package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Scissor (0) , Rock (1) , Paper (2): ");
		int user = input.nextInt();

		int computer = (int) (Math.random() * 3);
		String guessComp = "";

		switch (computer) {
		case 0:
			guessComp = "Scissor";
			break;
		case 1:
			guessComp = "Rock";
			break;
		case 2:
			guessComp = "Paper";
			break;
		}

		String guessUser = "";

		switch (user) {
		case 0:
			guessUser = "Scissor";
			break;
		case 1:
			guessUser = "Rock";
			break;
		case 2:
			guessUser = "Paper";
			break;
		}

		System.out.println("The computer is " + guessComp + "." + "You are " + guessUser + ".");

		// 1 beats 0
		// 2 beats 1
		// 1 beats 0
		// 0 beats 2

		if (guessComp == guessUser) {
			System.out.println("It is a draw.");
		} else if ((computer == 0) && (user == 1)) {
			System.out.println("You win!");
		} else if ((computer == 0) && (user == 2)) {
			System.out.println("You lose!");
		} else if ((computer == 1) && (user == 0)) {
			System.out.println("You lose!");
		} else if ((computer == 1) && (user == 2)) {
			System.out.println("You win!");
		} else if ((computer == 2) && (user == 0)) {
			System.out.println("You win!");
		} else if ((computer == 2) && (user == 1)) {
			System.out.println("You lose!");
		}

	}
}
