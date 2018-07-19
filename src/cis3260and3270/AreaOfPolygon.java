package cis3260and3270;

import java.util.Scanner;

public class AreaOfPolygon {

	public static void main (String [] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		
		int numSide = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter the side: ");
		
		double side = input2.nextDouble();
		
		
		double area = (numSide * side*side) / (4 * Math.tan(Math.PI/numSide));
		
		System.out.print("The area of the polygon is " +area);
		
		input1.close();
		input2.close();
	}
}
