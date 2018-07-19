package cis3260and3270;

//UGH 
import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int num = input.nextInt();

		// Is it a palindrome??
		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") + " a palindrome.");

	}

	public static int reverse(int num) {

		String reverse = " ";
		String n = num + "";

		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}

	public static boolean isPalindrome(int num) {
		return num == reverse(num) ? true : false;
	}

}
