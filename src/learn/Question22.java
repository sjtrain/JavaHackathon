//WJP to convert int to string
package learn;

import java.util.Scanner;

public class Question22 {

	public static String convertIntToString(int number) {
		return String.valueOf(number);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Integer");
		int i = reader.nextInt();

		String convertedString = convertIntToString(i);
		System.out.println("Converted string: " + convertedString);
		reader.close();
	}
}
