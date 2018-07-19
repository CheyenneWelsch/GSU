package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class MaxNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter numbers, use 0 to end: ");
		int number = input.nextInt();
		int count = 0;
		int largest = 0;

		while (number > 0) {
			number = input.nextInt();
			if (number > largest) {
				largest = number;
				count = 0;
			}
			if (number == largest) {
				count++;
			}
		}
		System.out.println("The largest number is " + largest);
		System.out.println("The occurance count of the largest number is " + count);
	}
}
