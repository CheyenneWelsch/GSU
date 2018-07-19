package cis3260and3270;
 
import java.util.Scanner;

public class PositiveAndNegative {

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		int sumNum = 0;
		int count = 0;
		int num;
		float average;
		//average = 
		
		System.out.println("Enter a list of numbers");
		
		do{
			num = input.nextInt();	
		
			if (num < 0){
				negative++;
				
			}	else if (num > 0){
						positive++;
				} else {
					continue;
				}
			
			
			sumNum += num;
			count++;
		
		}while (num != 0);

		average = sumNum / (float)count;
				
		System.out.println("There are " +negative + " negative integers and " +positive + " positive integers");
		System.out.printf("The average is %4.2f",average);
		
		input.close();
		
	}
}
