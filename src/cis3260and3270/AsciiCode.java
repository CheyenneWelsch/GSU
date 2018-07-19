package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int code = input.nextInt();

		System.out.println("The character for ASCII code: " + code + " is " + (char) code);
	}
}
