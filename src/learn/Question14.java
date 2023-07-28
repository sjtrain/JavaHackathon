//Given a string print the reverse of the words string
package learn;

import java.util.Scanner;

public class Question14 {

	public static String wordReverse(String input) {
		//split() returns an array of string
		String s[] = input.split(" ");
		String result = "";
		for (int i = s.length - 1; i >= 0; i--) {
			result = result + s[i] + " ";
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the string");
		String input = reader.nextLine();
		System.out.println(wordReverse(input));
		reader.close();

	}

}
