package cis3260and3270;
import java.util.Scanner; 

public class MaxNumber {
	public static void main(String [] args){
	int max = 0;
	int count = 1;
	int userNum = 0;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a list of integers, with the last integer being 0: ");

	
	do { 
		
	
		userNum = input.nextInt();
		
		if (userNum > max){ 
			max = userNum;
			count = 1;
		}
		else if (userNum == max){
			count++; 
		}
		
		
		
	}while (userNum !=0); 
	
	
	System.out.println("Max is: " + max + " Max count: " +count);
}
	
}
