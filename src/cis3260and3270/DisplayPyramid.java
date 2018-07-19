package cis3260and3270;

//YES
import java.util.Scanner;

public class DisplayPyramid {

	public static void main(String[] strings) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines (1-15): ");
		int numberOfLines = input.nextInt();

		while (numberOfLines < 1 || numberOfLines > 15) {
			System.out.println("Invalid input");
			System.out.print("Enter the number of lines (1-15): ");
			numberOfLines = input.nextInt();
		}

		for (int currentRow = 1; currentRow <= numberOfLines; currentRow++) {

			for (int currentColumn = 1; currentColumn <= numberOfLines - currentRow; currentColumn++) {
				System.out.printf("%3s", " ");
			}
			for (int number = currentRow; number >= 1; number--) {
				System.out.printf("%3d", number);
			}
			for (int number = 2; number <= currentRow; number++) {
				System.out.printf("%3d", number);

			}
			System.out.println();

		}
	}
}
