package cis3260and3270;//31
import java.util.Scanner;

public class GeometryIntersectingPoint {
	
	public static double [] intersectingPoint(double [][]b, double []a) {
		double x = (((a[0] * b[1][1]) - (b[0][1] * a[1])) / ((b[0][0] * b[1][1]) - (b[0][1] * b[1][0])));
		double y = (((b[0][0] * a[1]) - (a[0] * b[1][0]) / (b[0][0] * b[1][1]) - (b[0][1] * b[1][0])));
		
		
		double[] intersectingPoint = {x , y};
		
		
		return intersectingPoint; 
		
	}

	public static double[] getIntersectingPoint(double[][] points) {
		//create matrix
		double[][] a = new double[2][2];
		
		//create array of 2
		double [] b = new double [2];
		
		//find intersecting point
		a[0][0] = points [0][1] - points[1][1];
		a[0][1] =  -1 * (points [0][0] - points[1][0]);
		a[1][0] = points [2][1] - points[3][1];
		a[1][1] =  -1 * (points [2][0] - points[3][0]);
		b[0] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		b[1] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		
		
		return intersectingPoint(a, b);
		
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[4][2];
		
		System.out.print("Enter four points: ");
		
		for (int i = 0; i < points[i].length; i++) {
			for (int j =0; j < points[j].length; j++) {
				points [i][j] = input.nextDouble();
				
			}
		}
		
		double[] result = getIntersectingPoint(points);
		
		if (result == null) {
			System.out.print("The two lines are parallel.");
		}
		else {
			System.out.print("The intersecting point is at ( " + result[0] +", " + result[1] + " )");
		}
		
	}
}
