package cis3260and3270;

//
import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {

		System.out.print("Enter three points for a triangle: ");
		// 1.5 -3.4 4.6 5 9.5 -3.4

		Scanner input = new Scanner(System.in);

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double side1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		double side2 = Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)));
		double side3 = Math.sqrt((Math.pow(x1 - x3, 2)) + (Math.pow(y1 - y3, 2)));
		double s;
		double area;

		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);

		s = (side1 + side2 + side3) / 2;
		System.out.println(+side1);
		System.out.println(+s);

		area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
		// area=sqrt(s(s - side1)(s - side2)(s - side3))

		System.out.printf("The area of your triangle is: %.1f", area);
		input.close();
	}
}
