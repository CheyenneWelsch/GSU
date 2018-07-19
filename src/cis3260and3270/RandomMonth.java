package cis3260and3270;

//COMPLETE
public class RandomMonth {

	public static void main(String[] args) {

		// random int 1-12, display corresponding month
		int number = (int) (1 + Math.random() * 12);

		String month = "";

		switch (number) {
		case 1:
			month = "Januar";
			break;

		case 2:
			month = "Februar";
			break;

		case 3:
			month = "Marz";
			break;

		case 4:
			month = "April";
			break;

		case 5:
			month = "Mai";
			break;

		case 6:
			month = "June";
			break;

		case 7:
			month = "Juli";
			break;

		case 8:
			month = "August";
			break;

		case 9:
			month = "September";
			break;

		case 10:
			month = "Oktober";
			break;

		case 11:
			month = "November";
			break;

		case 12:
			month = "Dezember";
			break;
		}

		System.out.println(month);

	}

}
