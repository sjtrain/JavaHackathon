//WJP to convert string to int
package learn;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = reader.nextLine();

		try {
			// the String to int conversion happens here
			int i = Integer.parseInt(str);

			// print out the value after the conversion
			System.out.println("Converted Integer: " + i);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: " + e.getMessage());
		}
		reader.close();
	}

}
