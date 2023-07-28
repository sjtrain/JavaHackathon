//WJP to display number of occurrence of all character
package learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Map.put(key, value)
//Map.get(key)
//Map.containsKey(key)

public class Question19 {

	public static Map<Character, Integer> countOccurances(String str) {
		//Declaring a Hash Map
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		//Converting given string to character array
		char[] charArray = str.toCharArray();
		
		//Checking each character in character array
		for (Character character : charArray) {
			if (character == ' ') {
				continue;
			}
			if (countMap.containsKey(character)) {
				countMap.put(character, countMap.get(character) + 1);
			} 
			else {
				countMap.put(character, 1);
			}
		}
		return countMap;

	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = reader.nextLine();
		System.out.println(countOccurances(str));
		reader.close();
	}

}
