//WJP to differentiate input as string, int or bool
package learn;

import java.util.Scanner;

public class Question23 {

	public static void differentiateInput(String input) {
		try {

			int number = Integer.parseInt(input);
			System.out.println("Input is an Integer");
			System.out.println("Parsed Integer: " + number);
		} catch (NumberFormatException e1) {

			if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
				boolean boolValue = Boolean.parseBoolean(input);
				System.out.println("Input is a Boolean");
				System.out.println("Parsed Boolean: " + boolValue);
			} else {

				System.out.println("Input is a String");
				System.out.println("Input String: " + input);
			}
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the Input");
		String i = reader.nextLine();
		differentiateInput(i);

		System.out.println("Enter the Input");
		String str = reader.nextLine();
		differentiateInput(str);

		System.out.println("Enter the Input");
		String b = reader.nextLine();
		differentiateInput(b);
		reader.close();
	}
}
