package cis3260and3270;

//COMPLETE
import java.util.Scanner;

//count negative and positive integers and compute the average 
public class AverageNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		int sumNum = 0;
		int count = 0;
		int num;
		float average;
		// average =

		System.out.println("Enter an integer,  the input ends if it is 0: ");

		do {
			num = input.nextInt();

			if (num < 0) {
				negative++;

			} else if (num > 0) {
				positive++;
			} else {
				continue;
			}

			sumNum += num;
			count++;

		} while (num != 0);

		if (positive + negative == 0) {
			System.out.println("No numbers were entered except 0");
			System.exit(0);
		}

		average = sumNum / (float) count;

		System.out.println("The number of positives is: " + positive);
		System.out.println("The number of negatives is: " + negative);
		System.out.println("The total is: " + sumNum);
		System.out.println("The average is: " + average);

		input.close();
	}
}
