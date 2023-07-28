//WJP to display duplicate character in string
package learn;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = reader.nextLine();

		char[] charArr = str.toCharArray();

		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (charArr[i] == charArr[j]) {
					System.out.print(charArr[j] + " ");
					break;
				}
			}
		}
		reader.close();
	}

}
