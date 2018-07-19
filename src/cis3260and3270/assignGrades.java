package cis3260and3270; //1
import java.util.Scanner;
public class assignGrades {

	public static void main (String[] args) {


		Scanner input = new Scanner(System.in);
	
		
	
		
		
		System.out.println("Enter the number of students: ");
			int numStudents = input.nextInt();
			int[] grades = new int [numStudents];
		
			int studentGrade;
			int bestGrade = 0;
			int count = 0;
		
		
			for ( int i = 0; i < grades.length; i++) {
				System.out.print("Enter student grades: ");
				grades[i] = input.nextInt();
				
			}
			
			for (int j= 0; j < grades.length; j++) {
				if (grades[j] > bestGrade){
				bestGrade = grades[j];
				}
				
			}
	
			System.out.println(bestGrade);
			
	
	//for loop, if, if else
			//use index count 
			//create an array for each grades
			//>= best - x
			
			
	
	
	//assign students grade and letter grade based off of bestGrade
	//index count
			
	
		
	int indexCount = 0;
	char grade;
			for (int i = 0; i < grades.length; i++) {
				
				if( grades[i] >= bestGrade - 10){
					grade = 'A';
					indexCount++;
				}
				else if(grades[i] >= bestGrade - 20){
					grade = 'B';
					indexCount++;
				}
				else if(grades[i] >= bestGrade - 30){
					grade = 'C';
					indexCount++;
				}
				else if(grades[i] >= bestGrade - 40){
					grade = 'D';
					indexCount++;
				}
			
				else
					grade = 'F';
					indexCount++;
			}
			
			System.out.print("Student " +numStudents + " score is " +grades[numStudents] + " and grade is "   + "\n");
			
			
	}	
	
}
