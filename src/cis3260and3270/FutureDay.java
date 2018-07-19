package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class FutureDay {

	public static void main(String[] args) {

		// Enter todays day: Sun0 mon1 tues2 wed3 thurs4 fri5 sat6
		// enter # of days elapsed since today
		// today is -- and the future day is ---

		Scanner input = new Scanner(System.in);

		System.out.println("Enter todays day(sun0 mon1 sat6...): ");
		int today = input.nextInt();

		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();

		String theDay = "";

		switch (today % 7) {
		case 0:
			theDay = "Sunday";
			break;
		case 1:
			theDay = "Monday";
			break;
		case 2:
			theDay = "Tuesday";
			break;
		case 3:
			theDay = "Wednesday";
			break;
		case 4:
			theDay = "Thursday";
			break;
		case 5:
			theDay = "Friday";
			break;
		case 6:
			theDay = "Saturday";
			break;
		}

		System.out.println("Today is " + theDay + " and the future day is ");

		// System.out.println("Enter the number of days elapsed since today: ");
		// int elapsed = input.nextInt();

		int futDay = (today + elapsed);

		switch (futDay % 7) {
		case 0:
			theDay = "Sunday";
			break;
		case 1:
			theDay = "Monday";
			break;
		case 2:
			theDay = "Tuesday";
			break;
		case 3:
			theDay = "Wednesday";
			break;
		case 4:
			theDay = "Thursday";
			break;
		case 5:
			theDay = "Friday";
			break;
		case 6:
			theDay = "Saturday";
			break;
		}
		System.out.println(theDay);

		// System.out.println("Today is " +theDay +" and the future day is "
		// +futDay);

	}

}
