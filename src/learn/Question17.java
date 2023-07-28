/* WJP to find total number of integers, uppercase and 
lowercase character in the give string*/
package learn;
import java.util.Scanner;

public class Question17 {
	// Function with no return type
	public static void countCharacters(String str) {
		int countIntegers = 0, countUppercase = 0, countLowercase = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				countIntegers++;
			} else if (Character.isUpperCase(ch)) {
				countUppercase++;
			} else if (Character.isLowerCase(ch)) {
				countLowercase++;
			}
		}

		System.out.println("Total integers: " + countIntegers);
		System.out.println("Total uppercase characters: " + countUppercase);
		System.out.println("Total lowercase characters: " + countLowercase);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = reader.nextLine();
		countCharacters(str);
		reader.close();
	}
}
