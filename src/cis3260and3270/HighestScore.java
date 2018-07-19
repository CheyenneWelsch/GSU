package cis3260and3270;
import java.util.Scanner;

public class HighestScore {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numStudents;
		String studentName;
		int studentScore;
		int count = 0;
		int highScore = 0;
		String highName = "";
		
		
		System.out.println("How many students are in the class?: ");
		numStudents = input.nextInt();
		
		while (count < numStudents) {
			System.out.print("Enter student name and grade: ");
			studentName =input.next();
			studentScore = input.nextInt();
			count++;
			
			if (studentScore > highScore){
				highScore = studentScore;
				highName = studentName;
				
			}
				
			
			
		}
				
		System.out.println("The student with the highest grade is " +highName +".");
		
		input.close();
		
	}
}
