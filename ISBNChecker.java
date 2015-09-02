import java.util.Scanner;


public class ISBNChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* for user inputted isbns
		System.out.println("Enter a complete ISBN: ");
		Scanner input = new Scanner(System.in);
		String isbn =input.nextLine(); */
		
		String isbn1 = "123456789X";
		String isbn2 = "0136091812";
		String isbn3 = "123456789X";
		printingResults(isbn1);
		printingResults(isbn2);
		printingResults(isbn3);

	}
	
	public static void printingResults(String isbn) {

		if (isISBN(isbn)) {
			System.out.println(isbn + " is a valid ISBN.");
		}
		else {
			System.out.println(isbn + " is an invalid ISBN");
		}
		
	}

	public static boolean isISBN(String isbn) {

		char checkDigit = isbn.charAt(isbn.length()-1);
		int sum = 0;
		int remainder;

		for(int i = 0; i < isbn.length() - 1; i++) {
			sum += (i+1)*Character.getNumericValue(isbn.charAt(i));
		}
		
		remainder = sum%11;
		
		if(remainder==10 && checkDigit == 'X') {
			return true;
		}
		else if(remainder==Character.getNumericValue(checkDigit)) {
			return true;
		}
		else {
			return false;
		}

	}

}
