package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class MultipleMatrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = input.nextInt();

		printMatrix(n);

	}

	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols++) {
				System.out.println((int) (Math.random() * 2));
			}

			System.out.println("    ");
		}
	}
}
