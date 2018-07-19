package cis3260and3270;
//area = radius * radius * pi
//volume = area * length 

import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	double area;
	double volume;
	double radius;
	double length;
	
	System.out.println("Enter the radius:");
	
	radius = input.nextDouble();
	
	System.out.println("Enter the length:");
	
	length = input.nextDouble();
	
	area = radius * radius * 3.14;
	
	volume = area * length;
	
	System.out.println("The area of the cylinder is " +area);
	System.out.println("The volume of the cylinder is " +volume);
	
	input.close();
	
	}
}
