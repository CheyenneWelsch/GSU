package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class NumberOfYears {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of minutes: ");

		int minutes = input.nextInt();
		int days = minutes / (24 * 60);
		int years = days / 365;

		System.out.println("There are " + years + " years in " + minutes + " minutes!");
		input.close();
	}
}
