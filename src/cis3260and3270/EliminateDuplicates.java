package cis3260and3270;//15
import java.util.Scanner;
public class EliminateDuplicates {

	public static int[] eliminateDuplicates(int[] list) {
		int count = 1;
		int count2 = 0;
		
		int[] values = new int [10];
		int [] values2	 = new int [10];
		
		
		for(int i = 1; i < list.length; i++) {
			boolean duplicate = false;
			for(int j = 0; j < count; j++) {
				if (list[i] == values2[j]) {
					duplicate = true;
				}
			} 
			if (duplicate == false) {
				values2[count2] = list[i];
				count2++;
				count++;
			}
				
		}
		int[] values3 = new int[count2];
		for (int i = 0; i < values3.length; i++){
			values3[i] = values2[i];
		}
		return values3;
	}
	
	public static void main (String[] args) {
		System.out.print("Enter ten integers: ");
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		for (int i = 0; i< 10;i++){
			list[i] = input.nextInt();
		}
		
		
		System.out.print("The distinct numbers are: ");
		for (int j = 0; j < eliminateDuplicates(list).length; j++){
			
			System.out.print(eliminateDuplicates(list)[j] + " ");
		}
		
	}
	
}
