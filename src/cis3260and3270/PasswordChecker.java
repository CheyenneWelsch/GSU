package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.nextLine();

		System.out.println((isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
	}

	public static boolean isValidPassword(String password) {
		final int LENGTH_OF_VALID_PASSWORD = 8;
		final int MINIMUM_NUMBER_OF_DIGITS = 2;

		boolean validPassword = isLengthValid(password, LENGTH_OF_VALID_PASSWORD) && isOnlyLettersAndDigits(password)
				&& hasXDigits(password, MINIMUM_NUMBER_OF_DIGITS);

		return validPassword;
	}

	public static boolean isLengthValid(String password, int validLength) {
		return password.length() >= validLength;
	}

	public static boolean isOnlyLettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean hasXDigits(String password, int x) {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= x) {
				return true;
			}
		}
		return false;
	}
}
