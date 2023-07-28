/*WJP to find total number of repeated integers, 
uppercase and lowercase character in the give string*/
package learn;

import java.util.HashMap;
import java.util.Map;

public class Question20 {
	
	public static void countRepeatedCharacters(String str) {
        Map<Character, Integer> charOccurrencesMap = new HashMap<>();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                charOccurrencesMap.put(ch, charOccurrencesMap.getOrDefault(ch, 0) + 1);
            }
        }

        int countRepeatedIntegers = 0;
        int countRepeatedUppercase = 0;
        int countRepeatedLowercase = 0;
	
        // Count the repeated integers, uppercase characters, and lowercase characters
        for (int occurrence : charOccurrencesMap.values()) {
            if (occurrence > 1) {
                if (Character.isDigit(str.charAt(0))) {
                    countRepeatedIntegers++;
                } else if (Character.isUpperCase(str.charAt(0))) {
                    countRepeatedUppercase++;
                } else if (Character.isLowerCase(str.charAt(0))) {
                    countRepeatedLowercase++;
                }
            }
        }

        System.out.println("Total repeated integers: " + countRepeatedIntegers);
        System.out.println("Total repeated uppercase characters: " + countRepeatedUppercase);
        System.out.println("Total repeated lowercase characters: " + countRepeatedLowercase);
    }

    public static void main(String[] args) {
        String inputString = "HelloWorld!1231aAaBBb";
        countRepeatedCharacters(inputString);
    }
}








	