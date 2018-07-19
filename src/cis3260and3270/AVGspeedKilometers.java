package cis3260and3270;
//1.12 Average speed in kilometers. 
//Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
//Write a program that displays the average speed in kilometers per hour. 
//1 mile is 1.6 kilometers. 

public class AVGspeedKilometers {

	public static void main (String [] args) {
		
		
		double miles = 24;
		double hours = 1;
		double minutes = 40;
		double seconds = 35;
		
		double kilometers = 1.6 * miles;
		double totalMinutes = hours * 60.0 + minutes + seconds / 60.0;
		double kilometersPerHr = 60.0 * kilometers / totalMinutes;
		
		//System.out.printf("This is number %d", a);
		System.out.println("The average speed in kilometers is " +kilometersPerHr +" per hour.");
		
	}
}
