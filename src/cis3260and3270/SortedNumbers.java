package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class SortedNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		double numb1 = input.nextDouble();
		double numb2 = input.nextDouble();
		double numb3 = input.nextDouble();

		displaySortedNumbers(numb1, numb2, numb3);
	}

	// public static void displaySortedNumbers
	// (double num1, double num2, double num3)
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;

		if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println(num1 + " " + num2 + " " + num3);
	}

}
