package cis3260and3270;

import java.util.Scanner;

public class MajorAndStatus {

	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	int defaultCheck = 0;
	
	System.out.print("Enter two characters: ");
	
	String userInput =input.next();
	String userMajorInput = userInput.substring(0,1);
	String userMajor = "";
	
	switch (userMajorInput) {
		case "M":
			userMajor = "Mathematics";
			break;
		case "C":
			userMajor = "Computer Science";
			break;
		case "I":
			userMajor = "Information Technology";
			break;
		default: 
			System.out.println("Invalid");
			defaultCheck = 1;
	}	
	
	
	String userYearInput = userInput.substring(1,2);
	String userYear = "";
	if (defaultCheck != 1){
	switch (userYearInput) {
	case "1":
		userYear = "Freshman";
		break;
	case "2": 
		userYear = "Sophomore";
		break;
	case "3":
		userYear = "Junior";
		break;
	case "4":
		userYear = "Senior";
		break;
	default: 
		System.out.println("Invalid");
	}
	}
	
	System.out.print(userMajor +" " +userYear);
	
	input.close();
	}
	
	
}
