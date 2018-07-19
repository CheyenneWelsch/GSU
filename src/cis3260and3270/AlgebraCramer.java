package cis3260and3270;

//COMPLETE
public class AlgebraCramer {

	public static void main(String[] args) {
		/*
		 * Using Cramers Rule ax+by=e cx+dy=f
		 * 
		 * x= ed-bf y= af-ec ad - bc ad - bc
		 * 
		 * Solve for X and Y 3.4x + 50.2y = 44.5 2.1x + .55y = 5.9
		 */

		double a = 3.4;
		double b = 50.2;
		double e = 44.5;
		double c = 2.1;
		double d = .55;
		double f = 5.9;

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		System.out.println("x is " + x + " and y is " + y);

	}
}
