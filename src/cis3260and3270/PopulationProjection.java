package cis3260and3270;
//COMPLETE

public class PopulationProjection {

	public static void main(String[] args) {

		/*
		 * double currentPop = 312032486; double year = 365;
		 * 
		 * //use double for more accurate population
		 * 
		 * double oneBirth = 7.0; double oneDeath = 13.0; double oneNewImmigrant
		 * = 45.0;
		 * 
		 * double secondsInYears = 31557600;
		 * 
		 * double numBirths = secondsInYears / oneBirth; double numDeaths =
		 * secondsInYears / oneDeath; double numNewImmigrant= secondsInYears /
		 * oneNewImmigrant;
		 * 
		 * for(int i = 1; i<=5; i++){ currentPop += numBirths + numNewImmigrant
		 * - numDeaths; }
		 * 
		 * 
		 * System.out.println("Year" + i + " = " + (int)currentPop);
		 */

		double currentPop = 312032486;
		double birth = 7.0;
		double death = 13.0;
		double newImmigrant = 45.0;
		double secondsInYears = 60 * 60 * 24 * 365;

		double numBirths = secondsInYears / birth;
		double numDeaths = secondsInYears / death;
		double numImmigrants = secondsInYears / newImmigrant;

		for (int i = 1; i <= 5; i++) {
			currentPop += numBirths + numImmigrants - numDeaths;
			System.out.println("Year " + i + " = " + (int) currentPop);

		}

	}
}
