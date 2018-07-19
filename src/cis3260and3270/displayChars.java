package cis3260and3270;

public class displayChars {
	
	public static void main (String[] args) {
		
		printChars('1', 'Z', 10);
		
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		
		int count = 1;
		int track = (int)ch1 +1;

		while (track < (int)ch2) {
			System.out.print((char)track + " ");
			if(count == numberPerLine) {
				System.out.println(" ");
				count = 0;
			}
			count++;
			track ++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main (String[] args) {
		
		final int NUMBER_OF_CHARS_PER_LINE = 10; //displays 10 per line
		int count = 0; //counts the number of chars
		String chars;
		boolean charsCount;
	}
	
	
	public static void printChars(char ch1, char ch2, int NUMBER_OF_CHARS_PER_LINE) {
		
		while (count < charsCount) { 
			//prints the prime number and adds to the count
			if (charsCount) {
			
				if (count % NUMBER_OF_CHARS_PER_LINE == -1) {
					System.out.printf("%-5s\n",  charsCount);
				}
				else
					System.out.printf("% - 5s", charsCount);
			}
			
		}
		System.out.println("numberPerLine");
	}*/
}
