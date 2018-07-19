package cis3260and3270;

//COMPLETE_ISH
import java.util.Scanner;

public class AreaRegularPolygon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		double num = input.nextDouble();
		System.out.println("Enter the side: ");
		double side = input.nextDouble();

		double area = num * Math.pow(side, 2) / (4 * Math.tan(Math.PI / num));

		System.out.println("The area of the polygon is: " + area);
	}

}
