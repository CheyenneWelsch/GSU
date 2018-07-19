package cis3260and3270;

//COMPLETE 
import java.util.Scanner;

public class FutureTuition {
	public static void main(String[] args) {
		// current year = 10,000
		// increases 5% annually
		// next year = 10,500
		// Tuition in ten years?
		// 4 years of tuition after ten years?

		int totalCost = 0;
		int currentYear = 10000;
		double tax = 0.05;
		int tenthYear = 0;

		for (int year = 1; year <= 14; year++) {
			currentYear += (currentYear * tax);

			if (year > 10)
				totalCost += currentYear;

			if (year == 10)
				tenthYear = currentYear;

		}

		System.out.println("The tuition in ten years will be: $" + tenthYear);
		System.out.println("The total cost for four years of tuition after the tenth year is: $" + totalCost);

	}

}
