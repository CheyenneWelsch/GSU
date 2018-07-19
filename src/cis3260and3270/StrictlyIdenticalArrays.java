package cis3260and3270; //26
import java.util.Scanner;

public class StrictlyIdenticalArrays {

	public static boolean equals(int[] list1, int[] list2) {
		
		
		boolean identical = true;
		
		if (list1.length != list2.length){
			return false;
		}
		
		for(int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i]) {
				identical = false;
			}
		}
		
		
		
		return identical; 
	}
	
	
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		
		int numList = input.nextInt();
		int [] list1 = new int[numList];
		
		for(int i = 0; i < numList; i++) {
			
			list1[i] = input.nextInt();
			
		}
		
		for(int i = 0; i < list1.length; i++) {
			System.out.println(list1[i] + " ");
		}
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.print("Enter list2: ");
		
		int numList2 = input2.nextInt();
		int [] list2 = new int[numList2];
		
		for(int i = 0; i < numList2; i++) {
			
			list2[i] = input2.nextInt();
		}
		
		for(int i = 0; i < list2.length; i++) {
			System.out.println(list2[i] + " ");
		}
		System.out.println(equals(list1, list2));
		
	}
}
