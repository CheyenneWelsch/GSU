package cis3260and3270; //14
import java.util.Scanner;

public class CptGcd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		//find the gcd
		System.out.print("The greatest common divisor is " + gcd(numbers));
	}
	//Use a method to get the gcd of an unspecified amount of numbers
	
	public static int gcd(int[] numbers) {
		int gcd = 1;
		boolean isDivisor; 
		
		for(int i = 2; i < min(numbers); i++) {
			isDivisor = true;
			for (int e: numbers) {
				if (e % i != 0)
					isDivisor = false;
			}
			if (isDivisor)
				gcd = i; 
		}
		return gcd;
	}
	
	//minimum integer within the array
	public static int min(int[] numbers) {
		int min = numbers[0];
		
		for (int e: numbers) {
			if (e < min)
				min = e;
		}
		return min;
	}
	
}
