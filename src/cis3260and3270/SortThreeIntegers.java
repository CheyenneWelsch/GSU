package cis3260and3270;
 
import java.util.Scanner;

public class SortThreeIntegers {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int highestNum;
		int middleNum;
		int lowestNum;
		
		if (a < b) {// a is less then b
			if (a < c) {// a is less than c
				lowestNum = a;
				if (b < c) { // b is less than c
					middleNum = b;
					highestNum = c;
				} 
				else { // c is less than b
					middleNum = c;
					highestNum = b;
				}
			} 
			else { //c is less than a
				lowestNum = c;
				middleNum = a;
				highestNum = b;
			}
		}
		else { //b is less than a
			if (b < c){
				lowestNum = b;
				if (a < c){
					middleNum = a;
					highestNum = c;
				}
				else{
					middleNum = c;
					highestNum = a;
				}
			}
			else{
				lowestNum = c;
				middleNum = b;
				highestNum = a;
			}
		}
		
		System.out.println(lowestNum +" "+middleNum +" " +highestNum);
		
		input.close();
	}
		
		
		
		
}

