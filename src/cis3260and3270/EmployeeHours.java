package cis3260and3270;
//COMPLETE

public class EmployeeHours {

	static final int EMPLOYEE = 0;
	static final int HOURS = 1;

	public static void main(String[] args) {

		int[][] employeeHours = new int[][] { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		int[][] totalHoursAssigned = assignedHours(employeeHours);

		descendingEmployees(totalHoursAssigned);

		for (int i = 0; i < totalHoursAssigned.length; i++) {
			System.out.println("Employee #" + totalHoursAssigned[i][EMPLOYEE] + " has a total of "
					+ totalHoursAssigned[i][HOURS] + " hours.");

		}
	}

	// add each employees hours
	public static int getEmployeesTotals(int[][] emp, int row) {
		int total = 0;
		for (int column = 0; column < emp[row].length; column++) {
			total += emp[row][column];
		}
		return total;
	}

	// assign hours to employees
	public static int[][] assignedHours(int[][] emp) {
		int[][] totalHoursAssigned = new int[emp.length][2];

		for (int i = 0; i < emp.length; i++) {
			totalHoursAssigned[i][HOURS] = getEmployeesTotals(emp, i);
			totalHoursAssigned[i][EMPLOYEE] = i;
		}
		return totalHoursAssigned;
	}

	// rank employees in descending order
	public static void descendingEmployees(int[][] emp) {

		for (int i = 0; i < emp.length - 1; i++) {

			int index = i;
			int max = emp[i][HOURS];
			int employeeNumb = emp[i][EMPLOYEE];

			for (int k = i + 1; k < emp.length; k++) {

				if (max < emp[k][HOURS]) {
					max = emp[k][HOURS];
					index = k;
					employeeNumb = emp[k][EMPLOYEE];
				}
			}
			if (index != i) {
				emp[index][EMPLOYEE] = emp[i][EMPLOYEE];
				emp[index][HOURS] = emp[i][HOURS];
				emp[i][EMPLOYEE] = employeeNumb;
				emp[i][HOURS] = max;
			}
		}

	}
}
