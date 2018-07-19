package cis3260and3270;

public class UpperCase {

	public static void main (String[] args) {
	
		
		int randomNum = 65 + (int)(Math.random() *25 +1);
		char randomChar = (char)randomNum; 
		
		System.out.print(randomChar);
	}
}
