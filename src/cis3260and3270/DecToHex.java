package cis3260and3270;

//COMPLETE
import java.util.Scanner;

public class DecToHex {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");

		int userNum = input.nextInt();

		switch (userNum) {

		case 0:
			System.out.print("0");
			break;
		case 1:
			System.out.print("1");
			break;
		case 2:
			System.out.print("2");
			break;
		case 3:
			System.out.print("3");
			break;
		case 4:
			System.out.print("4");
			break;
		case 5:
			System.out.print("5");
			break;
		case 6:
			System.out.print("6");
			break;
		case 7:
			System.out.print("7");
			break;
		case 8:
			System.out.print("8");
			break;
		case 9:
			System.out.print("9");
			break;
		case 10:
			System.out.print("A");
			break;
		case 11:
			System.out.print("B");
			break;
		case 12:
			System.out.print("C");
			break;
		case 13:
			System.out.print("D");
			break;
		case 14:
			System.out.print("E");
			break;
		case 15:
			System.out.print("F");
			break;
		default:
			System.out.print(userNum + " is an invalid input.");
		}

		input.close();

	}

}
