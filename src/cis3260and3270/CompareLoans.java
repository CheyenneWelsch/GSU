 package cis3260and3270;

//OMPLETE
import java.util.Scanner;

public class CompareLoans {

	public static void main(String[] args) {

		double interestRate = 5.00;

		Scanner input = new Scanner(System.in);
		System.out.printf("Loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.printf("Number of Years: ");
		int numberOfYears = input.nextInt();

		System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

		for (; interestRate <= 8.00; interestRate += 0.125) {

			double monthlyInterestRate = interestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

			double totalPayment = monthlyPayment * numberOfYears * 12;

			String str = "%";
			System.out.printf("%-1.5f%s%17.2f%24.2f \n", interestRate, str, ((int) (monthlyPayment * 100) / 100.0),
					((int) (totalPayment * 100) / 100.0));

		}

	}

}
