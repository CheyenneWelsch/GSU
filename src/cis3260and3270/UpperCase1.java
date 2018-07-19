package cis3260and3270;
import java.util.Scanner;
public class UpperCase1 {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of words: ");

		String upperCase; 
		upperCase = input.nextLine();
		int count = 0;
		
		for (int i = 0; i < upperCase.length(); i++) {
			
			if (Character.isUpperCase(upperCase.charAt(i))){
				count++;
			}	
		}
		
		System.out.println("There are " + count + " uppercase letters!");
		
	}
}
