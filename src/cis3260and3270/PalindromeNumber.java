package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three digit integer: ");
		int num = input.nextInt();
		// 121

		int firstNum;
		int thirdNum;

		firstNum = num / 100;
		thirdNum = num % 10;

		if (firstNum == thirdNum)
			System.out.print(num + " is a palindrome");
		else
			System.out.print(num + " is not a palindrome");

		input.close();
	}
}
