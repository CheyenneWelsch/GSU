package cis3260and3270;

import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
	
		  Scanner input = new Scanner(System.in);
		 
		  double distance; 
		  double cost;
		  double fuelEff;
		  double pricePerGallon;
		  
		  System.out.print("Enter the driving distance:");
		  distance = input.nextDouble();
		  
		  System.out.print("Enter miles per gallon:");
		  fuelEff = input.nextDouble();
		  
		  System.out.print("Enter price per gallon:");
		  pricePerGallon = input.nextDouble();
		  cost = distance / fuelEff * pricePerGallon;
		  
		  System.out.println("The cost of driving is $ " + cost);
		  //The code is right but I want to limit it to 2 decimal points
		  //I tried using this and it keeps giving me an error. 
		  //System.out.printf("This is number %.2", cost);

		  input.close();
	}
}
