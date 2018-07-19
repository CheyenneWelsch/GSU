package cis3260and3270;
//(Random point) Write a program that displays a random coordinate in a rectangle. 
//The rectangle is centered at (0, 0) with width 100 and height 200.
public class RandomPoint {

	public static void main (String[] args) {
		
		int x;
		int y;
		
		
		x = -50 + (int)((Math.random() *(50+50)+1)); //(100)-50
		y = -100 +(int)((Math.random() *(100+100)+1)); //(200)-100

		System.out.println(+ x + " , " + y);
		
		
	}
}
