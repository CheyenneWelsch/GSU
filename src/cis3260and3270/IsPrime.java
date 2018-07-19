package cis3260and3270;

//
public class IsPrime {

	public static void main(String[] args) {

		int primeCount = 0;
		for (int i = 2; i <= 10000; i++) {

			if (isPrime(i)) {
				System.out.println(i);
				primeCount++;
			}
		}

		System.out.println("The total number of prime numbers from 1-10000 is " + primeCount);

	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}
