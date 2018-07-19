package cis3260and3270;//10

public class LargestRowAndColumn {
	
	public static int largestColumn(int[][] matrix) {
		int max = 0;
		int num;
		for (int i = 0; i < 4; i++) {
			num = matrix[0][i] + matrix [1][i] + matrix[2][i] + matrix[3][i];
			if(num > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int largestRow(int[][] matrix) {
		int max = 0;
		int num;
		for (int i = 0; i < 4; i++) {
			num = matrix[i][0] + matrix [i][1] + matrix[i][2] + matrix[i][3];
			if(num > max) {
				max = i;
			}
		}
		return max;
	}

	public static void main (String[] args) {
		int [][] matrix = new int [4][4];
		
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++){
				double random = Math.random();
				if (random > .5) {
					matrix [i][j] = 1;
				}
				else 
					matrix [i][j] = 0;
			}
			
		}
		for(int i = 0; i < 4; i++)  {
			
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println("The largest row index: " +largestRow(matrix));
		System.out.println("The largest column index: " +largestColumn(matrix));
	}
}
