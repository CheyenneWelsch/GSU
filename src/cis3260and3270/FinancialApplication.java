package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double subTotal = 0;
		double total = 0;
		double gratuity = 0;

		System.out.println("Enter the subtotal");
		subTotal = input.nextDouble();

		System.out.println("Enter the gratuity");
		gratuity = input.nextDouble();

		gratuity = subTotal * (gratuity / 100.0);
		total = subTotal + gratuity;

		System.out.println("The total is " + total + " and the gratuity amount is " + gratuity + ".");
		input.close();

	}

}
