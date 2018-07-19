package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class IntegerDigitSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = 0;

		System.out.println("Enter a number between 0 and 1000: ");
		number = input.nextInt();

		int firstDigit = number % 10;
		int remDigit = number / 10;
		int secondDigit = remDigit % 10;

		remDigit = remDigit / 10;

		int thirdDigit = remDigit % 10;

		int sumDigit = firstDigit + secondDigit + thirdDigit;

		System.out.println("The sum of all of the digits in " + number + " is :" + sumDigit);

	}
}
