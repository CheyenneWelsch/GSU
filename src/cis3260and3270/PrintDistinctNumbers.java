package cis3260and3270;

//Maybe
import java.util.Scanner;

public class PrintDistinctNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		int index = 0;
		System.out.print("Enter ten integers: ");

		for (int i = 0; i < numbers.length; i++) {
			int num = input.nextInt();

			if (isDistinct(numbers, num)) {
				numbers[index++] = num;
			}
		}
		System.out.println("There are " + index + " distinct numbers.");
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < index; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

	public static boolean isDistinct(int[] numbers, int n) {

		for (int i : numbers) {
			if (n == i)
				return false;
		}
		return true;
	}
}
