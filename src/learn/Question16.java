//Write a method that will remove given character from the String
package learn;

import java.util.Scanner;

public class Question16 {

	public static String removeChar(String ch, String str) {

		String result = str.replace(ch, "");
		return result;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = reader.nextLine();
		System.out.println("Enter the character to be removed");
		String ch = reader.nextLine();

		System.out.println("Result string is: " + removeChar(ch, str));
		reader.close();
	}

}
