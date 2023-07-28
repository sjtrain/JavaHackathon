//Given a string print the reverse of the string
package learn;

import java.util.Scanner;

public class Question13 {

	public static String reverseStr(String originalStr) {

		int size = originalStr.length();
		
		// Convert given string to Character array
		char[] charArray = originalStr.toCharArray();

		// Declaring a new character array to store the reversed String
		char[] reverseCharArray = new char[size];

		for (int i = 0; i < size; i++) {

			reverseCharArray[i] = charArray[size - i - 1];

		}
		System.out.println(reverseCharArray);
		// Convert reverseCharArray array to String
		
		String reverseStr = new String(reverseCharArray);
		return reverseStr;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string");
		String originalStr = reader.nextLine();
		System.out.println(reverseStr(originalStr));
		reader.close();
	
	}
}
