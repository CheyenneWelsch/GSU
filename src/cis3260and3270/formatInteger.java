package cis3260and3270;
import java.util.Scanner;

public class formatInteger {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number and its width: ");
		int number = input.nextInt();
		int width = input.nextInt();
		
		
		System.out.println(format(number, width)); //displays the newly formatted number
		System.out.println(number + " formatted to width " + width +"; " + format(number, width));
		//shows by how much the number was formatted
		
	}
	public static String format(int number, int width) {
		
		//gets the string of numbers
		String num = number + "";
		
		//makes sure the length of the string of numbers is accurate
		
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--){
				num = 0 + num;
			}
		}
		
		return num; //returns the number
	}
}
