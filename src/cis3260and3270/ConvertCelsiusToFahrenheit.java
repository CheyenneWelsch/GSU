package cis3260and3270;

public class ConvertCelsiusToFahrenheit {

	
	//convert from celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit;
		
		fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius;
		
		celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
	
	public static void main (String[]args) {
		double countC = 40;
		double countF = 120; 
		System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");
		for (double i = 0; i < 10; i++) {
			double x = (double) ((int)((celsiusToFahrenheit(countC) * 10))) / 10;
			double y = (double)((int)((fahrenheitToCelsius(countF) * 10))) / 10;
			System.out.println(countC + "       " + x + " | " + countF + "      " +y);
			countC -= 1;
			countF -= 10; 
		}

	}
	
}
