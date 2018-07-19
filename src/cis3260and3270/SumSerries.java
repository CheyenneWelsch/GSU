package cis3260and3270;

//COMPLETE
public class SumSerries {
	public static void main(String[] args) {

		double sum = 0.0;
		for (double x = 1.0; x <= 97.0; x += 2) {
			sum += x / (x + 2);
		}
		System.out.println("Sum of Series '1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + "
				+ " ... + 95 / 97 + 97 / 99': " + sum);

	}

}
