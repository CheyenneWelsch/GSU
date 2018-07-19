package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] zodiac = { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.println(zodiac[year % 12]);
	}
}
