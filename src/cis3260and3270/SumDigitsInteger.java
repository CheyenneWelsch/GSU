package cis3260and3270;
import java.util.Scanner;
public class SumDigitsInteger {
	//Method
	public static int sumDigits(long n){
		
		int sum = 0;
		System.out.println("n = " + n);
		while (n>0) {
			sum += n % 10;
			System.out.println(sum);
			n /= 10;
			System.out.println("n =" + n);
		}
				
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
	//Sum of the digits in an integer using a method with the header:
	// "Public static int sumDigits(long n)"
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer with multiple digits: ");
		long digits = input.nextLong();
		
		System.out.println("The sum of the integers digits is: " + sumDigits(digits));
		
	}
}
