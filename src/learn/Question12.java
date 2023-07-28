//Write a program to check palindrome for both numbers and string
package learn;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Palindrome checking program");
		System.out.println("Enter I for interger and S for string");
		String c = reader.nextLine();
		
		if ("I".equalsIgnoreCase(c)) {
			System.out.println("Enter the number");
			int num = reader.nextInt();
			
			// Method to check if a number is a palindrome
			int originalNum = num;
			int reversedNum = 0;
			while (num > 0) {
				
				int digit = num % 10;
				reversedNum = reversedNum * 10 + digit;
				num /= 10;
			}
			if (originalNum == reversedNum)
				System.out.println("Number is Palindrome:");
			else
				System.out.println("Number is not Palindrome:");
		 } 
		else if ("S".equalsIgnoreCase(c)) {
			System.out.println("Enter the string");
			String str = reader.nextLine();
			
			// Method to check if a string is a palindrome
			int flag = 1;
			str = str.toLowerCase();
			int left = 0;
			int right = str.length() - 1;
			while (left < right) {
				if (str.charAt(left) != str.charAt(right)) {
					System.out.println("String is not Palindrome:");
					flag = 0;
					break;
				}
				left++;
				right--;
			}
			if (flag == 1)
				System.out.println("String is  Palindrome:");
		}
		reader.close();
	}
}
