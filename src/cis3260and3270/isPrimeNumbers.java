package cis3260and3270;

public class isPrimeNumbers {
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10000; i++) {
			if(isPrime(i)) {
				count++;
			}
		} System.out.println("There are " +count + " prime numbers, less than 10000.");
		System.out.println (isPrime(0) + " " +isPrime(1)); //to test 0 and 1
	}
	
	/*public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; //displays 10 per line
		int count = 0; //counts the number of prime numbers
		int number = 2; //Tests accuracy
		
		//continuously counts for prime numbers
		while (count < numberOfPrimes) { 
			//prints the prime number and adds to the count
			if (isPrime(number)) {
				count++;
			
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%-5s\n",  number);
				}
				else
					System.out.printf("% - 5s", number);
			}
			number++;
		}
	}
	*/
	public static boolean isPrime(int number) { 
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false; //number is not prime
			}
		}
		return true; // number is prime
	}

	
	
}
