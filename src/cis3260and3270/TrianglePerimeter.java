package cis3260and3270;
//COMPLETE

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] strings) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		boolean isTriangle = ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));

		if (isTriangle) {
			double perimeter = side1 + side2 + side3;
			System.out.println("You entered a true triangle with the perimeter of " + perimeter + ".");
		} else {
			System.out.println("That is not a valid triangle.");
		}
	}
}
